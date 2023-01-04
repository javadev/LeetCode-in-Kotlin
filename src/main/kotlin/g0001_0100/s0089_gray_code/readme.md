89\. Gray Code

Medium

An **n-bit gray code sequence** is a sequence of <code>2<sup>n</sup></code> integers where:

*   Every integer is in the **inclusive** range <code>[0, 2<sup>n</sup> - 1]</code>,
*   The first integer is `0`,
*   An integer appears **no more than once** in the sequence,
*   The binary representation of every pair of **adjacent** integers differs by **exactly one bit**, and
*   The binary representation of the **first** and **last** integers differs by **exactly one bit**.

Given an integer `n`, return _any valid **n-bit gray code sequence**_.

**Example 1:**

**Input:** n = 2

**Output:** [0,1,3,2]

**Explanation:** The binary representation of [0,1,3,2] is [00,01,11,10]. - 0<ins>0</ins> and 0<ins>1</ins> differ by one bit - <ins>0</ins>1 and <ins>1</ins>1 differ by one bit - 1<ins>1</ins> and 1<ins>0</ins> differ by one bit - <ins>1</ins>0 and <ins>0</ins>0 differ by one bit [0,2,3,1] is also a valid gray code sequence, whose binary representation is [00,10,11,01]. - <ins>0</ins>0 and <ins>1</ins>0 differ by one bit - 1<ins>0</ins> and 1<ins>1</ins> differ by one bit - <ins>1</ins>1 and <ins>0</ins>1 differ by one bit - 0<ins>1</ins> and 0<ins>0</ins> differ by one bit

**Example 2:**

**Input:** n = 1

**Output:** [0,1]

**Constraints:**

*   `1 <= n <= 16`