package mypackage;
import java.util.*;

import mypackage.DStarLite;
import mypackage.Pair;
import mypackage.State;

public class Main {
	
	protected int robotWidth = 10;
	protected int robotLength = 10;

	public static void main(String[] args){
//		DStarLite pf = new DStarLite();
//		pf.init(0, 1, 3, 1);
//		pf.updateCell(2, 1, -1);
//		pf.updateCell(2, 0, -1);
//		pf.updateCell(2, 2, -1);
//		pf.updateCell(3, 0, -1);
//		pf.replan();
//		List<State> path = pf.getPath();
//		for(State i: path){
//			System.out.print("x: " + i.x + " y: " + i.y + "\n");
//		}
		
		Main main = new Main();
		
		DStarLite ds = new DStarLite();
		ds.init(150, 150, 198, 1);
//		// top and bottom wall
//		for(int i = 0 ; i < 200; i ++){
//			// south wall
//			ds.updateCell(i, 0, -1);
//			// top wall
//			ds.updateCell(i, 299, -1);
//		}
//		// left and right wall
//		for(int i = 0 ; i < 300; i ++){
//			//left wall
//			ds.updateCell(0, i, -1);
//			//right wall
//			ds.updateCell(199, i, -1);
//		}
		// obstacles
		for(int i = 0 ; i < 280; i ++){
			ds.updateCell(160, i, -1);
		}
		ds.replan();
		List<State> path = ds.getPath();
		for(State i : path){
			System.out.print((i.x)+main.robotWidth + "\t" + (i.y)+main.robotLength + "\n");
		}
	}
}
