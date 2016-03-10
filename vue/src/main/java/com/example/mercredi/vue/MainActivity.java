package com.example.mercredi.vue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView a = (ListView) findViewById(R.id.listView);
        List<Book> bookList = new ArrayList<>();
        Book book = new Book("Book1",R.drawable.ic_sqlpc);
        bookList.add(book);

        book = new Book("Book2",R.drawable.ic_sqlpc);
        bookList.add(book);

        book = new Book("Book3",R.drawable.ic_sqlpc);
        bookList.add(book);

        CustomAdapter ca = new CustomAdapter(this,bookList);
        a.setAdapter(ca);

        //AutoCompleteTextView a = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        /*String[] tab = {"So we walk alone.","No more let life divide what death can bring together",
                "Never underestimate the power of a queen with lovely hair, my dear.",
        "To conquer death is an ennobled calling.","When our day has come you will know terror.",
        "When men become mad, they quite lose their dignity.",
        "Our little God has brought forth not angels but demons."};
        //ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,tab);
        aa = new ArrayAdapter(this, android.R.layout.simple_list_item_1,tab);
        a.setAdapter(aa);
        a.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = aa.getItem(position).toString();
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
            }
        });
        EditText et = (EditText)findViewById(R.id.editText);
        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                aa.getFilter().filter(s);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });*/
    }

    /*public void afficher(View v){
        Toast.makeText(this,"Hiiiiiiiiiiiiiiiiiiiiiiiii! Kill yourself!!!",Toast.LENGTH_LONG).show();
    }*/
    /*public void afficher(View v){
        CheckBox c = (CheckBox)v;
        if(c.isChecked()){
            Toast.makeText(this,"We have claws for a reason",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"No more let life divide what death can bring together",Toast.LENGTH_LONG).show();
        }

    }*/

}
