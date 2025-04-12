package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
    public int Task1(int[] a, int[] b){
        int adder = 0; //used for adding to
        for (int i = 0; i < b.length; i++){ //for loop to go through the array that 
            if(b[i]>=0 && b[i] < a.length){ //checks if the indexed value in b fits the range of values in array a.
                adder = adder + a[b[i]]; //this line adds the previous number to the number array a 
                //to the stipulated index in in array b
            }else{
                adder = adder + 0;
            }
        }
        return adder;
    }
}
