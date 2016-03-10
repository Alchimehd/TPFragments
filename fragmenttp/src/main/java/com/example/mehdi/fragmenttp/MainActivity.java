package com.example.mehdi.fragmenttp;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    CustomAdapter adap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Book> liste = new ArrayList<Book>();
        liste.add(new Book("Livre des morts", "Bercklay James", "Maison verte", "2007", "ceci est un long résumé", R.drawable.ic_agilecovrer, R.drawable.ic_agile));
        liste.add(new Book("Eragon", "Christopher Paolini", "Page bleus", "2017", "This is a very long summary", R.drawable.ic_androidfdcover, R.drawable.ic_androidfd));


        listView = (ListView)findViewById(R.id.listView);
        adap = (CustomAdapter) listView.getAdapter();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Book bk = (Book) (adap.getItem(position));
                showDetail(bk);
                //Toast.makeText(getApplicationContext(),text, Toast.LENGTH_LONG).show();
            }
        });
    }

    public boolean isTwoPane() {
        View view = findViewById(R.id.frameLayout);
        return (view != null);
    }

    public void showDetail(Book bk) {
        if (isTwoPane()) {
            DetailFragment detailFragment = new DetailFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("bk", bk);
            detailFragment.setArguments(bundle);
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.frameLayout,detailFragment);
            ft.commit();

        }
        else {
            Intent intent = new Intent(this,DetailActivity.class);
            intent.putExtra("bk",bk);
            startActivity(intent);
        }

    }
}
