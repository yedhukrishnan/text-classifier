package tokens;

public class MainClass {
	
	public static void main(String[] args) {
		
		String text = "Lorem    ips$um    dolor sit amet, consectetuer adipiscing elit.\n" +
				"Aenean commodo ligula    eget dolor.\n" +
				"Aenean massa. Cum sociis natoque penatibus et mag$nis dis parturient montes, nasc#etur ridic#ulus mus." +
				"Donec qua#m felis, ultri$cies nec, pellentesque eu, preti#um quis, sem." +
				"Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, v#ulputate eget, arcu." +
				"In enim justo, rhoncus ut, im$%^&*(perdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium." +
				"Integer tincidunt. Cras %^&*()dapibus. Vivamus elementum semper nisi. " +
				"Aenean vulputate eleifend tellus." +
				"Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim." +
				"Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus.";
		Tokenizer tokenizer = new Tokenizer(text);
		tokenizer.tokenize();
		
	}

}
