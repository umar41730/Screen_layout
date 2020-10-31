package com.example.saddaassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecycleAdapteTopTenHome mAdapter2;
    private Integer image1[]={R.drawable.ac,R.drawable.headphones,R.drawable.ac,R.drawable.headphones};
    private String title1[] ={"Vigo Atom Personal Air Condi....","Bosh Head Phone Blue Color","Vigo Atom Personal Air Condi....","Bosh Head Phone Blue Color",};
    private String type[] = {"Kitenid","HeadPhones","Kitenid","HeadPhones"};




    private RecyclerView top_ten_recyclerview;
    private ArrayList<TopTenModelClass> topTenModelClasses;

    //Top Feature_product
    private ArrayList<TopTenModelClass> topTenFeatureClasses;
    private RecyclerView top_feature_crecyclerview;
    private RecyclerView top_featuree_crecyclerview;
    private RecyclerView top_crecyclerview;
    private RecycleAdapteTopTenHome mAdapter3;
    private Integer image2[]={R.drawable.ac,R.drawable.headphones,R.drawable.ac,R.drawable.headphones};
    private String title2[] ={"Vigo ","Bosh ","Vigo ","Bosh ",};
    private String type2[] = {"Kitenid","HeadPhones","Kitenid","HeadPhones"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);



        //        Top ten producta//
        top_ten_recyclerview = (RecyclerView)findViewById(R.id.top_picks_recyclerview);

        topTenModelClasses = new ArrayList<>();



        for (int i = 0; i < image1.length; i++) {
            TopTenModelClass beanClassForRecyclerView_contacts = new TopTenModelClass(image1[i],title1[i],type[i]);

            topTenModelClasses.add(beanClassForRecyclerView_contacts);
        }


        mAdapter2 = new RecycleAdapteTopTenHome(MainActivity.this, topTenModelClasses);
        RecyclerView.LayoutManager mLayoutManager2 = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        top_ten_recyclerview.setLayoutManager(mLayoutManager2);



        top_ten_recyclerview.setLayoutManager(mLayoutManager2);
        top_ten_recyclerview.setItemAnimator(new DefaultItemAnimator());
        top_ten_recyclerview.setAdapter(mAdapter2);




        //        Top Feature//
        top_feature_crecyclerview = (RecyclerView)findViewById(R.id.top_featured_recyclerview);

        topTenFeatureClasses = new ArrayList<>();



        for (int i = 0; i < image1.length; i++) {
            TopTenModelClass beanClassForRecyclerView_contacts = new TopTenModelClass(image1[i],title1[i],type[i]);

            topTenFeatureClasses .add(beanClassForRecyclerView_contacts);
        }


        mAdapter3 = new RecycleAdapteTopTenHome(MainActivity.this, topTenFeatureClasses );
        RecyclerView.LayoutManager mLayoutManager3 = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        top_feature_crecyclerview.setLayoutManager(mLayoutManager3);



        top_feature_crecyclerview.setLayoutManager(mLayoutManager3);
        top_feature_crecyclerview.setItemAnimator(new DefaultItemAnimator());
        top_feature_crecyclerview.setAdapter(mAdapter3);




    }
}