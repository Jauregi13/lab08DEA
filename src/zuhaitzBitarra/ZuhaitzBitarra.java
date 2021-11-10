package zuhaitzBitarra;

import java.util.Scanner;


import java.util.Iterator;
import java.util.LinkedList;

public class ZuhaitzBitarra {

	private Adabegia erroa;

	/**
	 * ZuhaitzBitarra klasearen eraikitzailea: zuhaitz hutsa sortzen du.
	 * 
	 */
	public ZuhaitzBitarra() {
		this.erroa = null;
	}

	/**
	 * ZuhaitzBitarra klasearen eraikitzailea: fitxategiko edukietatik zuhaitza
	 * sortzen du.
	 * 
	 */
	public ZuhaitzBitarra(Scanner source) throws Exception {
		String token = source.next();
		if (token.equals("*"))
			this.erroa = null;
		else if (token.equals("["))
			this.erroa = new Adabegia(source);
		else
			throw new Exception(String.format("Unexpected token when reading " + "binary tree: %s", token));
	}

	/**
	 * Zuhaitz bitarra hutsa den ala ez itzultzen du.
	 * 
	 * @return true, zuhaitz bitarra hutsa bada; false, bestela.
	 */
	public boolean hutsaDa() {
		return (erroa == null);
	}

	/**
	 * Erroa izeneko adabegia zuhaitz bitarraren erroan jartzen du.
	 * 
	 * @param erroa zuhaitz bitarraren erroan jarriko den adabegia.
	 * @return eguneratutako zuhaitza itzultzen du.
	 */
	public ZuhaitzBitarra errotu(Adabegia erroa) {
		this.erroa = erroa;
		return this;
	}

	
	/**
	 * java.lang.Object-etik heredatutako metodoaren gainidazketa.
	 * 
	 * @return zuhaitzaren edukia String formatuan.
	 */
	@Override
	public String toString() {
		if (this.hutsaDa())
			return " * ";
		return this.erroa.toString();
	}
	
	public boolean egituraBerekoak(ZuhaitzBitarra z1) {

		if(this.hutsaDa() && z1.hutsaDa()) {
			return true;
		}
		else if((this.hutsaDa() && !z1.hutsaDa()) || (!this.hutsaDa() && z1.hutsaDa())) {
			return false;
		}
		else {
			return this.erroa.egituraBerekoak(z1.erroa);
		}
		
	}
	
	public void etiketatu() {

		
		if(this.hutsaDa()) {
			
		}
	}
}