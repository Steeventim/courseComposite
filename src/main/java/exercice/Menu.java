/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tims
 */
public class Menu extends MenuComponent {
    
    private 
            String nom;
            String type;
            List<MenuComponent>sousmenu;

    public Menu(String nom) {
        super();
        this.nom = nom;
        this.type = "Menu";
        this.sousmenu = new ArrayList<MenuComponent>();
    }
    
    
    
    @Override
    public void Afficher() {
        System.out.println(".............Menu : "+ this.nom + ".............");
        //Parcourir les sous elements
        for (int i = 0; i < sousmenu.size(); i++) {
            if (sousmenu.get(i) instanceof Menu) {
                sousmenu.get(i).Afficher();
            } else 
                if(sousmenu.get(i) instanceof MenuItem){
                sousmenu.get(i).Afficher();
            }
        }
    }
    
    public void Ajouter(MenuComponent element){
        sousmenu.add(element);
    }
    
    public void Supprimer(MenuComponent element){
        int i ;
        for (i=0; i<sousmenu.size(); i++){
            if (sousmenu.get(i)==element) {
                sousmenu.remove(i);
            }
        }
    }
    
    public MenuComponent Obtenir(int i){
        return sousmenu.get(i);
    }

    
}
