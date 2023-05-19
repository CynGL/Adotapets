package br.com.eteica.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    MaterialCardView idMenuPets, idMenuProdutos, idMenuDoacoes, idMenuServicos, idMenuLocalizacao, idMenuParceiros;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        idMenuPets = findViewById(R.id.idMenuPets);
        idMenuProdutos = findViewById(R.id.idMenuProdutos);
        idMenuDoacoes = findViewById(R.id.idDoacoes);
        idMenuServicos = findViewById(R.id.idMenuServicos);
        idMenuLocalizacao = findViewById(R.id.idMenuLocalizacao);
        idMenuParceiros = findViewById(R.id.idMenuParceiros);


    }

    @Override
    public void onClick(View v) {

    }
}