import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KisoKadai2 {
	int kazu = 0 ;
	public static void main(String[] args) {
	System.out.print("0〜10までの数字を入力してください: ");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try{
		String buf = br.readLine();
        kazu = Integer.parseInt(buf);
	}catch(Exception e){
	System.out.print("0〜10までの数字を入力してください: ");
	}
	
	}

}
