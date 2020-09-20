// Problem Statement Link : https://www.hackerrank.com/challenges/30-abstract-classes/problem
// Solution:

import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

class MyBook extends Book{

    int price;
    MyBook(String t, String a, int p){
    super(t,a);
    //super keyword is use to call function from parent class or method from abstract classes, to remove the confusion we have used super keyword.
    price = p;
    }

@Override
void display()
{
    System.out.println("Title: "+title);
    System.out.println("Author: "+author);
    System.out.println("Price: "+price);
}
}

public class Solution {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
