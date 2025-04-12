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

    //Removes the first character from every element in a list
    public int Task2(int[] a , int value){
        int counter = 0; //keeps track of how many times a value appears
        for (int i  = 0; i < a.length; i ++){ 
            if (a[i] == value){ //checks if the current element is equal to the value
                counter++;//if the above is true it increments the counter by 1
            }
        }
        return counter;//returns total count
    }
}
