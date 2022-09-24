/* Napraviti klasu koja predstavlja predracun. Treba da ima ime proizvoda i cenu (po komadu).
U main metodi napraviti nekoliko predracuna unoseci vrednosti iskljucivo kroz konstruktor.
Napisati metodu u klasi  za predracun koja ce da izracuna koliko kosta proizvod za uneti kvantitet (preko parametra proslediti).
U main metodi ispisati koliko koji proizvod kosta za taj neki kvantitet.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String productName;
        int productPrice;
        int quantity;

        System.out.print("Unesite ime proizvoda: ");
        productName = scan.nextLine();

        System.out.print("Unesite cenu proizvoda po komadu: ");
        productPrice = scan.nextInt();

        ProInvoice product = new ProInvoice(productName, productPrice);

        System.out.println("Cena za " + productName.toLowerCase() + " po komadu je " + productPrice + " rsd.");

        System.out.print("Unesite koliko komada zelite da kupite: ");
        quantity = scan.nextInt();

        System.out.println("Cena za " + quantity + " komada je " + product.quantity(quantity) + " rsd.");
    }
}
