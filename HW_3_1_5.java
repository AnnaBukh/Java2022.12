package HW_3;

import java.util.ArrayList;
import java.util.Random;

import HW_3.HW_3_1_4;

public class HW_3_1_5 {
    public static void main(String[] args) {        
        Random rnd = new Random();
        ArrayList<Integer> unsortedArray = new ArrayList<Integer>();
        
        // unsortedArray.add(8);
        // unsortedArray.add(7);
        // unsortedArray.add(6);
        // unsortedArray.add(5);
        // unsortedArray.add(4);
        // unsortedArray.add(0);
        // unsortedArray.add(2);   

    
        for (int i = 0; i < 6; i++){
            unsortedArray.add(rnd.nextInt(99));
        }
        
        // System.out.println("---------Initial Unsorted Array---------");
        // for(int i:ms.getSortedArray()){
        //     System.out.print(i+" ");
        // }

        System.out.println(unsortedArray);

        HW_3_1_4 ms = new HW_3_1_4(unsortedArray);

        ms.sortGivenArray();
        
        // System.out.println("\n------------Sorted Array------------");
        // for(int i:ms.getSortedArray()){
        //     System.out.print(i+" ");
        // }
        System.out.println(unsortedArray);
    }
}

