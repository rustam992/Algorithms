package ArraySort.InsertSort;

public class InsertSort {
    private long[] a;
    int nElems;

    public InsertSort(int max) {
        a = new long[max];
        nElems=0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for(long i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void insertSort() {
        int in, out;
        long temp;
        for (out=1; out<nElems;out++) {
            temp = a[out];
            in = out;
            while (in>0 && a[in-1]>=temp) {
                a[in] = a[in-1];
                --in;
            }
            a[in] = temp;
        }
    }

    public int getSize() {
        return a.length;
    }
}
