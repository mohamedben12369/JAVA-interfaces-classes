
public class Etudiant extends Personne {
    private final String diplomeEnCours;
    //compter les étudiants
    private static int nbEtudiants = 0;
    //Constructeur
    public Etudiant(String nom, String prenom,String rue,String ville,String diplomeEnCours){
        super(nom, prenom, rue, ville); this.diplomeEnCours = diplomeEnCours;
        nbEtudiants++;}
    @Override
    //toString
    public String toString() { return super.toString() + ", Diplôme en cours: " + diplomeEnCours; }
    @Override
    // Implémentation de la méthode abstraite
    public void ecrirePersonne(){System.out.println("Étudiant:"+toString()); }
    //afficher le nombre d'étudiants
    public static void nbEtudiants(){System.out.println("Nombre d'étudiants: " + nbEtudiants);}
}