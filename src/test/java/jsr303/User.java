package jsr303;

public class User {

	@ArrayItemLen(min = 1, max = 10)
	private String[] hobbies;

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

}
