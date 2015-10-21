package objectbook;
//ジャンケンのプレイヤーを表すクラス
public class Player {
	//ジャンケンの手を表す定数
	public static final int STONE = 0 ;
	public static final int SCISSORS = 1 ;
	public static final int PAPER = 2 ;

	//---------------------//
	//プレイヤーの属性//
	//---------------------//
	//プレイヤーの名前//
	private String name_;

	//プレイヤーの勝った回数//
	private int winCount_ = 0 ;

	//与えられた戦略
	private Tactics tactics_;
	//---------------------//
	//プレイヤークラスの操作//
	//---------------------//
	//ジャンケンの手を出す//
	//@return ジャンケンの手//
	int showHand(){
		//与えられた戦略を読んでジャンケンの手を決める
		int hand = tactics_.readTactics();
		return hand;
/*		int hand = 0 ; //int型のhandを作りそこにとりあえず0を代入
		//プレイヤーの手 1～3の乱数を発生させて数字によって手を決める仕組み
		double randomNum = Math.random()*3 ;
		if(randomNum < 1){
			hand = STONE ;
			}else if(randomNum < 2){
				hand = SCISSORS ;
				}else if(randomNum < 3){
					hand = PAPER ;
				}
		return hand ; //このメソッドで定めた値をこのメソッドのint showHandに値を返した。
*/
	}

	//審判から勝敗を聞く//
	//param result true:勝ち,false:負け//
	public void notifyResult(boolean result){
		if(true == result)
			winCount_ += 1 ;
		}

	//自分の勝った回数を答える。//
	//@return 勝った回数//
	public int getWinCount(){
		return winCount_ ;
	}

	//自分の名前を答える
	//*return 名前
	public String getName(){
		return name_;
	}
	//Player型の名前.getName() で定められた名前を取りだせるようにする。
	//この場合は下記のコンストラクタによってname_に必ず名前が格納されている。それを取りだす。

	//プレイヤークラスのコンストラクタ//
	//@param name 名前
	public Player(String name){
		name_ = name;
	}
	//privateなname_にコンストラクタで定めてもらったString型のnameを代入する
	//Playerクラスの名前を決められる。

	/*
	 * プレイヤーに戦略を渡す
	 *
	 * @param tactics 戦略
	 */
	void setTactics(Tactics tactics){
		tactics_ = tactics;
	}
}
