/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hugh
 */
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        if (this.balance >= 2.50) {
            this.balance = this.balance - 2.50;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4.00) {
            this.balance = this.balance - 4.00;
        }
    }

    public void loadMoney(double money) {

        if (money <= 0) {

        } else {
            this.balance = this.balance + money;
            if (this.balance > 150) {
                this.balance = 150.00;
            }
        }
    }
}
