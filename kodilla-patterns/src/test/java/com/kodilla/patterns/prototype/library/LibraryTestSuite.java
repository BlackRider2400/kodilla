package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //Given
        Set<Book> mathBooks = new HashSet<>();

        for(int i = 0; i < 10;i++){
            mathBooks.add(new Book("math book for grade: " + i, "Peter Smith", LocalDate.of(1943, 11, 3)));
        }
        Library library = new Library("Math Library");
        library.books = mathBooks;

        //When
        Library shallowCloneLibrary = null;
        Library deepCloneLibrary = null;

        try{
        shallowCloneLibrary = library.shallowCopy();
        deepCloneLibrary = library.deepCopy();
        }catch (Exception e){
            System.out.println("Cloning error!");
        }

        library.books.clear();

        //Then
        assertEquals(10, deepCloneLibrary.books.size());
        assertEquals(0, shallowCloneLibrary.books.size());

    }
}
