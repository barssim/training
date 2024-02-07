package javaFunction;

//Java Program to Illustrate Functional Interface
//Via apply() method

//Importing interface
import java.util.function.Function;

//Main class
public class Apply {

 // Main driver method
 public static void main(String args[])
 {
     // Function which takes in a number
     // and returns half of it
     Function<Double, Double> half = a -> a / 2.0;
     
     Function<Integer, Double> triple = a -> a * 3.0;
     
//     half = half.andThen(a -> 3 * a);

     // Applying the function to get the result
     System.out.println(half.apply(10.0));
     
     System.out.println(half.andThen(a -> 3 * a).apply(triple.apply(3)));
     
 }
}