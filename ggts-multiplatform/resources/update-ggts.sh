#!/bin/bash
# jdk toegevoegd
# jdk, workspace en memory settings in GGTS.ini (bij macOs hier: ggts-3.6.3.SR1/GGTS.app/Contents/MacOS)
VERSION=3.6.4.RELEASE-e4.4.2
echo "Downloading eclipse ${VERSION} for all platforms..."
parallel ::: \
"wget http://dist.springsource.com/release/STS/3.6.4.RELEASE/dist/e4.4/groovy-grails-tool-suite-${VERSION}-win32.zip" \
"wget http://dist.springsource.com/release/STS/3.6.4.RELEASE/dist/e4.4/groovy-grails-tool-suite-${VERSION}-macosx-cocoa-x86_64.tar.gz" \
"wget http://dist.springsource.com/release/STS/3.6.4.RELEASE/dist/e4.4/groovy-grails-tool-suite-${VERSION}-linux-gtk-x86_64.tar.gz"

echo "Done."
