package com.bookclub.Model;

public class WishlistItem {
    @NotNull
    @NotEmpty(message = " ISBN is a required field")
    private String isbn;
    private String title;
    String username;
    
    // constructor
    Book() {
        
    }

    Book( String isbn, String title) {


    }

public void setIsbn(String isbn){
  this.Isbn="Value1";
}

public int getIsbn{
  return isbn;
}

public void setTitle(String title){
this.title="Java Programming";
}

public int getTitle{
return Title;
}



public void setUsername(String username){
  this.Username="username1";
}

public int getUserame{
  return username;
}

@Override
public String toString() {
    return “WishlistItem{isbn='"+ isbn +"', title='"+ title +"', username='"+ username +"'}";
}



@RequestMapping(method =RequestMathod.POST, path = "/update")

public String updateWishlistItem(WishlistItem wishlistItem, BindingResult bidingResult, Authentication authentication) {

  wishlistItem.setUsername \(authetication.getName());

  if(bindingResult.hasErrors()){
    return "wishlist/view";
  }

  wishlistDao.update(wishlistItem);
  return "redirect:/wishlist";

}


@RequestMapping(method =RequestMathod.POST, path = "/id")
  wishlistDao.remove(id);
  return "redirect:/wishlist";


}
