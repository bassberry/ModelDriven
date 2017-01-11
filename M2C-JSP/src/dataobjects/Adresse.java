
package dataobjects;

public class Adresse {
	// deklariere alle Attribute

	private String strasse;

	private Integer hausnummer;

	private String stadt;

	// get- / set-Methoden für jedes Attribut

	public String getStrasse() {
		return this.strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public Integer getHausnummer() {
		return this.hausnummer;
	}

	public void setHausnummer(Integer hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getStadt() {
		return this.stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

}
