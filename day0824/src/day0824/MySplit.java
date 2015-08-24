package day0824;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * String.split method custom
 * @author hyemi
 */
public class MySplit{
	
	public ArrayList<String> mySplit(String str, String s) {
		ArrayList<String> strArr = new ArrayList<String>();
		String word = "";

		for(int i = 0 ; i < str.length(); i++) {
			if( i+s.length() <= str.length() && str.substring(i, i+s.length()).equals(s) ) {
				strArr.add(word);
				word="";
				i += s.length()-1;
			} else {
				word += str.charAt(i);
			}// end else
		}// end for
		
		if(word.length() > 0) {
			strArr.add(word);	
		}//end if
		
		return strArr;
	}//mySplit
	
	public ArrayList<String> mySplit(String str, int count) {
		ArrayList<String> strArr = new ArrayList<String>();
		String word = "";

;
		for(int i = 0 ; i < str.length(); i++) {
			word += str.charAt(i);
			
			if( (i+1) % count == 0 ) {
				strArr.add(word);
				word="";
			}//end if
		}// end for
		
		if(word.length() > 0) {
			strArr.add(word);	
		}//end if
		
		return strArr;
	}//mySplit

	public static void main(String[] args) {
		MySplit m= new MySplit();
		
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1 = m.mySplit("aaaabaaaabaaaabaaaabaaaabaaaab", "aba");
		for (int i = 0; i < arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}
		System.out.println("-----------");
		ArrayList<String> arr2 = m.mySplit("aaaabaaaabaaaabaaaabaaaabaaaab", 5);
		for (int i = 0; i < arr2.size(); i++) {
			System.out.println(arr2.get(i));
		}
	}//main
	
}//class

