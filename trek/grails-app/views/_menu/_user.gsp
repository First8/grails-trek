<%--<ul class="nav pull-right">--%>
	<li class="dropdown">
	
<sec:ifNotLoggedIn>

		<a class="dropdown-toggle" data-toggle="dropdown" href="#">
    		<i class="glyphicon glyphicon-user"></i>
    		<g:message code="security.signin.label"/><b class="caret"></b>
		</a>

		<ul class="dropdown-menu" role="menu">
			<li class="form-container">
				<g:form controller="user" action="login" method="post" accept-charset="UTF-8">
					<g:textField class="form-control margin-bottom-medium" name="userName" required="" id="userName" placeholder="User Name"/>
					<g:textField class="form-control margin-bottom-medium" name="password" required="" id="password" placeholder="Password"/>
					<input class="btn btn-primary btn-block" type="submit" id="sign-in" value="Sign In">
				</g:form>
			</li>
		</ul>

</sec:ifNotLoggedIn>
<sec:ifLoggedIn>

		<a class="dropdown-toggle" role="button" data-toggle="dropdown" data-target="#" href="#">
			<i class="glyphicon glyphicon-user icon-white"></i>
			Hi there, <sec:username/>
			<b class="caret"></b>
		</a>
		<ul class="dropdown-menu" role="menu">
			<li class="">
				<g:link controller="user" action="show">
					<i class="glyphicon glyphicon-user"></i>
					<g:message code="user.show.label"/>
				</g:link>	
			</li>
			<li class="">
				<g:link controller="user" action="logout">
					<i class="glyphicon glyphicon-edit"></i>
					<g:message code="user.settings.change.label"/>
				</g:link>
			</li>
			
			<li class="divider"></li>
			<li class="">
				<g:link controller="user" action="logout">
					<i class="glyphicon glyphicon-off"></i>
					<g:message code="security.signoff.label"/>
				</g:link>
			</li>
		</ul>

</sec:ifLoggedIn>

	</li>
<%--</ul>--%>

<noscript>
<ul class="nav pull-right">
	<li class="">
		<g:link controller="user" action="show"><g:message code="default.user.unknown.label"/></g:link>
	</li>
</ul>
</noscript>
