package ex_project_a;

public class RectangularVO {

	public int garo;
	public int sero;
//	Ŭ������� ������ ���� �����ڷ� ������ ����Ÿ���� �ۼ����� �ʴ´�.
	public RectangularVO() {
	}

	public RectangularVO(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
	}
	
	public int surface() {
		return garo + sero;
	}
	

}
