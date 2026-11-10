# My DSA Mistakes Diary

A record of the mistakes I make while solving DSA problems and the concepts I learn from them.

My goal is to understand my mistakes, improve my problem-solving skills, and avoid repeating the same mistakes.

## Day 1 - Nov 7, 2026: Find Max, Two Sum, Contains Duplicate

**Mistakes**
- Didn't handle an empty or `null` array in `findMax`.
- Created two folders (`Leetcode` and another) by typing the name differently.
- File name had a space and a typo (`brute foce`).
- Skipped the brute force and went straight to the HashMap.

**Fix**
```java
if (arr == null || arr.length == 0) {
    throw new IllegalArgumentException("Array cannot be null or empty");
}
```

**Learned**
- Check `arr == null` first, then `arr.length`. Handle edge cases before the main logic.
- Put logic in separate methods.
- Two pointers: `left` and `right` indices.
- HashMap = element → count. HashSet = check if seen.
- HashMap uses `Integer`, not `int`. Java converts automatically.
- Two Sum: check the map first, then `put`.
- Same folder name every time, no spaces in file names.

**Revise:** write `findMax` and Two Sum again from scratch.


  -----------------------------------------------------------------------

## Day 2 - Nov 8, 2026: LeetCode 125 Valid Palindrome

**Mistakes**
- Forgot `left < right` in loop conditions.
- Wrong parentheses when comparing characters.
- Wrote `character` instead of `Character`.

**Learned**
- Last index: `s.length() - 1` for strings, `arr.length - 1` for arrays.
- `Character.isLetterOrDigit()` skips spaces and symbols.
- `Character.toLowerCase()` ignores capitals.

**Revise:** re-solve Valid Palindrome on my own, and again after one week (Nov 15).

**Takeaway:** understand the conditions, don't memorise the code.

--------------------------------------------------------------------------
## Day 3 - Nov 9, 2026: Prefix Sum, LeetCode 1480 Running Sum

**Confusion / mistakes**
- Mixed up the LeetCode version and the normal version with `main`.
- Added up the wrong positions when checking a range sum by hand (included position 0 by mistake).

**Learned**
- Java only forces file name = class name when the class is `public`. I still match them in my own programs.
- Prefix sum: sum from `l` to `r` = `prefix[r] - prefix[l - 1]`. If `l` is 0, it is just `prefix[r]`.
- A running `sum` variable is simpler than `prefix[i - 1]`, and handles an empty array without a crash.

**Revise:** write Running Sum again from scratch, once with `main` and once in LeetCode style.
------------------------------------------------------------------------------

## Day 4 - Nov 10, 2026: Range Sum, LeetCode 303 (OOP), ArrayList/HashSet

**Confusion / mistakes**
- Was confused about OOP in LeetCode 303: why there is a class, a constructor and no `main`.
- was confused tht leetcode accepted both versions with and without main

**OOP in LeetCode 303 (NumArray)**
- Class = blueprint. LeetCode creates the object with `new NumArray(nums)`.
- In the constructor, write `prefix = new int[...]`. With `int[]` in front it becomes a local variable that disappears, and `sumRange` sees nothing.
- `sumRange` has no loop. It is one `if` and one subtraction.
- LeetCode needs only the class. `main` is for my own file, to test it.

**Learned**
- HashSet `contains` is O(1). ArrayList `contains` is O(n), because it scans.
- ArrayList keeps duplicates and order. HashSet removes duplicates.

**Revise:** write LeetCode 303 again from scratch, then once more with `main`.

------------------------------------------------------------------------------

# Rules to remember (read before every session)

1. Two Sum: check the map first, then `put`.
2. Check `null` first, then `length`. Test empty input.
3. Folder and file names: no spaces, no typos, same capitals every time. The file name matches the class name.
4. Code goes in `.java` files. `mistakes.md` is for lessons only.
5. Skip loops use `while`, not `if`, and keep `left < right`.
6. Class names start with a capital, method names with a lowercase letter.
7. String: `s.length()`. Array: `arr.length` (arrays have no parentheses).
8. File name matches the class name for my own programs. LeetCode files are named after the problem, and the class stays Solution.
