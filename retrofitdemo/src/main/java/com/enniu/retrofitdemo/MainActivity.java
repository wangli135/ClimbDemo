package com.enniu.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.enniu.retrofitdemo.api.Client;
import com.enniu.retrofitdemo.model.NewsResult;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.functions.Action1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = findViewById(R.id.rvNews);

        //GET请求
        new Client().getServcie().getNews("", "74919b986ef0f8c602f61fdb3bd81e45")
                .enqueue(new Callback<NewsResult>() {
                    @Override
                    public void onResponse(Call<NewsResult> call, final Response<NewsResult> response) {
                        Log.i("TAG", response.body().toString());

                        recyclerView.post(new Runnable() {
                            @Override
                            public void run() {
                                NewsAdapter adapter = new NewsAdapter(MainActivity.this, response.body().getResult().getData());
                                recyclerView.setAdapter(adapter);
                            }
                        });

                    }

                    @Override
                    public void onFailure(Call<NewsResult> call, Throwable t) {

                    }
                });

        //POST请求
//        Map<String, String> params = new HashMap<>();
//        params.put("type", "");
//        params.put("key", "74919b986ef0f8c602f61fdb3bd81e45");
//        new Client().getServcie().postNews(params).enqueue(new Callback<NewsResult>() {
//            @Override
//            public void onResponse(Call<NewsResult> call, final Response<NewsResult> response) {
////                recyclerView.post(new Runnable() {
////                    @Override
////                    public void run() {
////                        NewsAdapter adapter = new NewsAdapter(MainActivity.this, response.body().getResult().getData());
////                        recyclerView.setAdapter(adapter);
////                    }
////                });
//                NewsAdapter adapter = new NewsAdapter(MainActivity.this, response.body().getResult().getData());
//                recyclerView.setAdapter(adapter);
//            }
//
//            @Override
//            public void onFailure(Call<NewsResult> call, Throwable t) {
//
//            }
//        });


//        new Client().getServcie().getNews("","74919b986ef0f8c602f61fdb3bd81e45")
//                .enqueue(new Callback<ResponseBody>() {
//                    @Override
//                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                        try {
//                            Log.i("TAG",response.body().string());
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    }
//
//                    @Override
//                    public void onFailure(Call<ResponseBody> call, Throwable t) {
//
//                    }
//                });
//        new Client()
//                .getServcie().getNews("", "74919b986ef0f8c602f61fdb3bd81e45")
//                .subscribe(new Action1<NewsResult>() {
//                    @Override
//                    public void call(NewsResult newsResult) {
//                        Log.i("TAG", newsResult.toString());
//                    }
//                });
    }
}
