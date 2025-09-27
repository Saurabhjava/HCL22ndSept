package foo;

public interface Soundable {
	int defalutVol=5;
	void play();
	void pause();
	void stop();
	default void m1() {
		System.out.println("Default Method");
	}
	
	static void m2() {
		System.out.println("Static Method");
	}
}
