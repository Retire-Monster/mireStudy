package ex_project_a;

public class TriangleVO {

	public int height = 10;
	public int baseLine = 100;

	// ����
	public TriangleVO() {
	}

	// �����ε�
	public TriangleVO(int height, int baseLine) {
		this.height = height;
		this.baseLine = baseLine;
	}

	public int surface() {
		return (int) (height * baseLine * 0.5f);
	}

	public static int surface(int height, int baseLine) {
		return (int) (height * baseLine * 0.5f);
	}

}