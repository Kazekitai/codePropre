package ex2;

public class LivretA extends CompteBancaire {
	/* ATTRIBUTS */

	/** tauxRemuneration */
	private double tauxRemuneration;

	/* CONSTRUCTEUR */

	/**
	 * Constructeur LivretA
	 * 
	 * @param type:
	 *            LivretA
	 * @param solde
	 *            solde du livret A
	 * @param tauxRemuneration
	 *            taux de r�mun�ration
	 */
	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	/* METHODES */

	/**
	 * Enl�ve un montant au solde
	 * 
	 * @param montant
	 */
	public void debiterMontant(double montant) {
		this.setSolde(this.getSolde() - montant);
	}

	/**
	 * Applique le taux de r�mun�ration � un solde
	 */
	public void appliquerRemuAnnuelle() {
		double remuneration = this.getSolde() + (this.getSolde() * tauxRemuneration) / 100;
		this.setSolde(remuneration);
	}

	/* GETTERS ET SETTERS */

	/**
	 * Getter pour le taux de R�muneration
	 * 
	 * @return tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration
	 *            Taux de r�mun�ration
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
