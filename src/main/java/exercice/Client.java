/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercice;

/**
 *
 * @author tims
 */
public class Client {

    public static void main(String[] args) {
        // Creation des tests
        System.out.println(".................... Creation de la Feuille de Menu 1.pdf ...............");
        MenuItem rubrique1 = new Plat("Burger Max");
        rubrique1.Afficher();
        
        System.out.println("                   \n");
        System.out.println(".................... Creation de la Feuille de Menu 2.pdf ...............");
        MenuItem rubrique2 = new Boisson("Soda Glacee");
        rubrique2.Afficher();
        rubrique1.Afficher();
        
        System.out.println("                   \n");
        System.out.println(".................... Creation du Menu  : SIMPLE ...............");
        Menu menu1 = new Menu("SIMPLE");
        menu1.Ajouter(rubrique1);
        menu1.Ajouter(rubrique2);//        
        menu1.Afficher();        
        menu1.Obtenir(1).Afficher();         
        menu1.Supprimer(rubrique2);
        menu1.Afficher();
        
        System.out.println("                   \n");
        System.out.println(".................... Creation du Menu  : MIXTE ...............");
        Menu menu2 = new Menu("MIXTE");
        menu2.Ajouter(menu1);
        menu2.Afficher();
    }
}
