package Clock;

import Display.Dispaly;

public class Clock {
	public static void main(String[] args) {
		System.out.println("clock");
		
		Clock clock = new Clock();
		clock.start();
		
	}
	
	private Dispaly hour = new Dispaly(24);
	private Dispaly minute = new Dispaly(60);
	
	
//	public Clock(Dispaly hour, Dispaly minute) {
//		// TODO Auto-generated minute: constructor stub
//		this.hour = hour;
//		this.minute = minute;
//	}
	
	public void start() {
		while (true) {
			minute.increase();
			
			if (minute.getValue() == 0) {
				hour.increase();
			}
			
			//printf,c语言输出语法！！！
			System.out.printf("%02d:%02d\n",hour.getValue(),minute.getValue());
		}
	}
}
