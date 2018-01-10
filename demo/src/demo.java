import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo {
	public static void main(String[] args) {
	Pattern p = Pattern.compile("(\\d(\\d))\\2");// \1代表的是第一个组捕捉到的字符串必须和后面一样
		// \2和第二个组抓到的要一样
		Matcher m = p.matcher("122");
		System.out.println(m.matches());
	}
}
