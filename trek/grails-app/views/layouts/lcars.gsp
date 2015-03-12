<!DOCTYPE html>
<html lang="en">
<head>
	<title><g:layoutTitle /> - ${meta(name:'app.name')}</title>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="">
	
	
	<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!--[if lt IE 9]>
	      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
	      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
	    <![endif]-->
	<asset:stylesheet src="application-lcars.css" />
	<g:layoutHead />
</head>

<body>
	<g:render template="/_menu/navbar"/>
	<g:render template="/layouts/content"/>	
	<div id="spinner" class="spinner" style="display: none;">
		<g:message code="spinner.alt" default="Loading&hellip;" />
	</div>
	<g:render template="/layouts/footer" />
	<asset:javascript src="application-lcars.js" />
</body>
</html>