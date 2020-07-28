package com.stayready;
import org.junit.Assert;
import org.junit.Test;

public class Problem02Test {
    Problem02 problem02= new Problem02();

    @Test
    public void sortTest(){
        int [] arr= {6,1,2,5,4};
        int [] expectedArr= {1, 2, 4, 5, 6};
        int [] actualArr=problem02.sort(arr);
        Assert.assertEquals(expectedArr,actualArr);
    }


   @Test
   public void howManyContinuousTest(){
       int [] arr={1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
       int expectedAmt=5;
       int actualAmt=problem02.howManyContinuous(arr);
       Assert.assertEquals(expectedAmt, actualAmt);


   }



}
