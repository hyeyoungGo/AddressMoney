
public class MenuChoiceException extends Exception {
	int WrongChoice;
	
	public MenuChoiceException(int choice){
		super("�߸��� ������ �̷�������ϴ�.");
		WrongChoice = choice;
	}
	public void showWrongChoice(){
		System.out.println(WrongChoice+"�� �ش��ϴ� ������ �������� �ʽ��ϴ�.");
	}
}
