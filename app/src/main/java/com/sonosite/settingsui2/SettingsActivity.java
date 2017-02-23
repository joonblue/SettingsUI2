package com.sonosite.settingsui2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class SettingsActivity extends AppCompatActivity {

    public static String Settings_Fragment_Tag = "SETTINGS_MENU";

    private SettingsMenuFragment mSettingsMenuFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.settings_activity);

        FragmentManager fm = getFragmentManager();

        mSettingsMenuFragment = new SettingsMenuFragment();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.SettingsMenuFragment, mSettingsMenuFragment,
                Settings_Fragment_Tag);
        transaction.commit();
    }

    public void onClick(View view) {
        mSettingsMenuFragment.onClick(view);
    }
}
