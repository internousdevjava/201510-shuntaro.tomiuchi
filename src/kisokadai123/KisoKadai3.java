package kisokadai123;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
public class KisoKadai3
{
	public static void main(String[] args) {
		int x=0;
		int end=0;
		while(end!=1){
			BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\n\n--メニュー--\n\n 1新規作成\n2:読み込み\n 3:書き込み\n4:終了\nを入力してください");
			try{
				x=Integer.parseInt(br.readLine());
			}catch(Exception e){
				System.out.println(e);
			}
			if(x==1){
				try{
					System.out.println("ディレクトリを指定してください");
					System.out.println("以下のようにファイル名を記載してください");
					System.out.println("例 - C:/Users//internous//test.txt");
					String dirmake=br.readLine();
					File file = new File(dirmake);
					File dir = new File(file.getParent());
					if(dir.exists()){ 
						System.out.println("ディレクトリが存在します");
					}else{
						System.out.println("新しくディレクトリを作成します");
						dir.mkdir();
					}
					if(file.exists()){ 
						System.out.println("ファイルが存在します。");
					}else{
						System.out.println("新しくファイルを作成します");
						try{
							file.createNewFile();
						}catch(Exception e){
							System.out.println(e);
						}
					}
				}catch(Exception e){
					System.out.println(e);
				}
			}
			if(x==2){
				try{
					String readstr ;
					System.out.println("ファイル名を記載してください");
					System.out.println("C:/Users//internous//test.txt");
					String yomikomi=br.readLine();
					BufferedReader fileread = new BufferedReader(new FileReader(new File(yomikomi))); 
					System.out.println("---" + yomikomi + "-----");
					while((readstr = fileread.readLine()) != null){
						System.out.println(readstr);
					}
					fileread.close();
				}catch(Exception e){
					System.out.println(e);

				}
			}
			if(x==3){
				int j = 0; //選択の保存用
				System.out.println("ファイル名を記載してください");
				System.out.println("C:/Users//internous//test.txt");
				String kakikomi="";
				try{
					kakikomi=br.readLine();
				}catch(Exception e){
				}
				File checkfile = new File(kakikomi);
				if(!checkfile.exists()){
					System.out.println("ファイルは存在しません。");
					continue;
				}
				while(j != 3){
					try{
						System.out.println("1.上書き    2.追記   3.終了");
						j = Integer.parseInt(br.readLine());
						String filestr = "";
						if(j == 1){
							FileWriter fileuwagaki = new FileWriter(new File(kakikomi)); //パスに指定されたファイルに書き込みを行う宣言
							System.out.print("文字を入力してください");
							filestr = br.readLine();
							fileuwagaki.write(filestr + "\r\n"); //入力された文字列を上書き   //改行方法 Windows=\r\n  Linux=\n
							fileuwagaki.close();
						}else if(j == 2){//追記
							FileWriter filetuiki = new FileWriter(new File(kakikomi),true); //trueを入れることで指定ファイルに追記できる
							System.out.print("文字を入力してください");
							filestr = br.readLine();
							filetuiki.write(filestr + "\r\n");
							filetuiki.close();
						}else if(j == 3){//終了
							System.out.println("書き込みを終了します");
						}else{//指定外の数字が入力された時
							System.out.println("指定内の数字を入力してください");
						}  			}catch(Exception e){
							System.out.println("指定内の数字を入力してください");
						}
				}
			}
			{
				if(x==4){
					System.out.println("終了しますか？");
					System.out.println("1．はい 2.いいえ");
					try{
						end=Integer.parseInt(br.readLine());
					}catch(Exception e){
					}


				}
			}
		}
		System.out.println("処理を終了します");
	}
}