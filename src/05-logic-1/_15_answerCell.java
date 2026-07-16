// Your cell phone rings. Return true if you should answer it. Normally you
// answer, except in the morning you only answer if it is your mom calling. In
// all cases, if you are asleep, you do not answer.
//
// answerCell(false, false, false) → true
// answerCell(false, false, true) → false
// answerCell(true, false, false) → false

public class _15_answerCell {

	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (isAsleep || (isMorning && !isMom))
			return false;
		return true;
	}

	// Solution:

	/*
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (isAsleep) {
			return false;
		}

		if (isMorning && !isMom) {
			return false;
		}

		return true;

		// Solution notes: write code to detect each of the false cases.
		// Deal with one case at a time to keep it simple.
		// Avoid using == true in tests; use the variables directly as shown here.
	}
	*/
}
