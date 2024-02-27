public class Compte {
    private String numero;
    private double solde;
    private static int nbComptes = 0;

    public Compte() {
        this.numero = "";
        this.solde = 0;
        nbComptes++;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void deposer(double montant) {
        this.solde += montant;
    }

    public void retirer(double montant) {
        if (montant <= this.solde) {
            this.solde -= montant;
        } else {
            System.out.println("Solde insuffisant pour effectuer le retrait.");
        }
    }

    public void afficherCompteInfo() {
        System.out.println("Numéro de compte : " + this.numero);
        System.out.println("Solde actuel : " + this.solde);
    }

    public static void afficherNbComptes() {
        System.out.println("Nombre de comptes créés : " + nbComptes);
    }

    public static void main(String[] args) {
        Compte compte = new Compte();
        compte.setNumero("123456");

        compte.deposer(1000);
        compte.afficherCompteInfo();

        compte.retirer(500);
        compte.afficherCompteInfo();

        compte.retirer(700);
        Compte.afficherNbComptes();
    }
}
