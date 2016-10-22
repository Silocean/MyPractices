
/**
今年的植树节（2012年3月12日），小明和他的叔叔还有小伙伴们一起去植树。休息的时候，小明的同学问他叔叔多大年纪，
他叔叔说：“我说个题目，看你们谁先猜出来！”
“把我出生的年月日连起来拼成一个8位数（月、日不足两位前补0）正好可以被今天的年、月、日整除！”
他想了想，又补充到：“再给个提示，我是6月出生的。”
根据这些信息，请你帮小明算一下，他叔叔的出生年月日。
答案写在“解答.txt”中，不要写在这里！

格式是年月日连成的8位数。
例如，如果是1948年6月12日，就写：19480612

 */
public class Test猜生日 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String year, month, day;
		String date;
		for (int i = 1900; i <= 2012; i++) {
			for (int k = 1; k <= 30; k++) {
				year = i + "";
				month = "" + 0 + 6;
				if (k < 10) {
					day = "" + 0 + k;
				} else {
					day = k + "";
				}
				date = year + month + day;
				if (Integer.parseInt(date)%2012==0 && Integer.parseInt(date)%3==0 && Integer.parseInt(date)%12==0) {
					System.out.println(date);
				}
			}

		}
	}

}
