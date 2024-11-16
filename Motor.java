public class Motor extends Kendaraan {
    private int jumlahRoda;

    public Motor(String merk, String model, int tahunProduksi, int jumlahRoda) {
        super(merk, model, tahunProduksi);
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public String getInfo() {
        return "Motor: " + getMerk() + " " + getModel() + " (" + getTahunProduksi() + "), Roda: " + jumlahRoda;
    }
}