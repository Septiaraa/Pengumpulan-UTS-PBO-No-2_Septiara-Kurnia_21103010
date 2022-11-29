/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package septiarakurnia21103010.perusahaan;

/**
 *
 * @author admin
 */
public class SalariedEmployee extends Employee{
    int upahMingguan;
    int gaji;
    
    public SalariedEmployee(String nama, String nip, int upahMingguan){
        super(nama,nip);
        this.upahMingguan = upahMingguan;
    }
    public void menghitungGaji(){
        gaji = upahMingguan;
        System.out.println("GAJI                : Rp "+gaji);
    }
    public void cetakInformasi(){
        System.out.println("NAMA                : "+nama);
        System.out.println("NIP                 : "+nip);
        System.out.println("UPAH MINGGUAN       : Rp "+upahMingguan);
        menghitungGaji();
    }
    
}
