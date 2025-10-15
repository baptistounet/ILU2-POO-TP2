package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		if (!controlLibererEtal.isVendeur(nomVendeur)) {
			System.out.println("Mais vous n'êtes pas inscrit sur notre marché aujourd'hui !");
		} else {
			String[] donnesEtal = controlLibererEtal.libererEtal(nomVendeur);
			if (donnesEtal[0]!=null && donnesEtal[0].equals("true")) {
				System.out.println("Vous avez vendu" + donnesEtal[4] + " sur " + donnesEtal[3] + " " + donnesEtal[2] + ".\nAu revoir" + nomVendeur + ", passez une bonne journée.");
			}
		}
	}

}
