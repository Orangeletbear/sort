package bubble;

/**
 * Created by YancyChong on 2019/5/21
 * 冒泡排序
 */
public class Bubble_Sort3 {
    private static void bubbleSort3(int[] sortNum){
        boolean flag = true;
        while(flag){
            flag = false;

            int temp = 0;
            //第一个for循环控制排序要走多少趟，最多做n-1趟排序
            for (int i = 0; i < sortNum.length-1; i++) {
                //第2个for循环控制每趟比较多少次
                for (int j = 0; j < sortNum.length-1-i; j++) {
                    //大的往后面排
                    if(sortNum[j+1]<sortNum[j]){
                        temp = sortNum[j];
                        sortNum[j] = sortNum[j+1];
                        sortNum[j+1] = temp;
                        flag = true;
                    }
                }
                //优化判断
                if(!flag){// 若没有交换则排序完成，直接跳出
                    break;
                }
            }
        }
    }
}
