/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercice;

/**
 *
 * @author tims
 */
public class Plat extends MenuItem {

    public Plat(String nom) {
        super();
        this.nom = nom;
        this.type = "Plat";
    }
    
       
    public void Afficher() {
        System.out.println("- Rubrique du Menu : "+ this.nom + " de type : "+ this.type);
    }
}
