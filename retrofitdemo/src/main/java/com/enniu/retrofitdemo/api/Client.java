package com.enniu.retrofitdemo.api;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @Author: 王立
 * @Date: 2019/4/28 20:21
 * @Desc:
 */
public class Client {

    Retrofit mRetrofit = new Retrofit.Builder()
            .baseUrl("http://v.juhe.cn/toutiao/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.createAsync())
            .build();

    public NewsService getServcie() {
        return mRetrofit.create(NewsService.class);
    }

}
