package com.takeoutProject.mohan;

import java.util.Scanner;

public class DriverTakeOutProject {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of people: ");

        int numberoftrays;
        int people = input.nextInt();
        if (people < 10) {
            System.out.println("Number of people are invalid");
        }
        else {
            TakeOutProject sam = new TakeOutProject();

            sam.displayMainMenu();
            Scanner input1 = new Scanner(System.in);
            String food = input1.nextLine();

            if (food.equals("Italian")) {
                TakeOutProject Italian = new TakeOutProject();
                Italian.displayItalianFoodMenu();
                int item = input.nextInt();
                if (item == 1) {
                    TakeOutProject tray = new TakeOutProject();
                    tray.DetermineTrays(people, 5);
                    double price = 17.99;
                    if (people % 5 == 0) {
                        numberoftrays = (people / 5);
                    }
                    else {
                        numberoftrays = (people / 5) + 1;
                    }

                    TakeOutProject sum = new TakeOutProject();
                    sum.getSubTotal(price, numberoftrays);

                    TakeOutProject tax = new TakeOutProject();
                    double total = price * numberoftrays;

                    tax.getTax(total, 0.07);
                    TakeOutProject.getTip(total, 0.15);
                    TakeOutProject.getGrandTotal(total, 0.07 * total, 0.15 * total);
                    TakeOutProject.pricePerPerson(TakeOutProject.getGrandTotal(total, 0.07 * total, 0.15 * total), people);
                    TakeOutProject.determineLeftOver(5, numberoftrays, people);
                }
                else if (item == 2) {

                    TakeOutProject tray2 = new TakeOutProject();
                    tray2.DetermineTrays(people, 7);
                    double price = 15.99;
                    if (people % 7 == 0) {
                        numberoftrays = (people / 7);
                    }
                    else {
                        numberoftrays = (people / 7) + 1;
                    }

                    TakeOutProject sum = new TakeOutProject();
                    sum.getSubTotal(price, numberoftrays);
                    TakeOutProject tax = new TakeOutProject();
                    double total = price * numberoftrays;
                    tax.getTax(total, 0.07);
                    TakeOutProject.getTip(total, 0.15);
                    TakeOutProject.getGrandTotal(total, 0.07 * total, 0.15 * total);
                    TakeOutProject.pricePerPerson(TakeOutProject.getGrandTotal(total, 0.07 * total, 0.15 * total), people);
                    TakeOutProject.determineLeftOver(7, numberoftrays, people);
                }
                else if (item == 3) {
                    TakeOutProject tray3 = new TakeOutProject();
                    tray3.DetermineTrays(people, 4);
                    double price = 12.99;
                    if (people % 4 == 0) {
                        numberoftrays = (people / 4);
                    }
                    else {
                        numberoftrays = (people / 4) + 1;
                    }
                    TakeOutProject sum = new TakeOutProject();
                    sum.getSubTotal(price, numberoftrays);
                    TakeOutProject tax = new TakeOutProject();
                    double total = price * numberoftrays;
                    tax.getTax(total, 0.07);
                    TakeOutProject.getTip(total, 0.15);
                    TakeOutProject.getGrandTotal(total, 0.07 * total, 0.15 * total);
                    TakeOutProject.pricePerPerson(TakeOutProject.getGrandTotal(total, 0.07 * total, 0.15 * total), people);
                    TakeOutProject.determineLeftOver(4, numberoftrays, people);
                }
                else System.out.println("Please enter which number you want: ");

            }
            else if (food.equals("Chinese")) {
                TakeOutProject Chinese = new TakeOutProject();
                Chinese.displayChineseFoodMenu();
                int item = input.nextInt();

                if (item == 1) {
                    TakeOutProject tray = new TakeOutProject();
                    tray.DetermineTrays(people, 7);
                    double price = 18.99;
                    if (people % 7 == 0) {
                        numberoftrays = (people / 7);
                    } else {
                        numberoftrays = (people / 7) + 1;
                    }

                    TakeOutProject sum = new TakeOutProject();
                    sum.getSubTotal(price, numberoftrays);
                    TakeOutProject tax = new TakeOutProject();
                    double total = price * numberoftrays;
                    tax.getTax(total, 0.07);
                    TakeOutProject.getTip(total, 0.15);
                    TakeOutProject.getGrandTotal(total, 0.07 * total, 0.15 * total);
                    TakeOutProject.pricePerPerson(TakeOutProject.getGrandTotal(total, 0.07 * total, 0.15 * total), people);
                    TakeOutProject.determineLeftOver(7, numberoftrays, people);

                }
                else if (item == 2) {
                    TakeOutProject tray2 = new TakeOutProject();
                    tray2.DetermineTrays(people, 7);
                    double price = 18.99;
                    if (people % 7 == 0) {
                        numberoftrays = (people / 7);
                    }
                    else {
                        numberoftrays = (people / 7) + 1;
                    }
                    TakeOutProject sum = new TakeOutProject();
                    sum.getSubTotal(price, numberoftrays);
                    TakeOutProject tax = new TakeOutProject();
                    double total = price * numberoftrays;
                    tax.getTax(total, 0.07);
                    TakeOutProject.getTip(total, 0.15);
                    TakeOutProject.getGrandTotal(total, 0.07 * total, 0.15 * total);
                    TakeOutProject.pricePerPerson(TakeOutProject.getGrandTotal(total, 0.07 * total, 0.15 * total), people);
                    TakeOutProject.determineLeftOver(7, numberoftrays, people);
                } else if (item == 3) {
                    TakeOutProject tray3 = new TakeOutProject();
                    tray3.DetermineTrays(people, 5);
                    double price = 10.99;
                    if (people % 5 == 0) {
                        numberoftrays = (people / 5);
                    }
                    else {
                        numberoftrays = (people / 5) + 1;
                    }
                    TakeOutProject sum = new TakeOutProject();
                    sum.getSubTotal(price, numberoftrays);
                    TakeOutProject tax = new TakeOutProject();
                    double total = price * numberoftrays;
                    tax.getTax(total, 0.07);
                    TakeOutProject.getTip(total, 0.15);
                    TakeOutProject.getGrandTotal(total, 0.07 * total, 0.15 * total);
                    TakeOutProject.pricePerPerson(TakeOutProject.getGrandTotal(total, 0.07 * total, 0.15 * total), people);
                    TakeOutProject.determineLeftOver(5, numberoftrays, people);
                }
                else System.out.println("please enter which number you want, ");
            } else if (food.equals("American")) {
                TakeOutProject American = new TakeOutProject();
                American.displayAmericanFoodMenu();
                int item = input.nextInt();
                if (item == 1) {
                    TakeOutProject tray = new TakeOutProject();
                    tray.DetermineTrays(people, 8);
                    double price = 21.99;
                    if (people % 8 == 0) {
                        numberoftrays = (people / 8);
                    } else {
                        numberoftrays = (people / 8) + 1;
                    }
                    TakeOutProject sum = new TakeOutProject();
                    sum.getSubTotal(price, numberoftrays);
                    TakeOutProject tax = new TakeOutProject();
                    double total = price * numberoftrays;
                    tax.getTax(total, 0.07);
                    TakeOutProject.getTip(total, 0.15);
                    TakeOutProject.getGrandTotal(total, 0.07 * total, 0.15 * total);
                    TakeOutProject.pricePerPerson(TakeOutProject.getGrandTotal(total, 0.07 * total, 0.15 * total), people);
                    TakeOutProject.determineLeftOver(8, numberoftrays, people);

                } else if (item == 2) {
                    TakeOutProject tray2 = new TakeOutProject();
                    tray2.DetermineTrays(people, 5);
                    double price = 22.99;
                    if (people % 5 == 0) {
                        numberoftrays = (people / 5);
                    } else {
                        numberoftrays = (people / 5) + 1;
                    }
                    TakeOutProject sum = new TakeOutProject();
                    sum.getSubTotal(price, numberoftrays);
                    TakeOutProject tax = new TakeOutProject();
                    double total = price * numberoftrays;
                    tax.getTax(total, 0.07);
                    TakeOutProject.getTip(total, 0.15);
                    TakeOutProject.getGrandTotal(total, 0.07 * total, 0.15 * total);
                    TakeOutProject.pricePerPerson(TakeOutProject.getGrandTotal(total, 0.07 * total, 0.15 * total), people);
                    TakeOutProject.determineLeftOver(5, numberoftrays, people);
                } else if (item == 3) {
                    TakeOutProject tray3 = new TakeOutProject();
                    tray3.DetermineTrays(people, 10);
                    double price = 26.99;
                    if (people % 10 == 0) {
                        numberoftrays = (people / 10);
                    } else {
                        numberoftrays = (people / 10) + 1;
                    }
                    TakeOutProject sum = new TakeOutProject();
                    sum.getSubTotal(price, numberoftrays);
                    TakeOutProject tax = new TakeOutProject();
                    double total = price * numberoftrays;
                    tax.getTax(total, 0.07);
                    TakeOutProject.getTip(total, 0.15);
                    TakeOutProject.getGrandTotal(total, 0.07 * total, 0.15 * total);
                    TakeOutProject.pricePerPerson(TakeOutProject.getGrandTotal(total, 0.07 * total, 0.15 * total), people);
                    TakeOutProject.determineLeftOver(10, numberoftrays, people);
                }
                else System.out.println("Please  enter which number you want, ");
            }
            else System.out.println("Please enter correct Item!!!!");
        }


    }
}


