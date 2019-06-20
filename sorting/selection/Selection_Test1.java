package selection;

/**
 * Created by YancyChong on 2019/5/21
 *  直接插入排序
 */
public class Selection_Test1 {
    public static void main(String[] args) {
        insertSort();
    }
    //int[] arr={3,1,4,2};
    //for(int i = 0; i<arr.length; i++){
    //System.out.println(arr[i]);
    public static void insertSort(){
        int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
        int temp=0;
        for(int i=1;i<a.length;i++){
            int j=i-1;
            temp=a[i];
            //将大于temp的值整体后移一个单位
            for(;j>=0&&temp<a[j];j--){
                a[j+1]=a[j];
            }
            a[j+1]=temp;
        }
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}

