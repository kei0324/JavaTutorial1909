import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Sample4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// テストで追加
		
		// ファイルの読み込みにチャレンジ
		// 参考にしたサイトはここ
		// https://www.sejuku.net/blog/20924
		try {
			// 1．ファイルのパスを指定する
			File file = new File("/Users/Kei/Desktop/TextA.txt");
			
			// 2．ファイルが存在しない場合に例外が発生するので確認する
			if (!file.exists()) {
				System.out.print("ファイルが存在しません");
				return;
			}
			
			// 3．BufferReaderクラスのreadLineメソッドを使って1行ずつ読み込む
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String data;
			while ((data = bufferedReader.readLine()) != null) {
				
				// System.out.println(data);
				// ここからファイルの書き込み
				try {
					File wfile = new File("/Users/Kei/Desktop/TextB.txt");
					BufferedWriter bw = new BufferedWriter(new FileWriter(wfile, true));
					
					// 読み込んだ内容を書き込む
					bw.write(data);
					bw.newLine();
					
					// ファイルを閉じる
					bw.close();
					
				}
				catch (IOException e) {
					System.out.println(e);
				}
			}
			
			// 4．最後にファイルを閉じてリソースを開放させる
			fileReader.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
