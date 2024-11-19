/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cours;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tims
 */
public class Dossier extends Component {
    
    private 
            String nom;
            String type;
            List<Component>sousdossier;

    public Dossier(String nom) {
        super();
        this.nom = nom;
        this.type = "Dossier";
        this.sousdossier = new ArrayList<Component>();
    }
    
    
    
    @Override
    public void decrire() {
        System.out.println(".............Dossier : "+ this.nom + ".............");
        //Parcourir les sous elements
        for (int i = 0; i < sousdossier.size(); i++) {
            if (sousdossier.get(i) instanceof Dossier) {
                sousdossier.get(i).decrire();
            } else 
                if(sousdossier.get(i) instanceof Fichier){
                sousdossier.get(i).decrire();
            }
        }
    }
    
    public void Ajouter(Component element){
        sousdossier.add(element);
    }
    
    public void Supprimer(Component element){
        int i ;
        for (i=0; i<sousdossier.size(); i++){
            if (sousdossier.get(i)==element) {
                sousdossier.remove(i);
            }
        }
    }
    
    public Component Obtenir(int i){
        return sousdossier.get(i);
    }
    
}
