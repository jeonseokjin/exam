package shop;

import java.util.Scanner;

public class MyShop implements IShop {

	private String title;
	private User users[] = new User[2];
	private Product[] product= new Product[5];
	private Product[] carts= new Product[10];
	
	private Scanner sc= new Scanner(System.in);
	
	//���� ���ÿ��� ������ ����� ���� ���
	private int selUser;
	
	
	
	@Override
	public void setTitle(String title) {
		this.title=title;
	}

	@Override
	public void genUser() {
		//user ��ü�� �̿��ؼ� 2�� ����
		//User ���� �� �迭�� ���
		users[0] = new User("ȫ�浿", PayType.CARD);
		users[1] = new User("������", PayType.CASH);
	}

	@Override
	public void genProduct() {
		//�ڵ��� 3�� ����, ����Ʈ TV 2�� ����
		//�迭�� ���
		product[0] = new CellPhone("��Ʈ4", 10000, "SKT" );
		product[1] = new CellPhone("������12", 200000, "KT");
		product[2] = new CellPhone("������11", 100000, "LG");
		product[3] = new SmartTV("�Ｚ��Ʈ��HD", 2500000, "4k");
		product[4] = new SmartTV("LG����Ʈ", 3000000, "1080p");
		
	}

	@Override
	public void start() {
		System.out.println(title+" : ���� ȭ�� - ���� ����");
		System.out.println("=========================");
		
		int i=0;
		for(User user:users) {
			System.out.printf("[%d] %s(%s)\n",i++,user.getName(),user.getPayType());
		}
//		for(int i=0; i<users.length; i++) {
//			System.out.println("[%d] %s(%s)\n",i,users[i].getName(),users[i].getPayType());;
//		}
		System.out.println("[x] ����");
		System.out.println("���� : ");
		String input=sc.nextLine();
	
		//input : 0,1,x
		//switch
		switch (input){
			case "0" : case "1":
				System.out.println("### "+input+" ���� ###");
				
				selUser = Integer.parseInt(input);
				productList();
				break;
			case "x" : case "X":
			System.out.println("���α׷� �����մϴ�.");
			break;
			default : 
				System.out.println("�Է°��� Ȯ���� �ּ���");
				start();
				break;
		}
		//System.out.println("###"+input+" ���� ###");
		//0,1 => �� ��¹� �����ְ�, productList() ȣ��
	
		//�ٸ��� �ԷµǸ� => �Է°��� Ȯ���� �ּ���
		//				�������� ȭ�� �����ֱ�
		System.out.println("### "+input+" ���� ###");
	}
		
		
	public void productList() {
			System.out.println(title+" : ��ǰ ��� - ��ǰ ����");
			System.out.println("=========================");
			
			int i=0;
			for(Product p:product) {
				System.out.printf("[%d]", i++);
				p.printDetail();
			}
			System.out.println("[h] ���� ȭ��");
			System.out.println("[c] üũ �ƿ�");
			System.out.println("���� : ");
			String input = sc.nextLine();
			
			switch (input) {
			case "0" : case "1" : case "2" : case "3" : case "4" :// 0~4 ��ٱ��� ��� �ٽ� �ѹ� ��� ȭ�� �����ֱ�
				for(int j=0; j<carts.length; j++) {
					if(carts[j]==null) {
						carts[j]=product[Integer.parseInt(input)];
						break;
					}
				}
				productList();
				break;
			case "h" : case "H" :
				start();// start() ȣ��
				break;
			case "c" : case "C" :
				checkout();// checkOut() ȣ��
				break;
			default :
				System.out.println("�޴��� Ȯ���� �ּ���");
				productList();// productList() ȣ�� 
				break;
			}
		
	}
	
	public void checkout() {
		System.out.println(title+" : üũ�ƿ�");
		System.out.println("=========================");
		
		int i=0;
		int sum=0;
		for(Product p:carts) {
			if(p!=null) {
				System.out.printf("[%d] %s(%d)\n" , i++,p.getName(),p.getPrice());
				sum+=p.getPrice();
			}
		
	}
		System.out.println("���� ��� : "+users[selUser].getPayType());
		System.out.println("�հ� : "+sum+" �� �Դϴ�.");
		System.out.println("[p] ����, [q] �����Ϸ�");
		System.out.println("���� : ");
		String input = sc.nextLine();
		
		switch(input) {
		case "p" : case "P" :
			productList();
			break;
		case "q" : case "Q" :
			System.out.println("������ �Ϸ�Ǿ����ϴ�. �����մϴ�.");
			break;
		default :
			checkout();
			break;
		}
		
		
		//input : p,q
		//p : ����ȭ�� productList()
		//q : ������ �Ϸ�Ǿ����ϴ� �����մϴ�. (��¹�)
		
		
	}

	}


