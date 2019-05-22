package com.polytech.dp;

public class FormatFactory {
	public Format getFormat(String FormatType) {
		if (FormatType == null)
			return null;
		if(FormatType.equalsIgnoreCase("24H")){
	         return new Format24h();
	      } else if(FormatType.equalsIgnoreCase("ENGLISH")){
	         return new FormatEnglish();
	      } else if(FormatType.equalsIgnoreCase("OWN")){
	         return new FormatOwn();
	      }
	      return null;
	}
}
