package businessentities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee", schema = "public")
public class EmployeeBE {
	
	private String name;
	
	private String vorname;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private ArrayList<String> focalpointsworkedwith;
	
	private ArrayList<String> departmentsworkedwith;

	// create employee with assignments -> take  Student elements

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getVorname() {
		return vorname;
	}
	
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	public ArrayList<String> getFocalpointsworkedwith() {
		return focalpointsworkedwith;
	}

	public void setFocalpointsworkedwith(ArrayList<String> focalpointsworkedwith) {
		this.focalpointsworkedwith = focalpointsworkedwith;
	}

	public ArrayList<String> getDepartmentsworkedwith() {
		return departmentsworkedwith;
	}

	public void setDepartmentsworkedwith(ArrayList<String> departmentsworkedwith) {
		this.departmentsworkedwith = departmentsworkedwith;
	}
}