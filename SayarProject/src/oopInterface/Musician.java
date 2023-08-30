package oopInterface;

public class Musician implements Playing
{
	
	String musicalInstrument;
	
	public Musician(String musicalInstrument) {
		this.musicalInstrument=musicalInstrument;
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return musicalInstrument;
	}
	
	

}
