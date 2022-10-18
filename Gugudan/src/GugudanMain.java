
public class GugudanMain {
	public static void main(String[] args) {

		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단 : ");
			int[] result = Gugudan.calculate(i);
			Gugudan.print(result);
			System.out.println("==========");
		}
	}
}
