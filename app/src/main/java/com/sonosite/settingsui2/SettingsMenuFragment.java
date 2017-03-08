package com.sonosite.settingsui2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class SettingsMenuFragment extends Fragment {
    @BindView(R.id.imageView_SettingsHeader_Back)
    ImageView ivHeader;
    @BindView(R.id.textView_Settings_Header)
    TextView tvHeader;

    private Unbinder unbinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.settings_menu_fragment, container, false);
        unbinder = ButterKnife.bind(this, v);

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

        ivHeader.setImageResource(R.drawable.settings_small);
        ivHeader.setVisibility(View.VISIBLE);

        tvHeader.setText(getActivity().getString(R.string.Settings));

        return v;
    }

    public void setIconAttributes(View v, int iWidgetRes, int iIconRes,
                                  String sName) {
        TableLayout tlIcon = (TableLayout) v.findViewById(iWidgetRes);
        TextView tvName =
                (TextView) tlIcon.findViewById(R.id.textView_Name);
        tvName.setText(sName);
        ImageView ivIcon =
                (ImageView) tlIcon.findViewById(R.id.imageView_Icon);
        ivIcon.setImageResource(iIconRes);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onStart() {
        super.onStart();

    }

    @OnClick({R.id.widget_PreferencesBtn, R.id.widget_CalculationsBtn, R.id.widget_LabelsBtn,
            R.id.widget_DicomBtn, R.id.widget_PatientBtn, R.id.widget_EMRBtn})
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.widget_PreferencesBtn:
                Toast.makeText(getActivity(), "Preferences", Toast.LENGTH_LONG).show();
                break;
            case R.id.widget_CalculationsBtn:
                Toast.makeText(getActivity(), "Calculation", Toast.LENGTH_LONG).show();
                break;
            default:
                Toast.makeText(getActivity(), "Others", Toast.LENGTH_LONG).show();
                break;
        }
    }
}