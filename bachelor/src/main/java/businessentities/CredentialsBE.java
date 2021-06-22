package businessentities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "credentials", schema = "public")
public class CredentialsBE {
	
	private String username;
	
	private String password;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	public CredentialsBE() {
		
	}
	
	public CredentialsBE(final String username, final String password) {
		this.username = username;
		this.password = password;
	}
	
	public long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setUserame(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}