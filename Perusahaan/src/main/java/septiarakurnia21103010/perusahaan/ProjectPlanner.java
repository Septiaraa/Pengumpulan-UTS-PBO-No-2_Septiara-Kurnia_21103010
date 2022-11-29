/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package septiarakurnia21103010.perusahaan;

/**
 *
 * @author admin
 */
public class ProjectPlanner extends Employee {
    int gajiPokok, komisi, totalHasilProyek;
    float pajak;
    int gaji;
    
    public ProjectPlanner(String nama, String nip, int gajiPokok, int komisi, int totalHasilProyek){
        super(nama,nip);
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalHasilProyek = totalHasilProyek;
    }
    public void menghitungGaji(){
        pajak = (float) (0.05*gajiPokok);
        gaji = (int) (gajiPokok + (komisi*totalHasilProyek)-pajak);
        System.out.println("GAJI                : Rp "+gaji);
    }
    public void cetakInformasi(){
        System.out.println("NAMA                : "+nama);
        System.out.println("NIP                 : "+nip);
        System.out.println("GAJI POKOK          : Rp "+gajiPokok);
        System.out.println("KOMISI              : Rp "+komisi);
        System.out.println("TOTAL HASIL PROYEK  : "+totalHasilProyek);
        menghitungGaji();
    }
}
