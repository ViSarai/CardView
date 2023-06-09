package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerView);

        // definir layout
            LinearLayoutManager layoutManager  = new LinearLayoutManager(this);
            layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
            recyclerPostagem.setLayoutManager( layoutManager );

        // definir adapter
        this.prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter( postagens);
        recyclerPostagem.setAdapter( adapter);

    }


    public void prepararPostagens(){

        Postagem p = new Postagem("Vinicius Sarai","#tbt viagem legal!",   R.drawable.imagem1);
        this.postagens.add(p);

         p = new Postagem("Vinicius Sarai","simplesmente perfeito",R.drawable.imagem2);
        this.postagens.add(p);

         p = new Postagem("Vinicius Sarai","I LOVE THIS CITY",   R.drawable.imagem3);
        this.postagens.add(p);

       p = new Postagem("Vinicius Sarai","#tbt mais uma pra conta !!!",   R.drawable.imagem4);
        this.postagens.add(p);


    }

}