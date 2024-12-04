package suanfa;

public class xuanzhepaoxu {
    public static void main(String[] args){
    int[] arr = {2,3,4,6,1,5,7,9,8};
    int[] arr2 = sort(arr);
        System.out.println("-----------------");
    for(int i=0; i<arr.length; i++){
        System.out.print(arr2[i]);
    }
        System.out.println(" ");
        System.out.println("-----------------");

    }

    public static int[] sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
