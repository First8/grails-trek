
<%@ page import="nl.first8.trek.Person" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="lcars" />
	<g:set var="entityName" value="${message(code: 'person.label', default: 'Person')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>

<body>

<section id="list-person" class="first">

		<div class="page-header">
			<h2>All personnel</h2>
		</div>
		
		<div class="row">
		<g:each in="${personInstanceList}" status="i" var="personInstance">
			
			<div class="col-sm-2 col-xs-2">
				<div class="thumbnail">
					<g:if test="${personInstance.mediaPath}">
						<asset:image class="img-thumbnail" src="trek/${personInstance.mediaPath}" alt="${personInstance.name}"/>
					</g:if>
					<div class="caption">
						<g:link action="show" id="${personInstance.id}">${fieldValue(bean: personInstance, field: "name")}</g:link>
						<p>${fieldValue(bean: personInstance, field: "rank")}</p>
					</div>
				</div>
			</div>

		</g:each>
		</div>

</section>

</body>

</html>
