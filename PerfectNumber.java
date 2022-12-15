import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int sayi,s1=1,toplam=0;
        System.out.print("Sayı Giriniz.:");
        sayi= entry.nextInt();
        while(s1<sayi)
        {
            if(sayi%s1==0)
            {
                System.out.println(s1);
                toplam+=s1;
                s1++;
            }
            else
            {
                s1++;
            }
        }
        if(toplam==sayi)
        {
            System.out.println(toplam+" Mükemmel Sayıdır.");
        }
        else
        {
            System.out.println("Mükemmel Sayı Değldir.:");
        }
    }
}

