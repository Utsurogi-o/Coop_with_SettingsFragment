package com.example.mypreferences.ui.settings

import android.os.Bundle
import android.util.Log
import androidx.preference.EditTextPreference
import androidx.preference.PreferenceFragmentCompat
import com.example.mypreferences.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)

        findPreference<EditTextPreference>("signature")
            ?.setOnPreferenceChangeListener { prefs, newValue ->
                Log.d("Preferences", "signature was changed:: $newValue")
                true
            }
    }
}