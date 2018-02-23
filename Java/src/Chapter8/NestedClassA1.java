package Chapter8;

public class NestedClassA1 {
	//ÁßÃ¸ Å¬·¡½º
	NestedClassA1(){
		System.out.println("NestedClassA1 °´Ã¼°¡ »ý¼ºµÊ");
	}
	
	/**ÀÎ½ºÅÏ½º ¸É¹ö Å¬·¡½º**/
	class B{
		B(){
			System.out.println("B °´Ã¼°¡ »ý¼ºµÊ");
		}
		int field1;
		//static int field2;
		void method1() {}
		//static void method2(){}
	}
	
	/**Á¤Àû ¸É¹ö Å¬·¡½º**/
	static class C{
		C(){
			System.out.println("C °´Ã¼°¡ »ý¼ºµÊ");	
		}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		/**·ÎÄÃ Å¬·¡½º**/
		class D{
			D(){
				System.out.println("D °´Ã¼°¡ »ý¼ºµÊ");
			}
			int field1;
			//static int field2;
			void method1() {}
			//static void method2() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
