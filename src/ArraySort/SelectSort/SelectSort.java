package ArraySort.SelectSort;

import java.util.Scanner;

public class SelectSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SelectArr arr = new SelectArr(sc.nextInt());

        for (int i = 0; i < arr.arraySize(); i++) {
            System.out.println("Insert value:");
            arr.insert(sc.nextLong());
        }

        arr.display();
        arr.selectSort();
        arr.display();
    }
}
