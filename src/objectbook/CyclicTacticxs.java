package objectbook;

	public class CyclicTacticxs implements Tactics{
		int hand = -1;
			public int readTactics(){
					hand++;
					if(hand==3){
						hand = -1;
					}
				return hand;
				//このやり方だともし4回目があると-1をメソッドに帰してしまい、４回目は上手く表示されない。
			}
}
