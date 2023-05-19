package br.com.eteica.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        idMenuPets.setOnClickListener(this);
        idMenuProdutos.setOnClickListener(this);
        idMenuDoacoes.setOnClickListener(this);
        idMenuServicos.setOnClickListener(this);
        idMenuLocalizacao.setOnClickListener(this);
        idMenuParceiros.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case R.id.idMenuPets:
                    startActivity(new Intent(getApplicationContext(),
                            PetsActivity.class));
                    break;
                case R.id.idMenuProdutos:
                    startActivity(new Intent(getApplicationContext(),
                            ProdutosActivity.class));
                    break;
                case R.id.idDoacoes:
                    startActivity(new Intent(getApplicationContext(),
                            DoacoesActivity.class));
                    break;
                case R.id.idMenuServicos:
                    startActivity(new Intent(getApplicationContext(),
                            ServicosActivity.class));
                    break;
                case R.id.idMenuLocalizacao:
                    startActivity(new Intent(getApplicationContext(),
                            LocalizarActivity.class));
                    break;
                case R.id.idMenuParceiros:
                    startActivity(new Intent(getApplicationContext(),
                            ParceirosActivity.class));
                    break;
            }
    }
}