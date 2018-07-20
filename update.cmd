@echo off
title Git update

set project=java11poz
set dev_local=%userprofile%\desktop\dev\
set git_app=%dev_local%apps\git\bin\git.exe

IF NOT EXIST %dev_local%apps\git\bin\git.exe (
		set git_app="C:\Program Files\Git\bin\git.exe"
        timeout /T3
)
IF NOT EXIST "C:\Program Files\Git\bin\git.exe" (
		echo git executable is missing! Please install git
        pause
)
set mvn_app=%dev_local%apps\apache-maven-3.5.2\bin\mvn

IF EXIST %dev_local%java\jdk1.8.0_152 (
		set JAVA_HOME=%dev_local%java\jdk1.8.0_152
        timeout /T3
)

set chrome_app=%dev_local%apps\GoogleChromePortable\GoogleChromePortable.exe
echo Current path: %dev_local%
echo git path: %git_app%
echo mvn path: %mvn_app%
echo project: %dev_local%git\github\%project%

IF NOT EXIST %git_app% (
        echo git executable is missing!
        timeout /T3
)
    
cd /d %dev_local%git\github\%project%

%git_app% reset --hard HEAD
%git_app% fetch --all
%git_app% reset --hard origin/master

timeout /T 3
exit