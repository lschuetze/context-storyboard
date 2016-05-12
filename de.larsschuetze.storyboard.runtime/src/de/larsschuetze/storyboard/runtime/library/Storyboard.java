package de.larsschuetze.storyboard.runtime.library;

import java.util.Set;

import de.larsschuetze.storyboard.runtime.execution.ExecutionManager;

public class Storyboard {

	private StartNode startNode;
	private Set<EndNode> endNodes;

	public Storyboard() {
	}

	public StartNode getStartNode() {
		return startNode;
	}

	public void setStartNode(StartNode startNode) {
		this.startNode = startNode;
	}
}
