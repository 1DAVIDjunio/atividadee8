package atividadee8;




public class NumberModel {
    private int[] numbers;
    private int size; // Tamanho atual da lista de números

    public NumberModel() {
        numbers = new int[10]; // Inicialmente, armazena 10 números
        size = 0;
    }

    public void addNumber(int number) {
        if (size < numbers.length) {
            numbers[size] = number;
            size++;
        } else {
            System.out.println("Limite máximo de números atingido (10 números).");
        }
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void insertionSort() {
        // Implementação do Insertion Sort
        for (int i = 1; i < size; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }
    }

    public void bubbleSort() {
        // Implementação do Bubble Sort
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    // troca números[j+1] e numbers[j]
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }
}
