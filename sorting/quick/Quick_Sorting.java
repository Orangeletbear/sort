package quick;

/**
 * Created by YancyChong on 2019/5/22
 * 快速排序
 */
public class Quick_Sorting {
    public static void main(String[] args){
        System.out.print(("排序开始："));
        int[] a={2,1,34,56};
        int start =0;
        int end = a.length-1;
        sort(a,start,end);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void sort(int[] a,int s_start, int s_end){
        int start = s_start;
        int end = s_end;
        int key = a[s_start];

        while(end > start){
            //从后往前比较
            //如果没有比关键值小的，比较下一个，
            // 直到有比关键值小的交换位置，然后又从前往后比较
            while(end>start&&a[end]>=key)
                end--;
            if(a[end]<=key){
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            //从前往后比较
            while(end> start&&a[start]<=key){
                //如果没有比关键值大的，就比较下一个，直到有比关键值大的交换位置
                start++;
                if(a[start]>=key){
                    int temp = a[start];
                    a[start] = a[end];
                    a[end] = temp;
                }
                //此时第一次循环比较结束，关键值的位置已经确定了。左边的值逗比关键值要小
                //右边的值逗比关键值要大，但是两边的顺序还有一种可能是不太一样的，进行下面的递归调用
            }
            //递归
            //左边序列。第一个索引位置到关键值的索引-1
            if(start>s_start) sort(a,s_start,start-1);
            //右边序列。从关键值索引+到最后一个
            if(end<s_end) sort(a,end+1,s_end);
        }
    }
}
