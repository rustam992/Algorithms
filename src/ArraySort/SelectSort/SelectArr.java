package ArraySort.SelectSort;

public class SelectArr {
    private long[] a;
    int nElems;

    public SelectArr(int max) {
        a = new long[max] ;
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        System.out.println("Your array:");
        for (long i:a) if(i>0) System.out.print(i+" ");
        System.out.println();
    }

    public void selectSort() {
        int out,in, indexOfMin = 0;
        for (out=0; out<a.length; out++) {
            indexOfMin = out;
            for(in=out; in<a.length; in++) {
                if (a[in]<a[indexOfMin]) indexOfMin = in;
            }
            swap(out, indexOfMin);
        }
    }

    public void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public int arraySize(){
        return a.length;
    }
}
