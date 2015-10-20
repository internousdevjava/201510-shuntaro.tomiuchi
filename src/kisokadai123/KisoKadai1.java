package kisokadai123;
import java.io.BufferedReader;
import java.io.InputStreamReader;
	public class KisoKadai1 {
		public static void main(String[] args) {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
				int x = 0 ;
				int y = 0 ;
				int j = 0 ;
				int k = 0 ;
				//x軸とy軸の数字を決めてもらう。
				System.out.println("入力されたx軸とy軸の数字までの九九の答えを表形式で出力します");
					try{
						while(j==0 & k==0){
							System.out.println("0～100までのx軸の数字を入力をして下さい。");
							j = Integer.parseInt(br.readLine());
							System.out.println("0～100までのy軸の数字を入力をして下さい。");
							k = Integer.parseInt(br.readLine());
						}
					}catch (Exception e){
						System.out.println("0～100までの数字を入力をして下さい\n" + e +"が入力されました");
					}
					//x軸とy軸までの九九表を作成
					for(x=j;x>=1;x--){
						for(y=1;y<=k;y++){
							System.out.print(x*y+" ");
								if(y==j){
									System.out.println();
								}
						}
					}
		}

	}