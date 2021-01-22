package com.takeoutProject.mohan;

/**
 * Mohan Adhikari Chhetri
 * Jan 2020
 */
public class TakeOutProject {
    public static void displayMainMenu() {

        System.out.println("Please can you choose your meal type,");
        System.out.println("1. Italian");
        System.out.println("2. Chinese");
        System.out.println("3. American");

    }

    public static void displayItalianFoodMenu() {
        System.out.println("Please can you choose which number you want, ");
        System.out.println("1. Lasagna Tray- Feeds 5 - 17.99");
        System.out.println("2. Pizza Pack - Feeds 7- 15.99");
        System.out.println("3. Gazpacho soup, salad and bread stick pack - Feeds 4 - 12.99");

    }

    public static void displayChineseFoodMenu() {
        System.out.println("Please can you choose which number you want, ");
        System.out.println("1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls)-Feeds 7 - 18.99");
        System.out.println("2. Sweet and Sour Pork Tray  (includes 7 hot and sour soups, 7 egg rolls)-Feeds 7  - 18.99");
        System.out.println("3. Shrimp Fried Rice Tray (includes 10 egg rolls) feeds 5  - 10.99");


    }

    public static void displayAmericanFoodMenu() {
        System.out.println("Please can you choose your which number you want, ");
        System.out.println("1. Hamburger and Hot Dog Tray - includes bun and condiments-feeds 8 - 21.99");
        System.out.println("2. Grilled Chicken Sandwich and Mozzarella Stick Tray - includes dipping sauces - feeds 5 - 22.99");
        System.out.println("3. Barbeque Tray - includes bun and peach cobbler-  Feeds 10- 26.99");

    }

    public static int DetermineTrays(int people, int feeds) {

        int numberofTrays = 0;

        if(people % feeds == 0) {
            numberofTrays = (people / feeds);
        } else {
            numberofTrays = (people / feeds) + 1;
        }
        System.out.println("You need " + numberofTrays + " trays");
        System.out.println("Feeds: " + feeds);

        return numberofTrays;
    }

    public static double getSubTotal(double price, int trays) {
        double total = price * trays;
        System.out.println("Price for " + trays + " is " + total);
        return total;
    }

    public static double getTax(double subtotal, double taxrate) {
        double totalTax = taxrate * subtotal;
        System.out.println("Tax: " + totalTax);
        return totalTax;
    }

    public static double getTip(double subtotal, double tiprate) {
        double totalTip = tiprate * subtotal;
        System.out.println("Tip: " + totalTip);
        return totalTip;
    }

    public static double getGrandTotal(double subtotal, double tax, double tip) {
        double grandTotal = subtotal + tax + tip;
        System.out.println("Total(food,tax,tip): " + grandTotal);
        return grandTotal;
    }

    public static double pricePerPerson(double grandtotal, int person) {
        double perPerson = grandtotal / person;
        System.out.println("Price per person:  " + perPerson);
        return perPerson;
    }

    public static int determineLeftOver(int feeds, int trays, int people) {
        int leftOver = (feeds * trays) - people;
        System.out.println("leftover serving for delivery person: " + leftOver);
        return leftOver;
    }
}



