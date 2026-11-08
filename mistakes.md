# My DSA Mistakes Diary

A record of the mistakes I make while solving DSA problems and the concepts I learn from them.

My goal is to understand my mistakes, improve my problem-solving skills, and avoid repeating the same mistakes.

## Day 1 – November 7, 2026

**Problem: Find Maximum Element in Array**

1. What was my mistake?
- Didn't handle an empty array.
- Forgot to check for `null`.
- Accessing `arr.length` when the array is `null` causes `NullPointerException`.
2. Correct Approach
```java
if (arr == null || arr.length == 0) {
    throw new IllegalArgumentException("Array cannot be null or empty");
}
```

3. What did I learn?
- Check `arr == null` first.
- Then check `arr.length == 0`.
- Handle edge cases before writing the main logic.

4. Important Concepts I Understood
1. **Methods:** Write logic inside separate methods for reusable and organised code.
2. **Two Pointers:** Use two variables to store array indices (`left` and `right`).
3. **HashMap:** Used for frequency counting (element → frequency).
4. **HashSet:** Used to check whether elements exist and detect duplicates.
5. **int vs Integer:** HashMap uses `Integer` because it works with objects, not primitive types. Java automatically converts between them.

### 5. Revision
- Revise Find Maximum Element in Array.
- Write the code independently without looking at the solution.

  -----------------------------------------------------------------------

  ## Day 2 - Nov 8, 2026

**Problem:**

### 1. What was my mistake?

-

### 2. What did I do wrong?

-

### 3. Correct approach

-

### 4. What did I learn?

-
-

### 5. Important concepts I understood

1.
2.
3.

### 6. Revision

- Revise the problem.
- Try solving it again without looking at the solution.
- Practise a similar problem.

### 7. Key takeaway

-


