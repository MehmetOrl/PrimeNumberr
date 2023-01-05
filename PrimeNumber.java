import java.util.Scanner;
public class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int sayi=2;
        int sayi2=1;
        int adet=0;
        for(int i=2;i<=100;i++)
        {

            if(i>3&&i%3==0||(i>5&&i%5==0)||(i>7&&i%7==0)||(i>2&&i%2==0))
            {
                continue;
            }
            adet++;


            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Adet.:"+adet);

    }
}

