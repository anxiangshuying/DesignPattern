package com.polytech.dp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Format24h implements Format {

	@Override
	public void diaplayTime() {
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("HH:mm");

		System.out.println("Time: " + ft.format(dNow));
	}

}
