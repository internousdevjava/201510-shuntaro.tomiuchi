import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kisokadai2_test{
	public static void main(String[] args) {			
		int ran = (int)(Math.random()*10);    //Math.random()は０以上１未満の乱数を返します。その値に、10を掛けた値をint型にして０〜９の乱数を作ります。		
		
		while(true){
		System.out.println("数字を入力してください"); //数字入力の趣旨を伝える
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int kazu = 0 ;
		kazu =Integer.parseInt(br.readLine());
		if(kazu > ran){
				System.out.println("大きいです");
			}else if(kazu < ran){
				System.out.println("小さいです");
			}else{
				break;
			}	
		}System.out.println("正解です<br>");
	}
}