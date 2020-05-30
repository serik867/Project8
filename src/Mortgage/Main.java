package Mortgage;

public class Main {
    public static void main(String[] args) {
        HousePrices housePrices= new HousePrices("Fernando" , "new" ,  "Apartment" ,3 ,40000 ,30 , StatesTax.OHIO);
        System.out.println(housePrices.getPriceTotal());
        System.out.println(housePrices.getPriceEachMonth());

    }
}
