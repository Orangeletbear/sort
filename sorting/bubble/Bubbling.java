package bubble;

/**
 * Created by YancyChong on 2019/5/22
 * 冒泡排序
 */
public class Bubbling {
    public static void main(String[] args) {
        bubbleSort();
    }
    public static void bubbleSort(){
        int a[]={13,31,45,66,76,87,53,24,45,90,86,35,23,12,};
        int temp=0;
        for(int i=0; i<a.length-1; i++){
            for (int j=0; j<a.length-1-i; j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for (int anA : a){
            System.out.print(anA+"  ");
        }
    }
}


