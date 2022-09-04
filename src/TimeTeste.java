
public class TimeTeste {
	public static void main(String[] args) {
		Time t = new Time(0,15,23);
		System.out.println(t.retornaHoraUniversal());
		System.out.println(t.retornaDataPadrao());
		t.setTime(16, 25, 0);
		System.out.println(t.retornaHoraUniversal());
		System.out.println(t.retornaDataPadrao());
	}
}
