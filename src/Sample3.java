import java.util.ArrayList;
import java.util.List;

public class Sample3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> list = new ArrayList<>();
		
		for(int idx = 0; idx < args.length; idx++) {
			list.add(args[idx]);
		}
		
		for(String s: list) {
			System.out.println(s);
		}
	}

}
