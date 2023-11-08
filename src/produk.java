import java.util.Random;
import java.util.Scanner;

abstract class produk {
    String[] namaMerk;
    String  namaProduk;
    String kodeProduk;
    public int[] jumlahStok;
    Scanner io = new Scanner(System.in);
    Random rand = new Random();

    abstract int hitungData();
    abstract void tampilkanData();
    abstract int hitungTotalStok();
}

