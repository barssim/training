package spielwiese;

import java.util.Arrays;

public class HexStringToByteArray {

	public static byte[]
			hexStringToByteArray(String s) {
		int len = s.length();
		byte[] data = new byte[len / 2];
		for (int i = 0; i < len; i += 2) {
			data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
					+ Character.digit(s.charAt(i + 1), 16));
		}
		return data;
	}

	public static void
			main(String[] args) {
		byte[] byteArray = hexStringToByteArray("e04fd020ea3a6910a2d808002b30309d");
		System.out.println(Arrays.toString(byteArray));
	}
}
