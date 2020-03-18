package sort;

public class MergeSort extends Sort{
    Comparable [] tmp = null;
    @Override
    public void sort(Comparable[] array) {
        tmp = new Comparable[array.length];
        sort(array,0,array.length-1);
    }
    public void merge(Comparable[] array,int l,int r){
        if(l >= r){
            return;
        }else{
            for(int i = l; i <= r; i++){
                tmp[i] = array[i];
            }
            int m = (l + ((r - l) >> 1)),p = l,q = m + 1;
            for(int i = l; i <= r; i++){
                if(p > m) array[i] = tmp[q++];
                else if(q > r) array[i] = tmp[p++];
                else if(less(tmp[p],tmp[q])) array[i] = tmp[p++];
                else array[i] = tmp[q++];
            }
        }
    }
    public void sort(Comparable[] array,int l,int r){
        if(l >= r){
            return;
        }else{
            int m = l + ((r-l) >> 1);
            sort(array,l,m);
            sort(array,m+1,r);
            merge(array,l,r);
        }
    }

    public static void main(String[] args) {
        MergeSort sort = new MergeSort();
        Integer [] array = sort.genRandomArray(10);
        sort.show(array);
        sort.sort(array);
        sort.show(array);
    }
}
