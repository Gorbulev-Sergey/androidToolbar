package com.example.androidtoolbar.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.PreferenceFragmentCompat;

import com.example.androidtoolbar.MainActivity;
import com.example.androidtoolbar.R;

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // Меняем заголовки toolbar
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Настройки");
        ((MainActivity) getActivity()).getSupportActionBar().setSubtitle("Страница настроек");
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}