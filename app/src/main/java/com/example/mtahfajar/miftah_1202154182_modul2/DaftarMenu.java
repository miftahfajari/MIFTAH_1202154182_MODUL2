package com.example.mtahfajar.miftah_1202154182_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {
    private RecyclerView recycle;
    private adapter adaptermenu;

    public static ArrayList<model>menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        menuList = menuisi();
        recycle = (RecyclerView)findViewById(R.id.recyclerView);
        adaptermenu = new adapter(menuList);
        recycle.setAdapter(adaptermenu);
        recycle.setLayoutManager(new LinearLayoutManager(this));

    }

    private ArrayList<model> menuisi() {
        ArrayList<model> isi = new ArrayList<>();
        isi.add(new model("Masabi Biasa",10000,R.drawable.menu_mie1,"Mie Ayam hijau dengan ayam dan sayur mayur"));
        isi.add(new model("Masabi Spesial",15000,R.drawable.menu_mie2,"Mie Ayam hijau dengan ayam dan sayur mayur plus pangsit besar"));
        isi.add(new model("Masabi Ceker",12000,R.drawable.menu_mie3,"Mie Ayam hijau dengan ayam dan sayur mayur plus ceker ayam kecap"));
        isi.add(new model("Tahu Bacem",1000,R.drawable.menu_tahu_bacem,"Tahu Yang dimasak dengan cara bacem kecap"));
        isi.add(new model("Tempe Bace,",1000,R.drawable.menu_tempe_bacem,"Tempe Yang Dimasak dengan bacem kecap"));
        return  isi;
    }
}