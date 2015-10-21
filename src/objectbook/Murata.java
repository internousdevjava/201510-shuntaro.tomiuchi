package objectbook;
//ジャンケンのプレイヤーを表すクラス
public class Murata extends Player{
		//---------------------//
		//プレイヤークラスの操作//
		//---------------------//
		//ジャンケンの手を出す//
		//@return ジャンケンの手//
		public int showHand(){
			return STONE ; //このメソッドで定めた値をこのメソッドのint showHandに値を返した。
		}
		/*
		 * コンストラクタの設定
		 * @param 名前
		 */
		public Murata(String name){
			super(name);
		}
	}