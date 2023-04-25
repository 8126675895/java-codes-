import java.util.function.BiPredicate;


public class FactorChecker 

{
    public static void main(String[] args) 
	
	{
    

    BiPredicate<Integer, Integer> isFactor = (num, factor) -> num % factor == 0;


        int num = 10;

        int factor = 5;



        if (isFactor.test(num, factor)) {

            System.out.println(factor + " is a factor of " + num);

        } else 
		{
            System.out.println(factor + " is not a factor of " + num);
        }
    }
}