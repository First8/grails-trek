
<%@ page import="nl.first8.trek.Person" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="lcars" />
	<g:set var="entityName" value="${message(code: 'person.label', default: 'Person')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-person" class="first">

	<div class="col-sm-8">

		<div class="page-header">
			<h1>${personInstance.name}</h1>
		</div>
		<p class="lead">
			<person:intro />
		</p>
		
		<div class="page-header">
			<h2>Assignments</h2>
		</div>
		
		<p>Most recent assignment: <person:mostRecentAssignment person="${personInstance}" /></p>
		
		<p>All assignments</p>
		<person:assignments person="${personInstance}" />

	</div>
	
	<div class="col-sm-4">
	
		<asset:image class="img-thumbnail" src="trek/${personInstance.name}.jpg" alt="${personInstance.name}"/>
		
		<table class="table">
			<tbody>
			
				<tr class="prop">
					<td valign="top" class="name"><g:message code="person.name.label" default="Name" /></td>
					
					<td valign="top" class="value">${fieldValue(bean: personInstance, field: "name")}</td>
					
				</tr>
			
				<tr class="prop">
					<td valign="top" class="name"><g:message code="person.rank.label" default="Rank" /></td>
					
					<td valign="top" class="value">${fieldValue(bean: personInstance, field: "rank")}</td>
					
				</tr>
			
				<tr class="prop">
					<td valign="top" class="name"><g:message code="person.gender.label" default="Gender" /></td>
					
					<td valign="top" class="value">${personInstance?.gender?.encodeAsHTML()}</td>
					
				</tr>
			
				<tr class="prop">
					<td valign="top" class="name"><g:message code="person.birthDate.label" default="Birth Date" /></td>
					
					<td valign="top" class="value"><g:formatDate date="${personInstance?.birthDate}" format="MM-dd-yyyy" /></td>
					
				</tr>
						
			</tbody>
		</table>
		
	</div>
	
</section>

</body>

</html>
