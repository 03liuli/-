package 力扣算法;

public class ShuanFa_difficulty {
    public static void main(String[] args) {
        int[] nums1 ={1,2,3,4};
        int[] nums2 ={5,6,7,8};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums3 =new int[m+n];
        int a = 0;//1
        int b = 0;//2
        int sum = 0;
        for(int i = 0; i<(m+n);i++){
            if( m==a && n != b ){
                nums3[i]=nums2[b];
                b+=1;
                continue;
            }
            else if(n==b && m != a){
                nums3[i]=nums1[a];
                a+=1;
                continue;
            }
            else if(nums1[a]>nums2[b]){
                nums3[i]=nums2[b];
                b+=1;
                continue;
            }
            else if(nums1[a]<nums2[b]){
                nums3[i]=nums1[a];
                a+=1;
                continue;
            }
            else{
                nums3[i]=nums1[a];
                ++i;
                nums3[i]=nums2[b];
                a+=1; b+=1;
            }
        }

        int s = m+n;
        if(nums3.length%2 != 0){
            double Z = nums3[ ((s+1)/2-1) ];
            return Z;
        }
        else{
            double Z = (nums3[ s/2 ]+nums3[ (s/2-1) ])/2.0;
            return Z;
        }
    }
}
