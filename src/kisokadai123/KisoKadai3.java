package kisokadai123;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class KisoKadai3{
	public static void main(String[] args) throws IOException {
	//throws IOException をメソッドにつける理由http://www.javadrive.jp/start/file/index4.html
		System.out.println("--処理開始--");
			if(args.length == 0){
			
	System.out.println("コマンドライン引数を指定してやり直してください。");
				System.out.println("処理を終了します");
				return;
			}
				if(args.length != 0){//0だったら最後にいって終了
					File file = new File(args[0]);
					File dir = new File(file.getParent());
					/*
					 * 配列argsの[0]をFile型fileとしてインスタンス化する。
					 * fileが存在しなかった時に使うのでgetParentである必要性がある
					   Fileオブジェクトが参照するファイルもしくはディレクトリが
					   格納されているディレクトリの絶対PATH名を返します。
					   getAbsolutePath( )
					   Fileオブジェクトが参照するファイルもしくはディレクトリの絶対PATH名を返します。
					 */
						if (dir.exists()){
						    System.out.println("ディレクトリが見つかりました");
						}else{
						    System.out.println("ディレクトリは存在しません\n新しいディレクトリを作成します。\n+file.getAbsolutePath()");
						    //File型をdirectory1でインスタンス化
						    /*File directory1 = new File(file.getParent());
						    最初に1つインスタンス化しているのでそれを使えばよい
						    ここで宣言しても利便性がない。もっと外のブロックで宣言する。
						    */
						    //dirにディレクトリの作成
						    dir.mkdir();
						    System.out.println("新しいディレクトリを作成しました");
					
						}
						try{ //try/catchの例外処理 http://www.javadrive.jp/start/file/index4.html
						if(file.exists()){ //もしfile(args[0]のこと)が存在すれば処理を行う
							System.out.println("ファイルが見つかりました");
						}else{
							System.out.println("ファイルは存在しません");
							//File型をnewfileでインスタンス化
						    /*File newfile = new File(directory1, "new file.txt");
						      最初にfileでインスタンス化されているのでそれを使えばよい*/
							file.createNewFile();
							System.out.println("ファイルを作成しました");
					
						}
						}catch(IOException e){
							System.out.println(e);

						}
						while(true){
							System.out.println("\n\n--メニュー--\n\n 1:読み込み\n 2:書き込み\n9:終了\nを入力してください");
						
							BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
							//メニュー番号を読み取りたいので上記を行い入力された内容を取得する。
							String str = br.readLine();
							//取得された内容一行をString型のstrに代入
							int nu ;
							nu = 0 ;
							//int型のnuを宣言、とりあえず0を代入
							if(str.matches("^[0-9]")){
							//もしstrの中身が0-9だった場合と違った場合で分岐
								nu=Integer.parseInt(str);
							//数字をint型で使用したいので上記でString型からint型へ変換
							}else{
								System.out.println("半角英数字でメニューを選択してください");
								//数字以外の場合はelseに入る
							}
								if(nu==1){//読み込み
									try{
										FileReader filereader1 = new FileReader(file);
										BufferedReader filebr1 = new BufferedReader(filereader1);
										/*ファイルの内容を読み取るために上記を行う
										 * http://www.javadrive.jp/start/stream/index3.html
										 */
										String filestr;
										  while((filestr = filebr1.readLine()) != null){
										    System.out.println(filestr);
										  }
										  filebr1.close();
										  //一行ずつ繰り返し読み取り出力しnullになったらcloseする。
									}catch(FileNotFoundException e){
									  System.out.println(e);
									  //FileReadeの例外処理
									}catch(IOException e){
									  System.out.println(e);
									  //BufferedReaderの例外処理
									}
								}
						
								if(nu==2){//書き込み
								try {
									boolean mode = false;
									System.out.println("\n\nモードの設定\n\n1:追記\n2:上書き");
									BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
									String str2 = br2.readLine();
								
									// モードを決める
									switch (str2) {
									case "1":
										mode = true;
										break;
									case "2":
										mode = false;
								
									default:
										break;
									}
									//真偽の設定をして代入する http://www.javadrive.jp/start/stream/index5.html
									//出力先を作成する
									FileWriter fw = new FileWriter(file.getAbsolutePath(), mode);
									PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
									/*PrintWriterとBufferedWriterはFileWriterの拡張機能
									 * http://www.javadrive.jp/start/stream/
									 * modeに真偽を代入する事によって自動でモードを切り替える
									 */
									BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
									String str3 = br3.readLine();
									//入力を読み取る一行をString型str3にまとめる
									pw.println(str3);
									//書き込む内容を指定し書き込み
									pw.close();
									//処理の終了
				
				} catch (IOException ex) {
									ex.printStackTrace();
									//例外時処理
								}
							}
							if(nu==9){//終了
								System.out.println("処理を終了します。");
								break;
							}
							if(nu==9){//終了
							System.out.println("処理を終了します。");
							break;
							}
						}
		
				}
	}
}