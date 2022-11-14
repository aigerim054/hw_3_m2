public class LimitException extends Throwable {
    private String massage;

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public LimitException(String massage, double remainingAmount) {
        this.massage = massage;
        this.remainingAmount = remainingAmount;
    }

    public LimitException(String massage) {
        this.massage = massage;
    }

    private double remainingAmount;

}
