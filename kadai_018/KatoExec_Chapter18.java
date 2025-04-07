package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		//加藤家の情報設定
		final String familyName = "加藤";
		final String address = "東京都中野区〇×";
		
		//継承クラス太郎の紹介
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18(familyName,address);
		taro.setGivenName();
		taro.execIntroduce();
		
		//継承クラス一郎の紹介
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18(familyName,address);
		ichiro.setGivenName();
		ichiro.execIntroduce();
		
		//継承クラス花子の紹介
		KatoHanako_Chapter18 hanako = new  KatoHanako_Chapter18(familyName,address);
		hanako.setGivenName();
		hanako.execIntroduce();
		
	}

}
