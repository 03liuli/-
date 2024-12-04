package suanfa;

public class charupaixu {
    public static void main(String[] args){
        int[] arr = {1,2,11,26,25,24,99,66,55,44,38};
        int[] arr1 = charu(arr);
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i]);
            System.out.print(" ");
        }
    }

    public static int[] charu(int[] arr){
        int startIndex = 0;
        for (int i=0 ;i < arr.length;i++){
            if (arr[i] > arr[i+1]) {
                startIndex = i+1;
                break;
            }
        }
        //for循环方法
        for(int j = startIndex; j < arr.length; j++){
            for(int k = j;k > 0; --k){
                if (arr[k] < arr[k-1]){
                  int temp = arr[k];
                  arr[k] = arr[k-1];
                  arr[k-1] = temp;
                }
                else break;
            }

            /*
            * while循环方法
            int sum = j;
            while (sum>0 && arr[sum] < arr[sum-1]){
                int temp = arr[sum];
                arr[sum] = arr[sum-1];
                arr[sum-1] = temp;
                --sum;
            }
            * */
        }
        return arr;
    }
}
