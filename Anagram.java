package PracticePackage;

import java.util.Scanner;

public class Anagram {

		static void isAnagram(String s1, String s2)
	    {
	        //Removing white spaces from s1 and s2 and changing case to lower
	 
	        String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
	 
	        String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
	 
	        //Initially setting status as true
	 
	        boolean status = true;
	 
	        if(copyOfs1.length() != copyOfs2.length())
	        {
	            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
	 
	            status = false;
	        }
	        else
	        {
	            //Converting copyOfs1 to char array
	 
	            char[] s1ToArray = copyOfs1.toCharArray();
	 
	            //Checking whether each character of s1ToArray is present in copyOfs2
	 
	            for (char c : s1ToArray)
	            {
	                int index = copyOfs2.indexOf(c);
	 
	                if(index != -1)
	                {
	                    //If character is present in copyOfs2, removing that char from copyOfs2
	 
	                    copyOfs2 = copyOfs2.substring(0, index)+copyOfs2.substring(index+1, copyOfs2.length());
	                }
	                else
	                {
	                    //If character is not present in copyOfs2, setting status as false and breaking the loop
	 
	                    status = false;
	 
	                    break;
	                }
	            }
	        }
	 
	       
	        if(status)
	        {
	            System.out.print("\"" + s1 + "\"" +" is an anagram of " + "\"" +s2+ "\"" + " ");
	        }
	        else
	        {
	            System.out.print("\"" + s1 + "\"" +" is NOT an anagram of " + "\"" +s2+ "\"" + " ");
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	    	
	    	Scanner sc=new Scanner(System.in);         
	    	System.out.println("Enter the String");
	    	String s = sc.nextLine();
	    	int k = 0 ,j = 0,l = 0;
	    	String[] parts = new String[10];
	    	int len = s.length();
	    	while(len>(j+2)){
	    	  int i = s.indexOf("\"",k);
	    	  j = s.indexOf("\"",i+1);
	    	  parts[l] = s.substring(i+1, j);
	    	  l++ ;
	    	  k=j+1 ;
	    	}	
	    	
	    	for(int m =0 ; m <= parts.length ; m=+2) {
	    		isAnagram(parts[m], parts[m+1]);
	    	}
	    		    	
	    	sc.close();
	        
	    }

	}

