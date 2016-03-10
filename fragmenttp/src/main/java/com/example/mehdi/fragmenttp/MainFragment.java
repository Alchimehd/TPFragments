package com.example.mehdi.fragmenttp;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainFragment extends Fragment {

    CustomAdapter adap;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,null);
        ArrayList<Book> liste = new ArrayList<Book>();
        liste.add(new Book("Livre des morts", "Bercklay James", "Maison verte", "2007", "ceci est un long résumé", R.drawable.ic_agilecovrer, R.drawable.ic_agile));
        liste.add(new Book("Eragon", "Christopher Paolini", "Page bleus", "2017", "This is a very long summary", R.drawable.ic_androidfdcover, R.drawable.ic_androidfd));

        // adap = new ArrayAdapter(this, android.R.layout.simple_list_item_1 , liste);
        adap = new CustomAdapter(getActivity(), liste);
        ListView listView = (ListView) view.findViewById(R.id.listView);
        listView.setAdapter(adap);
        return view;
    }


}
