@controller
@requestmapping("/")

Public Class HomeController {
    @requestmapping(method = RequestMthos.Get)
    public String showHome(Model model) {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int calMonth = cal.get(Calendar.Month) +1;
        RestBookDao bookDao = new restBookDao();
        List<BookOfTheMonth> monthlyBooks = bookOfTheMonthDao.list(integer.toString(calMonth));

        StringBuilder isbnBuilder = new StringBuilder();
        isbnBuilder.append("ISBN:");

        for(BookOfTheMonth monthlyBook : monthlyBooks){
            isbnBuilder.append(monthlyBook.getIsbn()).append(",");
        }
        
        String isbnString = isbnBuilder.toString().subString(0, isbnBuilder.toString().length() - 1);
       
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
    List<Book> books = bookDao.list(String isbnString);

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
    BookOfTheMonthDao.list(){

        MongoBookOfTheMonthDao MongobookofthemonthDao = new MongoBookOfTheMonthDao();
        
        @Autowired
        public void setBookOfTheMonthDao (BookOfTheMonthDao, bokOfTheMonthDao){

            this.BookOfTheMonthDao = bokOfTheMonthDao;
        }

    }
}

