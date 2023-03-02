package jrntr;
import java.util.Random;
import java.util.Scanner;
public class PasswordGenerator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialChars="<>!@#$^*()}{[]?/";
		String combination=upper+lower+numbers+specialChars;
		System.out.print("Enter the length of password :");
		int len = sc.nextInt();
		char[] password = new char[len];
		Random random = new Random();
		for(int i=0;i<len;i++)
		{
			password[i]=combination.charAt(random.nextInt(combination.length()));
		}
		System.out.println("Generated password is :"+new String(password));
		
		
	}

}
