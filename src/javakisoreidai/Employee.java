package javakisoreidai;

public class Employee{
    //フィールド
	private static int number = 0;  //総従業員数
    private int    code;             //従業員番号
    private String name;            //従業員名
    private int    year;            //入社年数
    private int    age;             //年齢
    //コンストラクタの定義
    public Employee(String name,int year,int age){
      this.name = name;
      this.year = year;
      this.age = age;
      code = ++number;      //numberを1つカウントアップする
    }//nameに「未定」、yearに「0」、ageに「0」を格納
    public Employee(){
        this("未定",0,0);
      }
      //nameに引数name、yearに「0」、ageに「0」を格納
    public Employee(String name){
        this(name,0,0);
      }
      //nameに引数name、yearに「0」、ageに変数ageを格納
    public Employee(String name,int age){
        this(name,0,age);
      }
    /*
     * 例題6でコンストラクタを定義しましたが、各フィールドに格納する値が明確でなければ実行クラスではインスタンスを生成することができなくなってしまいました。
	       本例題では、次の場合でも実行クラスでインスタンスが生成できるように、複数コンストラクタを定義します。
     */
    
    //各フィールドの値を表示するメソッド
      void display(){
        System.out.println("従業員番号："+ code);
        System.out.println("従業員名　："+ name);
        System.out.println("入社年数　："+ year);
        System.out.println("年　　齢　："+ age);
      }
    //従業員名を設定するメソッド
      public void setName(String name){
        this.name = name;
      }
      //入社年数を設定するメソッド
      public void setYear(int year){
        if(year > 0){
          this.year = year;
        }
      }
      //年齢を設定するメソッド
      public void setAge(int age){
        if(age > 0){
          this.age = age;
        }
      }
      //従業員名を取得するメソッド
      public String getName(){
        return name;
      }
      //入社年数を取得するメソッド
      public int getYear(){
        return year;
      }
      //年齢を取得するメソッド
      public int getAge(){
        return age;
      }
  }