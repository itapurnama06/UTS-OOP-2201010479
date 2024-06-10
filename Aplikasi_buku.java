package aplikasi_buku;

import java.util.Scanner;

/**
 *
 * @author itapu
 */
public class Aplikasi_buku {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Buku AD = new Buku();
        Scanner dIN = new Scanner(System.in);
        String clouse = "TIDAK";

        do {
                System.out.println("Aplikasi Buku");

                System.out.println("1. Input Data buku");
                System.out.println("2. Tampil Data Buku");
                System.out.println("3. Ubah Data Buku");
                System.out.println("4. Hapus Data Buku");
                System.out.println("5. Selesai");
                System.out.print("Pilih menu: ");

                String ch = dIN.nextLine();
                switch (ch) {
                    case "1":
                        AD.storedata();
                        break;

                    case "2":
                        AD.viewdata();
                        break;

                    case "3":
                        AD.editdata();
                        break;

                    case "4":
                        AD.destroydata();
                        break;

                    case "5":
                        clouse = "YA";
                        break;

                    default:
                        System.out.println("Menu Pilihan tidak Ada Ditampilkan");
                        break;
                }
            }while (clouse.equals("TIDAK"));
    }
    
}
