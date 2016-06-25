package jb.dev.databindingdemo.fragments;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import jb.dev.databindingdemo.R;
import jb.dev.databindingdemo.databinding.FragmentSimpleColorBindingBinding;
import jb.dev.databindingdemo.model.SimpleColorBindingUser;


public class SimpleColorBindingFragment extends Fragment {

    SimpleColorBindingUser user;

    public static SimpleColorBindingFragment newInstance() {
        return new SimpleColorBindingFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentSimpleColorBindingBinding binding = DataBindingUtil
                .inflate(inflater, R.layout.fragment_simple_color_binding, container, false);

        user = new SimpleColorBindingUser();
        user.setFirstName(getString(R.string.app_name));
        user.setColor(Color.parseColor("#224488"));
        binding.setUser(user);

        return binding.getRoot();
    }
}
