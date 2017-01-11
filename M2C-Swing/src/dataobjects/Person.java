
package dataobjects;

public class Person {

	private String vorname;

	private String nachname;

	private Integer alter;

	public String getVorname() {
		return this.vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return this.nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public Integer getAlter() {
		return this.alter;
	}

	public void setAlter(Integer alter) {
		this.alter = alter;
	}

}
