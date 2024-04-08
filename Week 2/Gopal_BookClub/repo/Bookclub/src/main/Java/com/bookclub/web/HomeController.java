@controller
@requestmapping("/")

Public Class HomeController {
    @requestmapping(method = RequestMthos.Get)
    public String showHome(Model model) {
        return "index";
        }

      
    @requestmapping(method = RequestMthos.Get, path = "/about")
     public String showAboutUs(Model model) {
            return "about";
            }

    @requestmapping(method = RequestMthos.Get, path = "/contact")
            public String showContactUs(Model model) {
                   return "Contact";
                   }
}

