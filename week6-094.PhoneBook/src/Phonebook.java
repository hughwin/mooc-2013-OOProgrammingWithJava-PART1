/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


 */

/**
 *
 * @author Hugh
 */
import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> book;

    public Phonebook() {
        this.book = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        this.book.add(new Person(name, number));
    }

    public void printAll() {
        for (Person x : this.book) {
            System.out.println(x.toString());
        }
    }

    public String searchNumber(String name) {
        for (Person x : book) {
            if (x.toString().contains(name)) {
                return x.getNumber();
            }
        }
        return "number not known";
    }

}
