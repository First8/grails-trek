<%@ page import="nl.first8.trek.security.User" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="lcars" />
	<g:set var="entityName" value="${message(code: 'user.label', default: 'User')}" />
	<title><g:message code="default.login.label" args="[entityName]" /></title>
	<g:set var="layout_nomainmenu"		value="${true}" scope="request"/>
	<g:set var="layout_nosecondarymenu"	value="${true}" scope="request"/>
</head>

<body>

	<section id="login-user" class="row first">
	
		<div class="col-sm-4">
			<asset:image class="img-responsive hidden-xs" src="trek/starfleet-security.png" />
		</div>
	
		<div class="col-sm-8">

		<g:hasErrors bean="${user}">
		<div class="alert alert-danger">
			<g:renderErrors bean="${user}" as="list" />
		</div>
		</g:hasErrors>

		<g:form action="login" class="form-horizontal" role="form" >
			
			<div class="form-group ${hasErrors(bean: user, field: 'userName', 'error')} ">
				<label for="userName" class="col-sm-2 control-label"><g:message code="user.userName.label" default="User Name" /></label>
				<div class="col-sm-10">
					<g:textField class="form-control" name="userName" required="" value="${user?.userName}" placeholder="User Name"/>
					<span class="help-inline">${hasErrors(bean: user, field: 'userName', 'error')}</span>
				</div>
			</div>

			<div class="form-group ${hasErrors(bean: user, field: 'password', 'error')} required">
				<label for="password" class="col-sm-2 control-label"><g:message code="user.password.label" default="Password" /><span class="required-indicator">*</span></label>
				<div class="col-sm-10">
					<g:textField class="form-control" name="password" required="" value="${user?.password}" placeholder="Password"/>
					<span class="help-inline">${hasErrors(bean: user, field: 'password', 'error')}</span>
				</div>
			</div>

			<div class="form-actions margin-top-medium">
				<g:submitButton name="create" class="btn btn-primary" value="${message(code: 'default.button.login.label', default: 'Login')}" />
	            <button class="btn" type="reset"><g:message code="default.button.reset.label" default="Reset" /></button>
			</div>
		</g:form>
		
		</div>
		
	</section>

</body>

</html>
