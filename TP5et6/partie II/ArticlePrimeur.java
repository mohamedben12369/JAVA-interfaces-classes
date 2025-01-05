public class ArticlePrimeur extends Article implements VendableKilo{
    private double stock;
    public ArticlePrimeur(String nom,String fournisseur,double prixAchat,double prixVente) {
        super(nom,fournisseur,prixAchat,prixVente);
        this.stock=0;//Le stock est vide au départ
        }
    //Remplir le stock
    public void remplirStock(double quantite){this.stock+=quantite; }
    //Méthode pour vendre par kilogramme
    @Override
    public double vendre(double quantiteVendue) {
        if (quantiteVendue<=stock){stock-=quantiteVendue;return quantiteVendue*prixVente;}
        else{ System.out.println("Stock insuffisant");return 0; }
    }
    @Override
    public String toString(){return super.toString()+"\nStock:"+stock+"kg";}
}
