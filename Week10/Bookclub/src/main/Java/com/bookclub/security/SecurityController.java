@Controller decorator
public class SecurityController {
    
        @Requestmapping(path= "/login", method=RequestMethod.GET)
        public String showLoginPage(){
            return "login";
        }


        @Requestmapping(path= "/logout", method=RequestMethod.GET)
        public String logout(HttpServletRequest request, HttpServletResponse response){
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();

            if ( auth != null) {
                new SecurityContextLogoutHandler().logout(request, response,auth);
            }

            return "redirect:/login?logout=true";
        }
    }




