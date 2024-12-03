package org.example;

import org.example.model.Book;
import org.example.model.LibraryItem;
import org.example.model.Magazine;



public class Main {
    public static void main(String[] args) {

        System.out.printf("Ajout des éléments à la bibliothèque....\n");
        System.out.println("Liste des éléments disponibles : ");

        LibraryItem book1 = new Book(1, "Effective Java", 2018, "Programmation", "Joshua Bloch");
        LibraryItem magazine = new Magazine(2, "National Geographic", 2023, 42);

        System.out.println(book1.getDetails());
        System.out.println(magazine.getDetails());


    }
}