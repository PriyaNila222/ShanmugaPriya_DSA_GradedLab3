package com.gl.PairSum;

import com.gl.PairSum.PairSum.Node;

public class Driver {
	public static void main(String[] args) {
		Node root = null;
		PairSum pairSum = new PairSum();
		root = pairSum.insertData(root, 40);
		root = pairSum.insertData(root, 20);
		root = pairSum.insertData(root, 60);
		root = pairSum.insertData(root, 10);
		root = pairSum.insertData(root, 30);
		root = pairSum.insertData(root, 50);
		root = pairSum.insertData(root, 70);

		int sum = 80;

		pairSum.findPairSum(root, sum);

	}

}
