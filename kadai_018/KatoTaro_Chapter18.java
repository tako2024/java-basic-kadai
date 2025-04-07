package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18{

	//コンストラクタ
	public KatoTaro_Chapter18(String familyName, String address) {
		super(familyName, address);
	}
	
	//個別紹介
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}

	//名前の設定
	public void setGivenName() {
		super.givenName = "太郎";
	}
}
