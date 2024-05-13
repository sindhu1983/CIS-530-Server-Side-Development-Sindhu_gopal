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

    MemBookDao bookDao = new MemBookDao();
    List<Book> books = bookDao.list();

    for (Book book : Books) {

        System.out.println(book.toString());
    }

    model.addAttribute( attributeName: "books", books);

    @RequestMapping(method = RequestMethod.Get, value = "/{id}")
    public String getMonthlyBook(@PathVariable("id") String id, Model model) {
        String isbn =id;
        system.out.println(id);

        MemBookDao bookDao = new MemBookDao();
        Book book = bookDao.find(isbn);

        system.out.println(book.toString());

        model.addAttribute(attributeName:"book", book);
        return "monthly.books/view";
    }

}

