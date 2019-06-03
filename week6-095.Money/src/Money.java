
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;

    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        return new Money(added.euros + this.euros, added.cents + this.cents);
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else {
            return this.euros == compared.euros && this.cents < compared.cents;
        }
    }

    public Money minus(Money decremented) {
        
        int totalEuros = this.euros - decremented.euros;
        int totalCents = this.cents - decremented.cents;
        int leftOver = totalCents;
       
        if (totalCents < 0){
            totalEuros -= 1;
            totalCents = 100 + leftOver;
        }

        if (totalEuros < 0 || totalEuros == 0 && totalCents < 0) {
            return new Money(0, 0);
        } else { 
            return new Money(totalEuros, totalCents);
        }
    }

}
