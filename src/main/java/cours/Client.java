/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cours;


/**
 *
 * @author tims
 */
public class Client {

    public static void main(String[] args) {
        
        // Creation des tests
        System.out.println(".................... Creation du Fichier support_1.pdf ...............");
        Fichier support1 = new FilePdf("Support 1");
        support1.decrire();
        
        System.out.println("                   \n");
        
        System.out.println(".................... Creation du Fichier support_2.txt ...............");
        
        Fichier support2 = new FileTxt("Support 1");
        
        support2.decrire();
        System.out.println("                   \n");
        System.out.println(".................... Creation du Dossier : INF465 ...............");
        Dossier dossier1 = new Dossier("INF465");
        
        dossier1.Ajouter(support1);
        dossier1.Ajouter(support2);
        
        dossier1.decrire();        
        dossier1.Obtenir(1).decrire(); 
        
        dossier1.Supprimer(support2);
        dossier1.decrire();
        
        Dossier dossier2 = new Dossier("Cours2024");
        dossier2.Ajouter(dossier1);
        dossier2.decrire();
        
    }
}
