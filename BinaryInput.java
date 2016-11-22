package assignment_1;

public class BinaryInput {
	public static void main(String[] args) {
		BinaryInput bi = new BinaryInput();
		bi.binary();

	}

	int num = 100;

	void binary() {
		if (num == 0 && num == 1) {
			System.out.println(" true");
		} else {

			if (num % 10 > 1) {
				System.out.println("false");
			} else if (num == 0 && num == 1) {
				System.out.println(" true");
			} else {
				num = num / 10;
				binary();
			}
		}

	}
}