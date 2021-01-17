import java.util.Scanner;

public class CombinationLock
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int l= sc.nextInt();
        sc.nextLine();
        String start= sc.nextLine();

        String end = sc.nextLine();

        char [] st=start.toCharArray();

        char [] en=end.toCharArray();
        int sum=0;

        for(int i=0;i<l;i++)
        {
            int a= st[i]-48;

            int b= en[i]-48;
            a=Math.abs(a-b);
            b=10-a;
            sum+=Math.min(a,b);

        }
        System.out.println(sum);


    }
}
