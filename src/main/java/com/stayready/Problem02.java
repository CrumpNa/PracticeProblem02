package com.stayready;
import java.util.Arrays;

public class Problem02 {




    public int[] sort(int [] arr){
        Arrays.sort(arr); //sort the array
        return arr;


    }


    public int howManyContinuous(int [] arr){
        int [] sortedArr= sort(arr); //sort the inputted array

        //use while loop to go thru sorted array
        int i=0;
        int currElem=sortedArr[i]; //current element
        int nextElem=sortedArr[i+2]; //elem right after curr elem
        int counter=0; //counts the number of contiguous situations

        while(currElem+1==nextElem){
            counter++; //add to counter
            i++; //advance in the array

        if(currElem+1!=nextElem){
            counter=0; //start counter over
    }
}
        return counter;
    }

}

