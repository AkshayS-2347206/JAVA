class Strings{
    public static void main(String args[]){
    String paragraph = "We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative The alternative mentioned hereis the Tata Nano, which soon after came as the worlds cheapest car on retail at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a recent post by Humans of Bombay which formed the basis of his decision to come up with a car like Tata Nano.";
	
	String word  = "We";
	String word1 = "WeWeWe";
	String name = "Slim shady";
	String alpha = "YOLO";
	
	//charAt
	System.out.println(paragraph.charAt(0));
	
	//compareTo
	System.out.println(paragraph.compareTo(word));
	
	//concat
	System.out.println(paragraph.concat(word1));
	
	//contains
	System.out.println(paragraph.contains(word));
	
	//endsWith
	System.out.println(paragraph.endsWith("."));
	
	//equals
	System.out.println(word1.equals(word));	
	
	//equalsIgnoreCase
	System.out.println(word.equalsIgnoreCase(word1));
	
	//format
	System.out.println(paragraph.format("Hi My name is %s", name));
	
	//getBytes()
	byte[] barr = alpha.getBytes();
	for(int i=0; i<barr.length; i++)
	{
		System.out.println(barr[i]);
	}
	
	//getChars()
	String str = new String("Welcome");
	char[] ch =  new char[20];
	str.getChars(0,3, ch,0);
	System.out.println(ch);
	
	//indexOf
	System.out.println(str.indexOf("W"));
	
	//intern
	String s1 = new String("Java Programming").intern();
	String s2 = s1.intern();
	System.out.println(s1 == s2);
	
	//isEmpty
	System.out.println(s1.isEmpty());
	
	//join()
	String joinstr = String.join("-","Java","Programming");
	System.out.println(joinstr);
	
	//lastIndexOf()
	System.out.println(s1.lastIndexOf('n'));
	
	//length()
	System.out.println(s1.length());
	
	//replace()
	String s3 = "Bing Bang";
	System.out.println(s3.replace('B','T'));
	
	//replaceAll()
	System.out.println(s3.replaceAll("n","p"));
	
	//split()
	String s5 = "helloworld";  
    System.out.println("Returning words:");  
	String[] arr = s5.split("l", 0);  
    for (String w : arr) {  
         System.out.println(w);  
     }  
    System.out.println("Split array length: "+arr.length);
	
	
	//startsWith()
	System.out.println(s5.startsWith("he"));
	
	//substring
	System.out.println(s5.substring(2,5));
	
	//charArray
	char[] c=s5.toCharArray();  
	for(int i=0;i<c.length;i++){  
	System.out.println(c[i]);
	}
	
	//toLowerCase()
	String lower = "HELLO";
	System.out.println(lower.toLowerCase());
	
	//toUpperCase()
	System.out.println(lower.toUpperCase());
	
	//trim()
	String ss = "Hello";
	System.out.println(ss.trim()+"World");
	
	//valueOf()
	boolean bol = true;
	String sc = String.valueOf(bol);
	System.out.println(sc);
	
    }

}