
package gorivo;

import java.util.Scanner;

public class Gorivo {


    public static void main(String[] args) {
        
        Scanner entry = new Scanner(System.in);
        double kilometraza;
        double gorivo;
        double cijenaGoriva;
        
        
       
        System.out.println("Unesite kilometrazu (u kilometrima [km]): ");
        kilometraza = entry.nextDouble();
        if (kilometraza <= 0) {
            System.out.println("Greska! Kilometraza mora biti veca od 0 km!!!");
            System.out.println("Program se prekida - pokrenite process kalkulacije ponovo...");
            System.exit(0);
            } 
        
        System.out.println("Unesite kolicinu potrosenog goriva (u litrima [l]): ");
        gorivo = entry.nextDouble();
        
        // Prosjek potrosnje
        
        double prosjek = (gorivo / kilometraza ) * 100;
        System.out.println("Za "+kilometraza+" potroseno je "+gorivo+"l goriva!");
        System.out.println("Prosjecna potrosnja za Vase vozilo je: "+prosjek+"l/100 km!");
        
        if (prosjek <= 6.0) {
            System.out.println("Vase vozilo je vrlo ekonomicno!");
            System.out.println("Prosjecna potrosnja je ispod 6 l/100km!!!");
        } else if (prosjek > 6.0) {
            System.out.println("Vase vozilo nije ekonomicno!");
            System.out.println("Vase vozilo trosi preko 6 l/100km!!!");
        } 
    
        System.out.println("Unesite cijenu goriva po litri (izrazenu u BAM): ");
        
        
        cijenaGoriva = entry.nextDouble();
        
        double ukupnaCijena = gorivo * cijenaGoriva;
        double cijenaPoKM = ukupnaCijena / kilometraza;
        
        System.out.println("Ukupan trosak: "+ukupnaCijena);
        System.out.println("Cijena jednog kilometra u vasem vozilu iznosi: " +cijenaPoKM + " BAM!!!");
        
        
        
        
    }
    
}
