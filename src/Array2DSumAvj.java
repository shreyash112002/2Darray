import java.util.Scanner;

public class Array2DSumAvj {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,c,j,i,sum=0;
        System.out.println("Enter row and column size");
        r=sc.nextInt();
        c=sc.nextInt();

        int [][]arr=new int[r][c];
        System.out.println("Enter 2D array elements");
        for(i=0;i<arr.length;i++);
        {
            for(j=0;j<arr.length;j++)
            {
                arr[i][j] =sc.nextInt();

            }
        }
        System.out.println("Array elements are");
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j] +" ");
                sum=sum+arr[i][j];
            }
            System.out.println(" ");
        }
        System.out.println("Sum is "+sum);
        System.out.println("Average is"+(double)sum/r*c);
    }
}
