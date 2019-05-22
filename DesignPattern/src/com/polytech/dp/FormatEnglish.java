package com.polytech.dp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatEnglish implements Format {

	@Override
	public void diaplayTime() {
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("hhaa:mm:ss",Locale.ENGLISH);

		System.out.println("Time: " + ft.format(dNow));
	}

}
