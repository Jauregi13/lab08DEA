package zuhaitzBitarra;

public class Etiketa {
	int balioa;
	int maila;
	int hostoKop;
	
	public Etiketa(int balioa) {
		this.balioa = balioa;
	}

	public int getBalioa() {
		return balioa;
	}

	public void setBalioa(int balioa) {
		this.balioa = balioa;
	}

	public int getMaila() {
		return maila;
	}

	public void setMaila(int maila) {
		this.maila = maila;
	}

	public int getHostoKop() {
		return hostoKop;
	}

	public void setHostoKop(int hostoKop) {
		this.hostoKop = hostoKop;
	}

	@Override
	public String toString() {
		return "<" + balioa + "," + maila + "," + hostoKop + ">";
	}
	
}
