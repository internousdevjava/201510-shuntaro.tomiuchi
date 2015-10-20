package student;
	public class Goods {
		private String name ; //商品名を格納する
		private int cost ;    //消費税抜きの価格を格納する
		static double rate ;  //消費税率を格納する
		private int price ; //消費税込の価格を計算(小数点以下は切り捨て)
		
		public Goods(String n,int c){
			this.name = n ;
			this.cost = c ;
		}
		public Goods(String n){
			this.name = n ;
			this.cost = 0 ;
		}
		public String getName(){ //nameフィールドの値を返す
			return name ;
		}
		static double getRate(){ //rateフィールド値を返す
		     return rate;
		}
		public int getCost(){ //costフィールドの値を返す
			return cost ;
		}
		public int getPrice(){ //消費税込の価格を計算して返す(小数点以下は切り捨て)
			return price ;
		}
		public void setName(String n){ //引数nの値をnameフィールドに格納する
		        this.name = n;
		}
		public void setCost(int c){ //引数cの値をcostフィールドに格納する
			if(cost > 0){
		        this.cost = c;
			}
		}
		static void setRate(double r){ //引数rの値をrateフィールドに格納する
		        rate = r;
		}
		public void show(){ //商品名、消費税抜きの価格、消費税率、消費税込の価格を表示する
			System.out.println("商品名:" + name);
			System.out.println("税抜価格:" + cost);
			System.out.println("消費税率:" + rate);	
			System.out.println("消費税込の価格:" + (int)(cost * rate + cost));
		}
}
