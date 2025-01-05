
 class Bouton extends Rectangle {
    private String text;
    // Constructeurs
    public Bouton(){super(); this.text ="";}
    public Bouton(int x,int y,double largeur,double hauteur,String text){super(x, y,largeur,hauteur); this.text = text; }
    public Bouton(Bouton bouton){super(bouton);this.text = bouton.text; }
    public String getText(){return text;}
    public void setText(String text){this.text=text;}
    @Override
    public void affiche(){System.out.println("Bouton: Position ("+x+","+y+"),Largeur:"+largeur+",Hauteur:"+hauteur+",Text:"+text);}
}
