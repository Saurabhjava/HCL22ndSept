package foo;

public class Mobile implements Soundable {

	@Override
	public void play() {
		System.out.println("Play Sound of Mobile with Vol="+defalutVol);		
	}

	@Override
	public void pause() {
		System.out.println("Pause Sound of Mobile");		
	}

	@Override
	public void stop() {
		System.out.println("Stop Sound of Mobile");
		
	}
	@Override
	public void m1() {
		
	}
	
}
