package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18{
	
	//コンストラクタ
	public KatoHanako_Chapter18(String familyName, String address) {
		//親クラスのコンストラクタ呼出し
		super(familyName, address);
	}
	
	//個別紹介
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}

	//名前の設定
	public void setGivenName() {
		super.givenName = "花子";
	}
}
