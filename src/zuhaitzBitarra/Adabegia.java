package zuhaitzBitarra;

import java.util.Scanner;

public class Adabegia {

	Etiketa info;
	Adabegia ezkerra;
	Adabegia eskuina;

	/**
	 * Adabegia klasearen eraikitzailea.
	 * 
	 * @param elem adabegiko elementua, int motakoa.
	 */
	public Adabegia(Etiketa elem) {
		info = elem;
		ezkerra = null;
		eskuina = null;
	}

	public Adabegia(Scanner source) throws Exception {
		this.info = new Etiketa(source.nextInt());
		String token = source.next();
		if (token.equals("]")) {
			this.ezkerra = null;
			this.eskuina = null;
		} else {
			if (token.equals("["))
				this.ezkerra = new Adabegia(source);
			else if (token.equals("*"))
				this.ezkerra = null;
			else
				throw new Exception(String.format("Unexpected token when " + "reading binary tree: %s", token));
			token = source.next();
			if (token.equals("["))
				this.eskuina = new Adabegia(source);
			else if (token.equals("*"))
				this.eskuina = null;
			else
				throw new Exception(String.format("Unexpected token when " + "reading binary tree: %s", token));
			token = source.next();
			if (!token.equals("]"))
				throw new Exception(String.format("Unexpected token when " + "reading binary tree: %s", token));
		}
	}

	/**
	 * Adabegiak ezkerreko umea baduen ala ez itzultzen du.
	 * 
	 * @return true, ezkerreko umea baldin badu; false, bestela.
	 */
	public boolean baduEzkerra() {
		return this.ezkerra != null;
	}

	/**
	 * Adabegiak eskuineko umea baduen ala ez itzultzen du.
	 * 
	 * @return true, eskuineko umea baldin badu; false, bestela.
	 */
	public boolean baduEskuina() {
		return this.eskuina != null;
	}

	/**
	 * Adabegia hostoa den ala ez itzultzen du.
	 * 
	 * @return true, hostoa bada; false, bestela.
	 */
	public boolean hostoaDa() {
		return !this.baduEzkerra() && !this.baduEskuina();
	}

	@Override
	public String toString() {
		String emaitza = "[ " + this.info + " ";
		if (!this.hostoaDa()) {
			if (this.baduEzkerra())
				emaitza += this.ezkerra.toString();
			else
				emaitza += "* ";
			if (this.baduEskuina())
				emaitza += this.eskuina.toString();
			else
				emaitza += "* ";
		}
		emaitza += "] ";
		return emaitza;
	}

	public boolean egituraBerekoak(Adabegia z1) {

		if(this.hostoaDa() && z1.hostoaDa()) {
			return true;
		}
		else if((!this.hostoaDa() && z1.hostoaDa()) || (this.hostoaDa() && !z1.hostoaDa())){
			return false;
		}
		
		else {
			if(this.baduEskuina() && z1.baduEskuina()) {
				return this.eskuina.egituraBerekoak(z1.eskuina);
			}
			
			if(this.baduEzkerra() && z1.baduEzkerra()) {
				return this.ezkerra.egituraBerekoak(z1.ezkerra);
			}
			
			if((!this.baduEzkerra() && z1.baduEzkerra()) || (this.baduEzkerra() && !z1.baduEzkerra())) {
				return false;
			}
			if((!this.baduEskuina() && z1.baduEskuina()) || (this.baduEskuina() && !z1.baduEskuina())) {
				return false;
			}
			
		}
		return true;
		
	
	}

	public void etiketatu(    ) {

		// HAU OSATU BEHAR DA
		
	
	}
}
