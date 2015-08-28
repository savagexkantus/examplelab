package edu.carrollcc.cis232;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;


import static com.jcabi.matchers.RegexMatchers.matchesPattern;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


/**
 * Unit test for simple App.
 */
public class AppTest 
{


    @Rule
    public final TextFromStandardInputStream systemInMock= emptyStandardInputStream();

    @Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    
    @Test
    public void testNameEntryDisplayed()
    {
    	String name = "bill";
        systemInMock.provideText(name);
    	App.main(null);
    	String output = systemOutRule.getLogWithNormalizedLineSeparator();
        assertThat(output, matchesPattern(String.format("(?smiu).*hello\\s+%s!?.$", name)));
    }
    
}
