/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hugh
 */
public class Product {
    
    private String name;
    private double price; 
    private int amount;
    
    public Product(String nameAtStart, double priceAtStart, int AmountAtStart){
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount = AmountAtStart;
    }
    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + " amount " + this.amount);
    }
}
