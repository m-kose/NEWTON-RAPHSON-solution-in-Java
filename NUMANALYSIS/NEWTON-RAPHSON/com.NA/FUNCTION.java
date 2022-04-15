package com.NA;
import java.util.function.DoubleFunction;


public class FUNCTION {
    public static DoubleFunction<Double> Funct() {
        return (x) -> (x*x*x*x)+x-1; // Define the function you want to solve.
    }
}
