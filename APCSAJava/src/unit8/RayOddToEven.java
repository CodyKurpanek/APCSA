package unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int odd = -1;
		int nextEven = -1;
		for(int i = 0; i < ray.length; i ++) {
			if (ray[i] % 2 == 1) {
				odd = i;
				break;
			}
		}
		if (odd != -1) {
			for(int j = odd + 1; j < ray.length; j ++) {
				if (ray[j] % 2 == 0) {
					nextEven = j;
					break;
				}
			}
		}

	if (odd == -1 || nextEven == -1) {
		return -1;
	}
	return nextEven - odd;
	}
}