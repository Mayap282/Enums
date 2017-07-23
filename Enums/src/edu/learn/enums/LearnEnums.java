package edu.learn.enums;

public class LearnEnums {
	
	enum Days{
		MON,TUE,WED,THUR,FRI,SAT,SUN;
	}

	enum Color{
		RED,BLUE,GREEN,WHITE;
		
		public static void main(String args[]){
			//access Days enum
			Days d = Days.MON;
			System.out.println(d+"days are bad");
			//access Color enum
			Color c =  Color.RED;
			System.out.println(c+" is too RED");
			
			
		}
	}
}
