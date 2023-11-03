    public class Main {
    public static void main(String[] args) {

        InterfaceSociete societeHashMap = new SocieteHashMap();


        Employe employe1 = new Employe("12345", "ccc", "bbb", "ttt");
        Employe employe2 = new Employe("54321", "E002", "zzz", "wwww");
        Departement departement1 = new Departement(1, "!!!");
        Departement departement2 = new Departement(2, "cccccc");

        societeHashMap.ajouterEmployeDepartement(employe1, departement1);
        societeHashMap.ajouterEmployeDepartement(employe2, departement2);



        societeHashMap.afficherLesEmployesLeursDepartements();

        societeHashMap.afficherLesEmployes();

        societeHashMap.afficherLesDepartements();

        societeHashMap.supprimerEmploye(employe1);
        societeHashMap.afficherLesEmployesLeursDepartements();

        boolean trouve = societeHashMap.rechercherEmploye(employe2);
        System.out.println (trouve ? "Trouvé" : "Non trouvé");
    }
}
