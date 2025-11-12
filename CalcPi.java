// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int N = Integer.parseInt(args[0]);
		double sum = 0.0;
		int sign = 1; // חיוביות ושליליות של טור לייבניץ 
		 for (int i = 0; i < N; i++){
			double denominator = 2.0 * i + 1.0; //חישוב המכנה שתמיד יהיה קשור ב2
			sum = sum + sign * (1.0 / denominator); // חישוב הסכום הכללי
			sign = -sign;
		 }
		 double piApproximated = sum * 4.0;
		 System.out.println("pi according to Java: " + Math.PI);
		 System.out.println("pi, approximated:     " + piApproximated);
	}
}
