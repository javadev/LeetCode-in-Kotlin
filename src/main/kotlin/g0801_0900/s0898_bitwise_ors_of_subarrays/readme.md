898\. Bitwise ORs of Subarrays

Medium

Given an integer array `arr`, return _the number of distinct bitwise ORs of all the non-empty subarrays of_ `arr`.

The bitwise OR of a subarray is the bitwise OR of each integer in the subarray. The bitwise OR of a subarray of one integer is that integer.

A **subarray** is a contiguous non-empty sequence of elements within an array.

**Example 1:**

**Input:** arr = [0]

**Output:** 1

**Explanation:** There is only one possible result: 0.

**Example 2:**

**Input:** arr = [1,1,2]

**Output:** 3

**Explanation:** The possible subarrays are [1], [1], [2], [1, 1], [1, 2], [1, 1, 2]. 

These yield the results 1, 1, 2, 1, 3, 3. 

There are 3 unique values, so the answer is 3.

**Example 3:**

**Input:** arr = [1,2,4]

**Output:** 6

**Explanation:** The possible results are 1, 2, 3, 4, 6, and 7.

**Constraints:**

*   <code>1 <= arr.length <= 5 * 10<sup>4</sup></code>
*   <code>0 <= arr[i] <= 10<sup>9</sup></code>