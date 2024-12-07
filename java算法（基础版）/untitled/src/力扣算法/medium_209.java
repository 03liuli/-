package 力扣算法;

import java.util.Scanner;

public class medium_209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 读取数组的大小 n
        int n = sc.nextInt();

        // 初始化长度为 n 的整数数组 arr
        int[] arr = new int[n];

        sc.nextLine();

        // 读取数组 arr 中的元素
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 假设输入的 target 为一个值（你可以根据实际输入来设置）
        int target = sc.nextInt();  // 读取目标值

        // 调用 minSubArrayLen 方法来计算结果并输出
        medium_209 solution = new medium_209();
        int result = solution.minSubArrayLen(target, arr);
        System.out.println(result);
    }

    // 定义方法 minSubArrayLen，计算满足条件的最小子数组长度
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;  // 起始指针，表示子数组的开始位置
        int sum = 0;  // 用于存储当前子数组的和
        int result = nums.length + 1;  // 初始化 result 为比最大可能子数组还大的数（nums.length + 1）

        // 遍历数组 nums，j 是结束指针，表示子数组的结束位置
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];  // 将当前元素加到 sum 中

            // 如果当前子数组的和小于目标值，并且已经遍历到了数组的最后一个元素且起始指针没有移动过
            if (sum < target && j == nums.length - 1 && i == 0) {
                return 0;  // 如果遍历完数组仍然没有找到符合条件的子数组，返回 0
            }

            // 如果当前子数组的和大于等于目标值，尝试缩小子数组的大小
            while (sum >= target) {
                int subLen = j - i + 1;  // 计算当前子数组的长度
                result = Math.min(result, subLen);  // 更新 result 为最小的子数组长度
                sum -= nums[i];  // 将起始元素从 sum 中减去
                i++;  // 移动起始指针，缩小子数组
            }
        }

        return result == nums.length + 1 ? 0 : result;  // 如果 result 仍然是初始化值，说明没有满足条件的子数组，返回 0
    }
}