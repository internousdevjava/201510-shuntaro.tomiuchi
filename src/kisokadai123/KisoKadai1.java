package kisokadai123;
import java.io.BufferedReader;
import java.io.InputStreamReader;
	public class KisoKadai1 {
		public static void main(String[] args) {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
				int x = 0 ;
				int y = 0 ;
				int j = 0 ;
				int k = 0 ;
				//x����y���̐��������߂Ă��炤�B
				System.out.println("���͂��ꂽx����y���̐����܂ł̋��̓�����\�`���ŏo�͂��܂�");
					try{
						while(j==0 & k==0){
							System.out.println("0�`100�܂ł�x���̐�������͂����ĉ������B");
							j = Integer.parseInt(br.readLine());
							System.out.println("0�`100�܂ł�y���̐�������͂����ĉ������B");
							k = Integer.parseInt(br.readLine());
						}
					}catch (Exception e){
						System.out.println("0�`100�܂ł̐�������͂����ĉ�����\n" + e +"�����͂���܂���");
					}
					//x����y���܂ł̋��\���쐬
					for(x=j;x>=1;x--){
						for(y=1;y<=k;y++){
							System.out.print(x*y+" ");
								if(y==j){
									System.out.println();
								}
						}
					}
		}

	}