package com.enniu.retrofitdemo.api;

import com.enniu.retrofitdemo.model.NewsResult;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * @Author: 王立
 * @Date: 2019/4/28 20:18
 * @Desc:
 */
public interface NewsService {

    @GET ("index")
    Call<NewsResult> getNews(@Query ("type") String type, @Query ("key") String key);

    @POST("index")
    @FormUrlEncoded
    Call<NewsResult> postNews(@FieldMap Map<String, String> params);

}
