public class Test{
    public static void main(String[]args){
        //Création d'un magasin
        Magasin magasin =new Magasin(2,2);
        //Création d'articles électroménagers
        ArticleElectromenager articleElectro1=new ArticleElectromenager("Téléviseur","Sony",200,300);
        articleElectro1.remplirStock(10);
        magasin.ajouterArticleElectromenager(0,articleElectro1);
        ArticleElectromenager articleElectro2=new ArticleElectromenager("Réfrigérateur","LG",400,600);
        articleElectro2.remplirStock(5);
        magasin.ajouterArticleElectromenager(1, articleElectro2);
        //Création d'articles primeurs
        ArticlePrimeur articlePrimeur1=new ArticlePrimeur("Pommes","Producteur local", 1, 2);
        articlePrimeur1.remplirStock(50);
        magasin.ajouterArticlePrimeur(0,articlePrimeur1);
        ArticlePrimeur articlePrimeur2=new ArticlePrimeur("Carottes","Producteur local", 0.8, 1.5);
        articlePrimeur2.remplirStock(30);
        magasin.ajouterArticlePrimeur(1, articlePrimeur2);
        //Affichage de l'état du magasin
        System.out.println(magasin);
        //Vente d'articles
        double revenuElectro1=articleElectro1.vendre(2);//Vente de 2 téléviseurs
        double revenuPrimeur1=articlePrimeur1.vendre(20);//Vente de 20 kg de pommes
        magasin.revenu+=revenuElectro1+revenuPrimeur1;
        //Affichage après ventes
        System.out.println("Après ventes:");
        System.out.println(magasin);}
}
