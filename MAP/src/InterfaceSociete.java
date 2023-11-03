public interface InterfaceSociete {

    void ajouterEmployeDepartement(Employe e, Departement d);

    public void ajouterEmploieDepartement(Employe e, Departement d);

    public void afficherLesEmployesLeursDepartements();
    public void  afficherLesEmployes();
    public void afficherLesDepartements();
    public void afficherDepartement(Employe e);

    boolean rechercheEmploye(Employe e);

    public boolean rechercheDepartement(Departement d);


    public boolean rechercherEmploye(Employe e);

    void SupprimerEmploye(Employe e);

    public void supprimerEmploye(Employe e);
}
