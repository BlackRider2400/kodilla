package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest(){
        //Given
        Book book = new Book("Adam Mickiewicz", "Pan Tadeusz", 1932,"signature");
        Book book1 = new Book("John Smith", "Test", 1800, "signature");
        Book book2 = new Book("John Smith", "Test1234", 2020, "signature");
        Set<Book> books = new HashSet<>();
        books.add(book);
        books.add(book1);
        books.add(book2);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        double median = medianAdapter.publicationYearMedian(books);
        //Then
        assertEquals(median, 1932);

    }
}
