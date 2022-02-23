

import java.util.*;

public class HashMapMain {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 3, 5, 7, 9, 11));
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < list.size(); i++) {
            hashMap.put(i, list.get(i));
        }

        //Question 4
        System.out.print("Enter a number to be inserted: ");
        int value = input.nextInt();

        System.out.println("\nThe HashMap before: " + hashMap);
        
        System.out.println("\nThe HashMap after: ");
        
        System.out.println(addAndSort(hashMap, value));


        //Question 5
        System.out.println("----------------------------------------");
        System.out.println("----------------Question 5--------------");
        System.out.println("Enter 2 number seperated by spaces to swap values: ");

        int indexOne = input.nextInt();
        int indexTwo = input.nextInt();
        System.out.println("The HashMap before: "+hashMap);
        swapValues(hashMap, indexOne,indexTwo);
        System.out.println("The HashMap after: "+hashMap);


        //Question 6
        System.out.println("----------------------------------------");
        System.out.println("----------------Question 6--------------");

        HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
        Random random = new Random();
        for(int i =0; i < 500 ; i++){
            hashMap1.put(i,random.nextInt(1000, 9999));
        }
        System.out.print("Enter a value to be searched: ");
        int searchVal = input.nextInt();
        System.out.println("The value is "+ findValue(hashMap1, searchVal));


        input.close();
    }


    //Question 4
    public static HashMap<Integer, Integer> addAndSort(HashMap<Integer, Integer> hashMap, int value) {
        hashMap.put(hashMap.size(), value);

        //Bubble Sort
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i = 1; i < hashMap.size(); i++){
                if(hashMap.get(i) < hashMap.get(i - 1)){
                    hashMap = swapValues(hashMap, i, i - 1);
                    sorted = false;
                }
            }
        }
        
        return hashMap;
    }

    //Question 5
    public static HashMap<Integer, Integer> swapValues (HashMap<Integer, Integer> hashMap, int indexOne, int indexTwo) {
        int tempHolder = hashMap.get(indexTwo);
        hashMap.put(indexTwo, hashMap.get(indexOne));
        hashMap.put(indexOne, tempHolder);
        return hashMap;
    }

    //Question 6
    public static int findValue (HashMap<Integer, Integer> hashMap, int searchVal) {
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == searchVal){
                return entry.getKey();
            };
        }
        return -1;
    }

}
