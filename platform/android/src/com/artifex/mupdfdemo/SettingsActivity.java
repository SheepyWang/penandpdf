package com.artifex.mupdfdemo;

import android.os.Bundle;
import android.app.Activity;

public class SettingsActivity extends Activity {
    final static String PREF_USE_STYLUS = "pref_use_stylus";
    final static String PREF_SCROLL_VERTICAL = "pref_scroll_vertical";
    final static String PREF_SCROLL_CONTINUOUS = "pref_scroll_continuous";
    final static String PREF_INK_THICKNESS = "pref_ink_thickness";
    final static String PREF_INK_COLOR = "pref_ink_color";
    final static String PREF_HIGHLIGHT_COLOR = "pref_highlight_color";
    final static String PREF_UNDERLINE_COLOR = "pref_underline_color";
    final static String PREF_STRIKEOUT_COLOR = "pref_strikeout_color";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display the fragment as the main content.
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();
    }
}
