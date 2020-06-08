import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
       Scanner k = new Scanner(System.in);
       String[] RIMarr = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
       int[] Rarr = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
       int arabch =0;
       String vvod;
        System.out.print("Введите римское число: ");

            vvod = k.nextLine();
            
            String rim="";
            String rim2="";
           for(int i = 0; i < vvod.length(); i++)
           {
           
               char ch1 = vvod.charAt(i);
               if(i+1<vvod.length())
               {
		       char ch2 = vvod.charAt(i+1);
		       rim = String.valueOf(ch1) + String.valueOf(ch2);
               }
               rim2 = String.valueOf(ch1);

               for(int j=12; j>=0; j--)
               {
                     if((rim.equals(RIMarr[j])))
                       {
                           arabch=arabch+Rarr[j];
                           i++;
                           break;
                       }else{

                       if (rim2.equals(RIMarr[j])){
                           arabch=arabch+Rarr[j];
                           break;
                       }
                       }
               }
               
           }
       System.out.println("\nАрабское число будет: "+ arabch);
       
	    System.out.print("\nВведите число: ");
	    String polin = k.nextLine();
        String polinrev = new StringBuffer(polin).reverse().toString();
        
        if (polin.equals(polinrev) == true)
        {
            System.out.println("\nЧисло является полиндром");
        }
        else
        {
            System.out.println("\nЧисло не является полиндромом");
        }
	}
	    
}
