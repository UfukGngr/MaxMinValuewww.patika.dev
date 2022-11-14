import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,num,maxValue=0,temp,minValue=0;


        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        n=scan.nextInt();

        for (int i=1;i<=n;i++){
            System.out.print(i+". sayıyı giriniz: ");
            num=scan.nextInt();
            //6,8,4,12
            temp=maxValue;
            maxValue=num;

            if(temp>num){
                maxValue=temp;
                minValue=num;
            }
        }
        System.out.println("En büyük sayı: "+ maxValue);
        System.out.println("En küçük sayı: "+ minValue);


    }
}