package kisokadai123;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class KisoKadai2{
	public static void main(String[] args) {
		int ran = (int) (Math.random() * 10);
		int player; //�u���b�N�̊O�Ő錾���Ȃ���΂����Ȃ��B�����O�͎g���Ȃ��B
		player = 0;
		while (true) {
			try {
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				System.out.println("��������͂��Ă�������"); // �������͂̎�|��`����
				String buf = (br.readLine());
				player = Integer.parseInt(buf); //�����ő������Ă���̂�player = 0;�͊O�ł��ǂ�
			} catch (Exception e) {
				System.out.println("�����ɂ��Ă��������B");
				continue;
			}

			if (ran < player) {
				System.out.println("�����̐����͂����Ə������ł�");

				continue;
			} else if (ran > player) {
				System.out.println("�����̐����͂����Ƒ傫���ł�");
				continue;
		
	}
			break;
		}
		System.out.println("�����ł�<br>");
	}
}