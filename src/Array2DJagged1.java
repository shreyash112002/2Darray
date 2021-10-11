import java.util.Scanner;
public class Array2DJagged1 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int [][]arr=new int[3][];
            int i ,c, j;
            for(i=0;i<arr.length;i++)
            {
                System.out.println("Enter size for column");
                c=sc.nextInt();
                arr[i]=new int[c];
                System.out.println("Enter elements for row"+(i+1));
                for(j=0;j<arr[i].length;j++)
                {
                    System.out.println("Enter a number");
                    arr[i][j]=sc.nextInt();
                }
                for(i=0;i<arr.length;i++)
                {
                    for(j=0;j<arr.length;j++)
                    {
                        System.out.print(" "+arr[i][j]);
                    }
                    System.out.println(" ");
                }

            }

    }
}
