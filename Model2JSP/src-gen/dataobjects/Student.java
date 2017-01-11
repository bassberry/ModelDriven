
package dataobjects;

public class Student {
	// deklariere alle Attribute

	private String name;

	private String matrikelnummer;

	private Integer semester;

	// get- / set-Methoden fuer jedes Attribut

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMatrikelnummer() {
		return this.matrikelnummer;
	}

	public void setMatrikelnummer(String matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}

	public Integer getSemester() {
		return this.semester;
	}

	public void setSemester(Integer semester) {
		this.semester = semester;
	}

}
