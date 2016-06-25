package jb.dev.databindingdemo.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import jb.dev.databindingdemo.R;
import jb.dev.databindingdemo.databinding.FragmentSimpleBindingBinding;
import jb.dev.databindingdemo.model.SimpleBindingUser;


public class SimpleBindingFragment extends Fragment {

    SimpleBindingUser user;

    public static SimpleBindingFragment newInstance() {
        return new SimpleBindingFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentSimpleBindingBinding binding = DataBindingUtil
                .inflate(inflater, R.layout.fragment_simple_binding, container, false);

        user = new SimpleBindingUser();
        user.setFirstName(getString(R.string.app_name));
        binding.setUser(user);

        return binding.getRoot();
    }
}
