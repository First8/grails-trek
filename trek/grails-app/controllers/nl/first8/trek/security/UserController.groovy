package nl.first8.trek.security

class UserController {
    static scaffold = true
	
	def securityService
	
	/**
	 * Log user in with userName and password.
	 * 
	 * @return redirect to dashboard if success
	 */
	def login() {
		// try and found user
		def user = User.findByUserName(params.userName)
		
		// see if passwords match
		if (user && user.password == params.password){
			securityService.login(user)
			redirect controller: 'dashboard', action: 'index'
		} else {
			flash.message = "Invalid username and password."
			render view: 'login'
		}
	}
	
	/**
	 * Log user out.
	 */
	def logout = {
		securityService.logout()
		redirect uri: '/'
	}

}
