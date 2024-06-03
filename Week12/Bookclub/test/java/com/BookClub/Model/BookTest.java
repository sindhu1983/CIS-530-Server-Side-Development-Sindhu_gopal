package com.BookClub.Model;

import static org.juint.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.beans.Transient;
import java.util.stream.*;
import org.junit.*;

import org.springframework.*;
import com.javatechie.spring.*;

@RunWith(springRunner.class)
@SpringBootTest

public class BookTest {

    @Autowired
    private userservice service;

    @MockBean
    private userRepository repository;

    @Test
    public void getinfoURL(){
        when(repository.findAll()).thenReturn(Stream .of("http://test.com"));
        assertEquals(2, service.gerinfoUrl().size());
    }

    @Test
    public void getNoofPagesTest(){
        int noofPages = 180;
        when(repository.findnoofPages()).thenReturn(Stream .of(180));
        assertEquals(2, service.gerinfoUrl().size());
    }

    @Test
    public void saveNoofPagesTest(){
        Noofpages noofPages = new noofPages(181); 
        when(repository.save(noofPages)).thenReturn(noofPages);
        assertEquals(noofPages, service.addnoofPages(noofPages));
    }

    @Test
    public void deleteNoofPagesTest(){
        Noofpages noofPages = new noofPages(181); 
        service.deleteNoofPagesTest(noofPages);
        verify(repository,times(1).delete(noofPages));

    }
}
