public class Main {
    public static void main(String[] args) {
        produk HVS = new produkHabisPakai("HVS", "001");
        produk printer = new produkTidakHabisPakai("Printer", "002");

        HVS.tampilkanData();
        printer.tampilkanData();
    }
}