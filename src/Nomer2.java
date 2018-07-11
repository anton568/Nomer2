import java.util.Scanner;
public class Nomer2 {

    public static void main(String[] args)
			throws java.io.IOException{
    	int z;
	Scanner in=new Scanner(System.in);
		System.out.println("Введи x");
		int x=in.nextInt();
		System.out.println("Введи y");
		int y=in.nextInt();

	z=x*y;
	System.out.println("Результат x*y = "+z);
	z=x+y;
	System.out.println("Результат x+y = "+z);
	z=x-y;
	System.out.println("Результат x-y = "+z);

	}
	}
