
public class Money {
	String mdate = "";
	String sort = "";
	String contents = "";
	String detail = "";
	String section = "";
	int amount = 0;
	
	Money(String mdate, String sort, String contents, String detail, String section, int amount){
		this.mdate = mdate;
		this.sort = sort;
		this.contents = contents;
		this.detail = detail;
		this.section = section;
		this.amount = amount;
	}
	
	public void showMoney(){
		System.out.println("��¥: "+mdate);
		System.out.println("�з�: "+sort);
		System.out.println("������: "+contents);
		System.out.println("���λ���: "+detail);
		System.out.println("����: "+section);
		System.out.println("�ݾ�: "+amount);
		System.out.println("");
	}
}