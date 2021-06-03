package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class MoodAnalyzerTest {
    //Test case for Sad mood
    @Test
    public void given_NullMood_Should_Throw_MoodAnalysisException() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain(null);
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.Exception_Type.NULL,e.type);
        }
    }
}