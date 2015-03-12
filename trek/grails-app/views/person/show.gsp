
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
			<h1>${personInstance.name} <small>${personInstance.rank}</small></h1>
		</div>
		
		<person:bio person="${personInstance}" />
		
		<div class="page-header">
			<h2>Assignments</h2>
		</div>
		
		<p>Most recent assignment: <person:mostRecentAssignment person="${personInstance}" /></p>
		
		<p>All assignments</p>
		<person:assignments person="${personInstance}" />

	</div>
	
	<div class="col-sm-4">
	
		<g:if test="${personInstance.mediaPath}">
			<asset:image class="img-responsive img-thumbnail" src="trek/${personInstance.mediaPath}" alt="${personInstance.name}"/>
		</g:if>
		<g:else>
			<img class="img-responsive img-thumbnail" data-src="holder.js/200x200" alt="Alas, no photo for $personInstance.name" />
		</g:else>
		
		<table class="table">
			<tbody>
			
				<tr>
					<td><g:message code="person.name.label" default="Name" /></td>
					
					<td>${fieldValue(bean: personInstance, field: "name")}</td>
					
				</tr>
			
				<tr>
					<td><g:message code="person.gender.label" default="Gender" /></td>
					
					<td>${personInstance?.gender?.encodeAsHTML()}</td>
					
				</tr>
				
				<tr>
					<td><g:message code="person.rank.label" default="Rank" /></td>
					
					<td>${fieldValue(bean: personInstance, field: "rank")}</td>
					
				</tr>
				
				<tr>
					<td><g:message code="person.affiliation.label" default="Affiliation" /></td>
					
					<td>
						<g:link controller="organization" action="show" id="${personInstance.worksFor.id}">
							${fieldValue(bean: personInstance, field: "worksFor")}
						</g:link>
					</td>
				
				</tr>
				
				<tr>
					<td><g:message code="person.occupation.label" default="Occupation" /></td>
					
					<td><person:mostRecentAssignment person="${personInstance}" /></td>
					
				</tr>
			
			
				<tr>
					<td><g:message code="person.birthDate.label" default="Birth Date" /></td>
					
					<td><g:formatDate date="${personInstance?.birthDate}" format="MM-dd-yyyy" /></td>
					
				</tr>
						
			</tbody>
		</table>
		
	</div>
	
</section>

</body>

</html>
