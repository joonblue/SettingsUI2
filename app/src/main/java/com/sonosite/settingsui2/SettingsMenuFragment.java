package com.sonosite.settingsui2;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;

public class SettingsMenuFragment extends Fragment {

    public SettingsMenuFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.settings_menu_fragment, container, false);
        setIconAttributes(v, R.id.widget_UIS251_PreferencesBtn,
                R.drawable.settings,
                getActivity().getString(R.string.Preferences_Btn));
        setIconAttributes(v, R.id.widget_UIS252_CalculationsBtn,
                R.drawable.ob_calcs_icon,
                getActivity().getString(R.string.Calculations_Btn));
        setIconAttributes(v, R.id.widget_UIS254_LabelsBtn,
                R.drawable.labels_icon,
                getActivity().getString(R.string.Labels_Btn));
        setIconAttributes(v, R.id.widget_UIS256_DicomBtn,
                R.drawable.dicom_icon,
                getActivity().getString(R.string.Dicom_Btn));
        setIconAttributes(v, R.id.widget_UIS257_PatientBtn,
                R.drawable.patient_search_icon,
                getActivity().getString(R.string.Patient_Btn));
        setIconAttributes(v, R.id.widget_UIS258_EMRBtn, R.drawable.emr_icon,
                getActivity().getString(R.string.EMR_Btn));

        ImageView ivHeader =
                (ImageView) v
                        .findViewById(R.id.imageView_UIS30x_SettingsHeader_Back);
        ivHeader.setImageResource(R.drawable.settings_small);
        ivHeader.setVisibility(View.VISIBLE);

        TextView tvHeader =
                (TextView) v.findViewById(R.id.textView_Settings_Header);
        tvHeader.setText(getActivity().getString(R.string.Settings));

        return v;
    }

    public void setIconAttributes(View v, int iWidgetRes, int iIconRes,
                                  String sName) {
        TableLayout tlIcon = (TableLayout) v.findViewById(iWidgetRes);
        TextView tvName =
                (TextView) tlIcon.findViewById(R.id.textView_UIS309_Name);
        tvName.setText(sName);
        ImageView ivIcon =
                (ImageView) tlIcon.findViewById(R.id.imageView_UIS309_Icon);
        ivIcon.setImageResource(iIconRes);
    }


}