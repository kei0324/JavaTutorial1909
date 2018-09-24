import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main3 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 入力パラメーターを読み込む
		String input = br.readLine();
		// 半角スペースで文字を区切る
		String param[] = input.split(" ");
		
		// 演算記号の入力用
		String type = null;
		// 合計数字の格納用
		Integer sum = 0;
		
		for(int i = 0; i < param.length; i++ ) {
			if(param[i].equals("+") || param[i].equals("-")) {
				type = param[i];
			}
			else {
				Integer num = Integer.parseInt(param[i]);
				if(type != null) {
					if(type.equals("+")) {
						sum = sum + num;
					}
					else if(type.equals("-")) {
						sum = sum - num;
					}
				}
				else {
					sum = num;
				}
			}
		}
		System.out.println(sum);
	}
}
