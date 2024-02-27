package lesson19;

public class RubberArray {

    private final double RESIZE_K = 1.5;
    private final int INIT_DATA_SIZE = 10;
    private int[] data;
    private int length;


    public RubberArray() {
        data = new int[INIT_DATA_SIZE];
        length = 0;
    }

    public int get(int idx) {
        return data[idx];
    }

    public void add(int value) {
        if (length == data.length) {
            int[] newData = new int[(int) (data.length * RESIZE_K)];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            // change link to new array
            data = newData;
        }
        // add value
        data[length] = value;
        length++;
    }

    public void add(int value, int idx) {
        if (idx < 0 || idx > length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (length == data.length) {
            int[] newData = new int[(int) (data.length * RESIZE_K)];
            for (int i = 0; i < idx; i++) {
                newData[i] = data[i];
            }
            newData[idx] = value;
            for (int i = idx + 1; i <= length; i++) {
                newData[i] = data[i - 1];
            }
            data = newData;
        } else {
            for (int i = length; i > idx; i--) {
                data[i] = data[i - 1];
            }
            data[idx] = value;
        }
        length++;
    }

    public void remove(int idx) {
        for (int i = idx; i <data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        length--;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < length; i++) {
            str.append(data[i]);
            if (i < length - 1) {
                str.append(", ");
            }
        }
        str.append("]");
        return str.toString();
    }
}
