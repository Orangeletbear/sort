package heap;

import java.util.Arrays;

/**
 * Created by YancyChong on 2019/5/22
 * 堆排序
 */
public class Heap_Sort {
    public static void main(String[] args){
        int a[]={11,77,23,17,19,36,37,45,40,59,51,69,64,79,73,88,84,99,90};
        heapSort(a);
    }

    public static void heapSort(int[] a){
        //System.out.print("开始排序");
        int arrayLength=a.length;
        //循环建堆
        for(int i=0;i<arrayLength-1; i++){
//            //建堆
//            buildMaxHeap(a,arrayLength-1-i);
//            //交换堆顶和最后一个元素
//            swap(a,0,arrayLength-1-i);
            System.out.print(a[i]+"\t");
        }
    }
    private static void swap(int[] data, int i,int j){
        int temp=data[i];
        data[i]=data[j];
        data[j]=temp;
    }
    //对data数组从0到lastIndex建立顶堆
    private static void buildMaxHeap(int[] data,int lastIndex){
        //从lastIndex处节点的父节点开始
        for(int i=(lastIndex-1)/2; i>=0; i--) {
            //k保存正在判断的节点
            int k = i;
            //如果当前k节点的子节点存在
            int biggerIndex = 0;
            while (k * 2 + 1 <= lastIndex) {
                //k节点的左子节点的索引
                biggerIndex = 2 * k + 1;
                //如果biggerIndex小于lastIndex，即biggIndex+1代表的k节点的右子节点存在
                if (data[biggerIndex] < data[biggerIndex + 1]) {
                    //biggerIndex总是记录较大子节点的索引
                    biggerIndex++;
                }
            }
            //如果k子节点的值小于其较大的子节点的值
            if (data[k] < data[biggerIndex]) {
                //交换他们
                swap(data, k, biggerIndex);
                //将biggerIndex赋予K，开始while的循环的下一次循环，重新保证k节点的值大于其左右子节点的值
                k = biggerIndex;
            } else {
                break;
            }
        }
    }
}