import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class text1 {
    public static void main (String[]args){
        /*
        键盘录入一些1~100之间的整数，并添加到集合中。
        直到集合中所有数据和超过200为止。
         */

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("请输入一个整数:");
            String Nums = sc.nextLine();
            int num = Integer.parseInt(Nums);

            if(num<1||num>100){
                System.out.println("当前数字不在1~100的范围当中，请重新输入");
                continue;
            }
            //
            list.add(num);

            int sum = getSum(list);

            if(sum>200){
                System.out.println("集合中所有的数据和已经满足要求");
                break;
            }
        }

    }
    public static int getSum(ArrayList<Integer> list){
        int sum = 0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }
}
