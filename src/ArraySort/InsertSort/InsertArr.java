package ArraySort.InsertSort;

import java.util.Scanner;

public class InsertArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert array length: ");
        InsertSort arr = new InsertSort(sc.nextInt());

        for (int i=0; i<arr.getSize(); i++) {
            System.out.println("Insert value");
            arr.insert(sc.nextLong());
        }

        arr.display();
        arr.insertSort();
        arr.display();
    }
}
