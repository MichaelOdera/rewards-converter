import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    //test the method returning cash value upon conversion
    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        var testRewardValue = new RewardValue(cashValue);
        assertEquals(testRewardValue.getCashValue(), rewardValue.getCashValue());
    }

    //test the method returning miles value upon conversion
    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        var testRewardValue = new RewardValue(milesValue);
        assertEquals(testRewardValue.getMilesValue(), rewardValue.getMilesValue());
    }

    //test the conversion from cash to miles
    @Test
    void convert_from_cash_to_miles() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        var testRewardValue = new RewardValue(milesValue);
        assertEquals(rewardValue.convertCashToMilesValue(), testRewardValue.convertCashToMilesValue());
    }


    //test the conversion from miles to cash
    @Test
    void convert_from_miles_to_cash() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        var testRewardValue = new RewardValue(cashValue);
        assertEquals(testRewardValue.convertMilesToCashValue(), rewardValue.convertMilesToCashValue());
    }
}
