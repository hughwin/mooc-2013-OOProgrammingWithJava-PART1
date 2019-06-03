/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hugh
 */
import java.util.*;
public class NightSky {
    
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint = 0;
    
    public NightSky(double density){
        this.width = 20;
        this.height = 10;
        this.density = density;
        
    }
    
    public NightSky(int width, int height){
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }
    
    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }
    public void printLine(){
        for (int i = 0 ; i < this.width ; i++){
            Random randomno = new Random();
            if (randomno.nextDouble() < this.density){
                System.out.print("*");
                starsInLastPrint++;
            }
            else{System.out.print(" ");}
        }
    } 
        public void print(){
        for (int i = 0 ; i < this.height ; i++){
            this.printLine();
            System.out.println();
            
        }
    }
        public int starsInLastPrint(){
            int count = this.starsInLastPrint;
            this.starsInLastPrint = 0;
            return count;
        }
}
