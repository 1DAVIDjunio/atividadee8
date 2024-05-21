package atividadee8;



import atividadee8.NumberController;
import atividadee8.NumberModel;
import atividadee8.NumberView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberModel model = new NumberModel();
        NumberView view = new NumberView();
        NumberController controller = new NumberController(model, view);

        Scanner scanner = new Scanner(System.in);

        // Adiciona 10 números iniciais
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int number = scanner.nextInt();
            controller.addNumber(number);
        }

        // Exibe números antes da ordenação
        System.out.println("Números antes da ordenação:");
        view.displayNumbers(model.getNumbers());

        // Ordena os números utilizando Insertion Sort
        controller.insertionSort();

        // Ordena os números utilizando Bubble Sort
        controller.bubbleSort();
    }
}
