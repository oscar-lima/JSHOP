import java.util.LinkedList;
import JSHOP2.*;

public class problem
{
	private static String[] defineConstants()
	{
		String[] problemConstants = new String[8];

		problemConstants[0] = "t1";
		problemConstants[1] = "t2";
		problemConstants[2] = "p1";
		problemConstants[3] = "p2";
		problemConstants[4] = "p3";
		problemConstants[5] = "p4";
		problemConstants[6] = "city1";
		problemConstants[7] = "city2";

		return problemConstants;
	}

	private static void createState0(State s)	{
		s.add(new Predicate(4, 0, new TermList(TermConstant.getConstant(5), TermList.NIL)));
		s.add(new Predicate(4, 0, new TermList(TermConstant.getConstant(6), TermList.NIL)));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(7), TermList.NIL)));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(8), TermList.NIL)));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(9), TermList.NIL)));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(10), TermList.NIL)));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(5), new TermList(TermConstant.getConstant(11), TermList.NIL))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(6), new TermList(TermConstant.getConstant(12), TermList.NIL))));
		s.add(new Predicate(3, 0, new TermList(TermConstant.getConstant(7), new TermList(TermConstant.getConstant(12), TermList.NIL))));
		s.add(new Predicate(3, 0, new TermList(TermConstant.getConstant(8), new TermList(TermConstant.getConstant(11), TermList.NIL))));
		s.add(new Predicate(3, 0, new TermList(TermConstant.getConstant(9), new TermList(TermConstant.getConstant(12), TermList.NIL))));
		s.add(new Predicate(3, 0, new TermList(TermConstant.getConstant(10), new TermList(TermConstant.getConstant(12), TermList.NIL))));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(9), new TermList(TermConstant.getConstant(6), TermList.NIL))));
	}

	public static LinkedList<Plan> getPlans()
	{
		LinkedList<Plan> returnedPlans = new LinkedList<Plan>();
		TermConstant.initialize(13);

		Domain d = new tea();

		d.setProblemConstants(defineConstants());

		State s = new State(5, d.getAxioms());

		JSHOP2.initialize(d, s);

		TaskList tl;
		SolverThread thread;

		createState0(s);

		tl = new TaskList(1, true);
		tl.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 0, new TermList(TermConstant.getConstant(12), new TermList(TermConstant.getConstant(11), TermList.NIL))), false, false));

		thread = new SolverThread(tl, 2147483647);
		thread.start();

		try {
			while (thread.isAlive())
				Thread.sleep(500);
		} catch (InterruptedException e) {
		}

		returnedPlans.addAll( thread.getPlans() );

		return returnedPlans;
	}

	public static LinkedList<Predicate> getFirstPlanOps() {
		return getPlans().getFirst().getOps();
	}
}