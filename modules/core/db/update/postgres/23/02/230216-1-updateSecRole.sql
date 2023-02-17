-- start Application Store Employee Role
update SEC_ROLE
set VERSION=2, CREATE_TS='2023-02-16 08:40:01', CREATED_BY='admin', UPDATE_TS='2023-02-16 08:47:35', UPDATED_BY='admin', DELETE_TS=null, DELETED_BY=null, NAME='application-store-employee', LOC_NAME='Store Employee', DESCRIPTION=null, ROLE_TYPE=0, IS_DEFAULT_ROLE=null, SYS_TENANT_ID=null, SECURITY_SCOPE='GENERIC_UI'
where ID='83b5af10-c882-8b86-7440-13296f5e24d2';
-- end
-- start Application Producer Role
update SEC_ROLE
set VERSION=2, CREATE_TS='2023-02-16 08:47:02', CREATED_BY='admin', UPDATE_TS='2023-02-16 08:47:23', UPDATED_BY='admin', DELETE_TS=null, DELETED_BY=null, NAME='application-producer', LOC_NAME='Producer Access', DESCRIPTION=null, ROLE_TYPE=0, IS_DEFAULT_ROLE=null, SYS_TENANT_ID=null, SECURITY_SCOPE='GENERIC_UI'
where ID='f2b62e46-13ed-0d79-7cc3-ed78e389b602';
-- end
-- start application Cashier Role
update SEC_ROLE
set VERSION=1, CREATE_TS='2023-02-16 08:56:40', CREATED_BY='admin', UPDATE_TS='2023-02-16 08:56:40', UPDATED_BY=null, DELETE_TS=null, DELETED_BY=null, NAME='application-cashier', LOC_NAME='Cashier', DESCRIPTION=null, ROLE_TYPE=0, IS_DEFAULT_ROLE=null, SYS_TENANT_ID=null, SECURITY_SCOPE='GENERIC_UI'
where ID='26c64cc7-2e7c-40ef-84fb-09f5c99f065c';
-- end application Cashier Role
-- start application Buyer Role
update SEC_ROLE
set VERSION=1, CREATE_TS='2023-02-16 08:58:31', CREATED_BY='admin', UPDATE_TS='2023-02-16 08:58:31', UPDATED_BY=null, DELETE_TS=null, DELETED_BY=null, NAME='application-buyer', LOC_NAME='Buyer', DESCRIPTION=null, ROLE_TYPE=0, IS_DEFAULT_ROLE=null, SYS_TENANT_ID=null, SECURITY_SCOPE='GENERIC_UI'
where ID='f55ac0de-9326-aed4-431f-f3c88fc0c062';
-- end
-- start application Online Store Employee Role
update SEC_ROLE
set VERSION=1, CREATE_TS='2023-02-16 09:01:46', CREATED_BY='admin', UPDATE_TS='2023-02-16 09:01:46', UPDATED_BY=null, DELETE_TS=null, DELETED_BY=null, NAME='application-online-store-employee', LOC_NAME='Online Store Employee', DESCRIPTION=null, ROLE_TYPE=0, IS_DEFAULT_ROLE=null, SYS_TENANT_ID=null, SECURITY_SCOPE='GENERIC_UI'
where ID='ca0159ab-16e4-7925-ae45-4e242ab88230';
-- end application Online Store Employee Role
