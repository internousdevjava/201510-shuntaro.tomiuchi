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
	//throws IOException �����\�b�h�ɂ��闝�Rhttp://www.javadrive.jp/start/file/index4.html
		System.out.println("--�����J�n--");
			if(args.length == 0){
			
	System.out.println("�R�}���h���C���������w�肵�Ă�蒼���Ă��������B");
				System.out.println("�������I�����܂�");
				return;
			}
				if(args.length != 0){//0��������Ō�ɂ����ďI��
					File file = new File(args[0]);
					File dir = new File(file.getParent());
					/*
					 * �z��args��[0]��File�^file�Ƃ��ăC���X�^���X������B
					 * file�����݂��Ȃ��������Ɏg���̂�getParent�ł���K�v��������
					   File�I�u�W�F�N�g���Q�Ƃ���t�@�C���������̓f�B���N�g����
					   �i�[����Ă���f�B���N�g���̐��PATH����Ԃ��܂��B
					   getAbsolutePath( )
					   File�I�u�W�F�N�g���Q�Ƃ���t�@�C���������̓f�B���N�g���̐��PATH����Ԃ��܂��B
					 */
						if (dir.exists()){
						    System.out.println("�f�B���N�g����������܂���");
						}else{
						    System.out.println("�f�B���N�g���͑��݂��܂���\n�V�����f�B���N�g�����쐬���܂��B\n+file.getAbsolutePath()");
						    //File�^��directory1�ŃC���X�^���X��
						    /*File directory1 = new File(file.getParent());
						    �ŏ���1�C���X�^���X�����Ă���̂ł�����g���΂悢
						    �����Ő錾���Ă����֐����Ȃ��B�����ƊO�̃u���b�N�Ő錾����B
						    */
						    //dir�Ƀf�B���N�g���̍쐬
						    dir.mkdir();
						    System.out.println("�V�����f�B���N�g�����쐬���܂���");
					
						}
						try{ //try/catch�̗�O���� http://www.javadrive.jp/start/file/index4.html
						if(file.exists()){ //����file(args[0]�̂���)�����݂���Ώ������s��
							System.out.println("�t�@�C����������܂���");
						}else{
							System.out.println("�t�@�C���͑��݂��܂���");
							//File�^��newfile�ŃC���X�^���X��
						    /*File newfile = new File(directory1, "new file.txt");
						      �ŏ���file�ŃC���X�^���X������Ă���̂ł�����g���΂悢*/
							file.createNewFile();
							System.out.println("�t�@�C�����쐬���܂���");
					
						}
						}catch(IOException e){
							System.out.println(e);

						}
						while(true){
							System.out.println("\n\n--���j���[--\n\n 1:�ǂݍ���\n 2:��������\n9:�I��\n����͂��Ă�������");
						
							BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
							//���j���[�ԍ���ǂݎ�肽���̂ŏ�L���s�����͂��ꂽ���e���擾����B
							String str = br.readLine();
							//�擾���ꂽ���e��s��String�^��str�ɑ��
							int nu ;
							nu = 0 ;
							//int�^��nu��錾�A�Ƃ肠����0����
							if(str.matches("^[0-9]")){
							//����str�̒��g��0-9�������ꍇ�ƈ�����ꍇ�ŕ���
								nu=Integer.parseInt(str);
							//������int�^�Ŏg�p�������̂ŏ�L��String�^����int�^�֕ϊ�
							}else{
								System.out.println("���p�p�����Ń��j���[��I�����Ă�������");
								//�����ȊO�̏ꍇ��else�ɓ���
							}
								if(nu==1){//�ǂݍ���
									try{
										FileReader filereader1 = new FileReader(file);
										BufferedReader filebr1 = new BufferedReader(filereader1);
										/*�t�@�C���̓��e��ǂݎ�邽�߂ɏ�L���s��
										 * http://www.javadrive.jp/start/stream/index3.html
										 */
										String filestr;
										  while((filestr = filebr1.readLine()) != null){
										    System.out.println(filestr);
										  }
										  filebr1.close();
										  //��s���J��Ԃ��ǂݎ��o�͂�null�ɂȂ�����close����B
									}catch(FileNotFoundException e){
									  System.out.println(e);
									  //FileReade�̗�O����
									}catch(IOException e){
									  System.out.println(e);
									  //BufferedReader�̗�O����
									}
								}
						
								if(nu==2){//��������
								try {
									boolean mode = false;
									System.out.println("\n\n���[�h�̐ݒ�\n\n1:�ǋL\n2:�㏑��");
									BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
									String str2 = br2.readLine();
								
									// ���[�h�����߂�
									switch (str2) {
									case "1":
										mode = true;
										break;
									case "2":
										mode = false;
								
									default:
										break;
									}
									//�^�U�̐ݒ�����đ������ http://www.javadrive.jp/start/stream/index5.html
									//�o�͐���쐬����
									FileWriter fw = new FileWriter(file.getAbsolutePath(), mode);
									PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
									/*PrintWriter��BufferedWriter��FileWriter�̊g���@�\
									 * http://www.javadrive.jp/start/stream/
									 * mode�ɐ^�U�������鎖�ɂ���Ď����Ń��[�h��؂�ւ���
									 */
									BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
									String str3 = br3.readLine();
									//���͂�ǂݎ���s��String�^str3�ɂ܂Ƃ߂�
									pw.println(str3);
									//�������ޓ��e���w�肵��������
									pw.close();
									//�����̏I��
				
				} catch (IOException ex) {
									ex.printStackTrace();
									//��O������
								}
							}
							if(nu==9){//�I��
								System.out.println("�������I�����܂��B");
								break;
							}
							if(nu==9){//�I��
							System.out.println("�������I�����܂��B");
							break;
							}
						}
		
				}
	}
}