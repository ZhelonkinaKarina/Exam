package Exam;


public class One {
		private int outer_x;
		
		public One(int outer_x) {
	        this.outer_x = outer_x;
	    }
		
		//Внутрішній клас
		public class Inner {
	        public void innerMethod() {
	            System.out.println("Зовнішня змінна: " + outer_x);
	        }
		}
	            
	    public static void main(String[] args) {
	        One outerObject = new One(6);
	        One.Inner innerObject = outerObject.new Inner();
	        innerObject.innerMethod();
		}
		
	}

