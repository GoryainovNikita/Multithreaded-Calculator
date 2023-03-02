package Model;

import java.util.List;
import java.util.concurrent.Callable;

public abstract class MathematicalOperations implements Callable<Double> {

    private List<Double> doubleList;

    @Override
    public Double call() throws Exception {
        return null;
    }

    public MathematicalOperations(List<Double> doubleList) {
        this.doubleList = doubleList;
    }

    public List<Double> getDoubleList() {
        return doubleList;
    }

    public void setDoubleList(List<Double> doubleList) {
        this.doubleList = doubleList;
    }
}
