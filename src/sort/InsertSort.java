package sort;

/**
 * 插入排序
 * 时间复杂度 O(n * n)
 * 是否稳定 ： 稳定
 */
public class InsertSort extends Sort {
    @Override
    public void sort(Comparable[] array) {
        if(array == null || array.length == 0){
            return;
        }else{
            for(int i = 1; i < array.length; i++){
                for (int j = i; j > 0 && less(array[j],array[j-1]); j--){
                    swap(array,j,j-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        InsertSort sort = new InsertSort();
        Integer [] array = sort.genRandomArray(10);
        sort.show(array);
        sort.sort(array);
        sort.show(array);
    }
}
