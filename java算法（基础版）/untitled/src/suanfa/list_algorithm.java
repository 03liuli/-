package suanfa;

import java.util.ArrayList;
import java.util.Scanner;

public class list_algorithm {
    /*
    *
    * 顺序查找
    * */
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("输入你要查找的数据：");
        int S = sc.nextInt();
        int []arr = {1,23,343,3434,232,22,22,22,22};
        System.out.println(numberList(arr,S));
    }
    public static ArrayList<Integer> numberList(int[]arr, int number){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == number){
                list.add(i);
            }
        }
        return list;
    }
}
