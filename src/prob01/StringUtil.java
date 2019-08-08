package prob01;

public class StringUtil {
	public static String concatenate(String[] str) {
		
		String appendStr = new String();
		for(int i = 0; i < str.length; i++) {
			appendStr = appendStr + str[i];
		}
		return appendStr;
	}
}
