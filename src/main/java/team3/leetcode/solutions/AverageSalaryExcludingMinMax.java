package team3.leetcode.solutions;

public class AverageSalaryExcludingMinMax {
	public double average(int[] salary) {
		// declare two variables to hold the min and max salaries,
		// setting their initial values to the first item in the array
		int minSalary = salary[0];
		int maxSalary = salary[0];
		// declare totalSalary to accumulate the salaries
		double totalSalary = 0; 

		// iterate through each salary in the array
		for (int i : salary) {
			// add the current salary to the totalSalary
			totalSalary += i;
			// check and uupdate the max and min salary if needed
			if (minSalary > i) { 
				minSalary = i;
			}
			if (maxSalary < i) {
				maxSalary = i;
			}
		}

		// Subtract the min and max salaries from the total salaries
		// to exclude them
		totalSalary -= minSalary + maxSalary;

		// return the average of the remaining salaries
		return totalSalary / (double) (salary.length - 2);

	}
}
