package selection;

/**
 * Created by YancyChong on 2019/5/21
 *  直接插入排序
 */
public class Selection_Soring {
    public static void main(String[] args){
        int[] nums = {15,2,34,67,93,11,46,4,97,27};
        int minIndex = 0;//用于记录每次比较的最小值下标

        //控制比较轮数
        for(int i = 0; i < nums.length-1;i++){
           minIndex = i;//每轮假设一个最小值下标（每轮的第一个）
           //控制比较次数，因为最后一个都需要比较一次，所有nums.length,不用再-1
            for(int j = i+1; j < nums.length; j++){
                //如果标记的数比比较的数大，则换标记数的下标，再进行比较
                if(nums[minIndex]>nums[j]){
                    minIndex = j;
                }
            }
            //判断需要交换的下标是否是自己i
            if (minIndex!=i){
                nums[minIndex] = nums[minIndex] + nums[i];
                nums[i] = nums[minIndex] - nums[i];
                nums[minIndex] = nums[minIndex] - nums[i];
            }
        }
        //输出结果
        /** for (int i = 0; i < nums.length; i++){
          *  System.out.print(nums[i]+"");
        */
        for (int num : nums) {
            System.out.print(num + "  ");
        }
    }
}
