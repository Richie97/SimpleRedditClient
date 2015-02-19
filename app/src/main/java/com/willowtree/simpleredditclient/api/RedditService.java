package com.willowtree.simpleredditclient.api;

import com.willowtree.simpleredditclient.api.model.RedditData;

import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by ericrichardson on 2/18/15.
 */
public interface RedditService {
    @GET("/{subreddit}.json")
    public RedditData getSubreddit(@Path("subreddit")String subreddit);
}
