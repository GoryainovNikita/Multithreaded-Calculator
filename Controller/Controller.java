package Controller;

import Model.Model;
import View.View;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class Controller {

    private static final Model model = new Model();
    private static final View view = new View();

    public void execute() throws IOException {
        view.greeting();

        while (true){
            int command = view.printMenuAndReadCommand();
            if(command == 5){
                try {
                    model.calculate();
                } catch (ExecutionException e) {
                    view.error();
                } catch (InterruptedException e) {
                    view.error();
                }
                break;
            }
            switch (command){
                case 1:{
                    model.addSum(view.sum());
                    break;
                }
                case 2:{
                    model.addSub(view.sub());
                    break;
                }
                case 3:{
                    model.addMulti(view.mult());
                    break;
                }
                case 4:{
                    model.addFactorial(view.fact());
                }
                default:{
                    view.unknownFigure();

                }
            }

        }

    }
}
