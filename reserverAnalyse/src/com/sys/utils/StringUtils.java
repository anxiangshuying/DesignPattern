package com.sys.utils;

/**
 * @author lhj
 *
 */
public class StringUtils {
	private StringUtils(){
		
	}
	
	public static boolean hasLength(String value){
		return value !=null && !"".equals(value.intern());
	}
}
