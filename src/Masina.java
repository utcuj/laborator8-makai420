
public class Masina implements Cloneable{
	private String marca;
	private String culoare;
	
	public Masina (String  marca, String culoare) {
		this.marca = marca;
		this.culoare = culoare;
	}
	
	//deep copy
	@Override
	protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	
	public String toString(){
		return "Masina " + marca + " de culoare " + culoare;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}
	
}
