package objectbook;
	//ランダムに手を決める戦略クラス。
	public class RandomTactics implements Tactics{
		/*
		 * 戦略を読み、ジャンケンの手を得る。
		 * Player.STONE … グー
		 * Player.STONE … チョキ
		 * Player.STONE … パー
		 *
		 * @return ジャンケンの手
		 */
		public int readTactics(){
			int hand = 0 ; //int型のhandを作りそこにとりあえず0を代入
			//プレイヤーの手 1～3の乱数を発生させて数字によって手を決める仕組み
			double randomNum = Math.random()*3 ;
			if(randomNum < 1){
				hand = Player.STONE ;
				}else if(randomNum < 2){
					hand = Player.SCISSORS ;
					}else if(randomNum < 3){
						hand = Player.PAPER ;
					}
			return hand ;
		}
}
