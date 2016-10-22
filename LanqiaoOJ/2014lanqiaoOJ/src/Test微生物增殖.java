
/**
假设有两种微生物 X 和 Y
X出生后每隔3分钟分裂一次（数目加倍），Y出生后每隔2分钟分裂一次（数目加倍）。
一个新出生的X，半分钟之后吃掉1个Y，并且，从此开始，每隔1分钟吃1个Y。
现在已知有新出生的 X=10, Y=89，求60分钟后Y的数目。
如果X=10，Y=90  呢？
本题的要求就是写出这两种初始条件下，60分钟后Y的数目。
题目的结果令你震惊吗？这不是简单的数字游戏！真实的生物圈有着同样脆弱的性质！也许因为你消灭的那只 Y 就是最终导致 Y 种群灭绝的最后一根稻草！


 */
public class Test微生物增殖 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y = 90;
		for(int i=1; i<=60; i++) {
			y = y - x;
			if(i%2 == 0) {
				y = y*2;
			}
			if(i%3 == 0) {
				x = x*2;
			}
		}
		System.out.println(y);
	}

}