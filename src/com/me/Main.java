//resources
/*
https://docs.oracle.com/javase/8/docs/api/java/util/List.html
https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html
https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
https://docs.oracle.com/javase/8/docs/api/java/util/AbstractList.html
 */
//arrayList - a resizable array that handles resizing of arrays automatically

package com.me;

//in conjunction with step 9
import java.util.Scanner;

public class Main {

    //step 9 add scanner
    private static Scanner scanner = new Scanner(System.in);
    //step 10
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        //step 11 creating switch statement, will need to add methods after
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                //these are options for the user
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }

        }

    }

    //step 12 print instructions method
    public static void printInstructions() {
        //these will be menu options as to what the user wants to do throughout program
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options. ");
        System.out.println("\t 1 - To print the list of grocery items. ");
        System.out.println("\t 2 - To add an item to the list. ");
        System.out.println("\t 3 - To modify an item in the list. ");
        System.out.println("\t 4 - To remove an item from the list. ");
        System.out.println("\t 5 - To search for an item in the list. ");
        System.out.println("\t 6 - To quit the application. ");

    }

    //step 13 method to add item
    public static void addItem() {
        System.out.print("Please enter the grocery item: ");  //got rid on ln so print on same line
        groceryList.addGroceryItem(scanner.nextLine());       //adding that as an item to our arraylist

    }

    //step 14 method to modify item
    public static void modifyItem() {
        System.out.print("Enter item name: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1, newItem); //- 1 to access to correct element

    }

    //step 15 method to remove item
    public static void removeItem() {
        System.out.println("Enter item name: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);   //no - 1 here

    }

    //step 16 method to search for item
    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + ", is not in the shopping list.");

            //step 17 run program



        }

    }




}
