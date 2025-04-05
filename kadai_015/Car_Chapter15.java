package kadai_015;

public class Car_Chapter15 {
	private int gear = 1;
	private int speed = 10;
	
	public Car_Chapter15 () {
		
	}

	//gear変更メソッド
	public void gearChange(int afterGear) {
		int beforeGear = this.gear;
		this.gear = afterGear;
		System.out.println("ギア" + beforeGear + "から" + afterGear + "に切り替えました");
	}

	public void run() {
		speed = switch(this.gear){
			case 1 ->  10;
			case 2 ->  20;
			case 3 ->  30;
			case 4 ->  40;
			case 5 ->  50;
			default -> 10;
		};
		
		System.out.println("速度は時速" + speed + "kmです");
		
	}

}