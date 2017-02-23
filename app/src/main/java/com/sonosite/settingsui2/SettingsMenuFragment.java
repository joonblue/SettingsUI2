package com.sonosite.settingsui2;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SettingsMenuFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.settings_menu_fragment, container, false);
        setIconAttributes(v, R.id.widget_PreferencesBtn,
                R.drawable.settings,
                getActivity().getString(R.string.Preferences_Btn));
        setIconAttributes(v, R.id.widget_CalculationsBtn,
                R.drawable.ob_calcs_icon,
                getActivity().getString(R.string.Calculations_Btn));
        setIconAttributes(v, R.id.widget_LabelsBtn,
                R.drawable.labels_icon,
                getActivity().getString(R.string.Labels_Btn));
        setIconAttributes(v, R.id.widget_DicomBtn,
                R.drawable.dicom_icon,
                getActivity().getString(R.string.Dicom_Btn));
        setIconAttributes(v, R.id.widget_PatientBtn,
                R.drawable.patient_search_icon,
                getActivity().getString(R.string.Patient_Btn));
        setIconAttributes(v, R.id.widget_EMRBtn,
                R.drawable.emr_icon,
                getActivity().getString(R.string.EMR_Btn));

        ImageView ivHeader = (ImageView) v.findViewById(R.id.imageView_SettingsHeader_Back);
        ivHeader.setImageResource(R.drawable.settings_small);
        ivHeader.setVisibility(View.VISIBLE);

        TextView tvHeader = (TextView) v.findViewById(R.id.textView_Settings_Header);
        tvHeader.setText(getActivity().getString(R.string.Settings));

        TableLayout widgetPrefrenceBtn = (TableLayout) v.findViewById(R.id.widget_PreferencesBtn);

        widgetPrefrenceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Preferences", Toast.LENGTH_LONG).show();
            }
        });
        return v;
    }

    @Override
    public void onStart() {
        super.onStart();

    }

    public void setIconAttributes(View v, int iWidgetRes, int iIconRes, String sName) {

        TableLayout tlIcon = (TableLayout) v.findViewById(iWidgetRes);
        TextView tvName = (TextView) tlIcon.findViewById(R.id.textView_Name);
        tvName.setText(sName);
        ImageView ivIcon = (ImageView) tlIcon.findViewById(R.id.imageView_Icon);
        ivIcon.setImageResource(iIconRes);
    }
}