package ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A
 * (type=LA)
 * 
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {
	/* ATTRIBUTS */

	/** solde : solde du compte */
	private double solde;

	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	private String type;

	/* CONSTRUCTEUR */

	/**
	 * Constructeur
	 * 
	 * @param solde
	 *            solde du compte
	 * @param type
	 *            type compte courante (type=CC) ou livret A (type=LA)
	 */
	public CompteBancaire(String type, double solde) {
		super();
		this.type = type;
		this.solde = solde;
	}

	/* METHODES */

	/**
	 * Ajoute un montant au solde
	 * 
	 * @param montant:
	 *            montant ajouté au solde
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Enlève un montant au solde
	 * 
	 * @param montant:
	 *            montant enlevé au solde
	 */
	abstract void debiterMontant(double montant);

	/* GETTERS ET SETTERS */

	/**
	 * Getter pour le solde du compte
	 * 
	 * @return solde:le solde du compte
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter
	 * 
	 * @param solde
	 *            le solde du compte
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter pour le type
	 * 
	 * @return type: le type de compte
	 */
	public String getType() {
		return type;
	}

	/**
	 * Setter pour le type
	 * 
	 * @param type
	 *            le type de compte
	 */
	public void setType(String type) {
		this.type = type;
	}
}
