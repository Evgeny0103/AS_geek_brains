package classwork;

public class TestDArray {
    public static void main(String[] args) {
        DArray<String> arr = new DArray<>();
        for (int i = 0; i < 12; i++) {
            arr.add("" + i);
        }
       // arr.add(12,"11");
       // arr.remove(12);
        arr.show();
    }
}
