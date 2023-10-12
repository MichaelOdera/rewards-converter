public class RewardValue {

    double mCashValue;
    int mMilesValue;

    double mExchangeRate = 0.0035;
    public RewardValue(double cashValue) {
        this.mCashValue = cashValue;
    }

    public RewardValue(int milesValue){
        this.mMilesValue = milesValue;
    }

    public double getCashValue() {
        return convertMilesToCashValue();
    }

    public double getMilesValue() {
        return convertCashToMilesValue();
    }

    public double convertMilesToCashValue(){
        System.out.println("My main miles value "+ this.mMilesValue);
        return (this.mMilesValue / this.mExchangeRate);
    }

    public double convertCashToMilesValue(){
        return (this.mCashValue * this.mExchangeRate);
    }
}
