package hackerRank;
import java.io.*;
import java.util.*;

public class Decrption {

public static void main(String[] args) {
	String input = "ne2ds";
    String[] inarr = input.split("\\s+");
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < inarr.length; i++) {
        String s = inarr[i];
        char[] c = s.toCharArray();
        for(int j = 0; j < c.length; j++) {
            if(Character.isDigit(c[j])) {
                for(int x = 0; x < Character.getNumericValue(c[j])-1; x++) {
                    sb.append(c[j-1]);
                }
            } else {
                sb.append(c[j]);
            }
        }
    }

System.out.println(sb.toString());
}
}