package ZhengZheBiaoDaDemo;

import java.util.Scanner;

public class shuanfa1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入价格p和购买数量:");
        String str = scanner.nextLine();
        String[] strs = str.split(" ");
        int p = Integer.parseInt(strs[0]);
        int t = Integer.parseInt(strs[1]);
        System.out.println(vin(p,t));
    }
    public static int vin(int p,int t){
    int x=12;
    int y=1;
    int z=0;
        while(x*y<t){
            y++;
            z+=p;
        }
        z+=p;
        return z;
    }
}
