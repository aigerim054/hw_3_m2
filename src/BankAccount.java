public class BankAccount {
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private double amount;
    public void withDraw(int sum)throws LimitException{
        if (sum > amount){
            throw new LimitException("на вашем балнсе не хватает дененг для снятия");
        }else {
            amount = amount - sum;
        }



    }
    public void deposit (int sum) {
        amount = amount + sum;

    }
}
