package ArraySort.BubleSort;

import java.util.Scanner;

public class BubleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert array size:");
        BubleArr arr = new BubleArr((sc.nextInt()));

        for (int i=0; i<arr.getArraySize();i++) {
            System.out.println("Insert next value");
            arr.insert(sc.nextLong());
        }

        arr.display();
        arr.bubleSort();
        arr.display();
    }
}
