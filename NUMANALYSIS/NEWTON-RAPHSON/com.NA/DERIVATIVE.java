// THANKS TO thekeenant, https://gist.github.com/thekeenant/4bdab56307e5b8e909f308a037a668ce.
package com.NA;
import java.util.function.DoubleFunction;

public class DERIVATIVE {
    public static DoubleFunction<Double> Derive(DoubleFunction<Double> a){
        double DX = 0.0001;
        return (x) -> (a.apply(DX+x) - a.apply(x)) / DX;
    }
}
