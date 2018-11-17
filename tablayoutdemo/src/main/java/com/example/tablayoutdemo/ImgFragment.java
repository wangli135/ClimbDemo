package com.example.tablayoutdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class ImgFragment extends Fragment {

    public static ImgFragment newInstance(int img) {
        ImgFragment imgFragment=new ImgFragment();
        Bundle bundle=new Bundle();
        bundle.putInt("img_id",img);
        imgFragment.setArguments(bundle);
        return imgFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_img, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView imageView=view.findViewById(R.id.iv_img);
        int imgResId=getArguments().getInt("img_id");
        imageView.setImageResource(imgResId);
    }
}
