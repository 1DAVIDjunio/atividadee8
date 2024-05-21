package atividadee8;



public class NumberView {
    public void displayNumbers(int[] numbers) {
        System.out.print("Números: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public void displaySortedNumbers(int[] sortedNumbers) {
        System.out.print("Números ordenados: ");
        for (int number : sortedNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
