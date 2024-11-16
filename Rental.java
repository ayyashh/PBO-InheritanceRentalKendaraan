import java.util.ArrayList;
import java.util.List;

public class Rental {
    private List<Kendaraan> kendaraanList;
    private List<String> penyewaList;

    public Rental() {
        kendaraanList = new ArrayList<>();
        penyewaList = new ArrayList<>();
    }

    public void tambahKendaraan(Kendaraan kendaraan) {
        kendaraanList.add(kendaraan);
    }

    public void tambahPenyewa(String nama, Kendaraan kendaraan) {
        penyewaList.add("Nama: " + nama + ", Kendaraan: " + kendaraan.getInfo());
    }

    public void tampilkanKendaraan() {
        System.out.println("Kendaraan Tersedia:");
        for (Kendaraan kendaraan : kendaraanList) {
            System.out.println("- " + kendaraan.getInfo());
        }
    }

    public void tampilkanPenyewa() {
        System.out.println("Daftar Penyewa:");
        for (String penyewa : penyewaList) {
            System.out.println("- " + penyewa);
        }
    }
}
