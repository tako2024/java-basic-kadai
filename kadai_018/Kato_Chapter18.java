package kadai_018;

public abstract class Kato_Chapter18 {
	//各情報
	public String familyName;
	public String givenName;
	public String address;

	//コンストラクタ（姓と住所を設定）
	public Kato_Chapter18(String familyName, String address) {
		this.familyName = familyName;
		this.address = address;
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
