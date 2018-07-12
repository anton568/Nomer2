import java.util.Scanner;
public class Nomer2 {

    public static void main(String[] args)
			throws java.io.IOException{
		float z;
    	float d;
	Scanner in=new Scanner(System.in);
		System.out.println("Введи x");
		float x=in.nextInt();
		System.out.println("Введи y");
		float y=in.nextInt();

	z=x*y;
	System.out.println("Результат x*y = "+z);
	z=x+y;
	System.out.println("Результат x+y = "+z);
	z=x-y;
	System.out.println("Результат x-y = "+z);
	d=x/y;
	System.out.println("Результат x/y = "+d);
	}
	}
