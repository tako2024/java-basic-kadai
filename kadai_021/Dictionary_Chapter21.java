package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	public HashMap<String,String> dictionaryMap = new HashMap<String,String>();
	
	//インスタンス
	public Dictionary_Chapter21() {}
	
	//調べる英単語を配列にセットする
    public void setDictionary() {
		this.dictionaryMap.put("apple","りんご");
		this.dictionaryMap.put("peach","桃");
		this.dictionaryMap.put("banana","バナナ");
		this.dictionaryMap.put("lemon","レモン");
		this.dictionaryMap.put("pear","梨");
		this.dictionaryMap.put("kiwi","キウィ");
		this.dictionaryMap.put("strawberry","いちご");
		this.dictionaryMap.put("grape","ぶどう");
		this.dictionaryMap.put("muscat","マスカット");
		this.dictionaryMap.put("cherry","さくらんぼ");
	}
	
  //配列で指定されたキー分、辞書を調べる
    public void checkDictionary(String key[]) {
    	
    	for (String keyWord: key) {
    		String value = this.dictionaryMap.get(keyWord);
    		
    		if(value==null) {
    			System.out.println(keyWord + "は辞書に存在しません");
    		}else {
    			System.out.println(keyWord + "の意味は" + value);
    		}
    		
    	}
    	
    }
	

	
}
