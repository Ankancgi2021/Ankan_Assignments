package io.inbuilt;

import java.util.function.Predicate;  
public class JavaPrediction {  
    public static void main(String[] args) {  
        Predicate<Integer> pr = a -> (a > 25); // Creating predicate  
        System.out.println(pr.test(26));    // Calling Predicate method    
    }  
}