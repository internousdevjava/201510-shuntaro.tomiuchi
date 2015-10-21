package objectbook;
public class Janken {
	//定数に入れて分かりやすくする
	public static final int STONE = 0 ;     //グー
	public static final int SCISSORS = 1 ; //チョキ
	public static final int PAPER = 2 ;    //パー
	public static void main(String[] args) {

		//①開始を宣言
		System.out.println("じゃんけんを開始します。");

		//乱数を格納するための変数を宣言
		double randomNum = 0 ;

		//⑥勝負した回数を加算する
		//⑦三回勝負が終わったか?
		for(int cnt=0;cnt<3;cnt++){

			//②プレイヤー1が何を出すか決める
			//player1の手を入れるint型変数を用意
			int player1Hand = 0 ;

			//0以上3未満の小数として乱数を作る
			randomNum = Math.random()*3 ;
			/*
			*0<1がグー、1<2がチョキ、2<3がパー
			*Math.random()は0以上1未満の小数で乱数（毎回異なる値）が得られる。
			*/

			if(randomNum < 1){
				player1Hand = STONE ;
				System.out.print("グー");
			}else if(randomNum < 2){
				player1Hand = SCISSORS ;
				System.out.print("チョキ");

			}else if(randomNum < 3){
				player1Hand = PAPER ;
				System.out.print("パー");
			}

			//③プレイヤー2が何を出すか決める
			int player2Hand = 0 ;

			randomNum = Math.random()*3 ;

			if(randomNum < 1){
				player2Hand = STONE ;
				System.out.print("グー");
			}else if(randomNum < 2){
				player2Hand = SCISSORS ;
				System.out.print("チョキ");

			}else if(randomNum < 3){
				player2Hand = PAPER ;
				System.out.print("パー");
			}

			int player1Wincount = 0 ;
			//player1の勝ち数
			int player2Wincount = 0 ;
			//player2の勝ち数

			//④どちらが勝ちかを判定し、結果を表示する
			//plaer1が勝つ場合
			if((player1Hand == STONE && player2Hand == SCISSORS)
				||(player1Hand == PAPER && player2Hand == STONE)
				||(player1Hand == SCISSORS && player2Hand == PAPER)){
				//⑤player1の勝った回数を加算する
				player1Wincount++ ;
				System.out.println("\nプレイヤー１が勝ちました\n");
			//plaer2が勝つ場合
			}else if((player2Hand == STONE && player1Hand == SCISSORS)
					||(player2Hand == PAPER && player1Hand == STONE)
					||(player2Hand == SCISSORS && player1Hand == PAPER)){
					//⑤player2の勝った回数を加算する
					player2Wincount++ ;
	 				System.out.println("\nプレイヤー２が勝ちました\n");
	 		//引き分けの場合
			}else{
				System.out.println("\n引き分けです！\n");
			}

			//⑥最終的な勝者を判定し、画面に出力する
			System.out.println("\nジャンケン終了\n");
			//プレイヤー1の勝ち数が多い時
			if(player1Wincount > player2Wincount){
				System.out.println(player1Wincount + "対" + player2Wincount + "でプレイヤー１の勝ちです！");
			}else if(player1Wincount < player2Wincount){
				System.out.println(player1Wincount + "対" + player2Wincount + "でプレイヤー２の勝ちです！");
			}else if(player1Wincount == player2Wincount){
				System.out.println(player1Wincount + "対" + player2Wincount + "で引き分けです！。");
			}
		}
	}
}
