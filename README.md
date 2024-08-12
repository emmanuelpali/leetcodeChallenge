# LeetCode Problems

https://app.codingrooms.com/app/org/bptn-bootcamps-Wikw6pa/course/full-stack-developer-bootcamp%253A-cohort-2-3p7aTai/b/leetcode-problems-qRJ3BCm|

## Average Salary Excluding the Minimum and Maximum Salary

<h4> Approach and Reasoning behind it </h4>
- This is pretty straight forward, since we want to calculate the average excluding the max and minimum salaries, we simply keep get the two excluding salaries and subtract them from the total sum of salaries and calculate the average.
<h4> Algorithm Explanation </h4>
- This algorithm calculates the average of an array of salaries excluding the maximum and minimum salaries found in the array. 
- Here is the pseudocode 
1- Initialise variables to hold the values of the Min and Max Salaries
2- Initialise a variable to hold the total of the total of the salaries
3- Loop through the array of salaries and sum them
4- Subtract the Max and Min salaries from the total
5- Calculate the average of the remaining salaries
	Ensure that you account for the two subtractions
6- Return the average

## Squares of a Sorted Array
<h4> Approach and Reasoning behind it <h4/>
- 
<h4> Algorithm Explanation </h4>
-

## Missing Number
#### Approach and Reasoning behind it
- Understanding the constraints of the question really helped with edge cases. Since the question would only give unique numbers, a set was not needed. Since the minimum number in the zone was 0 it was easier to no logic was needed to account for this. We also know there will be at least one number missing since 0 is included.
##### Logic of First Solution Attempt
- A solution that seems effective would be to sort the list. once the list is sorted, we could run a for loop. 
- We could compare the arrayIndex of the for loop to another numCounter index the numCounter would simply increase by one each loop. 
- When the currentIndex does not equal the numCounter we simply would return the missing number (being the numCounter)
- 
##### Final Thoughts
- For the most part The initial pseudocode solution ended up working. 
- Turning the Array to an ArrayList was unnecessary but easier to work with, This can definitely be refactored if needed
- One edge case where the final number of the array was the missing number was simply accounted for by just  adding a second return statement near the end of the code


#### Algorithm Explanation
- To find the missing number in an Array from 0...n we are given an area nums. nums Is turned to an ArrayList for ease of use (unnecessary) by adding each number to an ArrayList called finalList using a for loop. The ArrayList is sorted for easy comparison. A for loop is then created where Two indexes are compared, 1) for the sortedList, 2)  numCounter which increments each for loop. When the indexes don't match we know that's the missing number, and we can return numCounter. We also have a second return statement outside the for loop for the case when the missing number is the last number of the array
- Algorithm is O(n) due to the for loop

## Add Two Numbers
#### Approach and Reasoning behind it
-
#### Algorithm Explanation
-

## Merge Two Sorted Lists
<h4> Approach and Reasoning behind it </h4>
The problem involves adding two numbers stored in reverse in a linked list. This approach accurately adds two numbers digit by digit without having to use other data structures other than a linkedList. It handles edge cases like situations where you have two list with varying lengths. This approach is similar to the algorithm used to reverse a number, it works because the numbers are stored in reverse.

#### Algorithm Explanation
- This algorithm adds two numbers stored in reverse in a linked list where each node contains a single digit.
- Here is the pseudocode
1- Create a dummy node to act as the head of the merged list.
2- Initialise a pointer (current) to the current node in the merged list.
3- Loop until one of the two list  is null:
4- Compare the values and add the smaller node to the merged list:
5- If the value in list1 is less than or equal to the value in list2, add the list1 node to the merged list and 6- Move to the next node in list1.
7- Otherwise, add the list2 node to the merged list and move to the next node in list2.
8- Move the current pointer to the next node in the merged list.
9- Handle remaining nodes:
If there are remaining nodes in list1, add them to the merged list.
If there are remaining nodes in list2, add them to the merged list.
10- Skip the dummy node and return the actual head of the merged list.

