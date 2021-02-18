import java.math.BigDecimal;

public class Account {
    private String holder;
    private BigDecimal balance = new BigDecimal("0.00");

    public Account(String holder) {
        this.holder = holder;
    }

    public Account(String holder, BigDecimal balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String addBalance(BigDecimal addition) {
        this.balance = this.balance.add(addition);
        return addition + "€ edukalt lisatud. " + holder + " uus konto jääk on " + balance +"€";
    }

    public String subtractBalance(BigDecimal subtraction) {
        this.balance = this.balance.subtract(subtraction);
        return subtraction + "€ edukalt välja võetud. " + holder + " uus konto jääk on " + balance +"€";
    }
    
    @Override
    public String toString() {
        return holder + " konto jääk on " + balance + "€";
    }
}
