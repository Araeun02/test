package com.test.java;
import java.text.*;

public class Ex10_6 {
	public static void main(String [] args) throws Exception {
		double number = 1234567.89;
		String[] pattern = {
				"0",
				"#",
				"0.0",
				"#.#",
				"0000000000.0000",
				"##########.####",
				"#.#-",
				"-#.#",
				"#,###.##",
				"#,####.##",
				"#E0", //.1E7?? 왜? 지수기호E
				"0E0", // 1E6?
				"##E0", //##에는 앞자리가 그대로 출력
				"00e0",
				"####E0",
				"0000E0",
				"#.#E0",
				"0.0E0",
				"0.000000000E0", 
				"00.00000000E0",
				"000.0000000E0",
				"#.#########E0",
				"##.########E0",
				"###.#######E0",
				"#,###.##+;#,###.##=",
				"#.#%",
				"#.#\u2030",
				"\u00A4 #,###", //왜 원단위로 나옴?
				"'#'#,###",
				"''#,###",
		};
		for(int i=0; i < pattern.length; i++) {
			DecimalFormat df = new DecimalFormat(pattern[i]);
			System.out.printf("%19s : %s\n",pattern[i], df.format(number));
		}
	}

}
