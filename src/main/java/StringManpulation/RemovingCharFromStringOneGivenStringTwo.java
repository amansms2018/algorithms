package StringManpulation;// Java program to remove duplicates, the order of
// characters is not maintained in this program 


//Remove characters from the first string which are present in the second string
public class RemovingCharFromStringOneGivenStringTwo
{ 
	static final int NO_OF_CHARS = 256; 
	
	/* Returns an array of size 256 containg count 
	of characters in the passed char array */
//	static int[] getCharCountArray(String str)
//	{
//	int count[] = new int[NO_OF_CHARS];
//	for (int i = 0; i<str.length(); i++)
//		count[str.charAt(i)]++;
//
//	return count;
//	}
	
	/* removeDirtyChars takes two string as arguments: First 
	string (str) is the one from where function removes dirty 
	characters. Second string is the string which contain all 
	dirty characters which need to be removed from first string */
	static String removeDirtyChars(String str, String mask_str) 
	{

		for (int i = 0; i <mask_str.length() ; i++) {
			if(str.contains(String.valueOf(mask_str.charAt(i))))
			 str= str.replace(String.valueOf(mask_str.charAt(i)), "");
		}
		 return  str;
	}

	
	// Driver Method 
	public static void main(String[] args) 
	{ 
		String str = "mgeeksfaorgeekas";
		String mask_str = "mask"; 
		System.out.println(removeDirtyChars(str, mask_str)); 
	} 
} 
