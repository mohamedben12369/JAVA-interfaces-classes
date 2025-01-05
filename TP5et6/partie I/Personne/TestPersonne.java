public class TestPersonne {
    public static void main(String[]args){
        //Création d'un Secretaire
        Secretaire s=new Secretaire("Said","Abidi","Rue Elamal","Casablanca","A123");
        s.ecrirePersonne();
        //Création d'un Enseignant
        Enseignant e =new Enseignant("Ahmed","Sbihi","Rue Bel Air","Fès","Informatique");
        e.ecrirePersonne();
        //Création de deux Etudiants
        @SuppressWarnings("unused")
        Etudiant e1 =new Etudiant("Samir","Merras","rue saules","Oujda","licence informatique");
        Etudiant e2 =new Etudiant("Hamid","Nissani", "rue d’olivier","Taza","DUT informatique");
        e2.ecrirePersonne();
        //Modification des adresses
        e.modifierPersonne("rue du grenadier","Rabat");
        s.modifierPersonne("rue Taounat","Safi");
        // nombres de chaque type de personne
        Personne.nbPersonne();
        Secretaire.nbSecretaires();
        Enseignant.nbEnseignants();
        Etudiant.nbEtudiants();
        //caractéristiques après modification
        e.ecrirePersonne();
        s.ecrirePersonne();
    }
}
