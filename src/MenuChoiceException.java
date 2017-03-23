
public class MenuChoiceException extends Exception {
	int WrongChoice;
	
	public MenuChoiceException(int choice){
		super("잘못된 연산이 이루어졌습니다.");
		WrongChoice = choice;
	}
	public void showWrongChoice(){
		System.out.println(WrongChoice+"에 해당하는 선택은 존재하지 않습니다.");
	}
}
