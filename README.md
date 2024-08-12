# LeetCode Problems

https://app.codingrooms.com/app/org/bptn-bootcamps-Wikw6pa/course/full-stack-developer-bootcamp%253A-cohort-2-3p7aTai/b/leetcode-problems-qRJ3BCm|

## Emmanuel - Average Salary Excluding the Minimum and Maximum Salary

<h4> Approach and Reasoning behind it </h4>
This is pretty straight forward, since we want to calculate the average excluding the max and minimum salaries, we simply keep get the two excluding salaries and subtract them from the total sum of salaries and calculate the average.
<h4> Algorithm Explanation </h4>
- This algorithm calculates the average of an array of salaries excluding the maximum and minimum salaries found in the array. 

Here is the pseudocode
1. Initialise variables to hold the values of the Min and Max Salaries
2. Initialise a variable to hold the total of the total of the salaries
3. Loop through the array of salaries and sum them
4. Subtract the Max and Min salaries from the total
5. Calculate the average of the remaining salaries : Ensure that you account for the two subtractions
6. Return the average

## Anayika - Squares of a Sorted Array

<h4> Approach and Reasoning behind it <h4/>
This algorithm sorts the squares of numbers in a sorted array. It does this by using two pointers: one at the start and one at the end. Since the biggest squares might be at either end, it compares them, places the bigger square at the end of a new list, and then moves the pointer. This way, it quickly and easily creates a new list with all the squares in the right order.
<h4> Algorithm Explanation </h4>
- This algorithm squares the numbers of a sorted array and sorts the squared values in a non-decreasing order by using a two-pointer technique to compare and place the larger squares at the end of a new list.

Here is the pseudocode	
1. Initialize an empty sortedList array with the same length as nums
2. Set the left pointer to the start of the array and right pointer to the end of the array
3. Set the index to the last position of the sortedList
4. While the left pointer is less than or equal to right pointer:
     a.Calculate the square of the elements at the left and right of the array
     b.Compare the two squares:
     	- If the left square is larger, place it at the current index in sortedList and move the left pointer right
         - Else, place the right square at the current index in sortedList and move the right pointer left
    c. Decrement the index
5. Return the sortedList

## Errol - Missing Number
#### Approach and Reasoning behind it
- Understanding the constraints of the question really helped with edge cases. Since the question would only give unique numbers, a set was not needed. Since the minimum number in the zone was 0 it was easier to no logic was needed to account for this. We also know there will be at least one number missing since 0 is included.
##### Logic of First Solution Attempt
- A solution that seems effective would be to sort the list. once the list is sorted, we could run a for loop. 
- We could compare the arrayIndex of the for loop to another numCounter index the numCounter would simply increase by one each loop. 
- When the currentIndex does not equal the numCounter we simply would return the missing number (being the numCounter)
- To find the missing number in an Array from 0...n we are given an area nums. nums Is turned to an ArrayList for ease of use (unnecessary) by adding each number to an ArrayList called finalList using a for loop. The ArrayList is sorted for easy comparison. A for loop is then created where Two indexes are compared, 1) for the sortedList, 2)  numCounter which increments each for loop. When the indexes don't match we know that's the missing number, and we can return numCounter. We also have a second return statement outside the for loop for the case when the missing number is the last number of the array
- Algorithm is O(n) due to the for loop
 
##### Final Thoughts
- For the most part The initial pseudocode solution ended up working. 
- Turning the Array to an ArrayList was unnecessary but easier to work with, This can definitely be refactored if needed
- One edge case where the final number of the array was the missing number was simply accounted for by just  adding a second return statement near the end of the code

#### Algorithm Explanation
- This algorithm finds the missing number in an array of consecutive numbers. It adds up all the numbers in the array, calculates what the total sum should be if no numbers were missing, and then finds the missing number by subtracting the actual sum from this expected total.

Here is the final pseudocode
1. Initialize the sum of all the numbers to 0
2. Loop through each number in the array nums: - Add the number to the sum
3. Get the length of the nums array
4. Calculate the expected sum of all the numbers from 0 to the length of the nums array
5. Return the missing number, which is the difference between the expected sum and the sum

## Team 3 - Add Two Numbers
<h4> Approach and Reasoning behind it </h4>
The problem involves adding two numbers stored in reverse in a linked list. This approach accurately adds two numbers digit by digit without having to use other data structures other than a linkedList. It handles edge cases like situations where you have two list with varying lengths. This approach is similar to the algorithm used to reverse a number, it works because the numbers are stored in reverse.

#### Algorithm Explanation
- This algorithm adds two numbers stored in reverse in a linked list where each node contains a single digit.

Here is the pseudocode
1. Create a dummy node to act as the head of the resulting list
2. Initialise a pointer to the current node in the resulting list pointing to the head
3. Initialise a variable to store the leftover value
4. Loop until both list are null
5. Get the values of the current nodes in the lists. If a node is null, use 0 as its value
6. Calculate the sum of the values and the leftOver
7. Update the leftOver value for the next iteration
8. Create a new node with the digit value of the sum and add it to the resulting list
9. Move the current pointer to the next node in the resulting list
10. Move to the next nodes in the lists if they are not null
11. Handle remaining leftOver
12. Skip the dummy head and return the actual head of the resulting list.

## Team 3 - Merge Two Sorted Lists
<h4> Approach and Reasoning behind it </h4>
The approach allows us to use only linkedList in our solution and to maintain a single pass (O(n)) and ensure an ordered merge by leveraging the existing order in both lists, making the process efficient and straightforward.

#### Algorithm Explanation
-This algorithm merges two sorted linked lists into one sorted list. It creates a dummy head node and iteratively compares the current nodes of both lists, appending the smaller node to the merged list. The process continues until one list is exhausted. Any remaining nodes from the other list are then directly attached to the merged list. The algorithm returns the merged list, starting from head.next, as head is a placeholder. This approach efficiently combines two sorted lists into a single sorted linked list.

Here is the pseudocode
1. Create a dummy node to act as the head of the merged list.
2. Initialise a pointer (current) to the current node in the merged list.
3. Loop until one of the two list  is null:
4. Compare the values and add the smaller node to the merged list:
5. If the value in list1 is less than or equal to the value in list2, add the list1 node to the merged list and
6. Move to the next node in list1.
7. Otherwise, add the list2 node to the merged list and move to the next node in list2.
8. Move the current pointer to the next node in the merged list.
9. Handle remaining nodes:
	If there are remaining nodes in list1, add them to the merged list.
	If there are remaining nodes in list2, add them to the merged list.
10. Skip the dummy node and return the actual head of the merged list.


