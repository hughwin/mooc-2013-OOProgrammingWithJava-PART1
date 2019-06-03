/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hugh
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit){
        this.upperLimit = upperLimit;
    }
    
    public void next(){
        this.value++;
        if (this.value >= upperLimit){
            this.value = 0;
        }
    }
    
    public String toString(){
        if (value < 10){
            return "0" + value; 
        }
        else {return "" + value;}
    }
    
    public int getValue() {
        return this.value;
}
    public void setValue(int param){
        if (param <= this.upperLimit && param >0 ){
            this.value = param;
        }
    }
}
