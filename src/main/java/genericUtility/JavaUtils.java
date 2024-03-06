package genericUtility;

import java.util.Random;

public class JavaUtils {
	public int ranmdomNum(int boundry) {

		Random r = new Random();
		return r.nextInt(boundry);
	}
}
