package sort;

/**
 * 希尔排序
 * 时间复杂度O(n * n)
 * 是否稳定: 不稳定
 */
public class ShellSort extends Sort {
    @Override
    public void sort(Comparable[] array) {
        if(array == null || array.length == 0){
            return;
        }else{
            int h = 1;
            while (h < array.length / 3){
                h = 3 * h + 1;
            }
            while (h >= 1){
                for(int i = h; i < array.length; i++){
                    for (int j = i; j >= h && less(array[j],array[j-h]); j -= h){
                        swap(array,j,j-h);
                    }
                }
                h = h / 3;
            }
        }
    }
    public static void main(String[] args) {
        ShellSort sort = new ShellSort();
        Integer [] array = sort.genRandomArray(10);
        sort.show(array);
        sort.sort(array);
        sort.show(array);
    }
}
