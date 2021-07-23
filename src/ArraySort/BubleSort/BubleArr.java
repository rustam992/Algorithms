package ArraySort.BubleSort;

public class BubleArr {
    private long[] a;
    int nElems;

    public BubleArr(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        System.out.println("Your array:");
        for (int i=0; i<a.length; i++)
            if (a[i]>0) System.out.print(a[i]+ " ");
        System.out.println();
    }

    public void bubleSort() {
        int out, in;
        for (out=nElems-1; out>1; out--) {
            for(in = 0; in<out; in++) {
                if (a[in]>a[in+1]) swap(in, in+1);
            }
        }
    }

    public void swap (int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public int getArraySize() {
        return a.length;
    }
}
