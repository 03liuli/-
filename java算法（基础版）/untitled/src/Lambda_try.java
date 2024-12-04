import java.util.Arrays;
import java.util.Comparator;

import static suanfa.digui.method;

public class Lambda_try {
    public static void main(String[] args) {//初识lambda表达式
        Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4, 9};
        /*
        这是匿名内部类写法
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
         */
        //这里是Lambda写法
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
                    return o1 - o2;
                }
        );
        System.out.println(Arrays.toString(arr));

//        method(new Swim() {
//            @Override
//            public void swimming() {
//                System.out.println("正在游冰~~~");
//            }
//            });
        method(
                () -> {
                    System.out.println("man~~~~~");
                }
        );
    }

    public static void method(Swim s){
        s.swimming();
    }
    }
    interface Swim{
        public abstract void swimming();
    }
