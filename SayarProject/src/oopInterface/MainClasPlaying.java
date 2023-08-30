package oopInterface;

public class MainClasPlaying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child skalyy=new Child("toy");
		System.out.println("child play "+skalyy.toy);
		
		Musician zz=new Musician("Guitor");
		System.out.println("Musician play "+zz.musicalInstrument);
		
		Actor kywg=new Actor("ball");
		System.out.println("Actor play "+kywg.movie);

	}

}
