import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[];
        int i,n,s,count=0;
        System.out.println("Enter array size");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("Enter array elements");
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be sorted");
        s=sc.nextInt();
        for(i=0;i<a.length;i++)
        {
            if(a[i]==s)
            {
                System.out.println("Element found at "+(i+1)+" position");
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("Element not found");
        }
    }
}
