package level1;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class DartGame {

	public static void main(String[] args) {

		String dartResult = "1D2S3T*";

		System.out.println(getSubString(dartResult));

	}

	public static int getSubString(String dartResult) {

		int[] values = new int[3];
		ArrayList<Integer> starIndexList = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			int sIndex = dartResult.indexOf("S");
			int dIndex = dartResult.indexOf("D");
			int tIndex = dartResult.indexOf("T");

			if (sIndex == -1)
				sIndex = 1000;
			if (dIndex == -1)
				dIndex = 1000;
			if (tIndex == -1)
				tIndex = 1000;
			boolean containsPound = false;

			int[] temp = { sIndex, dIndex, tIndex };
			int currentIndex = IntStream.of(temp).min().orElse(Integer.MAX_VALUE);

			String strSpecialChar = dartResult.substring(0, currentIndex);

			String strValue = dartResult.substring(currentIndex, currentIndex + 1);

			if (strSpecialChar.contains("*")) {
				strSpecialChar = strSpecialChar.substring(1); // 로직추가
				starIndexList.add(i);
			} else if (strSpecialChar.contains("#")) {
				strSpecialChar = strSpecialChar.substring(1); // 로직추가
				containsPound = true;
			}

			int currentInt = Integer.parseInt(strSpecialChar);

			int currentSquareValue = 0;

			switch (strValue) {
			case "S": {
				currentSquareValue = 1;
				break;
			}
			case "D": {
				currentSquareValue = 2;
				break;
			}
			case "T": {
				currentSquareValue = 3;
				break;
			}
			}

			int value = (int) Math.pow(currentInt, currentSquareValue);
			if (containsPound) {
				values[i - 1] *= -1;
			}

			values[i] = value;

			if (i < 2)
				dartResult = dartResult.substring(currentIndex + 1);
			else if (i == 2) {
				strSpecialChar = dartResult.substring(currentIndex + 1);
				if (strSpecialChar.contains("*")) {
					strSpecialChar = strSpecialChar.substring(1); // 로직추가
					starIndexList.add(i + 1);
				} else if (strSpecialChar.contains("#")) {
					strSpecialChar = strSpecialChar.substring(1); // 로직추가
					values[i] *= -1;
				}
			}

		}

		for (int index : starIndexList) {

			if (index == 1) {
				values[0] *= 2;
			} else {
				values[index - 2] *= 2;
				values[index - 1] *= 2;
			}
		}

		int sum = 0;
		for (int value : values) {

			sum += value;
		}

		return sum;

	}

}
