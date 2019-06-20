package bubble;

/**
 * Created by YancyChong on 2019/5/21
 * 冒泡排序
 */
public class Bubble_Test1 {
    public static void main(String[] args){
        int arr[] = {2,59,15,36,59,16,95,84,25};

        Bubble_Sort1.bubbleSort(arr, arr.length);

        for(int a:arr) System.out.print(a + "  ");
    }
}
