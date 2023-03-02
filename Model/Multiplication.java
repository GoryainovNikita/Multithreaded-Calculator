package Model;

import java.util.List;

public class Multiplication extends MathematicalOperations{
    public Multiplication(List<Double> doubleList) {
        super(doubleList);
    }

    @Override
    public Double call() throws Exception {
        return getDoubleList().stream().reduce((result, elem) -> result*=elem).get();
    }
}
