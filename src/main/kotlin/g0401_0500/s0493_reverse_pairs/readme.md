493\. Reverse Pairs

Hard

Given an integer array `nums`, return _the number of **reverse pairs** in the array_.

A **reverse pair** is a pair `(i, j)` where:

*   `0 <= i < j < nums.length` and
*   `nums[i] > 2 * nums[j]`.

**Example 1:**

**Input:** nums = [1,3,2,3,1]

**Output:** 2

**Explanation:** The reverse pairs are: 

(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 \* 1 

(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 \* 1

**Example 2:**

**Input:** nums = [2,4,3,5,1]

**Output:** 3

**Explanation:** The reverse pairs are: 

(1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 \* 1 

(2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 \* 1 

(3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 \* 1

**Constraints:**

*   <code>1 <= nums.length <= 5 * 10<sup>4</sup></code>
*   <code>-2<sup>31</sup> <= nums[i] <= 2<sup>31</sup> - 1</code>