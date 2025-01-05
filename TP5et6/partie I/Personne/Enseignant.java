
public class Enseignant extends Personne {
    private final String specialite;
    private static int nbEnseignants = 0;
    //Constructeur
    public Enseignant(String nom,String prenom,String rue,String ville,String specialite) {
        super(nom,prenom,rue,ville);
        this.specialite=specialite;
        nbEnseignants++;
    }
    @Override
    //toString
    public String toString(){return super.toString()+",Spécialité:"+ specialite;}
    @Override
    // Implémentation de la méthode abstraite
    public void ecrirePersonne(){System.out.println("Enseignant: " + toString());}
    // Méthode statique pour afficher le nombre d'enseignants
    public static void nbEnseignants() {System.out.println("Nombre d'enseignants:"+nbEnseignants);}
}