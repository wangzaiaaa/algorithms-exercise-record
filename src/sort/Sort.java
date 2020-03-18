package sort;

public abstract class Sort <T extends Comparable<T>> {
    public abstract void sort(T [] array);
    public void swap(T [] array,int i,int j){
        T tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    public boolean less(T a,T b){
        return a.compareTo(b) < 0;
    }
    public void show(T [] array){
        for (T v : array){
            System.out.printf(v + " ");
        }
        System.out.println();
    }
    public Integer[] genRandomArray(int len){
        Integer [] array = new Integer[len];
        for (int i = 0; i < len; i++){
            array[i] = (int)(Math.random() * 3 * len);
        }
        return array;
    }
}
