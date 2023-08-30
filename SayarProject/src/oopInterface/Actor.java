package oopInterface;

public class Actor implements Playing {
	
	String movie;
	
	public Actor (String movie) {
		this.movie=movie;
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return movie;
	}

	

}
