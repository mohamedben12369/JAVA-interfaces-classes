public class ArticleElectromenager extends Article implements VendablePiece,Solde {
    private int stock;
    public ArticleElectromenager(String nom,String fournisseur,double prixAchat,double prixVente){
super(nom, fournisseur, prixAchat, prixVente);this.stock = 0;//Le stock est vide au départ 
}
    public void remplirStock(int quantite){this.stock += quantite;}
    //Méthode pour vendre par pièces
    @Override
    public double vendre(int quantiteVendue){
        if(quantiteVendue <= stock){stock-=quantiteVendue;return quantiteVendue*prixVente;} 
        else{System.out.println("Stock insuffisant");return 0;}}
    @Override
    public void lanceSolde(double pourcentage){prixVente-=prixVente*pourcentage/ 100; }
    @Override
    public void termineSolde(double pourcentage){prixVente+=prixVente*pourcentage/100;}
    @Override
    public String toString(){return super.toString()+"\nStock:"+stock;}
}
