
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
		System.out.println("날짜: "+mdate);
		System.out.println("분류: "+sort);
		System.out.println("콘텐츠: "+contents);
		System.out.println("세부사항: "+detail);
		System.out.println("구분: "+section);
		System.out.println("금액: "+amount);
		System.out.println("");
	}
}