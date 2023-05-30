package Exam;

public class RightTriangle {
	public static void main(String[] args) {
	double leg1 = 3;
	double leg2 = 4;
	double area = leg1*leg2/2;
	System.out.println("Площа прямокутного трикутника: " + area);
	
	double sqhypotenuse = ((Math.pow(leg1,2)) + (Math.pow(leg2,2)));
    double hypotenuse = Math.sqrt(sqhypotenuse);
    double Perimeter = leg1 + leg2 + hypotenuse; 
    System.out.println("Периметр прямокутного трикуника: " + Perimeter);
	}
}
