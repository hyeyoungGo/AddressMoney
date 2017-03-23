//import java.util.Scanner;

public class MoneyBook {
	
	public static void main(String[] args) {
		
		MBFunction mbFunction = MBFunction.createFunctionInst();
		int choice;
		
		while(true)
		{
			try
			{	
				MenuViewer.showMenu();
				choice=MenuViewer.keyboard.nextInt();
				MenuViewer.keyboard.nextLine();
				
				if(choice<INIT_MENU.ADD||choice>INIT_MENU.EXIT)
					throw new MenuChoiceException(choice);
				
				switch(choice)
				{
				case INIT_MENU.ADD:
					mbFunction.addData();
					break;
				case INIT_MENU.DELETE:
					mbFunction.deleteData();
					break;
				case INIT_MENU.MODIFY:
					mbFunction.modifyData();
					break;
				case INIT_MENU.EXIT:
					System.out.println("프로그램 종료합니다.");
					return;
				}
			}
			catch(MenuChoiceException e)
			{
				e.showWrongChoice();
				System.out.println("메뉴 선택을 처음부터 다시 진행합니다.");
			}
		}
		
	}
}
/*
static Scanner keyboard = new Scanner(System.in);

public static void showMenu()
{
	System.out.println("선택하세요...");
	System.out.println("1.데이터 입력");
	System.out.println("2.프로그램 종료");
	System.out.print("선택>>");
}
public static void readData()
{
	System.out.println("날짜: ");
	String mdate = keyboard.nextLine();
	System.out.println("수입/지출: ");
	String sort = keyboard.nextLine();
	System.out.println("항목: ");
	String contents = keyboard.nextLine();
	System.out.println("세부사항: ");
	String detail = keyboard.nextLine();
	System.out.println("현금/카드: ");
	String section = keyboard.nextLine();
	System.out.println("금액: ");
	int amount = keyboard.nextInt();
	
	Money income = new Money(mdate, sort, contents, detail, section, amount);
	System.out.println("\n입력된 정보 출력");
	income.showMoney();
}
*/
