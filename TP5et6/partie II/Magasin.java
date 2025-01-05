public class Magasin{
    private double depense;//Coût d'achat des produits
 protected  double revenu;//Revenu du magasin après ventes
    private final ArticleElectromenager[]articlesElectromenager;
    private final ArticlePrimeur[]articlesPrimeur;
    public Magasin(int tailleElectromenager,int taillePrimeur){
        this.articlesElectromenager=new ArticleElectromenager[tailleElectromenager];
        this.articlesPrimeur=new ArticlePrimeur[taillePrimeur];}
    //Ajouter un article électroménager au magasin
    public void ajouterArticleElectromenager(int index, ArticleElectromenager article){articlesElectromenager[index] = article;}
    //Ajouter un article primeur au magasin
    public void ajouterArticlePrimeur(int index, ArticlePrimeur article){articlesPrimeur[index] = article;}
    //Calcul du rendement du magasin
    public double rendement(){return(revenu-depense)/depense*100;}
    @Override
public String toString() {
    StringBuilder sb=new StringBuilder(); //Create a new StringBuilder object
    sb.append("Magasin:\n");//Append the header for the store
    sb.append("Dépenses:").append(depense).append("\nRevenu: ").append(revenu).append("\nRendement:").append(rendement()).append("%\n");  // Append store details
    sb.append("Articles électroménagers:\n");//Append section for electronic articles
    //Append each ArticleElectromenager's details if not null
    for(ArticleElectromenager article:articlesElectromenager){
        if (article!=null) { sb.append(article.toString()).append("\n");}}
    sb.append("Articles primeurs:\n");  //Append section for primeur articles
    //Append each ArticlePrimeur's details if not null
    for(ArticlePrimeur article:articlesPrimeur) {if (article!=null){sb.append(article.toString()).append("\n");}}
    return sb.toString();//Return the complete string built by StringBuilder
    }}