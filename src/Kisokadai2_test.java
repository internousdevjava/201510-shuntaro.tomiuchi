import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kisokadai2_test{
	public static void main(String[] args) {			
		int ran = (int)(Math.random()*10);    //Math.random()�͂O�ȏ�P�����̗�����Ԃ��܂��B���̒l�ɁA10���|�����l��int�^�ɂ��ĂO�`�X�̗��������܂��B		
		
		while(true){
		System.out.println("��������͂��Ă�������"); //�������͂̎�|��`����
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int kazu = 0 ;
		kazu =Integer.parseInt(br.readLine());
		if(kazu > ran){
				System.out.println("�傫���ł�");
			}else if(kazu < ran){
				System.out.println("�������ł�");
			}else{
				break;
			}	
		}System.out.println("�����ł�<br>");
	}
}