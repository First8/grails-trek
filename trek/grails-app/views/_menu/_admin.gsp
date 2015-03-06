<li class="dropdown">
	<a class="dropdown-toggle" data-toggle="dropdown" href="#">
   		<i class="glyphicon glyphicon-wrench"></i>
		<g:message code="default.admin.label"/><b class="caret"></b>
	</a>
	<ul class="dropdown-menu">
		<li class="">
			<a tabindex="-1" href="#"><b>Technical Admin</b></a>
		</li>
		<g:if env="development">
		<li class="">
			<a href="${createLink(uri: '/dbconsole')}">
				<i class="glyphicon glyphicon-dashboard"></i>
				<g:message code="default.dbconsole.label"/>
			</a>
		</li>
		</g:if>
		<li class="divider"></li>
	    <li class="">
			<a tabindex="-1" href="#"><b>Controllers</b></a>
		</li>
	    <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
			<li class="controller">
				<g:link controller="${c.logicalPropertyName}">
					${c.fullName.substring(c.fullName.lastIndexOf('.')+1)}
				</g:link>
			</li>
		</g:each>
	</ul>
</li>
