
class ChessBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] symbol = new char[] { '□', '■' };
		boolean alt = false;
		for (int i = 0; i < 8 * 8; i++) {
			if (i % 8 == 0) {
				System.out.println();
				alt = !alt;
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(" " + symbol[((alt ? 1 : 0) + i) % 2]);
		}

	}

}
