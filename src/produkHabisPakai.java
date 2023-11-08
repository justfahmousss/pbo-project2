import java.util.Arrays;

public class produkHabisPakai extends produk {

    produkHabisPakai(String namaProduk, String kodeProduk) {
        jumlahStok = new int[10];
        this.namaProduk = namaProduk;
        this.kodeProduk = kodeProduk;
        this.namaMerk = new String[]{"Kertas HVS A4 Sidu 70 gsm", "Kertas HVS Ekon 75 gsm", "Kertas HVS Paper One 75 gsm", "Kertas HVS Natural 70 gsm", "Kertas HVS PPLite 75 gsm", "Kertas HVS PPLite 80 gsm", "Bola Dunia Kertas HVS 80 gsm", "Bola Dunia Kertas HVS 75 gsm", "Kertas Hvs Copy Paper 70 gsm", "Kertas Hvs Copy Paper 80 gsm"};
        for (int i = 0; i < jumlahStok.length; i++) {
            jumlahStok[i]= rand.nextInt(25);
        }
    }

    @Override
    int hitungData() {
        int nilaiTerkecil=9999999;
        for (int i = 0; i< jumlahStok.length;i++){
            if (jumlahStok[i] < nilaiTerkecil) {
                nilaiTerkecil = jumlahStok[i];
            }
        }
        return nilaiTerkecil;
    }

    @Override
    void tampilkanData() {
        System.out.println(
                "Nama Produk : " + namaProduk
                        +"\nKode Produk : " + kodeProduk
                        +"\nNama Merk : " + Arrays.toString(namaMerk)
                        + "\nJumlah Ketersediaan Kertas dengan "+jumlahStok.length+" macam merk :" + Arrays.toString(jumlahStok)
                        +"\nTotal Kertas Semua Merk : "+ hitungTotalStok()
                        +"\nJumlah ketersediaan kertas sedikit : " + hitungData()+"\n");
    }

    @Override
    int hitungTotalStok() {
        int totalStok = 0;
        for (int i = 0; i < jumlahStok.length; i++) {
            totalStok = totalStok + jumlahStok[i];
        }
        return totalStok;
    }
}
