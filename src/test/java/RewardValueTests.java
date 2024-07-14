import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 1000;
        var rewardValue = new RewardValue(milesValue ,true );
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 200.0;
        RewardValue rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashValue / (1.0 / 0.0035); // Corrected conversion rate
        assertEquals(expectedMiles, rewardValue.getMilesValue(), 0.01); // Tolerance for floating-point comparison
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 5000.0;
        RewardValue rewardValue = new RewardValue(milesValue, true );
        double expectedCash = milesValue * (1.0 / 0.0035);  // Corrected conversion rate
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.01); // Tolerance for floating-point comparison
    }
    
}
