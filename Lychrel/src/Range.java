
public class Range {
int low, high, natural=0, non=0, yes=0;

void rango(int a, int b) {
	low = a; //the lower bound
	high = b; // the highest bound
}

void types() {
	String palin = "";
	String palinInverse = "";
	long p1, p2, suma, n;
	for (int x = low; x <= high; x++ ) {
		palin = "" + x;
		palinInverse = new StringBuilder(palin).reverse().toString();
		if (palin.equals(palinInverse)) {
			natural++;
			continue;
		}
		for(n = 0; n<30; n++) {
			p1 = Long.parseLong(palin);
			p2 = Long.parseLong(palinInverse);
			suma = p1 + p2;
			palin = "" + suma;
			palinInverse = new StringBuilder(palin).reverse().toString();
			if (palin.equals(palinInverse)) {
				non++;
				break;
			}
		}
		if (n == 30){
			System.out.println("Alert! Lychrel candidate found! " + x);
			yes++;
		}
	}
	System.out.println("There were " + natural + " natural palindrome numbers");
	System.out.println("There were " + non + " non Lychrel numbers");
	System.out.println("There were " + yes + " Lychrel candidates");
}
}

