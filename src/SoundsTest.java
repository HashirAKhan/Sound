
public class SoundsTest {

	public static void main(String[] args) {
		int[] values = {0, 0, 25, 300, -400, 26, 0, -555};
		Sound sound1 = new Sound(values);
		System.out.println(sound1);
		int changes = sound1.limitAmp(200);
		System.out.println(changes);
		
	}

}
