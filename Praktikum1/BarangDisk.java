import java.util.Scanner;

public class BarangDisk {
 public static void main(String[]args){
    Scanner BD = new Scanner(System.in);

    int JmlBrg, HrgBrg;
    System.out.print("Masukkan jumlah barang :");
    JmlBrg = BD.nextInt();

    System.out.print("harga barang perunit: ");
    HrgBrg = BD.nextInt();

    float JumlahDiskon = JmlBrg*HrgBrg*15/100;

    float JumlahBayar = JmlBrg*HrgBrg-JumlahDiskon;

    System.out.println("Jumlah barang yang perlu dibayar :" + JumlahBayar);
    
 }
}
