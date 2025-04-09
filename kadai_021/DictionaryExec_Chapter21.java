package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		String key[] = {"apple","banana","grape","orange"};
		
		//辞書クラスのインスタンスを作成する 
		Dictionary_Chapter21 dictionaryClass = new Dictionary_Chapter21();
		
		//調べる英単語を配列にセットする
		dictionaryClass.setDictionary();
	
		//辞書を調べる
		dictionaryClass.checkDictionary(key);
	}
}
