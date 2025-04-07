package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18{

	//コンストラクタ
	public KatoIchiro_Chapter18(String familyName, String address) {
		super(familyName, address);
	}

	//個別紹介
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}

	//名前の設定
	public void setGivenName() {
		super.givenName = "一郎";
	}

}
