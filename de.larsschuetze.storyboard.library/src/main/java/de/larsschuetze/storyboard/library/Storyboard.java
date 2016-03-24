package de.larsschuetze.storyboard.library;

import java.util.Set;

import de.larsschuetze.storyboard.execution.ExecutionManager;

public class Storyboard {

	private StartNode startNode;
	private Set<EndNode> endNodes;
	private ExecutionManager runtime;

	public Storyboard(ExecutionManager runtime) {
		this.runtime = runtime;
	}

	public StartNode getStartNode() {
		return startNode;
	}

	public void setStartNode(StartNode startNode) {
		this.startNode = startNode;
	}
}
