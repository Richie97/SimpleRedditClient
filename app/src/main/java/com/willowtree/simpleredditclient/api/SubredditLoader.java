package com.willowtree.simpleredditclient.api;

import android.content.Context;

import com.willowtree.simpleredditclient.api.model.RedditData;

import oak.util.OakAsyncLoader;

/**
 * Created by ericrichardson on 2/18/15.
 */
public class SubredditLoader extends OakAsyncLoader<RedditData>{
    public SubredditLoader(Context context) {
        super(context);
    }

    @Override
    public RedditData loadInBackground() {
        RedditData data = Reddit.getService().getSubreddit("android");
        return data;
    }
}
