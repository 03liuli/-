package 蓝桥算法;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class banjihuodong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 创建 Scanner 对象，用于接收输入
        int n = sc.nextInt(); // 读取一个整数n，表示后续输入的数字的个数
        sc.nextLine(); // 读取并忽略换行符（由于 nextInt() 后面会有换行符，调用 nextLine() 来跳过）

        // 读取一行并以空格分割成字符串数组
        String[] str = sc.nextLine().split(" ");

        // 创建一个长度为n的整数数组arr，并初始化一个 ArrayList
        int[] arr = new int[n];
        ArrayList<Integer> list = new ArrayList<>();

        // 将字符串数组中的数字转换为整数并存入 arr 和 list
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);  // 将字符串转换为整数
            list.add(arr[i]); // 将整数添加到 list 中
        }

        // 创建一个 HashMap，用来记录每个数字出现的次数
        HashMap<Integer, Integer> sum = new HashMap<>();

        // 遍历 list，统计每个数字出现的次数
        for (Integer id : list) {
            if (sum.containsKey(id)) {
                // 如果 map 中已经包含该数字，则计数加 1
                int count = sum.get(id);
                count++;
                sum.put(id, count); // 更新该数字的计数
            } else {
                // 如果 map 中没有该数字，说明这是第一次出现，初始化计数为 1
                sum.put(id, 1);
            }
        }

        // 调用 number() 方法计算结果并输出
        System.out.println(number(sum));
    }

    // 计算符合条件的结果
    public static int number(HashMap<Integer, Integer> map) {
        int condition = 2;  // 定义一个条件值为 2
        int A = 0;  // 记录出现次数小于条件值的数字种类数
        int B = 0;  // 记录出现次数大于条件值的数字总的多余部分
        int numberCount = 0;  // 最终计算的结果

        // 遍历 map 中每个键值对
        for (Integer key : map.keySet()) {
            Integer value = map.get(key);  // 获取数字出现的次数
            if (value > condition) {
                // 如果出现次数大于条件值，将超出部分累加到 B
                B += (value - 2);
            } else if (value < condition) {
                // 如果出现次数小于条件值，增加 A 的计数
                A++;
            }
        }

        // 根据 A 和 B 的关系来计算 numberCount 的值
        if (A > B) {
            // 如果 A 大于 B，说明有更多次数较少的数字，需要通过调整使得较少出现的数字参与更多的组合
            int C = A - B;  // 计算 A 和 B 之间的差值
            numberCount = (C / 2) + B;  // 将差值的一半加上 B，得到最终的结果
        } else {
            // 如果 A 小于或等于 B，直接使用 B 作为结果
            numberCount = B;
        }

        return numberCount;  // 返回计算结果
    }
}

