package sdetInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacterInStringArray {
	public static void main(String[] args) {
		  String str2 = "findduplicateelementsinarray";
	        String[] ary = str2.split("");
	     ArrayList<String> list = new ArrayList<String>(Arrays.asList(ary));
	     Set<String> str1 = new HashSet<String>();{
	     for ( String str21 : list) {
	         if (str1.add(str21) == false) {
	             System.out.println(str21 + " occurs: " + Collections.frequency(list, str21) +": is the Duplicate Element");
	         }else if (Collections.frequency(list, str21) < 2) {
	             System.out.println(str21 + " occurs: " + Collections.frequency(list, str21));
	         }
	     }
	   
		
	}
}
}
	


