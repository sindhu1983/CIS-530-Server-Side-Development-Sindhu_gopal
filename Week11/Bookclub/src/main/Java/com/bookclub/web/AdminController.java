import java.util.List;

import com.bookclub.Model.Book;

import com.bookclub.service.dao.BookOfTheMonthDao;
import com.bookclub.service.impl.MemBookDao;

import com.bookclub.service.impl.MongoBookOfTheMonthDao.MongoBookOfTheMonthDao;

@controller
@enableWebSecurity
@requestmapping("/admin")

public class AdminController {

     BookOfTheMonthDao BookofthemonthDao = new MongoBookOfTheMonthDao();

    @requestmapping(method = RequestMthos.Get)
    public String  showBookOfTheMonth(Model model) {
        String username = authentication.getBookOfTheMonth();
        List<BookOfTheMonth> Bookofthemonth = BookofthemonthDao.list(); 
        List<BookOfTheMonthItem> BookOfTheMonthitem = BookOfTheMonthDao.list();    
        model.addAttribute( attributeName: "Bookofthemonth", wBookOfTheMonth);
        return "admin/list";
        }

      
    @requestmapping(method = RequestMthos.Get, path = "/new")
        public String bookoftheMonthForm(Model model {

            BookOfTheMonth Bookofthemonth= new BookOfTheMonth();
            model.addAttribute( getMonths(), BookOfTheMonth);

            return "admin/new";
            }

    @requestmapping(method = RequestMthos.Post)
        public String addBookOfTheMonth(@Valid BookOfTheMonthItem BookOfTheMonthItem, BindingResult bindingResult, Model model) {
        System.out.println(BokOfTheMonth.toString());   
        
        System.out.println(bindingResult.getallErrors());

        if (bindingResult.hasErrors()){
            return "Admin/BookOfTheMonth";
        }
        
        BookOfTheMonthDao.add(BookOfTheMonthItem);
        return "redirect:/monthly-books";
    }



    
    @Autowired
    private void setBookOfTheMonthDao (BookOfTheMonthtDao BookOfTheMonthDao){
        this.BookOfTheMonthDao=BookOfTheMonthDao;
    }

    private Map<Integer,String> getMonths(){
        Map<Integer,String> months = new HashMap<>();
        months.put(1,"January");
        months.put(2,"February");
        months.put(3,"March");
        months.put(4,"April");
        months.put(5,"Map");
        months.put(6,"June");
        months.put(7,"July");
        months.put(8,"Aug");
        months.put(9,"Sep");
        months.put(10,"Oct");
        months.put(11,"Nov");
        months.put(12,"Dec");
    }


    @requestmapping(method = RequestMthos.Post)
    public String removeBookOfTheMonth(Integer ID, @Valid BookOfTheMonthItem BookOfTheMonthItem, BindingResult bindingResult) {
    System.out.println(BokOfTheMonth.toString());   
    
    System.out.println(bindingResult.getallErrors());

    if (bindingResult.hasErrors()){
        return "admin/remove";
    }
    
    BookOfTheMonthDao.remove();
    return "redirect:/monthy-books";
}

    @RequestMapping(method = RequestMethod.GET, path="/{id}")
    public String showBookOfTheMonthItem (Model model){
              model.addAttribute(attributename:"books", BookofthemonthDao.list("key",999));

        return "monthly-books/list";
    }



}
