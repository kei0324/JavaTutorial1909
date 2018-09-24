
public class Sample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			String name = null;
			name = name.substring(0);
			System.out.println(name);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			String values[] = new String[2];
			values[2] = "value";
			System.out.println(values[2]);
		} catch(Exception e ) {
			e.printStackTrace();
		}
		
		try {
			Object value = "value";
			Integer number = (Integer)value;
			System.out.println(number);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
