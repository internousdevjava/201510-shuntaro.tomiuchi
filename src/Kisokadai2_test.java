import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kisokadai2_test{
	public static void main(String[] args) {			
		int ran = (int)(Math.random()*10);    //Math.random()‚Í‚OˆÈã‚P–¢–ž‚Ì—”‚ð•Ô‚µ‚Ü‚·B‚»‚Ì’l‚ÉA10‚ðŠ|‚¯‚½’l‚ðintŒ^‚É‚µ‚Ä‚O`‚X‚Ì—”‚ðì‚è‚Ü‚·B		
		
		while(true){
		System.out.println("”Žš‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢"); //”Žš“ü—Í‚ÌŽïŽ|‚ð“`‚¦‚é
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int kazu = 0 ;
		kazu =Integer.parseInt(br.readLine());
		if(kazu > ran){
				System.out.println("‘å‚«‚¢‚Å‚·");
			}else if(kazu < ran){
				System.out.println("¬‚³‚¢‚Å‚·");
			}else{
				break;
			}	
		}System.out.println("³‰ð‚Å‚·<br>");
	}
}