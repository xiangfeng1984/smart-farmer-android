package com.beanu.l4_bottom_tab.ui.moudle4;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.beanu.arad.base.BaseFragment;
import com.beanu.l4_bottom_tab.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends BaseFragment {


    public MyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my, container, false);
    }

}
