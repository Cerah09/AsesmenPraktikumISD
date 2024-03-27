import java.util.ArrayList;
import java.util.Scanner;

public class Asesmen1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Barang> koleksiBarang = new ArrayList<>();

        while (true) {
            System.out.println("1. Simpan barang");
            System.out.println("2. Hapus barang");
            System.out.println("3. Lihat koleksi");
            System.out.println("4. Keluar");

            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama barang: ");
                    String namaBarang = scanner.next();
                    System.out.print("Masukkan jenis barang: ");
                    String jenisBarang = scanner.next();
                    System.out.print("Masukkan tahun pembuatan: ");
                    int tahunPembuatan = scanner.nextInt();
                    System.out.print("Masukkan asal negara: ");
                    String asalNegara = scanner.next();

                    koleksiBarang.add(new Barang(namaBarang, jenisBarang, tahunPembuatan, asalNegara));
                    break;
                case 2:
                    System.out.print("Masukkan nama barang yang akan dihapus: ");
                    String namaBarangHapus = scanner.next();

                    for (int i = 0; i < koleksiBarang.size(); i++) {
                        if (koleksiBarang.get(i).getNama().equals(namaBarangHapus)) {
                            koleksiBarang.remove(i);
                            break;
                        }
                    }
                    break;
                case 3:
                    for (Barang barang : koleksiBarang) {
                        System.out.println("Nama barang: " + barang.getNama());
                        System.out.println("Jenis barang: " + barang.getJenis());
                        System.out.println("Tahun pembuatan: " + barang.getTahunPembuatan());
                        System.out.println("Asal negara: " + barang.getAsalNegara());
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan masukkan pilihan yang benar.");
            }
        }
    }

    static class Barang {
        private String nama;
        private String jenis;
        private int tahunPembuatan;
        private String asalNegara;

        public Barang(String nama, String jenis, int tahunPembuatan, String asalNegara) {
            this.nama = nama;
            this.jenis = jenis;
            this.tahunPembuatan = tahunPembuatan;
            this.asalNegara = asalNegara;
        }

        public String getNama() {
            return nama;
        }

        public String getJenis() {
            return jenis;
        }

        public int getTahunPembuatan() {
            return tahunPembuatan;
        }

        public String getAsalNegara() {
            return asalNegara;
        }
    }
}