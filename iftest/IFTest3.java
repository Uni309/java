
public class IFTest3 {

	public static void main(String[] args) {
		// ���ǹ� - if
		int score = 100;
		//printf %d %s %f 
		
		if(score >=90){
			System.out.printf("������ %d�� �Դϴ�", score);
			System.out.println("����� A�Դϴ�");
		}else if(score >=80){
			System.out.println("������ 80�� ���� Ů�ϴ�");
			System.out.println("����� B�Դϴ�");
		}else if(score >=70){
			System.out.println("������ 70�� ���� Ů�ϴ�");
			System.out.println("����� C�Դϴ�");
		}else if(score >=60){
			System.out.println("������ 60�� ���� Ů�ϴ�");
			System.out.println("����� D�Դϴ�");
		}else {
			System.out.println("������ 60�� ���� �۽��ϴ�");
			System.out.println("����� F�Դϴ�");
		}
	}

}
