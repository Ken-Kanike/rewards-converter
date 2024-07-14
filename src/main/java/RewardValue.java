public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    // Constructor that accepts miles value
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }

    // Get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Get the miles value
    public double getMilesValue() {
        return milesValue;
    }

     // Convert cash to miles
     private double cashToMiles(double cash) {
        return cash / (1.0 / 0.0035); // Corrected conversion rate
    }

    // Convert miles to cash
    private double milesToCash(double miles) {
        return miles * (1.0 / 0.0035); // Corrected conversion rate
    }
}
