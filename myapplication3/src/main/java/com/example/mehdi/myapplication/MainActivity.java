package com.example.mehdi.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openPage(View view)
    {
        Intent intent = new Intent(this, Main2Activity.class);
        /*Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
        //intent.setData(Uri.parse("hangouts:02132323232"));
        //intent.setPackage(com.android.phone);
        intent.putExtra(AlarmClock.EXTRA_MESSAGE, "Réveil");
        intent.putExtra(AlarmClock.EXTRA_HOUR, 14);
        intent.putExtra(AlarmClock.EXTRA_MINUTES, 22);*/
        Book bk = new Book();
        bk.setAuthor("Moi meme ellah ybarek");
        bk.setAuthor("L'histoire de ma modestie");
        intent.putExtra("book", bk);
        startActivity(intent);
    }
}
