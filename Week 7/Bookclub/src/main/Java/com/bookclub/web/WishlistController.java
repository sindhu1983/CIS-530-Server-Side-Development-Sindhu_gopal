import java.util.List;

import com.bookclub.Model.Book;
import com.bookclub.Model.WishlistItem;
import com.bookclub.service.impl.MemBookDao;
import com.bookclub.service.impl.MemWishlistDao;

@controller
@requestmapping("/wishlist")
public class WishlistController {

    WishlistDao wishlistDao = new MongoWishlistDao();

    @requestmapping(method = RequestMthos.Get)
    public String  showWishlist(Model model) {

        MemWishlistDao wishlistDao = new MemWishlistDao();
        List<wishlist> wishlist = wishlistDao.list(); 
        List<wishlistItem> wishlistitem = wishlistDao.list();    
        model.addAttribute( attributeName: "wishlist", wishlist);
        return "wishlist/list";
        }

      
    @requestmapping(method = RequestMthos.Get, path = "/new")
        public String wishlistForm(Model model) {
        model.addAttribute( attributeName: "wishlistitem", wishlist);

            return "wishlist/new";
            }

    @requestmapping(method = RequestMthos.Post)
        public String addWishlistItem(@Valid WishlistItem wishlistItem, BindingResult bindingResult) {
        System.out.println(wishlistItem.toString());   
        
        System.out.println(bindingResult.getallErrors());

        if (bindingResult.hasErrors()){
            return "wishlist/new";
        }
        
        wishlistDao.add(wishlistItem);
        return "redirect:/wishlist";
    }
    
    @Autowired
    private void setWishlistDao (WishlistDao wishlistDao){
        this.wishlistDao=wishlistDao;
    }

    List<WishlistItem> wishlist = wishlistDao.list(){
        model.addAttribute("wishlist",wishlist);
        return "wishlist/list";
    }

}
