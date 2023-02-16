-- start Application Store Employee Role
insert into SEC_ROLE
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME, LOC_NAME, DESCRIPTION, ROLE_TYPE, IS_DEFAULT_ROLE, SYS_TENANT_ID, SECURITY_SCOPE)
values ('83b5af10-c882-8b86-7440-13296f5e24d2', 2, '2023-02-16 08:40:01', 'admin', '2023-02-16 08:47:35', 'admin', null, null, 'application-store-employee', 'Store Employee', null, 0, null, null, 'GENERIC_UI');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('3aabb284-43cf-4139-488e-76c0d8dfd47b', 1, '2023-02-16 08:40:01', 'admin', '2023-02-16 08:40:01', null, null, null, 20, 'application_PurchaseProduct:create', 1, '83b5af10-c882-8b86-7440-13296f5e24d2');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('04c87fb3-50f3-e4dc-2c0b-0991e252c5aa', 1, '2023-02-16 08:40:01', 'admin', '2023-02-16 08:40:01', null, null, null, 20, 'application_Product:create', 1, '83b5af10-c882-8b86-7440-13296f5e24d2');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('ae860294-df3d-e8b0-05db-0401f82da5ce', 1, '2023-02-16 08:40:01', 'admin', '2023-02-16 08:40:01', null, null, null, 20, 'application_Product:delete', 1, '83b5af10-c882-8b86-7440-13296f5e24d2');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('d2befe32-f253-fb64-3a74-97d1b7f7a0ee', 1, '2023-02-16 08:40:01', 'admin', '2023-02-16 08:40:01', null, null, null, 20, 'application_Product:update', 1, '83b5af10-c882-8b86-7440-13296f5e24d2');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('7cf37452-4ae7-5d97-1e03-4e28db0a7907', 1, '2023-02-16 08:40:01', 'admin', '2023-02-16 08:40:01', null, null, null, 20, 'application_PurchaseProduct:delete', 1, '83b5af10-c882-8b86-7440-13296f5e24d2');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('b69b45b1-ac44-e9db-b721-66b654a07c0b', 1, '2023-02-16 08:40:01', 'admin', '2023-02-16 08:40:01', null, null, null, 20, 'application_Product:read', 1, '83b5af10-c882-8b86-7440-13296f5e24d2');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('b635cad4-0272-f201-b3d2-94a63e04bbfb', 1, '2023-02-16 08:40:01', 'admin', '2023-02-16 08:40:01', null, null, null, 20, 'application_Store:read', 1, '83b5af10-c882-8b86-7440-13296f5e24d2');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('2dff72b4-0c74-bd9a-c403-cfe2c9d3672d', 1, '2023-02-16 08:40:01', 'admin', '2023-02-16 08:40:01', null, null, null, 10, 'application_StoreServiceScreen', 1, '83b5af10-c882-8b86-7440-13296f5e24d2');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('2dbea528-7387-5104-1614-d3eb7ba0f6e7', 1, '2023-02-16 08:40:01', 'admin', '2023-02-16 08:40:01', null, null, null, 10, 'application_Store.browse', 1, '83b5af10-c882-8b86-7440-13296f5e24d2');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('710995cc-258c-470f-9aae-5e3a3592a6bf', 1, '2023-02-16 08:40:01', 'admin', '2023-02-16 08:40:01', null, null, null, 20, 'application_PurchaseProduct:read', 1, '83b5af10-c882-8b86-7440-13296f5e24d2');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('77f1114d-eea8-1c8e-5176-2f57960f396b', 1, '2023-02-16 08:40:01', 'admin', '2023-02-16 08:40:01', null, null, null, 20, 'application_PurchaseProduct:update', 1, '83b5af10-c882-8b86-7440-13296f5e24d2');
-- end Application Store Employee Role
-- start application Producer Role
insert into SEC_ROLE
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME, LOC_NAME, DESCRIPTION, ROLE_TYPE, IS_DEFAULT_ROLE, SYS_TENANT_ID, SECURITY_SCOPE)
values ('f2b62e46-13ed-0d79-7cc3-ed78e389b602', 2, '2023-02-16 08:47:02', 'admin', '2023-02-16 08:47:23', 'admin', null, null, 'application-producer', 'Producer Access', null, 0, null, null, 'GENERIC_UI');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('fab92221-bb3f-0de5-d056-23bb0f6ca123', 1, '2023-02-16 08:47:02', 'admin', '2023-02-16 08:47:02', null, null, null, 20, 'application_Producer:update', 1, 'f2b62e46-13ed-0d79-7cc3-ed78e389b602');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('dd3f6a49-fcdf-c66b-bb8f-2e51c1b95604', 1, '2023-02-16 08:47:02', 'admin', '2023-02-16 08:47:02', null, null, null, 10, 'application_ProducerServiceScreen', 1, 'f2b62e46-13ed-0d79-7cc3-ed78e389b602');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('e68014a2-8c27-aefe-ca49-caa83a481dc0', 1, '2023-02-16 08:47:02', 'admin', '2023-02-16 08:47:02', null, null, null, 10, 'application_Product.browse', 1, 'f2b62e46-13ed-0d79-7cc3-ed78e389b602');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('bc02b5ea-15d9-9c50-9356-2056b5ccf507', 1, '2023-02-16 08:47:02', 'admin', '2023-02-16 08:47:02', null, null, null, 20, 'application_Product:create', 1, 'f2b62e46-13ed-0d79-7cc3-ed78e389b602');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('2c442451-06c1-392c-fae2-bd787e60ee79', 1, '2023-02-16 08:47:02', 'admin', '2023-02-16 08:47:02', null, null, null, 20, 'application_Producer:read', 1, 'f2b62e46-13ed-0d79-7cc3-ed78e389b602');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('59286d9b-de9c-94c8-447a-ccf87fb1ca2f', 1, '2023-02-16 08:47:02', 'admin', '2023-02-16 08:47:02', null, null, null, 20, 'application_Product:update', 1, 'f2b62e46-13ed-0d79-7cc3-ed78e389b602');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('2f1c8e8f-7f15-fc8c-b9c4-5c78f181877a', 1, '2023-02-16 08:47:02', 'admin', '2023-02-16 08:47:02', null, null, null, 20, 'application_Producer:delete', 1, 'f2b62e46-13ed-0d79-7cc3-ed78e389b602');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('0fc3c8cf-e076-a925-93be-0af71b21b14a', 1, '2023-02-16 08:47:02', 'admin', '2023-02-16 08:47:02', null, null, null, 20, 'application_Product:read', 1, 'f2b62e46-13ed-0d79-7cc3-ed78e389b602');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('739687e2-b08b-d1a5-f6ad-a0a038e89b40', 1, '2023-02-16 08:47:02', 'admin', '2023-02-16 08:47:02', null, null, null, 10, 'application_Producer.browse', 1, 'f2b62e46-13ed-0d79-7cc3-ed78e389b602');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('5978bceb-c45b-216e-bef0-60e765ad8c73', 1, '2023-02-16 08:47:02', 'admin', '2023-02-16 08:47:02', null, null, null, 20, 'application_Product:delete', 1, 'f2b62e46-13ed-0d79-7cc3-ed78e389b602');
-- end Application Producer Role
-- start application Cashier Role
insert into SEC_ROLE
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME, LOC_NAME, DESCRIPTION, ROLE_TYPE, IS_DEFAULT_ROLE, SYS_TENANT_ID, SECURITY_SCOPE)
values ('26c64cc7-2e7c-40ef-84fb-09f5c99f065c', 1, '2023-02-16 08:56:40', 'admin', '2023-02-16 08:56:40', null, null, null, 'application-cashier', 'Cashier', null, 0, null, null, 'GENERIC_UI');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('05a5c65a-855a-f89d-aad1-4323863865f3', 1, '2023-02-16 08:56:40', 'admin', '2023-02-16 08:56:40', null, null, null, 20, 'application_Product:update', 1, '26c64cc7-2e7c-40ef-84fb-09f5c99f065c');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('7dc5f196-d45a-e90d-3887-b079150bae02', 1, '2023-02-16 08:56:40', 'admin', '2023-02-16 08:56:40', null, null, null, 20, 'application_Purchase:read', 1, '26c64cc7-2e7c-40ef-84fb-09f5c99f065c');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('0c8e8bb6-f4ee-f72e-fc24-2c3d0fa13c73', 1, '2023-02-16 08:56:40', 'admin', '2023-02-16 08:56:40', null, null, null, 20, 'application_PurchaseProduct:read', 1, '26c64cc7-2e7c-40ef-84fb-09f5c99f065c');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('baf4c190-0fbb-1240-92f6-a6db01a3aeb5', 1, '2023-02-16 08:56:40', 'admin', '2023-02-16 08:56:40', null, null, null, 10, 'application_StoreServiceScreen', 1, '26c64cc7-2e7c-40ef-84fb-09f5c99f065c');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('4b3a5a64-8ca6-47b1-3766-42e2fd552fcd', 1, '2023-02-16 08:56:40', 'admin', '2023-02-16 08:56:40', null, null, null, 10, 'application_Store.browse', 1, '26c64cc7-2e7c-40ef-84fb-09f5c99f065c');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('69bc2bfa-0c35-79c5-8e8f-83621b82e5bf', 1, '2023-02-16 08:56:40', 'admin', '2023-02-16 08:56:40', null, null, null, 20, 'application_Product:read', 1, '26c64cc7-2e7c-40ef-84fb-09f5c99f065c');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('ef77cb86-ad2a-b0e8-baf6-fb0e7be70376', 1, '2023-02-16 08:56:40', 'admin', '2023-02-16 08:56:40', null, null, null, 10, 'application_Product.browse', 1, '26c64cc7-2e7c-40ef-84fb-09f5c99f065c');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('07de226d-6502-da6f-19b9-aa7f2a5bfe6f', 1, '2023-02-16 08:56:40', 'admin', '2023-02-16 08:56:40', null, null, null, 20, 'application_Store:read', 1, '26c64cc7-2e7c-40ef-84fb-09f5c99f065c');
-- end application Cashier Role
-- start application Buyer Role
insert into SEC_ROLE
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME, LOC_NAME, DESCRIPTION, ROLE_TYPE, IS_DEFAULT_ROLE, SYS_TENANT_ID, SECURITY_SCOPE)
values ('f55ac0de-9326-aed4-431f-f3c88fc0c062', 1, '2023-02-16 08:58:31', 'admin', '2023-02-16 08:58:31', null, null, null, 'application-buyer', 'Buyer', null, 0, null, null, 'GENERIC_UI');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('aa7d6461-01da-a703-4ede-7c370a1a7b36', 1, '2023-02-16 08:58:31', 'admin', '2023-02-16 08:58:31', null, null, null, 20, 'application_Purchase:update', 1, 'f55ac0de-9326-aed4-431f-f3c88fc0c062');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('dc9931f8-6cc3-8994-38ff-68d58e455d3a', 1, '2023-02-16 08:58:31', 'admin', '2023-02-16 08:58:31', null, null, null, 20, 'application_Purchase:read', 1, 'f55ac0de-9326-aed4-431f-f3c88fc0c062');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('9ba17fbd-a2d7-15f0-df9b-42c57c3f666e', 1, '2023-02-16 08:58:31', 'admin', '2023-02-16 08:58:31', null, null, null, 20, 'application_Purchase:create', 1, 'f55ac0de-9326-aed4-431f-f3c88fc0c062');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('5171ad8c-444e-a45e-f7b3-c7d08fb291e9', 1, '2023-02-16 08:58:31', 'admin', '2023-02-16 08:58:31', null, null, null, 20, 'application_PurchaseProduct:delete', 1, 'f55ac0de-9326-aed4-431f-f3c88fc0c062');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('98363110-1c6d-2107-3473-66e24b5c394b', 1, '2023-02-16 08:58:31', 'admin', '2023-02-16 08:58:31', null, null, null, 20, 'application_PurchaseProduct:create', 1, 'f55ac0de-9326-aed4-431f-f3c88fc0c062');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('9fee6d5b-1c7f-f9f1-c61c-576f96316d22', 1, '2023-02-16 08:58:31', 'admin', '2023-02-16 08:58:31', null, null, null, 10, 'application_Purchase.browse', 1, 'f55ac0de-9326-aed4-431f-f3c88fc0c062');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('b6f94461-73ee-92b7-75d1-7bbc01dd600a', 1, '2023-02-16 08:58:31', 'admin', '2023-02-16 08:58:31', null, null, null, 20, 'application_PurchaseProduct:update', 1, 'f55ac0de-9326-aed4-431f-f3c88fc0c062');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('6a6d3339-2170-d58a-ec79-0c7e3ee239d7', 1, '2023-02-16 08:58:31', 'admin', '2023-02-16 08:58:31', null, null, null, 20, 'application_Purchase:delete', 1, 'f55ac0de-9326-aed4-431f-f3c88fc0c062');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('aece473b-2dfe-2af6-5fc7-4c199b15c928', 1, '2023-02-16 08:58:31', 'admin', '2023-02-16 08:58:31', null, null, null, 20, 'application_PurchaseProduct:read', 1, 'f55ac0de-9326-aed4-431f-f3c88fc0c062');
-- end application Buyer Role
-- start application Online Store Employee Role
insert into SEC_ROLE
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME, LOC_NAME, DESCRIPTION, ROLE_TYPE, IS_DEFAULT_ROLE, SYS_TENANT_ID, SECURITY_SCOPE)
values ('ca0159ab-16e4-7925-ae45-4e242ab88230', 1, '2023-02-16 09:01:46', 'admin', '2023-02-16 09:01:46', null, null, null, 'application-online-store-employee', 'Online Store Employee', null, 0, null, null, 'GENERIC_UI');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('d5cf650a-a210-50bc-5ae5-249d92bfca2e', 1, '2023-02-16 09:01:46', 'admin', '2023-02-16 09:01:46', null, null, null, 10, 'application_Store.browse', 1, 'ca0159ab-16e4-7925-ae45-4e242ab88230');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('7b723587-1e3e-778b-f8d7-3128a823f06d', 1, '2023-02-16 09:01:46', 'admin', '2023-02-16 09:01:46', null, null, null, 20, 'application_Product:create', 1, 'ca0159ab-16e4-7925-ae45-4e242ab88230');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('2a2d3be1-1624-2848-7cc3-94afd5233d3d', 1, '2023-02-16 09:01:46', 'admin', '2023-02-16 09:01:46', null, null, null, 20, 'application_Store:update', 1, 'ca0159ab-16e4-7925-ae45-4e242ab88230');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('36fdaab4-41cc-cee6-85b7-d79385a726a5', 1, '2023-02-16 09:01:46', 'admin', '2023-02-16 09:01:46', null, null, null, 20, 'application_Store:read', 1, 'ca0159ab-16e4-7925-ae45-4e242ab88230');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('8b65ca50-e625-a79e-9e32-74052b450022', 1, '2023-02-16 09:01:46', 'admin', '2023-02-16 09:01:46', null, null, null, 10, 'application_Product.browse', 1, 'ca0159ab-16e4-7925-ae45-4e242ab88230');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('b667a69c-5e7d-18e9-fe7a-b12228cb87f3', 1, '2023-02-16 09:01:46', 'admin', '2023-02-16 09:01:46', null, null, null, 20, 'application_Product:delete', 1, 'ca0159ab-16e4-7925-ae45-4e242ab88230');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('d0dd28ec-9a58-6724-5abd-178cd6df528c', 1, '2023-02-16 09:01:46', 'admin', '2023-02-16 09:01:46', null, null, null, 20, 'application_Product:read', 1, 'ca0159ab-16e4-7925-ae45-4e242ab88230');

