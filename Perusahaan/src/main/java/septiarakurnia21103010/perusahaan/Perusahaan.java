/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package septiarakurnia21103010.perusahaan;



/**
 *
 * @author admin
 */
public class Perusahaan {

    public static void main(String[] args) {
        CommissionEmployee C = new CommissionEmployee("Indira","C1001", 2000000,100000,10);
        ProjectPlanner P = new ProjectPlanner("Kurniawan","P5001",3000000,500000,7);
        SalariedEmployee S= new SalariedEmployee("Adiguna","S1511",50000);
        
        System.out.println("\t== DATA COMMISION EMPLOYEE ==");
        C.cetakInformasi();
        System.out.println("");
        System.out.println("\t== DATA PROJECT PLANNER ==");
        P.cetakInformasi();
        System.out.println("");
        System.out.println("\t== DATA SALARIED EMPLOYEE ==");
        S.cetakInformasi();
    }
}
