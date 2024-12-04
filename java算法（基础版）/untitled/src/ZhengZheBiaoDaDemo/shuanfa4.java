package ZhengZheBiaoDaDemo;

public class shuanfa4 {
    public static void main(String[] args){
        //核心逻辑：不断的去除以2，得到余数，一直到商为0就结束。
        //还需要把余数倒着拼接起来

        System.out.println(zifuchuan(10));
    }

    //定义一个StringBuilder用来拼接余数
    public static String zifuchuan(int number){
        StringBuilder A = new StringBuilder();
        while(number/2!=0){
                int temp = number%2;
                A.append(temp);
                number=number/2;
        }
        return A.toString();
    }
}
