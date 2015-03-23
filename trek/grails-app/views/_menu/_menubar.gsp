<div class="">
	<ul class="nav nav-tabs" data-role="listview" data-split-icon="gear" data-filter="true">
	
		<g:each status="i" var="c" in="${grailsApplication.controllerClasses.findAll { it.packageName.startsWith "nl.first8" }.sort { it.logicalPropertyName }.grep { it.logicalPropertyName != 'mission'} }">
			<li class="controller${params.controller == c.logicalPropertyName ? " active" : ""}">
				<g:link controller="${c.logicalPropertyName}" action="index">
					<g:message code="${c.logicalPropertyName}.label" default="${c.logicalPropertyName.capitalize()}"/>
				</g:link>
			</li>
		</g:each>
		
	</ul>
</div>
