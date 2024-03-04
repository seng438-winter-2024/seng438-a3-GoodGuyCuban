package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class RangeExpandTestNew {
	
	private Range originalRange;

    @Before
    public void setUp() {
        originalRange = new Range(10, 20);
    }

    @After
    public void tearDown() {
    	originalRange = null;
    }
    
    // ECT: Test expanding a range with valid, positive margins
    @Test
    public void expand_WithValidPositiveMargins_ShouldExpandRangeProperly() {
        double lowerMargin = 0.1; // 10%
        double upperMargin = 0.2; // 20%
        Range expandedRange = Range.expand(originalRange, lowerMargin, upperMargin);
        assertEquals("Expanded range lower bound is incorrect", 9, expandedRange.getLowerBound(), 0.00001);
        assertEquals("Expanded range upper bound is incorrect", 22, expandedRange.getUpperBound(), 0.00001);
    }
    
    // ECT: Test expanding a range with zero margins, should result in no change
    @Test
    public void expand_WithZeroMargins_ShouldNotChangeRange() {
        Range expandedRange = Range.expand(originalRange, 0, 0);
        assertEquals("Range should not change with zero margins", originalRange, expandedRange);
    }
    
    // ECT: Test expanding a range with negative margins, expected to throw an exception
    @Test(expected = IllegalArgumentException.class)
    public void expand_WithNegativeMargins_ShouldThrowError() {
        double lowerMargin = -0.1; // -10%
        double upperMargin = -0.2; // -20%
        Range.expand(originalRange, lowerMargin, upperMargin);
    }
    
 // BVT: Test minimal positive margins for a subtle expansion
    @Test
    public void expand_MinimalPositiveMargins_ShouldSlightlyExpandRange() {
        double lowerMargin = 0.001; // 0.1%
        double upperMargin = 0.001; // 0.1%
        Range expandedRange = Range.expand(originalRange, lowerMargin, upperMargin);
        assertEquals("Expanded range lower bound is incorrect", 10 - 0.001 * 10, expandedRange.getLowerBound(), 0.00001);
        assertEquals("Expanded range upper bound is incorrect", 20 + 0.001 * 10, expandedRange.getUpperBound(), 0.00001);
    }

    // BVT: Test with large positive margins to verify significant expansion
    @Test
    public void expand_LargePositiveMargins_ShouldSignificantlyExpandRange() {
        double lowerMargin = 1; // 100%
        double upperMargin = 1; // 100%
        Range expandedRange = Range.expand(originalRange, lowerMargin, upperMargin);
        assertEquals("Expanded range lower bound is incorrect", 10 - 1 * 10, expandedRange.getLowerBound(), 0.00001);
        assertEquals("Expanded range upper bound is incorrect", 20 + 1 * 10, expandedRange.getUpperBound(), 0.00001);
    }

    // ECT: Test expanding a range with one margin as zero and another margin as non-zero
    @Test
    public void expand_OneMarginZeroAndOneMarginNonZero_ShouldExpandRange() {
        double lowerMargin = 0; // 0%
        double upperMargin = 0.2; // 20%
        Range expandedRange = Range.expand(originalRange, lowerMargin, upperMargin);
        assertEquals("Expanded range lower bound is incorrect", 10, expandedRange.getLowerBound(), 0.00001);
        assertEquals("Expanded range upper bound is incorrect", 24, expandedRange.getUpperBound(), 0.00001);
    }

    // ECT: Test expanding a range with both margins as zero, should result in no change
    @Test
    public void expand_BothMarginsZero_ShouldNotChangeRange() {
        Range expandedRange = Range.expand(originalRange, 0, 0);
        assertEquals("Range should not change with both margins zero", originalRange, expandedRange);
    }
}
