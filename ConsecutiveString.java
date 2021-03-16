import java.util.*;

public class ConsecutiveString{

    public static void main(String args[])
    {
        String str3="attack";
        int count=0;
        
    
        for(int i=0;i<str3.length();i++)
        {
            for(int j=i+1;j<str3.length();j++)
            {
                if(str3.charAt(i)==str3.charAt(j))
                {
                   count++;
                }
            }
        }
        System.out.println(count);
           
    }
} 