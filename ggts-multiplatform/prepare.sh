#!/bin/bash
TREK=`pwd`

# set absolute path to grails distro for linux platform
GDIR="${TREK}/ggts-bundle-linux-x64/grails-2.4.4"
echo "Grails distro: ${GDIR}"
SEDCMD="s|<home>.*<\/home>|<home>${GDIR}<\/home>|g"
sed -i -- ${SEDCMD} ./workspace/.metadata/.plugins/org.grails.ide.eclipse.core/grails.installs

# update work directory in JVM startup options in eclipse preferences
GRAILSWORK="org.grails.ide.eclipse.core.JVM_ARGS=-Dgrails.work.dir\=${TREK}/workspace/trek/target/work -Dgrails.dependency.cache.dir\=${TREK}/workspace/trek/dependencies"
echo "WORK SETTINGS: ${GRAILSWORK}"
PREFS="${TREK}/workspace/.metadata/.plugins/org.eclipse.core.runtime/.settings/org.grails.ide.eclipse.core.prefs"
sed -i -- "s|org.grails.ide.eclipse.core.JVM_ARGS.*$|${GRAILSWORK}|g" "${PREFS}"

