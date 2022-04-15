package com.NA;
import java.util.function.DoubleFunction;

public class NEWTON_RAPHSON {
    public static void newrahMethod(DoubleFunction<Double> f, double P0){
        int count = 1;
        double P1; // P1
        while(true){
            P1 = P0 - (f.apply(P0)/DERIVATIVE.Derive(f).apply(P0));
            System.out.println(P1);
            if(Math.abs(P0-P1) < CONST.EPSILON || P1 == P0){ // Don't forget to update the EPSILON constant in CONST.java.
                System.out.println("The root is = "+P1+" Found in "+count+" iterations.");
                break;
            }
            P0 = P1;
            count++;
        }
    }
}