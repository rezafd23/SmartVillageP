package com.example.rezafd.smartvillagep;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.rengwuxian.materialedittext.MaterialEditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FPanic extends Fragment {

    ImageView panicbutton;
    MaterialEditText txtbutuh;

    public FPanic() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fpanic, container, false);
        panicbutton=(ImageView)view.findViewById(R.id.panicbutton);
        txtbutuh=(MaterialEditText)view.findViewById(R.id.txtbutuh);

        panicbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),PanicLocation.class);
                startActivity(intent);

            }
        });
        return view;
    }

}
