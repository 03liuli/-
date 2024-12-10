package 力扣算法;

import java.util.Scanner;

public class luoxuanjuzhen_59 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 初始化起始点的坐标 (startX, startY) 和一些变量
        int startX = 0, startY = 0, offset = 1, count = 1;
        // 创建一个 n x n 的二维数组，用于存储结果
        int[][] arr = new int[n][n];
        // 变量 i, j 用于循环控制
        int i, j;
        // 初始化 sum 用于循环次数的控制
        int sum = 1;

        // 开始一个循环，直到 sum 达到 n/2
        while (sum <= n / 2) {
            // 从左到右填充上边界 (startX, startY) 到 (startX, n-offset)
            for (j = startY; j < (n - offset); j++) {
                arr[startX][j] = count++; // 填充数字并递增 count
            }

            // 从上到下填充右边界 (startX, n-offset) 到 (n-offset, n-offset)
            for (i = startX; i < (n - offset); i++) {
                arr[i][j] = count++; // 填充数字并递增 count
            }

            // 从右到左填充下边界 (n-offset, n-offset) 到 (n-offset, startY)
            for (; j > startY; j--) {
                arr[i][j] = count++; // 填充数字并递增 count
            }

            // 从下到上填充左边界 (n-offset, startY) 到 (startX, startY)
            for (; i > startX; i--) {
                arr[i][j] = count++; // 填充数字并递增 count
            }

            // 向内缩小螺旋的范围，更新起始坐标和偏移量
            startX++;
            startY++;
            offset++;  // 偏移量每次增加 1
            sum++;     // 累加 sum，用于控制循环次数
        }

// 如果 n 为奇数，最后剩下的中心位置填充最后一个数字
        if (n % 2 == 1) {
            arr[startX][startY] = count; // 填充中心
        }
        for(int k = 0;k<n;k++){
            System.out.println("");
            for(int l = 0;l<n;l++){
                System.out.print(arr[k][l]+" ");
            }
        }
    }
}
