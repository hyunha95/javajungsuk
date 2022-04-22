import java.util.*;

class Star{
	public static void main(String[] args){
		int num = 0;

		System.out.println("* enter num");

		Scanner sc = new Scanner(System.in);
		int tmp = sc.nextInt();


		for(int i = 1; i <= tmp; i++){
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}