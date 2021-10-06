import java.util.Scanner;

public class Array2DJagged {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]a=new int[3][];
        int i,j ;
        a[0]=new int[4];
        a[1]=new int[2];
        a[2]=new int[3];
        //Accepting array elements
        for(i=0;i<a.length;i++)
        {
            System.out.println("Enter elements for row"+(i+1));
            for(j=0;j<a[i].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    // display arr elements
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                System.out.print(" "+a[i][j]);
            }
            System.out.println("");
        }
    }
}
