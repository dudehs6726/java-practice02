package practice02;
import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		
		loop1 : while(true)
		{
			int k = r.nextInt(100) + 1;
			int count = 1;
			int min = 1;
			int max = 100;
			int gab = 0;
			
			
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			loop2 : while(true)
			{
				System.out.println(min + "-" + max);
				System.out.print(count + ">>");
				gab = scanner.nextInt();
				
				if(k > gab)
				{
					System.out.println("더 높게");
					min = gab;
				}
				else if(k <  gab)
				{
					System.out.println("더 낮게");
					max = gab;
				}
				else if(k == gab)
				{
					System.out.println("맞았습니다.");
					System.out.print("다시하시겠습니까(y/n)>>");
					String answer = scanner.next();
					answer = answer.toLowerCase();
					if(answer.equals("n"))
					{
						break loop1;
					}
					else
					{
						break loop2;
					}
				}
				count++;
			}
		}
		
		scanner.close();
	}

}
