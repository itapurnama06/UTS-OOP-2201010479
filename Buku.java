package aplikasi_buku;

import java.util.Scanner;

/**
 *
 * @author itapu
 */
public class Buku {
    int jdata = 3;
    String[] dbuku = new String[jdata];
    Scanner dtIN = new Scanner(System.in);
    
   public void storedata(){
       
       System.out.println("isikan Data Buku");
       
       int num=0;
       for(int i=0; i<jdata;i++){
            num++;
       System.out.print("Data ke-"+num+": ");
       dbuku[i] = dtIN.nextLine(); 

       
       }
  
   }
   
   public void viewdata(){
       System.out.println("Daftar Buku");
       System.out.println("~~~~");
       
       int no=0;
       for(int i=0; i<jdata; i++){
           no++;
           
           System.out.println(no+". "+dbuku[i]);
       }
   }
   public void editdata(){
       System.out.println("Ubah Data Buku");
       System.out.print("Nomor Buku yang di Ubah: ");
       
       String id = dtIN.nextLine();
       int idx = Integer.parseInt(id);
       
       System.out.println("Data yang di Ubah: "+dbuku[idx]);
       System.out.print("Di ubah menjadi: ");
       String newdt = dtIN.nextLine();
       dbuku[idx] = newdt;
       System.out.println("data Buku ke-"+idx+" telah diubah");

   }
   
   public void destroydata(){
       System.out.println("Hapus Data Buku");
       System.out.print("Data Buku yang di Hapus: ");
       
       String id = dtIN.nextLine();
       int idx = Integer.parseInt(id);  
       dbuku[idx]="";
       
       System.out.println("Data Buku index ke-"+idx+" telah di hapus");
   }
   
}

