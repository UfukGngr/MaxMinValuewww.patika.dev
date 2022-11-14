import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,num,maxValue=0,temp,minValue=0,temp2;


        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        n=scan.nextInt();

        for (int i=1;i<=n;i++){
            System.out.print(i+". sayıyı giriniz: ");
            num=scan.nextInt();

            temp=maxValue;//temp=0 max=0
            temp2=minValue;
            maxValue=num;//max=6 num=6
            minValue=num;
            if(temp>num){
                maxValue=temp;
            }
            if(temp2<num){
                minValue=temp;
            }

        }
        System.out.println("En büyük sayı: "+ maxValue);
        System.out.println("En küçük sayı: "+ minValue);


    }
}