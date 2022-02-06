package co.special;
import java.util.*;
abstract class Instrument{
	abstract void play();
	
}
class Piano extends Instrument{
	@Override
	void play() {
		System.out.println("Piano");
	}
}
class Flute extends Instrument{
	@Override
	void play() {
		System.out.println("Flute");
	}
}
class Guitar extends Instrument{
	@Override
	void play() {
		System.out.println("Guitar");
	}
}
public class spaecial{
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		Instrument[] ins =new Instrument[10];
		int a;
		a=in.nextInt();
		if(a==1) {
			for(int i=0;i<10;i++) {
				ins[i]=new Piano();
			}
			for(int i=0;i<10;i++) {
				ins[i].play();
			}
		}
		else if(a==2) {
			for(int i=0;i<10;i++) {
				ins[i]=new Flute();
			}
			for(int i=0;i<10;i++) {
				ins[i].play();
			}
		}
		else {
			for(int i=0;i<10;i++) {
				ins[i]=new Guitar();
			}
			for(int i=0;i<10;i++) {
				ins[i].play();
			}
		}
	}
}
// if the input is guitar .
// output will print guitar 10 times in a new lines .
	
