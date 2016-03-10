package com.example.mehdi.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    CustomAdapter adap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Book> liste = new ArrayList<Book>();
        liste.add(new Book("Livre des morts", "Bercklay James", "Maison verte", "2007", "ceci est un long résumé", R.drawable.ic_agilecovrer, R.drawable.ic_agile));
        liste.add(new Book("Eragon", "Christopher Paolini", "Page bleus", "2017", "This is a very long summary", R.drawable.ic_androidfdcover, R.drawable.ic_androidfd));

        // adap = new ArrayAdapter(this, android.R.layout.simple_list_item_1 , liste);
        adap = new CustomAdapter(this, liste);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adap);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Book bk = (Book) (adap.getItem(position));
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                intent.putExtra("Book", bk);
                startActivity(intent);
                //Toast.makeText(getApplicationContext(),text, Toast.LENGTH_LONG).show();
            }
        });
    }
}
