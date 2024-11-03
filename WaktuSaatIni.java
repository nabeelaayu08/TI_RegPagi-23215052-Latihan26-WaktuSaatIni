package WaktuSaatIni;
/**
 * NAMA : NABE'ELA AYU NING TYAS ZAHRA
 * PRODI : TEKNIK INFORMATIKA
 * NIM       : 23215052
 * Deskripsi Program : Program ini akan menampilkan waktu saat ini
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class WaktuSaatIni {
    public static void main(String[] args) {
        // Membuat objek Date untuk mendapatkan waktu saat ini
        Date sekarang = new Date();

        // Mengatur format tanggal dan waktu
        SimpleDateFormat formatTanggal = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", new Locale("id", "ID"));

        // Menampilkan hasil dengan format yang diinginkan
        System.out.println("Hari ini adalah hari : " + formatTanggal.format(sekarang));
    }
}
