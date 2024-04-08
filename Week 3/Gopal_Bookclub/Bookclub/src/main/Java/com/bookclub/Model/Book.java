package com.bookclub.Model;

import java.util.List;

public class Book {

     String isbn;
     String title;
     String description;
     int numOfPages;
     List<String> authors;

      // constructor
        Book() {
        
        }

        Book( String isbn, String title, String description, int numOfPages, String string) {


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

      public void setDesciption(String description){
        this.title="This is book on Java";
      }
    
      public int getDescription{
        return description;
      }

      public void setNoofPages(int noofPages){
        this.noofPages=180;
      }
    
      public int getNoofPages{
        return noofPages;
      }

      public void setAuthor(List<String> author){
        this.title="Prof. Sriram";
      }
    
      public int getAuhor{
        return author;
      }

      // Overriding toString() method of String class
    @Override
    public String toString() {
        return Book{isbn="Value2", title="Programming Java"", description="This is Java Programming",
          numOfPages=182, authors="Sriram"};
          
    }
}
