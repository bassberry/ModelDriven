
package dataobjects;

public class Person {

	private String Vorname;

	private String Nachname;

	private Integer Alter;

	public String getVorname() {
		return this.Vorname;
	}

	public void setVorname(String Vorname) {
		this.Vorname = Vorname;
	}

	public String getNachname() {
		return this.Nachname;
	}

	public void setNachname(String Nachname) {
		this.Nachname = Nachname;
	}

	public Integer getAlter() {
		return this.Alter;
	}

	public void setAlter(Integer Alter) {
		this.Alter = Alter;
	}

}
