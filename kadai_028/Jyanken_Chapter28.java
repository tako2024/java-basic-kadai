package kadai_028;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	//じゃんけん値（自分、相手）をこちらで保持しても良いのでは？
	
	
	//自分のじゃんけんの手を入力して、入力値を返す
	public String getMyChoice() {
		boolean judge = false;	//入力判断（初期をfalseしておく)
		String input = "";		//入力値
		
		//入力メッセージを出力する
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		Scanner scanner = new Scanner(System.in);
		try {
			//入力値がじゃんけんの手が入力されまで続ける
			while(!judge) {
				//改行までの入力を取得する
				input = scanner.nextLine();
				
				//入力値がじゃんけんの手の場合はfalseでループを抜ける
				if(input.equals("r") || input.equals("s") || input.equals("p")) {
					judge = true;
				}else {
					System.out.println("入力が不正です。\n再度入力してください");
				}
			}
		}finally {
			//必ずScannerを閉じる
			scanner.close();
		}
		
		
		return input;
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		//map配列にじゃんけん値を設定する
		Map<Integer, String> map = new HashMap<>();
		map.put(0, "r");
		map.put(1, "s");
		map.put(2, "p");
		
		//ランダム値を整数に切り下げる
		int num = (int) Math.floor(Math.random() * 3);
		
		//乱数よりじゃんけんの手を取得する
		String janken = map.get(num);
				
		return janken;
	}

	//じゃんけんを行う
	public void playGame(String ownHands, String comHands) {
		//map配列にじゃんけん値を設定する
		Map<String, String> map = new HashMap<>();
		map.put("r", "グー");
		map.put("s", "チョキ");
		map.put("p", "パー");
		
		//配列からじゃんけん文字例を取得して、
		//自分の手と相手の手を画面出力する
		System.out.println(
				"自分の手は" + map.get(ownHands) +
				",対戦相手の手は" + map.get(comHands)
		);

		//じゃんけん判定処理
		if( ownHands.equals("r") && comHands.equals("r") ) {
			System.out.println("あいこです");
		}else if( ownHands.equals("r") && comHands.equals("s") ) {
			System.out.println("自分の勝ちです");
		}else if( ownHands.equals("r") && comHands.equals("p") ) {
			System.out.println("自分の負けです");
		}else if( ownHands.equals("s") && comHands.equals("r") ) {
			System.out.println("自分の負けです");
		}else if( ownHands.equals("s") && comHands.equals("s") ) {
			System.out.println("あいこです");
		}else if( ownHands.equals("s") && comHands.equals("p") ) {
			System.out.println("自分の勝ちです");
		}else if( ownHands.equals("p") && comHands.equals("r") ) {
			System.out.println("自分の勝ちです");
		}else if( ownHands.equals("p") && comHands.equals("s") ) {
			System.out.println("自分の負けです");
		}else if( ownHands.equals("p") && comHands.equals("p") ) {
			System.out.println("あいこです");
		}
		
	}
}
