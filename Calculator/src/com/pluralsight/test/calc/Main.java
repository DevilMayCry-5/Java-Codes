package com.pluralsight.test.calc;

public class Main {

    public static void main(String[] args) {
	    double[] firstVals = {100.0d, 25.0d, 225.0d, 11.0d};
	    double[] secondVals = {50.0d, 92.0d, 17.0d, 3.0d};
	    char[] opCodes = {'a', 's', 'd', 'm'};
    	double[] results = new double[opCodes.length];

//		System.out.println(results);

    	for(int i = 0; i < opCodes.length; i++) {
			switch (opCodes[i]) {
				case 'a':
					results[i] = firstVals[i] + secondVals[i];
					break;
				case 's':
					results[i] = firstVals[i] - secondVals[i];
					break;
				case 'd':
					results[i] = secondVals[i] != 0.0d ? firstVals[i] / secondVals[i] : 0.0d;
					break;
				case 'm':
					results[i] = firstVals[i] * secondVals[i];
					break;

				default:
					System.out.println("Error! - Invalid opCode");
					results[i] = 0.0d;
					break;
			}
		}

		for(double finalResult : results) {
			System.out.println(finalResult);
		}
	}
}
