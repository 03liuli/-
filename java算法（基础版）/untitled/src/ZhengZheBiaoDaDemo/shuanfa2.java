package ZhengZheBiaoDaDemo;

import java.util.Scanner;

public class shuanfa2 {
    public static void main(String[] args){
        /*
        自己实现parseInt方法的效果，将字符串形式的数据转成整数。
        要求：
        字符串中只能是数字不能有其他字符
        最少一位，最多10位
        0不能开头
         */
        Scanner sc = new Scanner(System.in);


//        String A = sc.nextLine();
//        Integer n = A.length();
        String A= "121391321";
        //这里用到了正则表达式，对数据1-9进行判，超出1-9则false
        if (!A.matches("[1-9]\\d{0,9}")){
            System.out.println("格式有误");
        }else {
            System.out.println("数据格式正确，将进行下一步");
            int number = 0;
            for (int i = 0; i < A.length(); i++) {
                int c = A.charAt(i) - '0';
            number = number*10 + c;
            }
            System.out.println(number);
        }


    }
}
