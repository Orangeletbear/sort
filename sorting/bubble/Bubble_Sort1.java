package bubble;

import org.jetbrains.annotations.Contract;

/**
 * @Author:YancyChong on 2019/5/21 11:17
 * @param: 冒泡排序
 * @return:
 * @Desciption:
 */
public class Bubble_Sort1 {
    @Contract("_, _ -> param1")
    public static int[] bubbleSort(int[] array, int length){
        if(array.length ==0)
            return array;
        for (int i=0; i< array.length; i++)
            for(int j=0; j<array.length - 1 - i; j++)
                if(array[j + i] < array[j]){
                    int temp = array[j + i];
                    array[j + i] = array[j];
                    array[j] = temp;
                }
                return  array;
    }
}
