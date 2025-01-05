public abstract class Personne {
    protected String nom;
    protected String prenom;
    protected String rue;
    protected String ville;
    //compter les personnes
    protected static int nbPersonnes = 0;
 //Constructeur
    public Personne(String nom, String prenom, String rue, String ville) {
        this.nom = nom;this.prenom = prenom;
 this.rue = rue;this.ville = ville;nbPersonnes++;}
    @Override
    //toString
    public String toString() {return nom+" "+prenom+","+rue+","+ville;}
  public abstract void ecrirePersonne();
    //afficher le nombre de personnes
    public static void nbPersonne(){System.out.println("Nombre total de personnes:"+nbPersonnes);}
    //modifier l'adresse
    public void modifierPersonne(String rue, String ville){this.rue=rue;
        this.ville=ville;
        ecrirePersonne();
    }
}
