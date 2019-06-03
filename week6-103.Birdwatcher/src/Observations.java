
import java.util.ArrayList;
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hugh
 */
public class Observations {

    private ArrayList<Bird> observations;

    public Observations() {
        this.observations = new ArrayList<Bird>();
    }

    public void addBird(Bird bird) {
        this.observations.add(bird);
    }

    public void show(String str) {
        System.out.println(str + "!");
        for (Bird x : this.observations) {
            if (x.getName().trim().toLowerCase().contains(str.trim().toLowerCase())){   //Why doesn't this work?
                System.out.println(x.toString());
            }
        }
    }

    public void observed(String str) {
        for (Bird x : this.observations) {
            if (x.getName().trim().toLowerCase().contains(str.trim().toLowerCase())) {
                x.addOne();
            }
        }
    }

    public void statistics() {
        for (Bird x : this.observations) {
            System.out.println(x);
        }
    }
}
