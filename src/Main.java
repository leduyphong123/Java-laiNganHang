import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month;
        float stg, ls;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so tien gui: ");
        stg = input.nextFloat();
        System.out.println("nhap so lai xuat: ");
        ls = input.nextFloat();
        System.out.println("nhap so thang: ");
        month = input.nextInt();
        float result=stg*(ls/12)*month;
        System.out.println("So tien lai = " +result);
    }
}