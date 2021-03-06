package com.resources;

import com.models.Book;

public class DocumentManager {
    private static DocumentManager documentManager;
    private Book book;

    private DocumentManager(){

    }

    public static DocumentManager getDocumentManager() {
        if(documentManager == null)
            documentManager = new DocumentManager();
        return documentManager;
    }

    public void setBook(Book newBook) {
        this.book = newBook;
    }

    public static Book getBook() {
        return this.book;
    }

}
