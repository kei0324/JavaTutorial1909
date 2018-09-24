import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 入力パラメーターを読み込む
		String input = br.readLine();
		 
		// 半角スペースで文字を区切る
		String param[] = input.split(" ");
		
		int num1 = Integer.parseInt(param[0]);
		int num2 = Integer.parseInt(param[2]);
		
		if (param[1].equals("+")) {
			System.out.println(num1 + num2);
		}
		else if (param[1].equals("-")) {
			System.out.println(num1 - num2);
		}
		else if (param[1].equals("*")) {
			System.out.println(num1 * num2);
		}
		else if (param[1].equals("/")) {
			System.out.println((num1 / num2) + " 余り: " + (num1 % num2));
		}

	}

}
