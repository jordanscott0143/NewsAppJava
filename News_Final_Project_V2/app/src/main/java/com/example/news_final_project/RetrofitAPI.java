package com.example.news_final_project;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrofitAPI {

    @GET
    Call<NewsModel> getAllNews(@Url String url);

    @GET
    Call<NewsModel>getNewByCategory(@Url String url);

}
