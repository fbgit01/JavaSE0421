/*
��д�����࣬TriAngle��TestTriAngle������TriAngle������˽�еĵױ߳�
base�͸�height��ͬʱ����������������˽�б�����
��һ������ʹ����Щ�������������������ε������
*/
class TestTriAngle {
	public static void main(String[] args) {
		TriAngle ta = new TriAngle(1.56,  22.22);
		
		double area = ta.getBase() * ta.getHeight() / 2;
		
		System.out.println("���Ϊ��" + area);
	}
}

class TriAngle{

	private double base;
	private double height;

	public TriAngle(){
	}

	public TriAngle(double base, double height){
		this.base = base;
		this.height = height;
	}

	public void setBase(double base){
		this.base = base;
	}

	public double getBase(){
		return base;
	}

	public void setHeight(double height){
		this.height = height;
	}

	public double getHeight(){
		return height;
	}

}