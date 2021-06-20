package com.example.animeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.Snackbar;

public class ListaFragment extends Fragment{


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_lista,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView img_bkh = getView().findViewById(R.id.img_bkh);

        img_bkh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Funcionou", Snackbar.LENGTH_SHORT).show();
            }
        });

        ImageView img_ds = getView().findViewById(R.id.img_ds);

        img_ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Funcionou", Snackbar.LENGTH_SHORT).show();
            }
        });

        ImageView img_op = getView().findViewById(R.id.img_op);

        img_op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Funcionou", Snackbar.LENGTH_SHORT).show();
            }
        });

        ImageView img_pnl = getView().findViewById(R.id.img_pnl);

        img_pnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Funcionou", Snackbar.LENGTH_SHORT).show();
            }
        });

    };
}
