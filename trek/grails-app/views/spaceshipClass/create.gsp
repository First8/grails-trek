<%@ page import="nl.first8.trek.SpaceshipClass" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="lcars" />
	<g:set var="entityName" value="${message(code: 'spaceshipClass.label', default: 'SpaceshipClass')}" />
	<title><g:message code="default.create.label" args="[entityName]" /></title>
</head>

<body>

<h1>TEST</h1>

	<section id="create-spaceshipClass" class="first">

		<g:hasErrors bean="${spaceshipClassInstance}">
		<div class="alert alert-danger">
			<g:renderErrors bean="${spaceshipClassInstance}" as="list" />
		</div>
		</g:hasErrors>

		<g:form action="save" class="form-horizontal" role="form" >
			<div class="form-group  required">
				<label for="name" class="col-sm-2 control-label">Name<span class="required-indicator">*</span></label>
				<div class="col-sm-10">
					<input class="form-control" name="name" required="" value="" id="name" type="text">
					<span class="help-inline"></span>
				</div>
			</div>

			<div class="form-group  ">
				<label for="length" class="col-sm-2 control-label">Length</label>
				<div class="col-sm-10">
					<input class="form-control" name="length" value="" id="length" type="null">
					<span class="help-inline"></span>
				</div>
			</div>

			<div class="form-group  ">
				<label for="width" class="col-sm-2 control-label">Width</label>
				<div class="col-sm-10">
					<input class="form-control" name="width" value="" id="width" type="null">
					<span class="help-inline"></span>
				</div>
			</div>

			<div class="form-group  ">
				<label for="height" class="col-sm-2 control-label">Height</label>
				<div class="col-sm-10">
					<input class="form-control" name="height" value="" id="height" type="null">
					<span class="help-inline"></span>
				</div>
			</div>

			<div class="form-group  ">
				<label for="mediaPath" class="col-sm-2 control-label">Media Path</label>
				<div class="col-sm-10">
					<input class="form-control" name="mediaPath" value="" id="mediaPath" type="text">
					<span class="help-inline"></span>
				</div>
			</div>

			<div class="form-group  required">
				<label for="operatedBy" class="col-sm-2 control-label">Operated By<span class="required-indicator">*</span></label>
				<div class="col-sm-10">
					<input class="form-control" placeholder="Starfleet" name="operatedBy.name" value="" id="operatedBy" type="text">
					<span class="help-inline"></span>
				</div>
			</div>

			<div class="form-actions margin-top-medium">
				<g:submitButton name="create" class="btn btn-primary" value="${message(code: 'default.button.create.label', default: 'Create')}" />
	            <button class="btn" type="reset"><g:message code="default.button.reset.label" default="Reset" /></button>
			</div>
		</g:form>

	</section>

</body>

</html>
