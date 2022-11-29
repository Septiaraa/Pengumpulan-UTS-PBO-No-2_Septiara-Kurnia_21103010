/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package septiarakurnia21103010.perusahaan;

/**
 *
 * @author admin
 */
public class CommissionEmployee extends Employee {
    int gajiPokok,komisi,totalPenjualan;
    int gaji;
    
    public CommissionEmployee(String nama, String nip, int gajiPokok,int komisi,int totalPenjualan){
        super(nama,nip);
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalPenjualan = totalPenjualan;
    }
    public void menghitungGaji(){
        gaji = gajiPokok + (komisi*totalPenjualan);
        System.out.println("GAJI                : Rp "+gaji);
    }
    public void cetakInformasi(){
        System.out.println("NAMA                : "+nama);
        System.out.println("NIP                 : "+nip);
        System.out.println("GAJI POKOK          : Rp "+gajiPokok);
        System.out.println("KOMISI              : Rp "+komisi);
        System.out.println("TOTAL PENJUALAN     : "+totalPenjualan);
        menghitungGaji();
    }
    
}
