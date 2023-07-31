package com.gl.BalancingBrackets;

public class Driver {
	public static void main(String[] args) {
		BalanceBrackets balanceBrackets = new BalanceBrackets();
		boolean value = balanceBrackets.isBalanced("({([{}])})");

		if (value) {
			System.out.println("The entered string have balanced brackets");
		} else {
			System.out.println("The entered string do not contain balanced brackets");
		}

	}

}
