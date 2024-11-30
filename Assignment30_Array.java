package test;

import java.util.Arrays;
public class Assignment30_Array
	{
		static int countofalphabet=0;
		static int countofdigit=0;
		static int countofspace=0;
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String input = "Hello! 123@ jAvA_";
			char [] c1 = input.toCharArray();
			System.out.println(Arrays.toString(c1));
			
			for(int i=0;i<c1.length;i++)
			{
				
				boolean b1 = 	Character.isAlphabetic(c1[i]);
					if(b1==true)
					{
						countofalphabet++;
					}
				boolean b2 = 	Character.isDigit(c1[i]);
					if(b2==true)
					{
						countofdigit++;
					}
				
				boolean b3 = 	Character.isWhitespace(c1[i]);
					if(b3==true)
					{
						countofspace++;
					}
				
			}	
				System.out.println("Count of Alphabet:" +countofalphabet);
				System.out.println("Count of Digit:" +countofdigit);
				System.out.println("Count of Space:" +countofspace);
				
				int countofSpecialcharacter=c1.length-(countofspace+countofdigit+countofalphabet);
				System.out.println("Count of Special Character:" +countofSpecialcharacter);
//				System.out.println(b1);
//				System.out.println(b2);
//				System.out.println(b3);
			
		}

	}

