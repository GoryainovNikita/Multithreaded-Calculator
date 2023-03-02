package Model;

import java.util.List;

public class Sub extends MathematicalOperations {
    @Override
    public Double call() throws Exception {
        return getDoubleList().stream().reduce((result, elem) -> result-=elem).get();
    }

    public Sub(List<Double> doubleList) {
        super(doubleList);
    }
}
