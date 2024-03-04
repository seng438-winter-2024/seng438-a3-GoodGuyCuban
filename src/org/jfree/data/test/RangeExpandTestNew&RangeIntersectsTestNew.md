**Test Plan: RangeExpandTest**

**Objective:** 
The objective of this test plan is to validate the new test methods and the adjustments made to cover missed branches in the RangeExpandTest class.

**Test Cases:**

1. **Test Case 1: expand_MinimalPositiveMargins_ShouldSlightlyExpandRange()**
   - **Description:** Verify that the range expands slightly when minimal positive margins are applied.
   - **Input:** 
     - Original range: [10, 20]
     - Lower margin: 0.001 (0.1%)
     - Upper margin: 0.001 (0.1%)
   - **Expected Output:** 
     - Expanded range lower bound should be approximately 9.99.
     - Expanded range upper bound should be approximately 20.01.
   - **Justification:** 
     - This test ensures that the expanded range is correctly adjusted according to the minimal positive margins, covering the missed branches where the original range's bounds are adjusted.

2. **Test Case 2: expand_LargePositiveMargins_ShouldSignificantlyExpandRange()**
   - **Description:** Verify that the range significantly expands when large positive margins are applied.
   - **Input:** 
     - Original range: [10, 20]
     - Lower margin: 1 (100%)
     - Upper margin: 1 (100%)
   - **Expected Output:** 
     - Expanded range lower bound should be 0.
     - Expanded range upper bound should be 30.
   - **Justification:** 
     - This test ensures that the expanded range is correctly adjusted according to the large positive margins, covering the missed branches where the original range's bounds are adjusted.

**Test Execution:**
- Execute the test cases within the RangeExpandTest class.
- Ensure that assertions are used to validate the correctness of the expanded ranges.
- Review test logs and results to confirm the accuracy of the adjustments made to cover missed branches.
- Verify that the coverage metrics (especially Branches) reflect the improved coverage due to the new test cases.

**Test Plan: RangeIntersectsTestNew**

**Objective:**
The objective of this test plan is to verify the correctness and robustness of the `intersects` method in the `Range` class by testing various scenarios and edge cases.

**Test Cases:**

1. **Test Case 1: intersects_WithFullyInsideRange_ShouldReturnTrue**
   - **Description:** Verify that the method returns true when the specified range is fully inside the test range.
   - **Input:** 
     - Test range: [10, 20]
     - Specified range: [12, 18]
   - **Expected Output:** 
     - Method should return true.
   - **Justification:** 
     - This test ensures that the method correctly identifies when the specified range is fully inside the test range.

2. **Test Case 2: intersects_WithFullyOutsideRange_LowerSide_ShouldReturnFalse**
   - **Description:** Verify that the method returns false when the specified range is fully outside the test range on the lower side.
   - **Input:** 
     - Test range: [10, 20]
     - Specified range: [5, 9]
   - **Expected Output:** 
     - Method should return false.
   - **Justification:** 
     - This test ensures that the method correctly identifies when the specified range is fully outside the test range on the lower side.

3. **Test Case 3: intersects_WithFullyOutsideRange_UpperSide_ShouldReturnFalse**
   - **Description:** Verify that the method returns false when the specified range is fully outside the test range on the upper side.
   - **Input:** 
     - Test range: [10, 20]
     - Specified range: [21, 25]
   - **Expected Output:** 
     - Method should return false.
   - **Justification:** 
     - This test ensures that the method correctly identifies when the specified range is fully outside the test range on the upper side.

4. **Test Case 4: intersects_WithOverlappingRange_LowerBound_ShouldReturnTrue**
   - **Description:** Verify that the method returns true when the specified range overlaps with the lower bound of the test range.
   - **Input:** 
     - Test range: [10, 20]
     - Specified range: [5, 15]
   - **Expected Output:** 
     - Method should return true.
   - **Justification:** 
     - This test ensures that the method correctly identifies when the specified range overlaps with the lower bound of the test range.

5. **Test Case 5: intersects_WithOverlappingRange_UpperBound_ShouldReturnTrue**
   - **Description:** Verify that the method returns true when the specified range overlaps with the upper bound of the test range.
   - **Input:** 
     - Test range: [10, 20]
     - Specified range: [15, 25]
   - **Expected Output:** 
     - Method should return true.
   - **Justification:** 
     - This test ensures that the method correctly identifies when the specified range overlaps with the upper bound of the test range.

6. **Test Case 6: intersects_WithExactMatchRange_ShouldReturnTrue**
   - **Description:** Verify that the method returns true when the specified range exactly matches the test range.
   - **Input:** 
     - Test range: [10, 20]
     - Specified range: [10, 20]
   - **Expected Output:** 
     - Method should return true.
   - **Justification:** 
     - This test ensures that the method correctly identifies when the specified range exactly matches the test range.

