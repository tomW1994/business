package businessentities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student", schema = "public")
public class StudentBE {
	
	private String name;

	private int alter;
	
	private String vorname;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
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
	
	public int getAlter() {
		return alter;
	}

	public String getVorname() {
		return vorname;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
}