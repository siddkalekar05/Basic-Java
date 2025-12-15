class OuterVar{
	int x = 20;
	int y = 90;
	class InnerVar{
		int x = 40;
		int y = 50;
		void disVar(){
			System.out.println(OuterVar.this.x);
			System.out.println(OuterVar.this.y);
			System.out.println(x);
			System.out.println(y);
		}
	}
}
class Variable2{
	public static void main(String[] args){
		new OuterVar().new InnerVar().disVar();
	}
}
