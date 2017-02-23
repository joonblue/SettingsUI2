package com.sonosite.settingsui2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SettingsActivity extends AppCompatActivity {

    public static String Settings_Fragment_Tag = "SETTINGS_MENU";

    private SettingsMenuFragment mSettingsMenuFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);

        FragmentManager fm = getFragmentManager();

        mSettingsMenuFragment = new SettingsMenuFragment();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.SettingsMenuFragment, mSettingsMenuFragment,
                Settings_Fragment_Tag);
        transaction.addToBackStack("Settings");
        transaction.commit();
    }
}
