package org.jfree.data;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.jfree.data.DataUtilitiesCalculateColumnTotalTests;
import org.jfree.data.DataUtilitiesCalculateRowTotalTests;
import org.jfree.data.DataUtilitiesCreateNumberArray2DTest;
import org.jfree.data.DataUtilitiesCreateNumberArrayTest;
import org.jfree.data.DataUtilitiesGetCumulativePercentagesTests;

import org.jfree.data.RangeExpandTest;
import org.jfree.data.RangeGetLengthTest;
import org.jfree.data.RangeGetLowerBoundTest;
import org.jfree.data.RangeGetUpperBoundTest;
import org.jfree.data.RangeIntersectsTest;


import org.junit.Test;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	   	DataUtilitiesCalculateColumnTotalTests.class,
	    DataUtilitiesCalculateRowTotalTests.class,
	    DataUtilitiesCreateNumberArray2DTest.class,
	    DataUtilitiesCreateNumberArrayTest.class,
	    DataUtilitiesGetCumulativePercentagesTests.class,
	    RangeExpandTest.class,
	    RangeGetLengthTest.class,
	    RangeGetLowerBoundTest.class,
	    RangeGetUpperBoundTest.class,
	    RangeIntersectsTest.class
})
public class AllTestsSuite {
    // Placeholder
}