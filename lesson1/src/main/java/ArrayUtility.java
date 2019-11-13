import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class ArrayUtility {

    // Здесь вопросов нет
    private int[] data;

    public ArrayUtility(int[] data) {
        this.data = data;
    }

    //функция должна возвращать сумму элементов массива
    public long arraySum() {
        int sum = 0;
        for (int i : data) {
            sum += i;
        }
        return sum;
    }

    //функция должна возвращать среднее арифметическое
    //элементов массива
    public double avg() {
        //TODO
        return (double) arraySum()/data.length;
    }

    //функция должна возвращать медиану массива
    //медиана - это элемент посередине в упорядоченном массиве для
    //нечетных длин массива
    //или среднее арифметическое двух соседних элементов посередине
    //для четных длин
    //1 2 3 4 5 - 3
    //1 2 3 4 - (2 + 3) / 2 = 2,5
    public double median() {
        //TODO
        double median;
        if (data.length % 2 == 0)
            median = ((double)data[data.length/2] + (double)data[data.length/2 - 1])/2;
        else
            median = (double) data[data.length/2];
        return median;


    }
}




