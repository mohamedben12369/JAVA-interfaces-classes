
 class Secretaire extends Personne{
    private String numeroBureau;
    //compter les secrétaires
    private static int nbSecretaires = 0;
    public Secretaire(String nom,String prenom,String rue,String ville,String numeroBureau){
     super(nom, prenom,rue,ville);
     this.numeroBureau=numeroBureau;
    nbSecretaires++; }
    @Override
    public String toString(){return super.toString()+",Bureau:"+numeroBureau;}
    @Override
    public void ecrirePersonne(){System.out.println("Secrétaire:"+toString());}
    //Méthode statique pour afficher le nombre de secrétaires
    public static void nbSecretaires() {System.out.println("Nombre de secrétaires:"+nbSecretaires);}
    public String getNumeroBureau() {
        return numeroBureau; }
    public void setNumeroBureau(String numeroBureau) { this.numeroBureau=numeroBureau;}
    public static int getNbSecretaires(){return nbSecretaires;}
    public static void setNbSecretaires(int nbSecretaires) {Secretaire.nbSecretaires = nbSecretaires; }
}
