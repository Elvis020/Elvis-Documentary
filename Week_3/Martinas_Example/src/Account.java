public class Account {
    private Icalculator calc;
    private double interest;

    public double getInterest() {
        return interest;
    }

    private double balance;

    public Account(Icalculator calc, double initBalance) {
        if(initBalance <0 ){
            throw new IllegalArgumentException("Initial balance cannot be negative");

        }
        this.calc = calc;
        this.balance = calc.add(initBalance, 500.0);
    }

    public double getBalance() {
        return balance;
    }


    public double calculateInterest() throws DivisionByZeroException{
        return this.balance = calc.division(1000, this.balance - 750.0);
    }

}
