package ZhengZheBiaoDaDemo;

public class RegexDemo1 {
    /**
    * 正则表达式运用
    * */
    public static void main(String[]args){
        String qq = "000000000000122";
        System.out.println(checkQQ(qq));
    }

    public static boolean checkQQ(String qq){
        //规则：6位及18位之内，0不能在开头，必须全部是数字。
        int length = qq.length();
        if (length<6||length>18) {
            return false;
        }
        //0不能在开头
        if(qq.startsWith("0")){
            return false;
        }
        //必须全部是数字
        for(int i = 0; i < qq.length(); i++){
            char c = qq.charAt(i);
            if(c<'0' || c> '9'){
                return false;
            }
        }
        return true;
    }
}
