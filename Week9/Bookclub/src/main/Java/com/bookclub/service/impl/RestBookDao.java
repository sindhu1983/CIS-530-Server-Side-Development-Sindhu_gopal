package com.bookclub.service.impl;

import java.lang.module.Configuration;
import java.util.List;

import com.bookclub.Model.Book;

public class RestBookDao extends GenericDao<Book, String> {

    getBooksDoc(string isbnString){

        String openLibraryUrl = "https://openlibrary.org/api/books";

        RestTemplate rest = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set(Http.Heders.Accept, MediaType.APPLICATION_JSON_VALUE);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(openLibraryUrl)
        .queryParam("bibkeys",isbnString)
        .queryparam("format","json")
        .queryparam("jscmd","details")

        HttpEntity<?> entity = new HttpEntity<>(headera);

        HttpEntiry<String> Response = rest.Exchange (
            builder.toUriString(),
            HttpMethod.Get,
            entiry,
            String.class);

        String jsonBooklist = response.getBody();

        return Configuration.defaultConfiguration().jsonProvider().parse(jsonBooklist);
    }

   
    @Override 
    public Book find(String key)  {
        Object doc = getBookDoc(key);

        List<String> isbns = JsonPath.read(doc,"$..bib_key");
        List<String> titles= JsonPath.read(doc,"$..title");
        List<String> subtitle= JsonPath.read(doc,"$..details.subtitle");
        List<String> infoUrls= JsonPath.read(doc,"$..info_Url");
        List<String> pages= JsonPath.read(doc,"$..details.number_of_pages");

        String isbn= isbns.size >0 ? isbns.get(0) : "N/A";
        String title= titles.size >0 ? titles.get(0) : "N/A";
        String desc= subtitle.size >0 ? subtitle.get(0) : "N/A";
        String infoUrl= infoUrls.size >0 ? infoUrls.get(0) : "N/A";
        int numofPages = pages.size >0 ? pages.get(0) : "N/A";

        Book book = new Book(isbn,title,desc,infoUrl,numofPages);
        return book;
    }
}
