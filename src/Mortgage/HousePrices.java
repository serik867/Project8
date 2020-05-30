package Mortgage;

public class HousePrices extends Users {

   /*
            This class is extending the Users class
            1 private int variable price
     */

    private int price;


    public HousePrices(String username, String whichCondition, String houseType, int roomCount, int downPayment, int longTerm, StatesTax statesTax) {
        super(username, whichCondition, houseType, roomCount, downPayment, longTerm, statesTax);
        this.price = 0;
    }

    public void roomCountToPrice() {

        if (getRoomCount() == 0) {
            this.price += 10000;
            System.out.println(price);

        } else if (getRoomCount() == 1) {
            this.price += 20000;
            System.out.println(price);
        } else if (getRoomCount() == 2) {
            this.price += 30000;
            System.out.println(price);
        } else if (getRoomCount() == 3) {
            this.price += 40000;
        } else if (getRoomCount() == 4) {
            this.price += 50000;
        } else if (getRoomCount() == 5) {
            this.price += 60000;
        }
    }

    public void ConditionToPrice() {
        if (getWhichCondition().equalsIgnoreCase("new")) {
            this.price += 50000;

        } else if (getWhichCondition().equalsIgnoreCase("like new")) {
            this.price += 40000;
        } else if (getWhichCondition().equalsIgnoreCase("old")) {
            this.price += 30000;
        } else if (getWhichCondition().equalsIgnoreCase("Renew Required")) {
            this.price += 15000;
        }


    }

    public void houseTypeToPrice() {
        if (getHouseType().equalsIgnoreCase("Apartment")) {
            this.price += 20000;
        } else if (getHouseType().equalsIgnoreCase("condo")) {
            this.price += 30000;
        } else if (getHouseType().equalsIgnoreCase("house")) {
            this.price += 40000;
        }

    }

    public int getPriceTotal() {
        if (price == 0 ) {
            roomCountToPrice();
            ConditionToPrice();
            houseTypeToPrice();
        }


        return (this.price * getStatesTax().getTax())/ 100+this.price;
    }

    public int getPriceEachMonth() {


        int result = (getPriceTotal()-getDownPayment())/getLongTerm();

        return result;
    }







    /*
        Create a method name is getPriceEachMonth
            Return the monthly payment amount.
            reduce the downpayment and calculate the each month's payment
     */


}
