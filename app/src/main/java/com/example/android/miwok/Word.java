package com.example.android.miwok;

/**
 * Created by Jonas on 10.03.2018.
 */

public class Word {

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    /**
     * Default picture for the word
     */
    private Integer mImageResourceId;


    /**
     * Default audio for the word
     */
    private Integer mAudioResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, Integer audioId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioId;
    }

    public Word(String defaultTranslation, String miwokTranslation, Integer resourceId, Integer audioId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = resourceId;
        mAudioResourceId = audioId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the resourceIC translation of the word.
     */
    public Integer getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the default audio of the word.
     */
    public Integer getDefaultAudio() {
        return mAudioResourceId;
    }


}





