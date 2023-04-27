import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        System.out.println("Podaj miasto:");

        String input = scanner.nextLine();

        while   (!input.equals("/")) {

            lista.add(input);
            input=scanner.nextLine();
        }

        System.out.println("Bledny znak");

        System.out.println("Lista zawiera:");
        for (String element : lista) {
            System.out.println(element);
        }

        System.out.println("Liczba miast:");

        System.out.println(lista.size());


    }
}