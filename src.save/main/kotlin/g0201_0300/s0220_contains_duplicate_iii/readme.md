220\. Contains Duplicate III

Hard

You are given an integer array `nums` and two integers `indexDiff` and `valueDiff`.

Find a pair of indices `(i, j)` such that:

*   `i != j`,
*   `abs(i - j) <= indexDiff`.
*   `abs(nums[i] - nums[j]) <= valueDiff`, and

Return `true` _if such pair exists or_ `false` _otherwise_.

**Example 1:**

**Input:** nums = [1,2,3,1], indexDiff = 3, valueDiff = 0

**Output:** true

**Explanation:** We can choose (i, j) = (0, 3). 

We satisfy the three conditions: 

i != j --> 0 != 3 

abs(i - j) <= indexDiff --> 

abs(0 - 3) <= 3 

abs(nums[i] - nums[j]) <= valueDiff --> abs(1 - 1) <= 0

**Example 2:**

**Input:** nums = [1,5,9,1,5,9], indexDiff = 2, valueDiff = 3

**Output:** false

**Explanation:** After trying all the possible pairs (i, j), we cannot satisfy the three conditions, so we return false.

**Constraints:**

*   <code>2 <= nums.length <= 10<sup>5</sup></code>
*   <code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code>
*   `1 <= indexDiff <= nums.length`
*   <code>0 <= valueDiff <= 10<sup>9</sup></code>