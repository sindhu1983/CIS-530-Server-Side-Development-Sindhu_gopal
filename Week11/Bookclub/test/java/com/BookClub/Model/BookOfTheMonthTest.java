package com.BookClub.Model;

import java.util.stream.Stream;

public class BookOfTheMonthTest {

    @BeforeAll
        static void setup() {
    log.info("@BeforeAll - executes once before all test methods in this class");
    }

    @BeforeEach
    void init() {
    log.info("@BeforeEach - executes before each test method in this class");
    }

    @AfterEach
void tearDown() {
    log.info("@AfterEach - executed after each test method.");
}

@AfterAll
static void done() {
    log.info("@AfterAll - executed after all test methods.");
}

@Test
void shouldThrowException() {
    Throwable exception = assertThrows(UnsupportedOperationException.class, () -> {
      throw new UnsupportedOperationException("Not supported");
    });
    assertEquals("Not supported", exception.getMessage());
}

@Test
void assertThrowsException() {
    String isbn = null;
    assertThrows(IllegalArgumentException.class, () -> {
      Integer.valueOf(isbn);
    });
}

@Test
    public void getIsbn(){
        String isbn = "Book001";
        when(repository.findisbn()).thenReturn(Stream .of("Book001"));
        assertEquals(2, service.gerinfoUrl().size());
    }

}
