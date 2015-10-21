package objectbook;
//オブジェクト指向によるジャンケンプログラム
public class ObjectJanken {
	public static void main(String[] args) {
		Judge judge = new Judge() ;//審判(斉藤さん)のインスタンス作成
		Player murata = new Player("村田さん");//プレイヤー1(村田さん)の作成
		Tactics murataTactics = new CyclicTacticxs();//村田さんに渡す戦略クラスを生成する
		murata.setTactics(murataTactics);//村田さんに戦略クラスを渡す
		Player yamada = new Player("山田さん");//プレイヤー2(山田さん)の作成
		Tactics yamadaTactics = new RandomTactics();
		yamada.setTactics(yamadaTactics);
		judge.startJanken(murata,yamada);


	}
}
