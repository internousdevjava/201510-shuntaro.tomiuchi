package student;
	public class Student {
		private String name ; //生徒名を格納する
		private int kokugo ; //国語の点数を格納する
		private int sansu ; //算数の点数を格納する
		
		//コンストラクタの定義
	    public Student(String name,int kokugo,int sansu){
	      this.name = name;
	      this.kokugo = kokugo;
	      this.sansu = sansu;
	    }
	    ////nameにname、kokugoに「0」、sansuに「0」を格納
		public Student(String name){
			this(name,0,0);
		}
		public String getName(){ //nameフィールドの値を返す
			return name ;
		}
		
		public int getKokugo(){ //kokugoフィールド値を返す
			return kokugo ;
		}
		
		public int getsansu(){ //sansuフィールドの値を返す
			return sansu ;
		}
		public void setName(String n){ //引数nの値をnameフィールドに格納する
			this.name = n;
		}
		public void setKokugo(int k){ //引数kの値をkokugoフィールドに格納する
			this.kokugo = k;
		}
		public void setSansu(int s){ //引数sの値をsansuフィールドに格納する
			this.sansu = s;
 		}
		public void show(){
			System.out.println("氏名:" + name);
			System.out.println("国語:" + kokugo);
			System.out.println("算数:" + sansu);
		}
	}
