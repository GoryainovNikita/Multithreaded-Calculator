package Model;

import java.util.List;

public class Sum extends MathematicalOperations {
    @Override
    public Double call() throws Exception {
        return getDoubleList().stream().reduce(Double::sum).get();
    }
    public Sum(List<Double> doubleList) {
        super(doubleList);
    }

}
