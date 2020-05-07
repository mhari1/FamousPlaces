package com.example.famousplaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class ViewPlace extends AppCompatActivity {

    ImageView pImage;
    TextView pName, pDesc;
    Button mapBtn;
    Double lat, longt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_place);

        pImage  = (ImageView) findViewById(R.id.pImage);
        pName   = (TextView) findViewById(R.id.pName);
        pDesc   = (TextView) findViewById(R.id.pDesc);
        mapBtn  = (Button) findViewById(R.id.viewMap);

        Intent intent = getIntent();
        int intvalue  = intent.getIntExtra("place",0);

        pImage.setImageResource( MainActivity.show_places.get(intvalue).getPlaceImage());
        pName.setText(MainActivity.show_places.get(intvalue).getPlaceName());
        pDesc.setText(MainActivity.show_places.get(intvalue).getPlaceDesc());

        lat   = MainActivity.show_places.get(intvalue).getPlaceLat();
        longt = MainActivity.show_places.get(intvalue).getPlaceLong();
        Log.e("lat", lat.toString());
        Log.e("longt", longt.toString());
        mapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?q=loc:%f,%f", lat,longt);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });

    }
}
