import java.util.function.Function;

public class StringReversal 
{
    public static void main(String[] args) {
        
		String input = "ISHAAN CHAUDHARY ";
        
        Function<String, String> reverse = (str) -> 
		{
            StringBuilder sb = new StringBuilder(str);
			
            return sb.reverse().toString();
        };
        
        String output = reverse.apply(input);
        
		System.out.println(output);
    }
}
