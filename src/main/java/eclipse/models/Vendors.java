package eclipse.models;

import java.util.Arrays;
import java.util.Objects;

public class Vendors {
	
	private String name;
	private String city;
	private String state;
	private String make[];
	
	public Vendors() {
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String[] getMake() {
		return make;
	}

	public void setMake(String make[]) {
		this.make = make;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(make);
		result = prime * result + Objects.hash(city, name, state);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendors other = (Vendors) obj;
		return Objects.equals(city, other.city) && Arrays.equals(make, other.make) && Objects.equals(name, other.name)
				&& Objects.equals(state, other.state);
	}


	@Override
	public String toString() {
		return "Vendors [name=" + name + ", city=" + city + ", state=" + state + ", make=" + Arrays.toString(make)
				+ "]";
	}

}
