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

    public static boolean Task3(String input) {
    int count = 0;

    for (char c : input.toCharArray()) {
        if (c == '(') {
            count++;
        } else if (c == ')') {
            count--;
            if (count < 0) {
                return false; // More closing than opening
            } }
        }

        return count == 0; // Must be zero if perfectly matched
    }

    public static List<Integer> Task4(List<Integer> a, List<Integer> b) {
        // Check if lists are of different sizes
        if (a.size() != b.size()) {
            return null;
        }

        List<Integer> result = new ArrayList<>();
        int n = a.size();

        // Multiply corresponding elements
        for (int i = 0; i < n; i++) {
            int product = a.get(i) * b.get(n - 1 - i);  // a[i] * b[last - i]
            result.add(product);
        }

        return result;
    }
    //g22m8834 Task5, checks if list is sorted
    public static boolean Task5(List<Integer> lst){
        if(lst == null || lst.size() <=1){
            return true;
        }

        for (int x=0; x < lst.size() -1; x++){
            if (lst.get(x) > lst.get(x+1)) {
                return false;
            }
        }
        return true;
    }
    
    //g21m7567 Task 6, round up to highest multiple of 100
    public static List<Integer> Task6(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();  
        for (int num : numbers) {
            if (num % 100 == 0) {
                result.add(num);  //Already a multiple of 100
            } else {
                //Calculate next highest multiple of 100
                int rounded = ((num / 100) + 1) * 100;
                result.add(rounded);
            }
        }
            
        return result;
        }
}

