package com.bridgelabz;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class MoodAnalyzerTest {
    //Test case for Sad mood
    @Test
    public void given_SadMood_Should_Return_SAD() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain("I am In Sad Mood");
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            assertSame("SAD", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
    //Constructor in message should return Happy

    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain("I am in Happy Mood");
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            assertSame("HAPPY", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
}