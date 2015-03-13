<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="lcars"/>
		<title>Starfleet Dashboard</title>
	</head>
	<body>
			
		<div class="row">
		
		<div class="col-sm-8">
			
			<sec:ifNotLoggedIn>
			
				<div class="jumbotron">
					<h1>Dashboard</h1>
					<p>
						Welcome to the LCARS dashboard. Please have a look around. You can view your collegues 
						or <g:link controller="user" action="login">sign in</g:link>.
					</p>
				</div>
				
			</sec:ifNotLoggedIn>
			
			<%--TODO6: you can also make your own tag libraries.
			          See SecurityTagLib in taglib (to do nr 7). --%>
			<sec:ifLoggedIn>
			
				<div class="jumbotron">
					<%-- TODO5: ...which can be used in the view.
					     As you can see, this file is called index.gsp, the same as the action (index) in the controller.
					     Also, this file is in the dashboard directory of the views directory, which links it to the DashboardController.
					     
					     This all is according to Grails' mantra: convention over configuration.
					 --%>
			        <h1>Hello, ${currentPerson.name}!</h1>
			        <p>Welcome back ${currentPerson.rank} ${currentPerson.name}, ready to get to work!</p>
			        
			        <p><a href="#" class="btn btn-primary btn-lg" role="button">Learn more &raquo;</a></p>
			        
			        <h2>Collegues</h2>
			        <%-- Normal HTML can be intertwined with Grails-specific tags, such as g:each.
			        	 See http://grails.github.io/grails-doc/2.4.x/ref/Tags/each.html for documentation.
			        	 Other built-in tags are to the right of that page.
			         --%>
					<g:each in="${colleagues}" var="person">
						<div class="media">
							<div class="media-left media-middle">
								<a href="#">
									<asset:image class="media-object" style="max-width: 50px" src="trek/${person.mediaPath}" alt="${person.name}"/>
								</a>
							</div>
							<div class="media-body">
								<h4 class="media-heading">${person.name}</h4>
								${person.rank} / ${person.worksFor}
							</div>
						</div>
					</g:each>
		        </div>
	        </sec:ifLoggedIn>
		        	        
	      </div>
	
		<div class="col-sm-4" role="complementary">
			<div class="page-header">
				<h3>Application Status</h3>
			</div>
			<ul>
				<li>App version: <g:meta name="app.version"/></li>
				<li>Grails version: <g:meta name="app.grails.version"/></li>
				<li>Groovy version: ${GroovySystem.getVersion()}</li>
				<li>JVM version: ${System.getProperty('java.version')}</li>
				<li>Reloading active: ${grails.util.Environment.reloadingAgentEnabled}</li>
				<li>Controllers: ${grailsApplication.controllerClasses.size()}</li>
				<li>Domains: ${grailsApplication.domainClasses.size()}</li>
				<li>Services: ${grailsApplication.serviceClasses.size()}</li>
				<li>Tag Libraries: ${grailsApplication.tagLibClasses.size()}</li>
			</ul>
			<div class="page-header">
				<h3>Installed Plugins</h3>
			</div>
			<ul>
				<g:each var="plugin" in="${applicationContext.getBean('pluginManager').allPlugins}">
					<li>${plugin.name} - ${plugin.version}</li>
				</g:each>
			</ul>
		</div>
				
		</div>
		
	</body>
</html>
