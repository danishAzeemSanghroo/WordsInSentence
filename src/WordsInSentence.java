import java.util.*;
class WordsInSentence
{
	public static void main(String arg[])
	{
	Scanner ob=new Scanner(System.in);
	System.out.print("Enter Sentence: ");
	String sent=ob.nextLine();
	int size=sent.length();
	int count=0;
	for(int i=0;i<=size-1;i++)
	{
		if(sent.charAt(i)==' ')
		{
			count++;
		}
	}
		System.out.println("There are : '" + (count+1) + "' Words in entered String");
	}//end main method
}//end class method