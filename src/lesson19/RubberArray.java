package lesson19;

public class RubberArray {

    private final double RESIZE_K = 1.5;
    private final int INIT_DATA_SIZE = 10;
    private int[] data;
    private int lenght;


    public RubberArray() {
        data = new int[INIT_DATA_SIZE];
        lenght = 0;
    }

    public int get(int idx) {
        return data[idx];
    }

    public void add(int value) {
        if (lenght == data.length) {
            int[] newData = new int[(int) (data.length * RESIZE_K)];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            // change link to new array
            data = newData;
        }
        // add value
        data[lenght] = value;
        lenght++;
    }

    public void add(int value, int idx) {
        // TODO implement
    }

    public void remove(int idx) {
        for (int i = idx; i <data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        lenght--;
    }

    @Override
    public String toString() {
        // TODO use StringBuilder instead of String
        String str = "[";
        for (int i = 0; i < lenght; i++) {
            str += String.valueOf(data[i]);
            if (i < lenght - 1) {
                str += ", ";
            }
        }
        return str + "]";
    }
}
