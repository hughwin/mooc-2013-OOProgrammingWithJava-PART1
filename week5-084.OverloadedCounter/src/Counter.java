/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hugh
 */
public class Counter {

    private int startingValue;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }

    public Counter() {
        this.startingValue = 0;
        this.check = false;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public int value() {
        return this.startingValue;
    }

    public void increase() {
        this.startingValue++;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount < 0) {
        } else {
            this.startingValue += increaseAmount;
        }
    }

    public void decrease() {
        if (this.startingValue == 0 && this.check) {
            this.startingValue = 0;
        } else {
            this.startingValue--;
        }
    }

    public void decrease(int decreaseAmount) {

        if (decreaseAmount < 0) {

        } else {

            this.startingValue -= decreaseAmount;

            if (this.startingValue < 0 && check) {
                this.startingValue = 0;
            }
        }
    }
}
