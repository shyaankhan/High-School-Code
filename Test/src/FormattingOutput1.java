
public class FormattingOutput1{
	public static void main(String args[]){
		System.out.printf("%-4s", "***");
		System.out.printf("%4s", "***");
		System.out.println();
		System.out.printf("%d", 12345678);
		System.out.println();
		System.out.printf("%5.2f", 75.123);
		System.out.println();
		System.out.printf("%5.2f", 75.126);
		System.out.println();
		System.out.printf("%-6s", "Chile");
		System.out.printf("%2s", "Pepper");

	}
}
