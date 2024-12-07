package 力扣算法;

public class ShuanFa_difficulty {
    public static void main(String[] args) {
        // 初始化两个已排序的数组 nums1 和 nums2
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {5, 6, 7, 8};

        // 调用 findMedianSortedArrays 方法，计算并输出两个排序数组的中位数
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 获取两个数组的长度
        int m = nums1.length;
        int n = nums2.length;

        // 创建一个新数组 nums3，用来存储合并后的数组，长度为 m + n
        int[] nums3 = new int[m + n];

        // 初始化指针 a 和 b，分别用于遍历 nums1 和 nums2
        int a = 0; // 指向 nums1 数组
        int b = 0; // 指向 nums2 数组

        // 使用变量 sum 来计算数组的合并过程，但实际这里未使用
        int sum = 0;

        // 遍历合并数组 nums3，直到所有元素都被填充
        for (int i = 0; i < (m + n); i++) {
            // 如果 nums1 已经完全遍历，直接将 nums2 中剩余的元素添加到 nums3 中
            if (m == a && n != b) {
                nums3[i] = nums2[b];
                b += 1; // nums2 的指针 b 向前移动
                continue; // 继续下一轮循环
            }
            // 如果 nums2 已经完全遍历，直接将 nums1 中剩余的元素添加到 nums3 中
            else if (n == b && m != a) {
                nums3[i] = nums1[a];
                a += 1; // nums1 的指针 a 向前移动
                continue; // 继续下一轮循环
            }
            // 如果 nums1[a] > nums2[b]，则将 nums2[b] 插入到 nums3 中
            else if (nums1[a] > nums2[b]) {
                nums3[i] = nums2[b];
                b += 1; // nums2 的指针 b 向前移动
                continue; // 继续下一轮循环
            }
            // 如果 nums1[a] < nums2[b]，则将 nums1[a] 插入到 nums3 中
            else if (nums1[a] < nums2[b]) {
                nums3[i] = nums1[a];
                a += 1; // nums1 的指针 a 向前移动
                continue; // 继续下一轮循环
            }
            // 如果 nums1[a] == nums2[b]，则将两个数字都插入到 nums3 中
            else {
                nums3[i] = nums1[a];
                ++i; // 指针 i 先向前移动
                nums3[i] = nums2[b]; // 插入 nums2[b]
                a += 1; // nums1 的指针 a 向前移动
                b += 1; // nums2 的指针 b 向前移动
            }
        }

        // 计算合并后数组 nums3 的长度（m + n）
        int s = m + n;

        // 判断合并后的数组长度是奇数还是偶数
        if (nums3.length % 2 != 0) {
            // 如果是奇数，返回中位数，即位于数组中间位置的元素
            double Z = nums3[((s + 1) / 2 - 1)];
            return Z;
        } else {
            // 如果是偶数，返回中位数，即中间两个数的平均值
            double Z = (nums3[s / 2] + nums3[s / 2 - 1]) / 2.0;
            return Z;
        }
    }
}