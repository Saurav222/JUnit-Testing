package testing;

// we cannot test private methods as they cannot be called
// Static methods can be unit tested
// Private Static method cannot be unit tested
// Public Static method can be unit tested


public class Calculator {
	public int add(int x,int y) {
		return x+y;
	}
	public float add(float x,float y) {
		if (x>2) {
			System.out.println("some message");
		}
		return x+y;
	}
	public float divide(int a, int b) {
		return (float)a/(float)b ;
	}
}
