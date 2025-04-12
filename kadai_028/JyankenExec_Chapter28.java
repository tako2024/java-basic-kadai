package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		//じゃんけんを開始
		Jyanken_Chapter28 janken = new Jyanken_Chapter28();

		//入力したじゃんけん文字を返す
		String ownhands =janken.getMyChoice();
		
		//対戦相手のじゃんけんの手を乱数で選ぶ
		String comhands =janken.getRandom();
		
		//じゃんけんを行う
		janken.playGame(ownhands, comhands);

	}

}
