class UrlMappings {

	/**
	 * TODO01: start your application by running: grails run-app.
	 * Easiest way to do this: right click on the project, click "Run As", "Grails Command (run-app)".
	 * Another way: Ctrl+Alt+Shift+G will open the Grails Command Prompt. You can enter all kinds of command there, one of them being run-app.
	 */
	static mappings = {
        //TODO09: click on the PERSON link, then CREATE.
		//Then look at the url in your browser address bar.
		//It will match this rule:
		"/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
		
		
        // TODO02: after starting your application, click the link in your console. It will match this rule:
		"/"(controller:"dashboard") //which says: map / to the DashBoardController, index method (index = default).
                                    //this would have done the same:
		                            // "/"(controller:"dashboard", action: "index")
		//(the '/trek' comes from the application name, @see application.properties)
		
        "500"(view:'/error')
	}
}
