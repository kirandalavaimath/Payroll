package test;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="kiran   Kumar";
	    int distinct = 0 ;

	    for (int i = 0; i < s.length(); i++) {

	        for (int j = 0; j < s.length(); j++) {

	            if(s.charAt(i)==s.charAt(j))
	            {
	                distinct++;

	            }
	        }   
	        System.out.println(s.charAt(i)+"--"+distinct);
	        String d=String.valueOf(s.charAt(i)).trim();
	        s=s.replaceAll(d,"");
	        distinct = 0;
	    }}}