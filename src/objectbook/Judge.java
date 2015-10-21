package objectbook;
//ジャンケンの審判を表すクラス
	public class Judge {
		/*
		 * ジャンケンを開始する。
		 *
		 * @param player1 判定対象プレイヤー1
		 * @param player2 判定対象プレイヤー2
		 */
		public void startJanken(Player player1, Player player2){

			//ジャンケンの開始を宣言する
			System.out.println("[ジャンケン開始]\n");

			for(int cnt = 0; cnt < 3;cnt++){ //ジャンケンを三回行う
				System.out.println("[" + (cnt + 1) + "回戦目]"); //何戦目か宣言する
				Player winner = judgeJanken(player1,player2);
					if(winner != null){
						System.out.println("\n" + winner.getName() + "が勝ちました！\n");//勝者を表示する

						//勝ったプレイヤーに結果を伝える----③
						winner.notifyResult(true);

					}else{//引き分けの場合
							System.out.println("\n引き分けです！\n");
					}
			}
			System.out.println("[ジャンケン終了]\n"); //ジャンケン終了を宣言

			Player finalWinner = judgeFinalWinner(player1,player2);//最終的な勝者を判定する
				if(finalWinner != null){
					System.out.print
					(player1.getWinCount() + "vs" + player2.getWinCount() + "で");
					System.out.println(finalWinner.getName() + "の勝ちです！\n");
				}else{
				System.out.println("引き分けです！\n");
				}
		}
			/*
			 * 「ジャンケン、ポン」と声をかけ、
			 * プレイヤーの手を見て、どちらが勝ちかを判定する。
			 *
			 * @param player1 判定対象プレイヤー1
			 * @param player1 判定対象プレイヤー2
			 * @return 勝ったプレイヤー。引き分けの場合はnullを返す。
			 */
		private Player judgeJanken(Player player1, Player player2){
			Player winner = null ;
			//プレイヤー1の手を出す-------①
			int player1hand = player1.showHand();

			//プレイヤー2の手を出す-------②
			int player2hand = player2.showHand();
			//それぞれの手を表示する
			printHand(player1hand);
			System.out.print(" vs. ");
			printHand(player2hand);
			System.out.print("\n");

			//プレイヤー１が勝つ場合
			if((player1hand == Player.STONE && player2hand == Player.SCISSORS)
			|| (player1hand == Player.SCISSORS && player2hand == Player.PAPER)
			|| (player1hand == Player.PAPER && player2hand == Player.STONE)){
				winner = player1;
				//プレイヤー２が勝つ場合
			}else if((player1hand == Player.SCISSORS && player2hand == Player.STONE )
					|| (player1hand == Player.PAPER && player2hand == Player.SCISSORS)
					|| (player1hand == Player.STONE && player2hand == Player.PAPER)){
				winner = player2;
			}
			return winner; //どちらでもない場合は引き分け(nullを返す)
		}
		/*
		 * 最終的な勝者を判定する。
		 * @param player1 判定対象プレイヤー１
		 * @param player2 判定対象プレイヤー２
		 * @return 勝ったプレイヤー。引き分けの場合はnullを返す
		 */
		private Player judgeFinalWinner(Player player1, Player player2){
			Player winner = null;
				int player1WinCount = 0;
				int player2WinCount = 0;
				//player１から勝ち数を聞く---------④
				player1WinCount = player1.getWinCount();
				//player２から勝ち数を聞く---------⑤
				player2WinCount = player2.getWinCount();
				if(player1WinCount > player2WinCount){
					//プレイヤー１の勝ち
					winner = player1 ;
				}else if(player1WinCount < player2WinCount){
					//プレイヤー２の勝ち
					winner = player2 ;
				}
				return winner; //どちらでもない場合は引き分け(nullを返す)
		}
		/*
		 * ジャンケンの手を表示する。
		 *
		 * @param hand ジャンケンの手
		 */
		private void printHand(int hand){
			switch (hand){
				case Player.STONE:System.out.print("グー"); break;
				case Player.SCISSORS:System.out.print("チョキ"); break;
				case Player.PAPER:System.out.print("パー"); break;
				default:break;
			}
		}
	}
