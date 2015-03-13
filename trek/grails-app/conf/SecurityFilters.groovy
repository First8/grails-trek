class SecurityFilters {

	//TODON: Wikipedia says: "Cross-cutting concerns are parts of a program that rely on or must affect many other parts of the system."
	//       Filters are the way in Grails to make cross-cutting concerns implemented in one location. They affect the way controllers
	//       are executed.
	//
	//       Implement your own filter that checks whether a user is logged in, before the controller action is executed. If no user is
	//       logged in, it should not be able to update or delete stuff in/from the database.
	//
	//       Hints:
	//       - read http://grails.github.io/grails-doc/2.4.4/guide/single.html#filters for more information
	//       - the strings after controller and action are regexps, where * are replaced by .*
	//       - see DashboardController how to use dependency injection, so you can ask the securityService if a user is logged in
	// 	     - if not, redirect your user to the login action of the UserController 
	//       - "Return false to indicate that the response has been handled and that all future filters and the action should not execute"
    def filters = {
        all(controller:'*', action:'*') {
            before = {
				
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
