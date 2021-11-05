package myproject.commands.Algorithms;

public class GCDEuclidDivisionRestRec {
	static public int get_gcd(int a, int b){
		if (b==0)
			return a;
		return get_gcd(b, a%b);
	}
}
