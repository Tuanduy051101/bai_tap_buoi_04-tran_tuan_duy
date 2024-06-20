package bt2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BT2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Red", "Green", "Orange", "White", "Black");
        System.out.println("Danh sách ban đầu: " + strings);
        Collections.sort(strings);
        System.out.println("Mảng đã được sắp xếp: " + strings);
    }
}