7. **Test Case 7: intersects_JustInsideLowerBound_ShouldReturnTrue**
   - **Description:** Verify that the method returns true when the specified range is just inside the lower bound of the test range.
   - **Input:** 
     - Test range: [10, 20]
     - Specified range: [10, 11]
   - **Expected Output:** 
     - Method should return true.
   - **Justification:** 
     - This test ensures that the method correctly identifies when the specified range is just inside the lower bound of the test range.

8. **Test Case 8: intersects_JustInsideUpperBound_ShouldReturnTrue**
   - **Description:** Verify that the method returns true when the specified range is just inside the upper bound of the test range.
   - **Input:** 
     - Test range: [10, 20]
     - Specified range: [19, 20]
   - **Expected Output:** 
     - Method should return true.
   - **Justification:** 
     - This test ensures that the method correctly identifies when the specified range is just inside the upper bound of the test range.

9. **Test Case 9: intersects_JustOutsideLowerBound_ShouldReturnFalse**
   - **Description:** Verify that the method returns false when the specified range is just outside the lower bound of the test range.
   - **Input:** 
     - Test range: [10, 20]
     - Specified range: [9, 10]
   - **Expected Output:** 
     - Method should return false.
   - **Justification:** 
     - This test ensures that the method correctly identifies when the specified range is just outside the lower bound of the test range.

10. **Test Case 10: intersects_JustOutsideUpperBound_ShouldReturnFalse**
   - **Description:** Verify that the method returns false when the specified range is just outside the upper bound of the test range.
   - **Input:** 
     - Test range: [10, 20]
     - Specified range: [20, 21]
   - **Expected Output:** 
     - Method should return false.
   - **Justification:** 
     - This test ensures that the method correctly identifies when the specified range is just outside the upper bound of the test range.

11. **Test Case 11: intersects_IdenticalBounds_ShouldReturnTrue**
   - **Description:** Verify that the method returns true when the lower and upper bounds of the specified range are identical.
   - **Input:** 
     - Test range: [10, 20]
     - Specified range: [10, 10]
   - **Expected Output:** 
     - Method should return true.
   - **Justification:** 
     - This test ensures that the method correctly handles the scenario where both lower and upper bounds of the specified range are identical.

12. **Test Case 12: intersects_InvertedRange_ShouldReturnFalse**
   - **Description:** Verify that the method returns false when the lower bound of the specified range is greater than the upper bound.
   - **Input:** 
     - Test range: [10, 20]
     - Specified range: [20, 10]
   - **Expected Output:** 
     - Method should return false.
   - **Justification:** 
     - This test ensures that the method correctly handles the scenario where the specified range is inverted.

13. **Test Case 13: intersects_NaNBounds_ShouldReturnFalse**
   - **Description:** Verify that the method returns false when the lower and upper bounds of the specified range are NaN (Not a Number).
   - **Input:** 
     - Test range: [10, 20]
     - Specified range: [NaN, NaN]
     - Specified range: [NaN, NaN]
   - **Expected Output:** 
     - Method should return false.
   - **Justification:** 
     - This test ensures that the method correctly handles the scenario where the bounds of the specified range are NaN.

14. **Test Case 14: intersects_PositiveInfinityBounds_ShouldReturnFalse**
   - **Description:** Verify that the method returns false when the lower and upper bounds of the specified range are positive infinity.
   - **Input:** 
     - Test range: [10, 20]
     - Specified range: [Infinity, Infinity]
   - **Expected Output:** 
     - Method should return false.
   - **Justification:** 
     - This test ensures that the method correctly handles the scenario where the bounds of the specified range are positive infinity.

15. **Test Case 15: intersects_NegativeInfinityBounds_ShouldReturnFalse**
   - **Description:** Verify that the method returns false when the lower and upper bounds of the specified range are negative infinity.
   - **Input:** 
     - Test range: [10, 20]
     - Specified range: [-Infinity, -Infinity]
   - **Expected Output:** 
     - Method should return false.
   - **Justification:** 
     - This test ensures that the method correctly handles the scenario where the bounds of the specified range are negative infinity.

**Test Execution:**
- Execute each test case in the `RangeIntersectsTestNew` class.
- Verify that the expected output matches the actual output for each test case.
- Ensure that assertions are used to validate the correctness of the method's behavior.
- Review test logs and results to confirm that all scenarios and edge cases are handled correctly.
- Check the coverage metrics to ensure that the test suite provides comprehensive coverage of the `intersects` method.
