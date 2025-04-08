package kadai_018;

public abstract class Kato_Chapter18 {
	//加藤クラス情報
	public String familyName = "加藤";			//姓（初期設定）
	public String givenName;					//名
	public String address = "東京都中野区〇×";	//住所（初期設定）

	//コンストラクタ
	public Kato_Chapter18() {
	}
	
	//共通紹介を出力
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}

	//個別の紹介(抽象クラス）
	public abstract void eachIntroduce();
	
	//紹介の実行処理
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}

}
