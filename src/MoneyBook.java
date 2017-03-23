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
					System.out.println("���α׷� �����մϴ�.");
					return;
				}
			}
			catch(MenuChoiceException e)
			{
				e.showWrongChoice();
				System.out.println("�޴� ������ ó������ �ٽ� �����մϴ�.");
			}
		}
		
	}
}
/*
static Scanner keyboard = new Scanner(System.in);

public static void showMenu()
{
	System.out.println("�����ϼ���...");
	System.out.println("1.������ �Է�");
	System.out.println("2.���α׷� ����");
	System.out.print("����>>");
}
public static void readData()
{
	System.out.println("��¥: ");
	String mdate = keyboard.nextLine();
	System.out.println("����/����: ");
	String sort = keyboard.nextLine();
	System.out.println("�׸�: ");
	String contents = keyboard.nextLine();
	System.out.println("���λ���: ");
	String detail = keyboard.nextLine();
	System.out.println("����/ī��: ");
	String section = keyboard.nextLine();
	System.out.println("�ݾ�: ");
	int amount = keyboard.nextInt();
	
	Money income = new Money(mdate, sort, contents, detail, section, amount);
	System.out.println("\n�Էµ� ���� ���");
	income.showMoney();
}
*/
