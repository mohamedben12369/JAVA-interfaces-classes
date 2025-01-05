public class Rectangle extends ObjetGraphique {
    protected double largeur,hauteur;
    public Rectangle(){super();this.largeur=0.0;this.hauteur=0.0;}
 public Rectangle(int x,int y,double largeur,double hauteur){
super(x,y);this.largeur=largeur;this.hauteur=hauteur;}
public Rectangle(Rectangle rect){
super(rect);
this.largeur=rect.largeur;
this.hauteur=rect.hauteur;}
    public double getLargeur(){ return largeur;}
 public double getHauteur() {return hauteur;}
 public void setObjetGraphique(int x, int y, double largeur, double hauteur) {
 setPosition(x, y);this.largeur=largeur;
 this.hauteur=hauteur;
}
public void setTaille(double largeur,double hauteur){this.largeur=largeur;
this.hauteur=hauteur;}
@Override
public void affiche(){System.out.println("Rectangle:Position("+x+","+y+"),Largeur:"+largeur+",Hauteur:"+hauteur);}
}
