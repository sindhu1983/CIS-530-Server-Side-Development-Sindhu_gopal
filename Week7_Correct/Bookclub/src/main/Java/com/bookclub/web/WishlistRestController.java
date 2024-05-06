import com.bookclub.service.dao.WishlistDao;
import com.bookclub.service.impl.MongoWishlistDao.MongoWishlistDao;

@RestController
@RequestMapping(path =“/api/wishlist”, produces = “application/json”)
@CrossOrigin(origins = “*”)

public class WishlistRestController {

   WishlistDao wishlistDao = new MongoWishlistDao();

    @Autowired
        private void setWishlistDao (WishlistDao wishlistDao){
        this.wishlistDao=wishlistDao;
    }

    @requestmapping(method = RequestMthos.Get, path = "/new")
        public List<WishlistItem> showWishList() {
            return "wishlist/list";
        }

    @requestmapping(path="/id", method=RequestMethod.Get)
        public WishlistItem findById(@pathVariable String id) {
            return wishlistDao.find(id);
        }

    
}
