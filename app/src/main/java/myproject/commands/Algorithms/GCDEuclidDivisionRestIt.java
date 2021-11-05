package myproject.commands.Algorithms;

public class GCDEuclidDivisionRestIt {
	static public int get_gcd(int a, int b){
		while (b != 0){
			int h = a % b;
			a = b;
			b = h;
		}
		return a;
	}
}
