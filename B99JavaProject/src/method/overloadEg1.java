package method;

public class overloadEg1 {
	
	String name;
	int age;
	String batchno;
	
	public overloadEg1() {
		// TODO Auto-generated constructor stub
		
		name="Su Su";
		age=20;
		batchno="B99";
	}
	
	public overloadEg1(String name,int age) {
		this.name=name;
		this.age=age;
		this.batchno="B99";		
	}
	
	public overloadEg1(String name,int age,String batchno) {
		this.name=name;
		this.age=age;
		this.batchno=batchno;		
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		overloadEg1 st1=new overloadEg1();
		overloadEg1 st2=new overloadEg1("Ag Net",10);
		overloadEg1 st3=new overloadEg1("Kyaw Gyi",20,"B99");
		
		System.out.println(st1.name+st1.age+st1.batchno);
		System.out.println(st2.name+st2.age+st2.batchno);
		System.out.println(st3.name+st3.age+st3.batchno);

	}

}
