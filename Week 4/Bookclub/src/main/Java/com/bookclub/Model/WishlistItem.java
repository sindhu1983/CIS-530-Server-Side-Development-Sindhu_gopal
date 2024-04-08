package com.bookclub.Model;

public class WishlistItem {
    @NotNull
    @NotEmpty(message = " ISBN is a required field")
    private String isbn;
    private String title;
    
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

@Override
public String toString() {
    return “WishlistItem{isbn='"+ isbn +"', title='"+ title +"'}";
}


}
