package merge;

import java.util.Arrays;

/**
 * Created by YancyChong on 2019/5/22
 * 归并排序
 */
public class Merge_Sorting {
    public static void main(String[] args){
        int a[]={12,34,25,38,42,49,52,58,63,68,67,64,70,79,89,83,90,95};
        sort(a,0,a.length-1);
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
    }
    public static void sort(int[] data, int left, int right){
        if(left<right){
            //找出中间索引
            int center = (left+right)/2;
            //对左边数组进行递归
            sort(data,left,center);
            //对右边数组进行递归
            sort(data,center+1,right);
            //合并
            merge(data,left,center,right);
        }
    }
    private static void merge(int[] data, int left, int center, int right){
        int [] tempArr = new int[data.length];
        int mid = center+1;
        //third记录中间数组的索引
        int third = left;
        int temp = left;
        while(left<=center&&mid<=right){
            //从两个数组中取出最小的放入中间数组
            if(data[left]<=data[mid]){
                tempArr[third++]=data[left++];
            }else{
                tempArr[third++]=data[mid++];
            }
        }
        //剩余部分依次放入中间数组
        while(mid<=right){
            tempArr[third++]=data[mid++];
        }
        while(left<=center){
            tempArr[third++]=data[left++];
            //将中间数组中的内容复制回原数组
            while(temp<=right){
                data[temp]=tempArr[temp++];
            }
            System.out.println(Arrays.toString(data));
        }
    }
}
