
import java.util.*;

class BloodDonation

{

public static void main(String s[])

{


Scanner sc = new Scanner(System.in);

System.out.print(" Your Age (in yrs): ");

int a = sc.nextInt();

System.out.print(" Your Weight (in kg) : ");

int w = sc.nextInt();

if( a>=25 && w>=48 )

System.out.println(" You are eligible to donate blood. ");

else

System.out.println(" You are not eligible to donate blood. ");

}

}