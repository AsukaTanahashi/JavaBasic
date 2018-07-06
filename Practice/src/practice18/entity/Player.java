package practice18.entity;

public class Player {
	private String position;
	private String name;
	private String country;
	private String team;

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPosition() {
		return this.position;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return this.country;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getTeam() {
		return this.team;
	}

	public String toString() {
		return this.position +","+this.name+","+this.country+","+this.team;
	}


}
