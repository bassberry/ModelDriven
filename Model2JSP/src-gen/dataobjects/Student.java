
package dataobjects;

public class Student {

	private String Name;

	private String Matrikelnummer;

	private Integer Semester;

	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getMatrikelnummer() {
		return this.Matrikelnummer;
	}

	public void setMatrikelnummer(String Matrikelnummer) {
		this.Matrikelnummer = Matrikelnummer;
	}

	public Integer getSemester() {
		return this.Semester;
	}

	public void setSemester(Integer Semester) {
		this.Semester = Semester;
	}

}
