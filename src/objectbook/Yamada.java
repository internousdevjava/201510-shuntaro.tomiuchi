package objectbook;
//ジャンケンのプレイヤーを表すクラス
public class Yamada extends Player{
		//---------------------//
		//プレイヤークラスの操作//
		//---------------------//
		//ジャンケンの手を出す//
		//@return ジャンケンの手//
		public int showHand(){
			return PAPER ; //このメソッドで定めた値をこのメソッドのint showHandに値を返した。
		}
		/*
		 * コンストラクタの設定
		 * @param 名前
		 */
		public Yamada(String name){
			super(name);
		}
	}