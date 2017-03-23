

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
	
	//������ �߰� �޼ҵ�
	public void addData()
	{
		System.out.println("������ �߰��� �����մϴ�.");
		
		System.out.println("��¥: ");
		String mdate = MenuViewer.keyboard.nextLine();
		System.out.println("����/����: ");
		String sort = MenuViewer.keyboard.nextLine();
		System.out.println("�׸�: ");
		String contents = MenuViewer.keyboard.nextLine();
		System.out.println("���λ���: ");
		String detail = MenuViewer.keyboard.nextLine();
		System.out.println("����/ī��: ");
		String section = MenuViewer.keyboard.nextLine();
		System.out.println("�ݾ�: ");
		int amount = MenuViewer.keyboard.nextInt();
		
		money[curCnt++]=new Money(mdate, sort, contents, detail, section, amount);
		System.out.println("������ �߰��� �Ϸ�Ǿ����ϴ�.");
	}
	//������ ���� �޼ҵ�
	public void deleteData()
	{
		System.out.println("������ ������ �����մϴ�.");
		
		System.out.print("��¥: ");
		String mdate = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(mdate);
		if(dataIdx<0){
			System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�.");
		}else{
			for(int idx=dataIdx; idx<(curCnt-1); idx++)
				money[idx]=money[idx+1];
			
			curCnt--;
			System.out.println("������ ������ �Ϸ�Ǿ����ϴ�.");
		}
	}
	//������ ���� �޼ҵ�
	public void modifyData()
	{
		System.out.println("������ ������ �����մϴ�.");
		
		System.out.print("��¥: ");
		String mdate = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(mdate);
		if(dataIdx<0){
			System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�.");
		}else{
			MenuViewer.keyboard.nextLine();
			System.out.println("������ ������ �Ϸ�Ǿ����ϴ�.");
		}
	}
	//���� �˻� �޼ҵ�
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
