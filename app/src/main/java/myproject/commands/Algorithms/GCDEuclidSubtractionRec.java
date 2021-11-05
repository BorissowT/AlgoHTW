package myproject.commands.Algorithms;

public class GCDEuclidSubtractionRec {
	static public int get_gcd(int a, int b){
		if (b == 0) return a;
		else if (a == 0) return b;
		else if (a > b) return get_gcd(a - b, b);
		else return get_gcd( a, b - a);
	}
}
