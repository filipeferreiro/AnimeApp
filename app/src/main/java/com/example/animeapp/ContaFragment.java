package com.example.animeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.Snackbar;

public class ContaFragment extends Fragment {
    public static boolean login_validate = false;

    private EditText email,senha;
    private TextView registrar;

    private String userEmail = "admin@gmail.com";
    private String userPass = "admin123";

    boolean isValid = false;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_conta, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        email = (EditText) getView().findViewById(R.id.email);
        senha = (EditText) getView().findViewById(R.id.senha);
        registrar = (TextView) getView().findViewById(R.id.registre);
        Button botao_entrar = getView().findViewById(R.id.botao_enviar);

        botao_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String editEmail = email.getText().toString();
                String editSenha = senha.getText().toString();
                if(editEmail.isEmpty() || editSenha.isEmpty()){
                    Snackbar.make(v, "Insira o Email e Senha para Login", Snackbar.LENGTH_SHORT).show();
                } else if(editEmail.isEmpty()){
                    Snackbar.make(v, "Insira o Email para Login", Snackbar.LENGTH_SHORT).show();
                } else if(editSenha.isEmpty()){
                    Snackbar.make(v, "Insira a Senha para Login", Snackbar.LENGTH_SHORT).show();
                } else{
                    isValid = validate(editEmail, editSenha);

                    if(!isValid){
                        Snackbar.make(v, "Email ou senha inválidos, tente novamente", Snackbar.LENGTH_SHORT).show();
                    } else{
                        Snackbar.make(v, "Voce entrou mas a página está em construção", Snackbar.LENGTH_SHORT).show();
                    }
                }
            }
        });

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent); //change to registre-se
            }
        });
    }

    private boolean validate(String email, String senha){
        if(email.equals(userEmail) && senha.equals(userPass)){
            return true;
        }
        return false;
    }
}
