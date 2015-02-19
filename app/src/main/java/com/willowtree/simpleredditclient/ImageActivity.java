package com.willowtree.simpleredditclient;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class ImageActivity extends ActionBarActivity {

    public static void startImageActivity(Context context, String url){
        Intent intent = new Intent(context, ImageActivity.class);
        intent.putExtra("url", url);
        context.startActivity(intent);
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        ImageView image = (ImageView) findViewById(R.id.image);
        Picasso.with(this).load(getIntent().getStringExtra("url")).into(image);
    }
}
