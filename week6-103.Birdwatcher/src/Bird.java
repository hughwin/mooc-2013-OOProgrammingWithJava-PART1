/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hugh
 */
public class Bird {

    private String name;
    private String latin;
    private int count = 0;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
    }

    public Bird(String name, String latin, int count) {
        this.name = name;
        this.latin = latin;
        this.count = count;
    }

    public String getName() {
        return this.name;
    }

    public String getLatin() {
        return this.latin;
    }

    public int getCount() {
        return this.count;
    }

    public int addOne() {
        return this.count++;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.latin + "): " + this.count + " observations";
    }

}
