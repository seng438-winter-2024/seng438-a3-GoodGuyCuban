package org.jfree.data.test;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RangeGetUpperBoundTestNew {
	
	/**
	 * So for tests we need:
	 *  - equal values
	 *  - unequal values
	 *  	- positive
	 *  	- negative
	 *  	- mixed
	 *  - null pointer
	 *  - max values
	 *  - infinity values
	 *  - NaN values
	 *  - invalid valaues
	 */
    
    
    // Equal value (ie no range) testing
	
	// BVT: Tests a range with both bounds being zero.
	@Test
	public void testGetUpperBound_WithZeroBounds_ReturnsCorrectValue() {
		Range range = new Range(0.0, 0.0);
		assertEquals("Upper bound is incorrect", 0.0, range.getUpperBound(), 0.00001);
	}
	
	// ECT: Tests a range with both bounds being positive and equal.
	@Test
	public void testGetUpperBound_WithNoRangePositive_ReturnsCorrectValue() {
		Range range = new Range(70.0, 70.0);
		assertEquals("Upper bound is incorrect", 70.0, range.getUpperBound(), 0.00001);
	}
	
	// ECT: Tests a range with both bounds being negative and equal.
	@Test
	public void testGetUpperBound_WithNoRangeNegative_ReturnsCorrectValue() {
		Range range = new Range(-30.2, -30.2);
		assertEquals("Upper bound is incorrect", -30.2, range.getUpperBound(), 0.00001);
	}
    
    // Normal range testing
	
	// ECT: Tests a range with positive values.
	@Test
	public void testGetUpperBound_WithPositiveRange_ReturnsCorrectValue() {
		Range range = new Range(2.0, 30.0);
		assertEquals("Upper bound is incorrect", 30.0, range.getUpperBound(), 0.00001);
	}
	
	// ECT: tests the equivalence class of ranges with negative values.
	@Test
	public void testGetUpperBound_WithNegativeRange_ReturnsCorrectValue() {
		Range range = new Range(-7.0, -3.2);
		assertEquals("Upper bound is incorrect", -3.2, range.getUpperBound(), 0.00001);
	}
	
	// ECT: tests the equivalence class of ranges with mixed positive and negative values.
	@Test
	public void testGetUpperBound_WithMixedRange_ReturnsCorrectValue() {
		Range range = new Range(-30.2, 14.0);
		assertEquals("Upper bound is incorrect", 14.0, range.getUpperBound(), 0.00001);
	}
    
    
    // Max value testing
    
	// BVT: tests the boundary where the upper bound is the maximum value.
    @Test
    public void testGetUpperBound_WithMaxValue_ReturnsMaxValue() {
        Range range = new Range(3.0, Double.MAX_VALUE);
        assertEquals("Upper bound is incorrect", Double.MAX_VALUE, range.getUpperBound(), 0.00001);
    }
    
    // BVT: tests the boundary where the lower bound is the maximum negative value.
    @Test
    public void testGetUpperBound_WithMaxNegativeValue_ReturnsCorrectValue() {
        Range range = new Range(-Double.MAX_VALUE, 10.0);
        assertEquals("Upper bound is incorrect", 10.0, range.getUpperBound(), 0.00001);
    }
    
    // ECT: tests the equivalence class of ranges where both bounds are maximum values.
    @Test
    public void testGetUpperBound_WithMaxRange_ReturnsMaxValue() {
    	Range range = new Range(-Double.MAX_VALUE, Double.MAX_VALUE);
    	assertEquals("Upper bound is incorrect", Double.MAX_VALUE, range.getUpperBound(), 0.00001);
    }
    
    // Infinity value testing
    
    // BVT: tests the boundary where the upper bound is positive infinity.
    @Test
    public void testGetUpperBound_WithPositiveInfinity_ReturnsPositiveInfinity() {
        Range range = new Range(3.0, Double.POSITIVE_INFINITY);
        assertEquals("Upper bound is not positive infinity", Double.POSITIVE_INFINITY, range.getUpperBound(), 0.00001);
    }
    
    // ECT: tests the equivalence class of ranges where the lower bound is negative infinity.
    @Test
    public void testGetUpperBound_WithNegativeInfinity_ReturnsNegativeInfinity() {
        Range range = new Range(Double.NEGATIVE_INFINITY, 10.0);
        assertEquals("Upper bound is incorrect", 10.0, range.getUpperBound(), 0.00001);
    }
    
    // ECT: tests the equivalence class of ranges where both bounds are infinity.
    @Test
    public void testGetUpperBound_WithInfiniteRange_ReturnsPositiveInfinity() {
    	Range range = new Range(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    	assertEquals("Upper bound is not positive infinity", Double.POSITIVE_INFINITY, range.getUpperBound(), 0.00001);
    }
    
    // Nan value testing

    // BVT: tests the boundary where the lower bound is NaN.
    @Test
    public void testGetUpperBound_NaNLowerBound_ReturnsCorrectValue() {
        Range range = new Range(Double.NaN, 10.0);
        assertEquals("Upper bound is incorrect", 10.0, range.getUpperBound(), 0.00001);
    }
    
    // BVT: tests the boundary where the upper bound is NaN.
    @Test
    public void testGetUpperBound_NaNUpperBound_ReturnsNaN() {
    	Range range = new Range(5.0, Double.NaN);
    	assertTrue("Upper bound is not NaN", Double.isNaN(range.getUpperBound()));
    }
    
    // ECT: tests the equivalence class of ranges where both bounds are NaN.
    @Test
    public void testGetUpperBound_NaNRange_ReturnsNaN() {
    	Range range = new Range(Double.NaN, Double.NaN);
    	assertTrue("Upper bound is not NaN", Double.isNaN(range.getUpperBound()));
    }
    




}
