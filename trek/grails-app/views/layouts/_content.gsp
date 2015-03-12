<div class="container">
	<!-- Main menu in one row (e.g., controller entry points -->
	<g:if test="${!layout_nomainmenu}">
		<g:render template="/_menu/menubar"/>
	</g:if>
	
	<div class="row">
		<div class="col-sm-12">
			<asset:image class="img-responsive" src="trek/dashboard-leader.png" />
		</div>
	</div>
	
	<!-- Secondary menu in one row (e.g., actions for current controller) -->
	<g:if test="${!layout_nosecondarymenu}">
		<g:render template="/_menu/submenubar"/>														
	</g:if>
	

	
	<!-- print system messages (infos, warnings, etc) - not validation errors -->
	<g:if test="${flash.message && !layout_noflashmessage}">
		<div class="alert alert-info">${flash.message}</div>
	</g:if>

	<g:layoutBody />
	<g:pageProperty name="page.body" />
</div>
