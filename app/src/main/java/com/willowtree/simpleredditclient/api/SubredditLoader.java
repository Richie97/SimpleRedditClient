package com.willowtree.simpleredditclient.api;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.willowtree.simpleredditclient.api.model.RedditData;

import java.lang.reflect.Type;
import java.util.Date;

import oak.util.OakAsyncLoader;

/**
 * Created by ericrichardson on 2/18/15.
 */
public class SubredditLoader extends OakAsyncLoader<RedditData>{
    private String subreddit;
    public SubredditLoader(Context context, String subreddit) {
        super(context);
        this.subreddit = subreddit;
    }

    @Override
    public RedditData loadInBackground() {
        RedditData data = Reddit.getService().getSubreddit(subreddit);
        return data;
    }

}
