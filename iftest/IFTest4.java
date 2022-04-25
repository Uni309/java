
public class IFTest4 {

	public static void main(String[] args) {
		//주사위 굴리기
		//double dice_number = Math.random() 0.0~0.999
		//double dice_number = Math.random() * 6 ; // 0이상 ~ 5.999미만 임의의 실수
		int dice_number = (int)(Math.random() * 6)+1; //1~6사이의 임의의 정수
		//System.out.println(dice_number);
		
		if(dice_number == 1) {
			System.out.println("1번이 나왔습니다");
		} else if(dice_number == 2) {
			System.out.println("2번이 나왔습니다");
		} else if(dice_number == 3) {
			System.out.println("3번이 나왔습니다");
		} else if(dice_number == 4) {
			System.out.println("4번이 나왔습니다");
		} else if(dice_number == 5) {
			System.out.println("5번이 나왔습니다");
		} else {
			System.out.println("6번이 나왔습니다");
		}
		
	}
}