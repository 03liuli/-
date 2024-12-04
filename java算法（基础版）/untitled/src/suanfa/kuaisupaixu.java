package suanfa;

public class kuaisupaixu {
    public static void main(String[]args){
        /*
        * 快速排序：第一轮：以0索引的数字为基准数，确定基准数在数组中正确的位置。
        * 比基准数小的全部在左边，
        * 比基准数大的全部在右边。
        * 后面以此类推。
        * */
        int[] arr = {100,99,2,1,3,6,7};

        sort(arr,0,arr.length - 1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" || ");
        }

    }
    public static void sort(int[] arr, int start, int end){

        /*
        * a和b是数组的范围
        *
        * 为什么定义排序范围呢？
        * 后面的递归和换值会运用到
        * 下面代码只是快速排序第一轮
        * */
        int a = start;
        int b = end;

        if (a>b){
            return ;
        }
        //记录基准数
        int baseNumber = arr[start];

        //该循环主要目的是为了找到基准数的位置
        while(start != end){
            //利用end,从最右边索引开始，比基准数大就跳到前一个索引
            if(baseNumber < arr[end]){ --end; }
            //找到右边比基准数小的，开始找左边比基准数大的
            else {
                //利用start,从最左边开始（是从索引1开始的，因为0索引作为基准数），比基准数小就跳到后一个索引
                if (baseNumber > arr[start+1]) {
                    ++start;
                }
                //找到左边比基准数大的和找到右边比基准数小的,条件符合开始交换两个索引值的元素
                else {
                    int temp = arr[start+1];
                    arr[start+1] = arr[end];
                    arr[end] = temp;
                }
            }
        }
        //找到基准值位置进行数据调换
        //交换范围的最左边索引值（起始索引值）和基准值的索引值
        int temp = arr[a];
        arr[a] = arr[start];
        arr[start] = temp;
        /*
        * 接下来我们用递归来进行反复整理顺序，直到数组里的所有数据都在自己基准数位置
        * 步骤：
        * 确定基准数左边的范围，重复上面的方法
        * 确定基准数右边的范围，重复上面的方法
        * 这里我们最主要的是左右开工查
        * */
        sort(arr,a,start-1);

        sort(arr,start+1,b);
    }
}
