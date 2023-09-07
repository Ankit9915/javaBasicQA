package hackerRank;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidUserName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String regex = "^[A-Za-z]{1}[A-Za-z0-9_]{7,29}";
		Pattern p = Pattern.compile(regex);
		if(name==null) {
			System.out.println("Wrong input");
		}
		Matcher m = p.matcher(name);
		if(m.matches()==true) {
			System.out.println("Valid UserName");
		}else {
			System.out.println("Invalid UserName");
		}
	}

}
