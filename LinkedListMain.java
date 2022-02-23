

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[]args){
        LinkedList<Integer> sortedList = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));
        
        Scanner input = new Scanner(System.in);
        //Question 1
        System.out.print("Enter a number to be added into the linked list: ");
        int value = input.nextInt();
        System.out.println("The list before adding is " + sortedList);
        addAndSort(sortedList, value);
        System.out.println("The list after adding is " + sortedList);

        //Question 2
        System.out.println("----------------------------------------");
        System.out.println("----------------Question 2--------------");
        System.out.println("Enter 2 number seperated by spaces to swap values: ");

        int indexOne = input.nextInt();
        int indexTwo = input.nextInt();
        System.out.println("The list before swapping is : " + sortedList);
        swapValues(sortedList, indexOne, indexTwo);
        System.out.println("The list after swapping is : " + sortedList);


        //Question 3
        System.out.println("----------------------------------------");
        System.out.println("----------------Question 3--------------");
        LinkedList<Integer> randomList = new LinkedList<Integer>();
        Random random = new Random();
        for(int i =0; i < 500 ; i++){
            randomList.add(random.nextInt(1000, 9999));
        }
        System.out.print("Enter a value to be searched: ");
        int searchVal = input.nextInt();
        System.out.println("The value is "+ findValue(randomList, searchVal));
        



        input.close();


    }

    //Question 1
    public static void addAndSort(LinkedList<Integer> list, int value){
        for(int i = 0; i < list.size(); i++){
            if(value < list.get(i)){
                list.add(i, value);
                return;
            }
        }
        list.add(value);
        
    }

    //Question 2
    public static void swapValues (LinkedList<Integer> list, int indexOne, int indexTwo){
        if(indexOne> list.size() || indexTwo > list.size()){
            System.out.println("Error. Invalid indexes");
        }
        else{
            int swapOne = list.get(indexOne);
            int swapTwo = list.get(indexTwo);
            for(int i = 0; i < list.size(); i++){
                if(i == indexOne){
                    list.remove(indexOne);
                    list.add(i, swapTwo);
                }
                if(i == indexTwo){
                    list.remove(indexTwo);
                    list.add(i, swapOne);
                }
            }
            System.out.println("The 2 values being swapped are : " + swapOne + " " + swapTwo);
        }

    }

    public static int findValue (LinkedList<Integer> list, int searchVal){
        
        return list.indexOf(searchVal);
    }





}
