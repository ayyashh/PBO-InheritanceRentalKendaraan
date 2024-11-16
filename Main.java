public class Main {
    public static void main(String[] args) {
        Rental rental = new Rental();

        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020, 4);
        Mobil mobil2 = new Mobil("Subaru", "BR-Z", 2020, 4);
        Mobil mobil3 = new Mobil("Hyundai", "Staria", 2020, 4);
        Motor motor1 = new Motor("Yamaha", "NMAX", 2021, 2);
        Motor motor2 = new Motor("Honda", "CBR", 2021, 2);
        Sepeda sepeda1 = new Sepeda("Polygon", "Helios", 2022, "Balap");
        Sepeda sepeda2 = new Sepeda("Cannondale", "SuperSix EVO", 2022, "Touring");
        
        rental.tambahKendaraan(mobil1);
        rental.tambahKendaraan(mobil2);
        rental.tambahKendaraan(mobil3);
        rental.tambahKendaraan(motor1);
        rental.tambahKendaraan(motor2);
        rental.tambahKendaraan(sepeda1);
        rental.tambahKendaraan(sepeda2);
        
        rental.tampilkanKendaraan();

        rental.tambahPenyewa("Jinx", mobil3);
        rental.tambahPenyewa("Vi", sepeda2);
        rental.tambahPenyewa("Jayce", motor1);

        rental.tampilkanPenyewa();
    }
}
