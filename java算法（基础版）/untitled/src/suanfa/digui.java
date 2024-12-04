package suanfa;

public class digui {
    public static void main(String[] args) {
        System.out.println("递归："+method(7));
    }
    public static int method(int number) {
        if (number == 1)
            return 1;
        else
        return  number * method(number - 1);
    }
}
