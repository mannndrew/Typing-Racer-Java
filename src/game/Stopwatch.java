package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Stopwatch {
	
	int elapsedTime = 0;
	int seconds = 0;
	int buffer = 0;

	Timer timer = new Timer(1000, (ActionListener) new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			elapsedTime=elapsedTime+1000;
			seconds = (elapsedTime/1000);
		}});
	
	void start() {
		timer.start();
	}
	
	void stop() {
		timer.stop();
	}
	
	void reset() {
		elapsedTime = 0;
		seconds = 0;
		buffer = 0;
		timer.restart();
	}
	
	boolean every_second() {
		if(seconds - buffer==1) {
			buffer++;
			return true;
		}
			
		else
			return false;
	}
}
