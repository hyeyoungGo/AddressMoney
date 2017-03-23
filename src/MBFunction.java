

public class MBFunction {
	final int MAX_CNT = 100;
	Money[] money = new Money[MAX_CNT];
	int curCnt = 0;
	
	static MBFunction inst = null;
	public static MBFunction createFunctionInst()
	{
		if(inst==null)
			inst = new MBFunction();
		return inst;
	}
	private MBFunction(){}
	
	//데이터 추가 메소드
	public void addData()
	{
		System.out.println("데이터 추가를 시작합니다.");
		
		System.out.println("날짜: ");
		String mdate = MenuViewer.keyboard.nextLine();
		System.out.println("수입/지출: ");
		String sort = MenuViewer.keyboard.nextLine();
		System.out.println("항목: ");
		String contents = MenuViewer.keyboard.nextLine();
		System.out.println("세부사항: ");
		String detail = MenuViewer.keyboard.nextLine();
		System.out.println("현금/카드: ");
		String section = MenuViewer.keyboard.nextLine();
		System.out.println("금액: ");
		int amount = MenuViewer.keyboard.nextInt();
		
		money[curCnt++]=new Money(mdate, sort, contents, detail, section, amount);
		System.out.println("데이터 추가가 완료되었습니다.");
	}
	//데이터 삭제 메소드
	public void deleteData()
	{
		System.out.println("데이터 삭제를 시작합니다.");
		
		System.out.print("날짜: ");
		String mdate = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(mdate);
		if(dataIdx<0){
			System.out.println("해당하는 데이터가 존재하지 않습니다.");
		}else{
			for(int idx=dataIdx; idx<(curCnt-1); idx++)
				money[idx]=money[idx+1];
			
			curCnt--;
			System.out.println("데이터 삭제가 완료되었습니다.");
		}
	}
	//데이터 수정 메소드
	public void modifyData()
	{
		System.out.println("데이터 수정을 시작합니다.");
		
		System.out.print("날짜: ");
		String mdate = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(mdate);
		if(dataIdx<0){
			System.out.println("해당하는 데이터가 존재하지 않습니다.");
		}else{
			MenuViewer.keyboard.nextLine();
			System.out.println("데이터 수정이 완료되었습니다.");
		}
	}
	//실제 검색 메소드
	private int search(String mdate){
		for(int idx=0; idx<curCnt; idx++)
		{
			Money curInfo = money[idx];
			if(mdate.compareTo(curInfo.mdate)==0)
				return idx;
		}
		return -1;
		
	}
	
}
