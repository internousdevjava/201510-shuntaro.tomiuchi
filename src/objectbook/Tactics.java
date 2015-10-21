package objectbook;
	/*
	 * ジャンケン戦略インターフェース
	 */
	public interface Tactics {
		/*
		 * 戦略を読み、ジャンケンの手を得る。
		 * グー・チョキ・パーのいずれかをplayerクラスに定義された
		 * 以下の定数で返す
		 *
		 * @return ジャンケンの手
		 */

		public int readTactics();
	}
