// Classe Cercle
public class Cercle extends ObjetGraphique {
    private double rayon;
    public Cercle(){super(); this.rayon = 0.0;}
    public Cercle(int x, int y, double rayon) {super(x, y); this.rayon = rayon;}
    public Cercle(Cercle cercle){super(cercle);this.rayon = cercle.rayon;}
    public double getRayon(){return rayon;}
    public void setRayon(double rayon){this.rayon=rayon;}
    @Override
    public void affiche(){System.out.println("Cercle:Position("+x+","+y+"),Rayon:"+rayon);}
}
