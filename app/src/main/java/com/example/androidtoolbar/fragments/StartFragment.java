package com.example.androidtoolbar.fragments;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import com.example.androidtoolbar.MainActivity;
import com.example.androidtoolbar.R;

public class StartFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Меняем заголовки toolbar
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Главная");
        ((MainActivity) getActivity()).getSupportActionBar().setSubtitle("Стартовая страница страница страница страница страница");
        return inflater.inflate(R.layout.fragment_start, container, false);
    }
}