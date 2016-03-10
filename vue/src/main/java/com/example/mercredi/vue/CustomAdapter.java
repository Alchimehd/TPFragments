package com.example.mercredi.vue;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mercredi on 25/02/2016.
 */
public class CustomAdapter extends BaseAdapter {
    Context context;
    List<Book> bookList;

    public CustomAdapter(Context context, List<Book> bookList) {
        this.context = context;
        this.bookList = bookList;
    }

    @Override
    public int getCount() {
        return bookList.size();
    }

    @Override
    public Object getItem(int position) {
        return bookList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = parent.inflate(context,R.layout.list_item,null);

        TextView tv = (TextView) convertView.findViewById(R.id.textView);
        ImageView iv = (ImageView) convertView.findViewById(R.id.imageView);

        tv.setText(bookList.get(position).getTitle());
        iv.setImageResource(bookList.get(position).getCover());

        return convertView;
    }
}
