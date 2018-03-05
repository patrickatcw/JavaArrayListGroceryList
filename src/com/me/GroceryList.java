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
    public void addGroceryItem(String item) {

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

    //step 18 modify grocery item
    public void modifyGroceryItem(String currentItem, String newItem){

        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }

    }

    //step 6 method to modify grocery item
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been changed.");

    }

    //step 19 overloading removeGroceryitem method
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >= 0) {
            removeGroceryItem(position);
        }

    }


    //step 7 method to remove grocery item
    private void removeGroceryItem(int position) {
        groceryList.remove(position);

    }

    //step 8 need a method to query list
    /*public String findItem(String searchItem) {
        int position = groceryList.indexOf(searchItem); //index part of java
        if(position >= 0){
            return groceryList.get(position);
        }

        return null;
        //now go to step 9 to main for running program*/

    //replace the immediate above with this
    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);


    }

    //step 21 back from main to create a method
    public boolean onFile(String searchItem){

        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }

        return false;

        //now go back to main

    }


}
