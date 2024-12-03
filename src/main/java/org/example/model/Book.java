package org.example.model;

public class Book extends LibraryItem {
    private String author;
    private String genre;

    public Book(int id, String title, int publicationYear, String genre, String author) {
        super(id, title, publicationYear);
        this.genre = genre;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getDetails(){
        return "Titre : "+title+
                "Auteur : "+author+
                "Genre : "+genre+
                "Année : "+publicationYear;

    }


}
