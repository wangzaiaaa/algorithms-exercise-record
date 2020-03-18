package sort;

/**
 * 选择排序
 * 时间复杂度O(n * n)
 * 是否稳定：不稳定
 */
public class SelectSort extends Sort{
    @Override
    public void sort(Comparable[] array) {
        if(array == null || array.length == 0){
            return;
        }else{
            for (int i = 0; i < array.length; i++){
                Comparable min = array[i];
                int minIndex = i;
                for(int j = i + 1; j < array.length; j++){
                    if(less(array[j],min)){
                        minIndex = j;
                        min = array[j];
                    }
                }
                swap(array,i,minIndex);
            }
        }
    }

    public static void main(String[] args) {
        SelectSort sort = new SelectSort();
        Integer [] array = sort.genRandomArray(10);
        sort.show(array);
        sort.sort(array);
        sort.show(array);
    }
}
