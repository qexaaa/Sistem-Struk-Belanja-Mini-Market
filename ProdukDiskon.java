public class ProdukDiskon extends Produk {
    private double diskon;

    public ProdukDiskon(String nama, double hargaSatuan, int jumlah, double diskon) {
        super(nama, hargaSatuan, jumlah);
        this.diskon = diskon;
    }

    @Override
    public double hitungTotal() {
        return super.hitungTotal() * (1 - diskon);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " (Diskon " + (diskon * 100) + "%)";
    }
}
