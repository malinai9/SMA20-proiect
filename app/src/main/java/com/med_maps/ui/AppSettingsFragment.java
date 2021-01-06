package com.med_maps.ui;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

import com.med_maps.R;


public class AppSettingsFragment extends PreferenceFragmentCompat {


    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.pref_general);

    }
}