insert into SEC_PERMISSION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, PERMISSION_TYPE, TARGET, VALUE_, ROLE_ID)
values ('e0f4eb49-eb13-e956-5447-54508305dd95', 1, '2023-02-16 09:01:46', 'admin', '2023-02-16 09:01:46', null, null, null, 20, 'application_Product:update', 1, 'ca0159ab-16e4-7925-ae45-4e242ab88230');
-- end application Online Store Employee Role

-- start application Producer Group
insert into SEC_GROUP
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME, PARENT_ID, SYS_TENANT_ID)
values ('f146a2f3-9373-df41-ed81-c0b16ba23932', 1, '2023-02-16 09:10:28', 'admin', '2023-02-16 09:10:28', null, null, null, 'Producer', '0fa2b1a5-1d68-4d69-9fbd-dff348347f93', null);
-- end
-- start application Store Group
insert into SEC_GROUP
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME, PARENT_ID, SYS_TENANT_ID)
values ('a4069615-fff0-9686-f142-e9bc5c241ab7', 1, '2023-02-16 09:21:49', 'admin', '2023-02-16 09:21:49', null, null, null, 'Store', '0fa2b1a5-1d68-4d69-9fbd-dff348347f93', null);
-- end
-- start application Buyer Group
insert into SEC_GROUP
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME, PARENT_ID, SYS_TENANT_ID)
values ('ed0c78a0-3412-caaf-e94b-12d067d6703c', 1, '2023-02-16 09:10:53', 'admin', '2023-02-16 09:10:53', null, null, null, 'Buyer', '0fa2b1a5-1d68-4d69-9fbd-dff348347f93', null);
-- end