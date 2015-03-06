<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">

	<div class="container">
	
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> 
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			
			<a class="navbar-brand" href="${createLink(uri: '/')}">${meta(name:'app.name')}</a>
		</div>
		
		<div class="navbar-collapse navbar-ex1-collapse collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>			
			</ul>
			
			<ul class="nav navbar-nav navbar-right">
				<g:render template="/_menu/admin"/>														
				<g:render template="/_menu/user"/>
		    </ul>
	    
		</div>
		<!--/.nav-collapse -->
	</div>
</div>