package kisokadai123;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class KisoKadai2{
	public static void main(String[] args) {
		int ran = (int) (Math.random() * 10);
		int player; //ブロックの外で宣言しなければいけない。中→外は使えない。
		player = 0;
		while (true) {
			try {
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				System.out.println("数字を入力してください"); // 数字入力の趣旨を伝える
				String buf = (br.readLine());
				player = Integer.parseInt(buf); //ここで代入されているのでplayer = 0;は外でも良い
			} catch (Exception e) {
				System.out.println("数字にしてください。");
				continue;
			}

			if (ran < player) {
				System.out.println("正解の数字はもっと小さいです");

				continue;
			} else if (ran > player) {
				System.out.println("正解の数字はもっと大きいです");
				continue;
		
	}
			break;
		}
		System.out.println("正解です<br>");
	}
}