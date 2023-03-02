import Controller.Controller;
import Model.Sub;
import Model.Sum;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Controller controller = new Controller();
        try {
            controller.execute();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
