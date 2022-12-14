package classesmvc;

import java.util.List;

import org.springframework.stereotype.Component;

@Component // Id of bean by default student
public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favouriteLanague;
	private String[] operatingSystem;
	
	
	
	// getters and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFavouriteLanague() {
		return favouriteLanague;
	}
	public void setFavouriteLanague(String favouriteLanague) {
		this.favouriteLanague = favouriteLanague;
	}
	public String[] getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

}
