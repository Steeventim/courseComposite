/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercice;


/**
 *
 * @author tims
 */
public abstract class MenuItem extends MenuComponent {
    
    protected 
            String nom;
            String type;

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setType(String type) {
        this.type = type;
    }

    
  
      
}
