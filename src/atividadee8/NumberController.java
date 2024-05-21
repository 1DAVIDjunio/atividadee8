package atividadee8;



import atividadee8.NumberModel;
import atividadee8.NumberView;

public class NumberController {
    private NumberModel model;
    private NumberView view;

    public NumberController(NumberModel model, NumberView view) {
        this.model = model;
        this.view = view;
    }

    public void addNumber(int number) {
        model.addNumber(number);
    }

    public void insertionSort() {
        model.insertionSort();
        view.displaySortedNumbers(model.getNumbers());
    }

    public void bubbleSort() {
        model.bubbleSort();
        view.displaySortedNumbers(model.getNumbers());
    }
}

