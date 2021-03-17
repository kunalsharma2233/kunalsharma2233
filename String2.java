import java.util.*;


public class String2
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        char ch='\0';
        
        System.out.println("Enter the string");
        String s = in.nextLine();

        for(int i=0;i<s.length();i=i+2)
        {
            if(i%2==1)
            {
                break;
            }
            else{
                System.out.println(s.charAt(i));
            }
        }

        System.out.println(ch);


    } 
}