package oopInterface;

public class Child implements Playing {

	String toy;
	public Child(String toy) {
		this.toy=toy;
	}
	@Override
	public String play() {
		// TODO Auto-generated method stub
		return toy;
	}

}
