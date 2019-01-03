package com.advancedassignment;

public class MovieAssignment {
	private String movieName; 
	private String leadAactor;
	private String leadActress;
	private String genre ;
	
	public MovieAssignment(String movieName, String leadAactor,
			String leadActress, String genre) {
		super();
		this.movieName = movieName;
		this.leadAactor = leadAactor;
		this.leadActress = leadActress;
		this.genre = genre;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLeadAactor() {
		return leadAactor;
	}

	public void setLeadAactor(String leadAactor) {
		this.leadAactor = leadAactor;
	}

	public String getLeadActress() {
		return leadActress;
	}

	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result
				+ ((leadAactor == null) ? 0 : leadAactor.hashCode());
		result = prime * result
				+ ((leadActress == null) ? 0 : leadActress.hashCode());
		result = prime * result
				+ ((movieName == null) ? 0 : movieName.hashCode());
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
		MovieAssignment other = (MovieAssignment) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (leadAactor == null) {
			if (other.leadAactor != null)
				return false;
		} else if (!leadAactor.equals(other.leadAactor))
			return false;
		if (leadActress == null) {
			if (other.leadActress != null)
				return false;
		} else if (!leadActress.equals(other.leadActress))
			return false;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MovieAssignment [movieName=" + movieName + ", leadAactor="
				+ leadAactor + ", leadActress=" + leadActress + ", genre="
				+ genre + "]";
	}
	
	
	
}
