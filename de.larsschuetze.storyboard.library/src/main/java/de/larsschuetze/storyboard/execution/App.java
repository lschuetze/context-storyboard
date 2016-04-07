package de.larsschuetze.storyboard.execution;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.larsschuetze.storyboard.library.Activity;
import de.larsschuetze.storyboard.library.EndNode;
import de.larsschuetze.storyboard.library.Event;
import de.larsschuetze.storyboard.library.ForkNode;
import de.larsschuetze.storyboard.library.GenericEvent;
import de.larsschuetze.storyboard.library.Guard;
import de.larsschuetze.storyboard.library.JoinNode;
import de.larsschuetze.storyboard.library.MatchActivity;
import de.larsschuetze.storyboard.library.Matcher;
import de.larsschuetze.storyboard.library.MergeNode;
import de.larsschuetze.storyboard.library.StartNode;
import de.larsschuetze.storyboard.library.Storyboard;
import de.larsschuetze.storyboard.library.Transition;
import de.larsschuetze.storyboard.library.execution.EventManager;

public class App {

	private static final Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {

		final EventManager eventManager = new EventManager();
		final ExecutionManager runtimeManager = new ExecutionManager(
				eventManager);

		logger.debug("Constructing");
		StartNode start = new StartNode();
		Activity activity1 = new MatchActivity(new Matcher() {
			@Override
			public boolean execute() {
				return true;
			}
		});

		MergeNode merge = new MergeNode();

		ForkNode fork = new ForkNode();
		JoinNode join = new JoinNode();

		Activity activity2 = new MatchActivity(new Matcher() {
			@Override
			public boolean execute() {
				return true;
			}
		});

		Activity activity3 = new MatchActivity(new Matcher() {
			@Override
			public boolean execute() {
				return true;
			}
		});

		EndNode end = new EndNode();

		Guard<TestClass, Integer> guard = new TestGuard();
		guard.setMethod("test");

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				TestClass testObject = new TestClass();
				Event<TestClass> event = new GenericEvent<TestClass>(
						"TestEvent", testObject, TestClass.class);
				int i = 1;
				while (i < 3) {
					try {
						Thread.sleep(2000 * i);
						i++;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					eventManager.eventOccurance(event);
				}
			}
		});
		t.start();

		Transition transition1 = new Transition(start, merge, "transition1");
		Transition transition2 = new Transition(activity1, fork, "transition2");
		Transition transition3 = new Transition(fork, activity2, "transition3");
		Transition transition4 = new Transition(fork, activity3, "transition4");
		Transition transition5 = new Transition(activity2, join, "transition5");
		Transition transition6 = new Transition(activity3, join, "transition6");
		Transition transition7 = new Transition(join, merge, "transition7");
		Transition transition8 = new Transition(merge, activity1, "transition8");

		transition2.setGuard(guard);
		transition2.setTriggerEventType("TestEvent");

		Storyboard storyboard = new Storyboard(runtimeManager);
		storyboard.setStartNode(start);

		logger.debug("Starting");
		runtimeManager.execute(storyboard);
		logger.debug("Stopping");
	}
}
