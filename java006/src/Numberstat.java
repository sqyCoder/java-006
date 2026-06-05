import java.util.Scanner;
public class Numberstat{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0,max=0,min=0,count=0;
        for(int j=0;j<10;j++){
            if(arr[j]>arr[max]){
                max=j;
            }
            if(arr[j]<arr[min]){
                min=j;
            }
            if(arr[j]%2==0){
                sum=sum+arr[j];
                count++;
            }
        }
        System.out.println("最大值是"+arr[max]);
        System.out.println("最小值是"+arr[min]);
        System.out.println("偶数的个数是"+count);
        System.out.print("偶数的平均值是");
        if(count>0){
            System.out.printf("%.1f",(double)sum/count);
        }
        else{
            System.out.print("0.0");
        }
        sc.close();
    }
}