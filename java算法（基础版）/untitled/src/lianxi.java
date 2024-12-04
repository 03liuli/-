public class lianxi {
    public static void main(String[] args){


        String a = Integer.toBinaryString(100);
        System.out.println(a);


        String b = Integer.toOctalString(-100);
        System.out.println(b);

        String c = Integer.toHexString(66);
        System.out.println(c);

        int i = Integer.parseInt(c,16);
        System.out.println(i);
        System.out.println(i+1);

        
    }
}
