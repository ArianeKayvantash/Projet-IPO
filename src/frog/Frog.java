package frog;

import gameCommons.Game;
import gameCommons.IFrog;
import package util;

public class Frog implements IFrog {
	
	private Game game;
	private Case coord;
	private Direction direct;

	public Frog(Game game, int abcs, int ord){
		this.game= game;
		this.coord.abcs=abcs;
		this.coord.ord=ord;
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
