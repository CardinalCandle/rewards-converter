public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    public double getCashValue() {
        if (cashValue == 0) {
            cashValue = milesValue * 0.0035;
        }
        return cashValue;
    }

    public double getMilesValue() {
        if (milesValue == 0) {
            milesValue = cashValue / 0.0035;
        }
        return milesValue;
    }
}
