package com.example.mehdi.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        Book bk =(Book) (intent.getSerializableExtra("Book"));
        TextView titre = (TextView) (findViewById(R.id.title1));
        titre.setText(bk.getTitle());
        TextView authors = (TextView) (findViewById(R.id.authors1));
        authors.setText(bk.getAuthors());
        TextView editor= (TextView) (findViewById(R.id.editors1));
        editor.setText(bk.getEditor());
        TextView summary= (TextView) (findViewById(R.id.summary));
        summary.setText(bk.getSummary());
        TextView year= (TextView) (findViewById(R.id.year));
        year.setText(bk.getYear());
        ImageView cover = (ImageView) (findViewById(R.id.imageView));
        cover.setImageResource(bk.getCover());
    }
}
