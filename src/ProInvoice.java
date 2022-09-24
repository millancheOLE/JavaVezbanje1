/* Napraviti klasu koja predstavlja predracun. Treba da ima ime proizvoda i cenu (po komadu).
U main metodi napraviti nekoliko predracuna unoseci vrednosti iskljucivo kroz konstruktor.
Napisati metodu u klasi  za predracun koja ce da izracuna koliko kosta proizvod za uneti kvantitet (preko parametra proslediti).
U main metodi ispisati koliko koji proizvod kosta za taj neki kvantitet.
 */

public class ProInvoice {

    String productName;
    int productPrice;

    public ProInvoice(String name, int productPrice) {
        this.productName = name;
        this.productPrice = productPrice;
    }

    public int quantity(int quantity) {

        int total;
        total = quantity * this.productPrice;

        return total;
    }
}
