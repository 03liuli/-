package suanfa;

public class find_1_2 {
    /*
    *
    * 二分查找
    *
    * */

    public static void main(String[] args){
        int []arr = {7,23,79,81,103,127,131,147};
        int A = numberFinder(arr,7);
        System.out.println(A);
    }

    public static int numberFinder(int[] arr , int n){
        int max = arr.length-1;
        int min = 0;

        while(true){
            if(min > max){
                return 0;
            }
            //记录每次折半的位置，同时最后查找得出的索引的位置
            int sum = (max+min)/2;
            if(n>arr[sum]){min = sum+1;}
            else if(n < arr[sum]){max = sum-1;}
        else {
            return sum;
        }
        }
    }
}
