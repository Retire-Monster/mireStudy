package ex_project_a.main;

public class PolyMain {

	public static void main(String[] args) {
		SurfaceSolution main = new SurfaceSolution();
		do {
			main.input();

			main.process();

			main.output();
		} while (true);
	}

}
