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
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){

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


}
