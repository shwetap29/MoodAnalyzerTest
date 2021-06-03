package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain();
        String mood = moodAnalyzer.analyseMood("I am In Any Mood");
        Assert.assertEquals("HAPPY", mood);

    }

}
