import java.util.*;
public class StringPower {
    public static void main(String args[])
    {
        int count=0;

        String str1 = "KUNAL";

        for(int i=0;i<str1.length();i++)
        {
            count =  count + 1;
        }
        System.out.println(count);

        powerOfString(count);
    }
    public static void powerOfString(int base)
    {   
        int exponent= 2;

        long result =1;

        for(;exponent!=0; --exponent)
        {
            result = result * base;

            System.out.println(result);
        }
    }
}
