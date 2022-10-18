package calculator;

import java.util.Stack;

public abstract class Operator {
	Stack<Double> st;
	public Operator(Stack<Double> st) {
		this.st = st;
	}
		
	public abstract void operate();
}
