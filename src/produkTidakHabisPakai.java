import java.util.Arrays;

public class produkTidakHabisPakai extends produk {
    public produkTidakHabisPakai(String namaProduk, String kodeProduk) {
        jumlahStok = new int[5];
        this.namaProduk = namaProduk;
        this.kodeProduk = kodeProduk;
        this.namaMerk = new String[]{"HP Laser Jet Pro M12w", "Canon Pixma MG2570S", "Brother DCP-T300",  "Canon Selphy CP1200", "HP Color Laser Jet Pro MFP M1777fwK"};
        for (int i = 0; i < jumlahStok.length; i++) {
            jumlahStok[i] = rand.nextInt(25);
        }
    }
    @Override
    int hitungData() {
        int nilaiTerbesar=0;
        for (int i = 0; i< jumlahStok.length;i++){
            if (jumlahStok[i] > nilaiTerbesar) {
                nilaiTerbesar = jumlahStok[i];
            }
        }
        return nilaiTerbesar;
    }

    @Override
    void tampilkanData() {
        System.out.println(
                "Nama Produk : " + namaProduk
                        +"\nKode Produk : " + kodeProduk
                        +"\nNama Merk : " + Arrays.toString(namaMerk)
                        +"\nJumlah Stok : " + Arrays.toString(jumlahStok)
                        +"\nTotal Stok : "+ hitungTotalStok()
                        +"\nJumlah Stok Terbanyak : " + hitungData()+"\n");
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
