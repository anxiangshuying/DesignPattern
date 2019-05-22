package com.polytech.dp;

public class FactoryPattern {
	public static void main(String[] args) {
		FormatFactory formatFactory = new FormatFactory();
		Format fEnglish = formatFactory.getFormat("English");
		fEnglish.diaplayTime();
	}
}
