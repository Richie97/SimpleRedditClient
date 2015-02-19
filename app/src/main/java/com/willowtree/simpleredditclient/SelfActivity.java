package com.willowtree.simpleredditclient;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.widget.TextView;

import com.willowtree.simpleredditclient.api.model.RedditData;

/**
 * Created by ericrichardson on 2/18/15.
 */
public class SelfActivity extends ActionBarActivity {

    public static void startSelfActivity(Context context, RedditData data){
        Intent intent = new Intent(context, SelfActivity.class);
        intent.putExtra("data", data);
        context.startActivity(intent);
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self);
        RedditData data = getIntent().getParcelableExtra("data");
        getSupportActionBar().setTitle(data.title);
        TextView tv = (TextView) findViewById(R.id.text);
        tv.setText(Html.fromHtml(Html.fromHtml(data.selfTextHtml).toString()));
    }
}
