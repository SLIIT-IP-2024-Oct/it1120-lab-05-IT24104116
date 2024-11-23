import java.util.Scanner;

public class IT24104116Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	
	
	
	System.out.println("Enter thr number of new members introduced");
	int newmembers = scanner.nextInt();
	
	if (newmembers >=5) {
	System.out.println("Prize is a : Headphone");}
 	
	else if (newmembers>=4) {
	System.out.println("Prize is a : Travelling chair" );}
	
	else if (newmembers>=3) {
	System.out.println ("Prize is a : Bag"); }
	
	else if (newmembers>=2) {
	System.out.println ("Prize is a : Umbrella"); }
	
	else if (newmembers>=1) {
	System.out.println ("Prize is a : Pen"); }
	
	else if (newmembers>=0) {
	System.out.println ("No prize"); }
	
	else {
	System.out.println ("Input must be a number 0 or greater");}
	
	scanner.close();
	
	}
}
