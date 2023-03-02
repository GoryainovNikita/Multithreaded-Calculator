package Model;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer> {

    private int value;

    @Override
    public Integer call() throws Exception {
        return factorialCalcilation(value);
    }

    private Integer factorialCalcilation(Integer elem) {
        if (elem < 0) {
            throw new IllegalArgumentException();
        } else if (elem == 0 || elem == 1) {
            return 1;
        } else {
            return elem * factorialCalcilation(elem - 1);
        }
    }

    public Factorial(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
