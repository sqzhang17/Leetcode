public class GCD{
	public int gcd(int a, int b) {
	   if (b==0) return a;
	   return GCD(b,a%b);
	}
}