package frog;

import gameCommons.Game;
import gameCommons.IFrog;

public class Frog implements IFrog {
	
	private Game game;
	private Case coord;
	private Direction direct;

	public Frog(Game game){
		this.game= game;
		this.coord=new Case(width/2,0);
		this.direct=Direction.up;
	}


	public Case getPosition(){
		return this.coord;
	}

	public Direction getDirection(){
		return this.direct;
	}


	public void move(Direction key){
		return null;
	}
}
