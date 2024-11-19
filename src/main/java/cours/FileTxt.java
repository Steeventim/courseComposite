/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cours;

/**
 *
 * @author tims
 */
public class FileTxt extends Fichier {

    public FileTxt(String nom) {
        super();
        this.nom = nom;
        this.type = "TXT";
    }
    
       
    @Override
    public void decrire() {
        System.out.println("Fichier : "+ this.nom + " de type : "+ this.type);
    }
}
