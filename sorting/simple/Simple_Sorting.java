package simple;

/**
 * Created by YancyChong on 2019/5/22
 * 简单选择排序
 */
public class Simple_Sorting {
    public static void main(String[] args) {
        selectSort();
    }
    /**
     * for(int i=0; i<arr.length; i++){
     *     System.out.println(arr[i];
     * }
     */

    private static void selectSort() {
        int a[] = {12, 11, 29, 28, 37, 34, 49, 43, 59, 54, 68, 63, 79, 74, 89, 85, 90};
        int post;
        for (int i=0;i<a.length ;i++){
            int j = i + 1;
            post = i;
            int temp = a[i];
            for (; j < a.length; j++) {
                if (a[j] < temp) {
                    temp = a[j];
                    post = j;
                }
            }
            a[post] = a[i];
            a[i] = temp;
        }
        for (int anA : a) System.out.print(anA);
        /**
          for (int i = 0; i < a.length; i++)
                      System.out.print(a[i]);
         */
        }
    }
