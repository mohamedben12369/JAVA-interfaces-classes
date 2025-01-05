import java.util.ArrayList;
import java.util.ListIterator;
public class ListeObjetGraphique {
 protected ArrayList<ObjetGraphique> liste;
    public ListeObjetGraphique() {
 liste=new ArrayList<>();}
    public void ajouter(ObjetGraphique obj) {liste.add(obj); }
    public void afficheObjetsGraphique() {
 ListIterator<ObjetGraphique> it = liste.listIterator();
 while (it.hasNext()){it.next().affiche();}
}
}
