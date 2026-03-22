import java.util.Scanner;
public class DegreeRotate {
    // public void swap(int a,int b){
    //     int temp=a;
    //     a=b;
    //     b=temp;
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of matrix");
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        // int n=arr.length;        row
        // int m=arr[0].length;      column
        System.out.println("Enter Elements of matix");
        for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
             }
        }
        
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < i; j++) {
             int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
          }
        }
        System.out.println("Transpose -");
        for(int[] ele:arr){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    
        for (int i = 0; i < arr.length; i++) {
            int p=0;
            int q=n-1;
            while(p<=q){
                int temp=arr[i][p];
                arr[i][p]=arr[i][q];
                arr[i][q]=temp;
                p++;q--;
            }
        }
        System.out.println("90 Degree Rotate -");
        for(int[] ele:arr){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    sc.close();

    }
}
