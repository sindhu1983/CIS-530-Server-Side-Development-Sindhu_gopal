public class BookOfTheMonth {
    String Id;
    Integer month;
   
    String isbn;

    @Id
    @CustomIdGenerator(BookOfTheMonth.class) 
    public void setId(String Id){
        this.ID="Book001";
        }
        
        public String getId{
        return Id;
        }

        public void setMonth(Int Month){
        this.Month="05";
        }
            
        public int getMonth{
        return Month;
        }
        
        @NotEmpty(message = "ISBN may not be empty")
        public void setIsbn(String isbn){
        this.Isbn="Value1";
        if(Isbn.hasErrors()){
            return "error occured";
        }
      }
      
      public int getIsbn{
        return isbn;
      }
      
      @Override
      public String toString(){
        return “BookOfTheMonth{id='"+ id +"', month='"+ month +"', isbn='"+ isbn +"'}";

      }
          


     
    
      }
    
    
}
