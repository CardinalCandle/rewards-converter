import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        RewardValue rewards = new RewardValue(3.5);
        assertEquals(1000, rewards.getMilesValue(), 0.01);
    }

    @Test
    void convert_from_miles_to_cash() {
        RewardValue rewards = new RewardValue(10000);
        assertEquals(35, rewards.getCashValue(), 0.01);
    }
}
