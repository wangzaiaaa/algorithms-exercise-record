package sort;

/**
 * 冒泡排序
 * 时间复杂度 O(n * n)
 * 是否稳定：稳定
 * 缺点 在数组有序的情况下 时间复杂度依然是O(n * n)
 */
public class BubbleSort extends Sort {
    @Override
    public void sort(Comparable[] array) {
        if(array == null || array.length == 0){
            return;
        }else{
            for(int i = 1; i < array.length; i++){
                for(int j = array.length - 1; j >= i; j--){
                    if(less(array[j],array[j-1])){
                        swap(array,j,j-1);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        Integer [] array = sort.genRandomArray(10);
        sort.show(array);
        sort.sort(array);
        sort.show(array);
    }
}
