package objectbook;
import java.io.BufferedReader;
import java.io.InputStreamReader;
	/*
	 *標準入力によりジャンケンの手をユーザーに聞く戦略クラス。
	 */
	public class AskTactics implements Tactics{
		/*
		 * 戦略を読み、ジャンケンの手を得る。
		 * Player.STONE … グー
		 * Player.STONE … チョキ
		 * Player.STONE … パー
		 *
		 * @return ジャンケンの手
		 */
		public int readTactics(){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("\nジャンケンの手を数字で入力してください。");
			System.out.println("0: グー");
			System.out.println("1: チョキ");
			System.out.println("2: パー\n");
			System.out.print("? ");

			int hand; //ジャンケンの手

			while(true){
				try{
					String inputStr = br.readLine();//入力文字列を受け取る
					hand = Integer.parseInt(inputStr);
						if(hand == Player.STONE
						|| hand == Player.SCISSORS
						|| hand == Player.PAPER){
							break;
						}else{
							System.out.println("入力が正しくありません。再度入力してください。");
							System.out.print("? ");
						}
				}catch(Exception ex){
					System.out.println("入力が正しくありません。再度入力してください。");
					System.out.print("? ");
				}
			}
			return hand;
		}
}
