package de.larsschuetze.storyboard.runtime.library;


public class Storyboard {
	
	private StartNode startNode;

	public Storyboard() {
	}
	
	public void setStartNode(StartNode startNode) {
		this.startNode = startNode;
	}
	
	public StartNode getStartNode() {
		return startNode;
	}
}
