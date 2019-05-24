
/*		
	1.1.4
	下列语句各有什么问题(如果有的话)?

	a. if (a > b) then c = 0; 
	b. if a > b { c = 0; }
	c. if (a > b) c = 0;
	d. if (a > b) c = 0 else b = 0;
	
	解答:
	a then关键字有问题，java中没有then关键字
	b a > b 外面忘记加括号了
	c 正确
	d c = 0 忘记加分号，并且没有花括号，b = 0;外没有加花括号
*/
public class Practice1_1_4 {

	public static void main(String[] args) {
		
	}

}
