import java.util.HashMap;
import java.util.Map;

    public class SocieteHashMap implements InterfaceSociete {
    private Map<Employe, Departement> employeDepartementMap;

    public SocieteHashMap() {
        employeDepartementMap = new HashMap<>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        employeDepartementMap.put(e, d);
    }

        @Override
        public void ajouterEmploieDepartement(Employe e, Departement d) {

        }

        @Override
        public void SupprimerEmploye(Employe e) {

        }


        public void supprimerEmploye(Employe e) {
        employeDepartementMap.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe, Departement> entry : employeDepartementMap.entrySet()) {
            Employe employe = entry.getKey();
            Departement departement = entry.getValue();
            System.out.println(employe + " travaille dans le département " + departement);
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (Employe employe : employeDepartementMap.keySet()) {
            System.out.println(employe);
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (Departement departement : employeDepartementMap.values()) {
            System.out.println(departement);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        Departement departement = employeDepartementMap.get(e);
        if (departement != null) {
            System.out.println(e + " travaille dans le département " + departement);
        } else {
            System.out.println("Employé non trouvé.");
        }
    }

        @Override
        public boolean rechercheEmploye(Employe e) {
            return false;
        }

        @Override
        public boolean rechercheDepartement(Departement d) {
            return false;
        }


        public boolean rechercherEmploye(Employe e) {
        return employeDepartementMap.containsKey(e);
    }


    public boolean rechercherDepartement(Departement d) {
        return employeDepartementMap.containsValue(d);
    }
}
