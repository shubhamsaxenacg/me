package com.cg.question2;

//......CONTAINS GETTERS AND SETTERS FOR MOVIE ATTRIBUTES
//......CONTAINS OVERRIDDEN HASHCODE AND EQUALS 

public class MovieDetails {
	private String mov_Name;
	private String lead_actor;
	private String lead_actress;
	private String genre;
	
	//...CONSTRUCTOR
	public MovieDetails(String mov_Name, String lead_actor, String lead_actress, String genre) {
		super();
		this.mov_Name = mov_Name;
		this.lead_actor = lead_actor;
		this.lead_actress = lead_actress;
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return "MovieDetails [mov_Name=" + mov_Name + ", lead_actor=" + lead_actor + ", lead_actress=" + lead_actress
				+ ", genre=" + genre + "]";
	}

	public String getMov_Name() {
		return mov_Name;
	}
	public void setMov_Name(String mov_Name) {
		this.mov_Name = mov_Name;
	}
	public String getLead_actor() {
		return lead_actor;
	}
	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}
	public String getLead_actress() {
		return lead_actress;
	}
	public void setLead_actress(String lead_actress) {
		this.lead_actress = lead_actress;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	//....HASHCODE AND EQUALS OVERRIDE
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mov_Name == null) ? 0 : mov_Name.hashCode());
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
		MovieDetails other = (MovieDetails) obj;
		if (mov_Name == null) {
			if (other.mov_Name != null)
				return false;
		} else if (!mov_Name.equals(other.mov_Name))
			return false;
		return true;
	}
	
}
