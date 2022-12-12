package HW_3;

import java.util.ArrayList;
import java.util.Random;

public class HW_3_1_2 {
    
    public static void mergeSort(ArrayList<Integer> Input)
    {
        if (Input.size() == 1)
        {
            return;
        }
        else {
            int mid = Input.size()/2;
                
            ArrayList<Integer> leftArray = new ArrayList<Integer>(mid);

            ArrayList<Integer> rightArray= new ArrayList<Integer>(Input.size()-mid);

            for (int i = 0; i < mid; i++) {
                leftArray.add(Input.get(i));
            } 
            
            for (int i = mid; i < Input.size(); i++) {
                rightArray.add(Input.get(i));
            } 

            mergeSort(leftArray); 
            // System.out.println(leftArray);
            mergeSort(rightArray);
            // System.out.println(rightArray);
            merge(leftArray, rightArray, Input);
        }
        // System.out.println(Input);

    }


    public static void merge (ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> target)
    {
        int indLeft = 0;
        int indRight = 0;
        // ArrayList<Integer> Sorted = new ArrayList<Integer>();

        // System.out.println(left);
        // System.out.println();
        // System.out.println(right);
        // int indTarget=0;

        while (indLeft < left.size() && indRight < left.size()){
            if (left.get(indLeft) <= right.get(indRight)){
                // Sorted.add(left.get(indLeft));
                target.add(left.get(indLeft));
                indLeft++;
            }
            else{
                // Sorted.add(right.get(indRight));
                target.add(right.get(indRight));
                indRight++;
            }
            indRight++;
        }
        while (indLeft < left.size()){
            // Sorted.add(left.get(indLeft));
            target.add(left.get(indLeft));
            indLeft++;
        }
        while (indRight < left.size()){
            // Sorted.add(right.get(indRight));
            target.add(right.get(indRight));
            indRight++;
        }

        // for (int i = 0; i < target.size(); i++) {
        //     if (leftIndex < left.size() && rightIndex < right.size()) {
        //         if (left.get(leftIndex) < right.get(rightIndex)) {
        //             target.add(left.get(leftIndex));
        //             leftIndex++;
        //         }
        //         else {
        //             target.add(right.get(rightIndex));
        //             rightIndex++;
        //         }
        //     }
        
        //    
        //     else if (leftIndex < left.size()) {
        //         target.add(left.get(leftIndex));
        //         leftIndex++;
        //     }
        //   
        //     else if (rightIndex < right.size()) {
        //         target.add(right.get(rightIndex));
        //         rightIndex++;
        //     }
        // }
    }

    public static void main(String[] args) {
        
        Random rnd = new Random();
        ArrayList<Integer> intArray = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            intArray.add(rnd.nextInt(99));
        }

        System.out.println(intArray);

        mergeSort(intArray);

        System.out.println(intArray);
    }
}
