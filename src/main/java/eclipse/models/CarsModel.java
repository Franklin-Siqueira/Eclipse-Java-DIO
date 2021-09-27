package eclipse.models;

import java.util.Objects;

public class CarsModel {
	
	private String make;
	private String model;
	private String color;
	private Integer year;
	
	public CarsModel() {
		this.setMake(make);
		this.setModel(model);
		this.setColor(color);
		this.setYear(year);
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, make, model, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarsModel other = (CarsModel) obj;
		return Objects.equals(color, other.color) && Objects.equals(make, other.make)
				&& Objects.equals(model, other.model) && Objects.equals(year, other.year);
	}

	@Override
	public String toString() {
		return "CarsModel [make=" + make + ", model=" + model + ", color=" + color + ", year=" + year + "]";
	}
	
	
}
