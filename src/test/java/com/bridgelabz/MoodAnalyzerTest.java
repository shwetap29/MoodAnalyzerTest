package com.bridgelabz;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class MoodAnalyzerTest {
    //Test case for Sad mood
    @Test
    public void given_SadMood_Should_Return_SAD() {
        MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain("I am In Sad Mood");
        String mood = moodAnalyzer.analyseMood();
        assertSame("SAD", mood);

    }
}