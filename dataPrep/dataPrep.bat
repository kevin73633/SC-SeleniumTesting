@echo off
SET PGPASSWORD=password_predevscpgadmin
"%USERPROFILE%\AppData\Local\Programs\pgAdmin 4\runtime\psql" -h dbs-aurora-predevezapp-predevsccluster03.cluster-cgw632hbyo27.ap-southeast-1.rds.amazonaws.com -d predevscpg_new -U predevscpgadmin -f "%~dp0script1.sql"
"%USERPROFILE%\AppData\Local\Programs\pgAdmin 4\runtime\psql" -h dbs-aurora-predevezapp-predevsccluster03.cluster-cgw632hbyo27.ap-southeast-1.rds.amazonaws.com -d predevscpg_new -U predevscpgadmin -f "%~dp0script2.sql"
pause