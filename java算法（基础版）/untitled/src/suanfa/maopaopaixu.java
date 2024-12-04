package suanfa;

public class maopaopaixu {
    public static void main(String[] args) {
        /*
        * 冒泡排序：核心思想：
        *   1，相邻的元素两两比较，大的放右边，小的放左边。
        *   2，第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面以此类推。
        *   3，如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以。
        * */
        int[] arr = {4,5,3,9,10,100,20,8,6,1};

        for (int j = 0; j < arr.length-1; j++) {
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
