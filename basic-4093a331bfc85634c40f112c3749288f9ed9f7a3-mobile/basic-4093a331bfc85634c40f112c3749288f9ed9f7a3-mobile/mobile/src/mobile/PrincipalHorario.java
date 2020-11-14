package mobile;

public class PrincipalHorario {
	public static void main(String[] args) {
		
		IHorario h = new HorarioNG();
		System.out.println(h);
		
		for(int i = 0; i < 86400; i++) {
			h.incrementaSegundo();
			System.out.println(h);
		}
	}
}
