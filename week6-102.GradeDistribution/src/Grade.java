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

public class Grade {

    private ArrayList<Integer> scores;

    public Grade() {
        this.scores = new ArrayList<Integer>();
    }

    public void addGrade(int score) {
        scores.add(score);
    }

    public float printAcceptance() {
        int i = 0;
        for (int x : this.scores) {
            if (x >= 30) {
                i++;
            }

        }
        return ((float) (i * 100.0 / this.scores.size()));
    }

    public void printScores() {

        String zero = "";
        String one = "";
        String two = "";
        String three = "";
        String four = "";
        String five = "";

        for (int a : this.scores) {

                if (a >= 0 && a < 30) {
                    zero = zero + "*";
                }
                if (a >= 30 && a < 35) {
                    one = one + "*";
                }
                if (a >= 35 && a < 40) {
                    two = two + "*";
                }
                if (a >= 40 && a < 45) {
                    three = three + "*";
                }
                if (a >= 45 && a < 50) {
                    four = four + "*";
                }
                if (a >= 50 && a <= 60) {
                    five = five + "*";
                }

        }
        System.out.println("Grade distribution:");
        System.out.println("5: " + five);
        System.out.println("4: " + four);
        System.out.println("3: " + three);
        System.out.println("2: " + two);
        System.out.println("1: " + one);
        System.out.println("0: " + zero);
        System.out.println("Acceptance percentage: " + this.printAcceptance() );
    }
}
