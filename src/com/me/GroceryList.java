package com.me;
//defining an array ex.
//int[] myArray = new int[10];
//numbered 0 - 9

import java.util.ArrayList;

//step 1 created a new class....Grocery List class
public class GroceryList {

    //step 2  create private variable for our arraylist
    //different form private int[] myNumbers; because an array list
    //can hold objects, in case here we are using String
    //creating an arrow list below, arraylist is actually a class,
    //note, (), can have it's own constructor

    //in conjunction with step 4
    private ArrayList<String> groceryList = new ArrayList<>();

    //step 3 method for adding grocery item
    public void addGroceryItem(String item){

        //step 4 (with arraylist, java does this for us with .add)
        groceryList.add(item);  //adding an item

    }

    //step 5 method to print grocery list
        public void printGroceryList() {
            System.out.println("You have " + groceryList.size() +   //size will return how many elements in the array list
                    " items in your grocery list.");
            for (int i = 0; i < groceryList.size(); i++) {
                System.out.println((i + 1) + ". " + groceryList.get(i)); //get method java
            }

        }

        //step 6 method to modify grocery item
        public void modifyGroceryItem(int position, String newItem) {
            groceryList.set(position, newItem);
            System.out.println("Grocery item " + (position + 1) + " has been changed.");

        }

}
