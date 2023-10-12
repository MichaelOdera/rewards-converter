import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Enter 1 or 2 to choose the conversion you would like to have");
        System.out.println("1. Convert Cash to Airline Miles");
        System.out.println("2. Convert Airline Miles to Cash");

        var choice_value = scanner.nextLine();
        double choiceValue;
        try {
            choiceValue = Integer.parseInt(choice_value);

            //handle the edge case for if the choice picked is not 1 or 2
            if(choiceValue < 1 || choiceValue > 2){
                System.out.println("Please enter value 1 or 2, exiting");
                return;
            }
        } catch (NumberFormatException exception) {
            // handle the edge case for if the value entered is not an integer or is not convertible to int 1 or 2
            System.out.println("Please enter value 1 or 2, exiting");
            return;
        }

        if(choiceValue == 1){
            //Main code block for converting cash to airline miles
            System.out.println("Please enter a cash value to convert to airline miles: ");
            var input_value = scanner.nextLine();
            double cashValue;
            try {
                cashValue = Double.parseDouble(input_value);
            } catch (NumberFormatException exception) {
                System.out.println("Could not parse input value as a double, exiting");
                return;
            }
            System.out.println("converting $" + input_value + " to miles");
            var rewardsValue = new RewardValue(cashValue);
            System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
        }else{
            // Main code block for converting airline miles to cash
            System.out.println("Please enter an airline miles value to convert to cash: ");
            var miles_value = scanner.nextLine();
            int milesValue;
            try {
                milesValue = Integer.parseInt(miles_value);
            } catch (NumberFormatException exception) {
                System.out.println("Could not parse input value as a integer, exiting");
                return;
            }
            System.out.println("Converting airline miles " + milesValue + " to $");
            var cashRewardsValue = new RewardValue(milesValue);
            System.out.println("Airline miles " + miles_value + " is worth $ " + cashRewardsValue.getCashValue());
        }

    }
}