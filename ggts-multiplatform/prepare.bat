@echo off
set TREK=%~dp0
set TREKFWD=%TREK:\=/%

rem set absolute path to grails distro for windows platform
set GDIR=%TREK%ggts-bundle-win32-i586\grails-2.4.4\

rem escape backslashes as to not confuse sed
set GDIR=%GDIR:\=\\%
echo %GDIR%
.\resources\sed-win32\bin\sed.exe -- "s|<home>.*<\/home>|<home>%GDIR%<\/home>|g" workspace\.metadata\.plugins\org.grails.ide.eclipse.core\grails.installs > grails.installs.update
move /y grails.installs.update workspace\.metadata\.plugins\org.grails.ide.eclipse.core\grails.installs

rem update work directory in JVM startup options in eclipse preferences
set GRAILSWORK=org.grails.ide.eclipse.core.JVM_ARGS=-Dgrails.work.dir\=%TREKFWD%workspace/work -Dgrails.dependency.cache.dir\=%TREKFWD%workspace/dependencies
echo WORK SETTINGS: %GRAILSWORK%
set PREFS=%TREKFWD%workspace/.metadata/.plugins/org.eclipse.core.runtime/.settings/org.grails.ide.eclipse.core.prefs
.\resources\sed-win32\bin\sed.exe -- "s|org.grails.ide.eclipse.core.JVM_ARGS.*$|%GRAILSWORK%|g" %PREFS% > org.grails.ide.eclipse.core.prefs.update
move /y org.grails.ide.eclipse.core.prefs.update %PREFS%

