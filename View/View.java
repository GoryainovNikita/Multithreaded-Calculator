package View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class View {

    private static final Scanner scanner = new Scanner(System.in);
    private static final BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

    public void greeting(){
        System.out.println("Добро пожаловать в наш многопоточный калькулятор!\n");
    }

    public int printMenuAndReadCommand(){
        System.out.println("Введите команду: \n" +
                "1. Сложение \n" +
                "2. Вычитание \n" +
                "3. Умножение \n" +
                "4. Факториал числа \n" +
                "5. Рассчитать");
        return scanner.nextInt();
    }

    public List<Double> sum() throws IOException {
        System.out.println("Введите числа, которые хотите сложить, через пробел: ");
        return Stream.of(buff.readLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
    }
    public List<Double> sub() throws IOException {
        System.out.println("Введите числа, которые хотите вычесть, через пробел: \n" +
                "Будьте внимательны, если вы введете больше 2 чисел, то все последующие числа будут вычтены из первого числа");
        return Stream.of(buff.readLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
    }

    public List<Double> mult() throws IOException {
        System.out.println("Введите числа, которые хотите умножить, через пробел: ");
        return Stream.of(buff.readLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
    }

    public List<Integer> fact() throws IOException {
        System.out.println("Введите числа, у которые хотите найти факториал, через пробел: ");
        return Stream.of(buff.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
    }

    public void error (){
        System.out.println("Произошла непредвиденная ошибка, попробуйте снова");
    }

    public void unknownFigure(){
        System.out.println("Пожаллуйста введите нужную цифру");
    }
}
