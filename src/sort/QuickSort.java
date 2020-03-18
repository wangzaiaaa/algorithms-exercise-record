package sort;

/**
 * 快速排序
 * 时间复杂度O(n * n)
 * 是否稳定：不稳定
 */
public class QuickSort extends Sort{
    @Override
    public void sort(Comparable[] array) {
        if(array == null || array.length == 0){
            return;
        }else{
            sort(array,0,array.length - 1);
        }
    }

    public void sort(Comparable[] array,int i,int j){
        if(i >= j){
            return;
        }else{
            int index = partition(array,i,j);
            sort(array,i,index - 1);
            sort(array,index + 1,j);
        }

    }
    public int partition(Comparable[] array,int l,int r){
        Comparable val = array[l];
        int i = l,j = r + 1;
        while (true){
            while (i < r && less(array[++i],val));
            while (j > l && less(val,array[--j]));
            if(i >= j) break;
            swap(array,i,j);
        }
        swap(array,l,j);
        return j;
    }

    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        Integer [] array = sort.genRandomArray(10);
        sort.show(array);
        sort.sort(array);
        sort.show(array);
    }
}
