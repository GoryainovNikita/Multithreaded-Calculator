package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Model {

    private static final List<MathematicalOperations> listOperation = new ArrayList<>();
    private static final List<Factorial> listFactorial = new ArrayList<>();


    public void addSub(List<Double> list){
        Sub sub = new Sub(list);
        listOperation.add(sub);
    }

    public void addSum(List<Double> list){
        Sum sum = new Sum(list);
        listOperation.add(sum);
    }

    public void addMulti(List<Double> list){
        Multiplication multiplication = new Multiplication(list);
        listOperation.add(multiplication);
    }

    public void addFactorial(List<Integer> list){
        for(var elem : list){
            Factorial factorial = new Factorial(elem);
            listFactorial.add(factorial);
        }
    }

    public void calculate() throws ExecutionException, InterruptedException {
        ExecutorService executorService1 = Executors.newCachedThreadPool();
        for(var elem : listOperation){
            if(elem instanceof Sum){
                System.out.println("Сумма чисел: " + elem.getDoubleList() + " равна " + executorService1.submit(elem).get());
            } else if (elem instanceof Sub) {
                System.out.println("Разность чисел " + elem.getDoubleList() + " равна " + executorService1.submit(elem).get());
            } else if (elem instanceof Multiplication) {
                System.out.println("Произведение чисел " + elem.getDoubleList() + " равно " + executorService1.submit(elem).get());
            }
        }
        ExecutorService executorService2 = Executors.newCachedThreadPool();
        for (var elem : listFactorial){
            try {
                System.out.println("Факториал числа " + elem.getValue() + " равен " + executorService2.submit(elem).get());
            }
            catch (IllegalArgumentException e){
                System.out.println("Вы ввели отрицательное число при расчете факториала!");
            }

        }
        executorService1.awaitTermination(10, TimeUnit.SECONDS);
        executorService1.shutdown();
        executorService2.awaitTermination(10, TimeUnit.SECONDS);
        executorService2.shutdown();
    }


}
