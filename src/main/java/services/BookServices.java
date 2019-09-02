package services;

import bean.Book;

public class BookServices {
    public Book[] getBooks(){
        return new Book[]{
                new Book("Chris","Java講義"),
                new Book("Nick","SQL講義"),
                new Book("MOMO","Ruby講義")
        };
    }
}


