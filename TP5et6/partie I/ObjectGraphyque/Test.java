public class Test {
    public static void main(String[]args) {
ListeObjetGraphique liste=new ListeObjetGraphique();
 liste.ajouter(new Rectangle(0, 0, 10, 20));
 liste.ajouter(new Bouton(5, 5, 15, 25, "OK"));
 liste.ajouter(new Cercle(10, 10, 5));
 System.out.println("Avant déplacement :");
 liste.afficheObjetsGraphique();
 ((Rectangle) liste.liste.get(0)).deplacer(10, 10);
 ((Bouton)liste.liste.get(1)).deplacer(-5, -5); 
 ((Cercle)liste.liste.get(2)).deplacer(3, 3);
 //Afficher les objets après déplacement
 System.out.println("\nAprès déplacement :");
 liste.afficheObjetsGraphique();
    }
}
