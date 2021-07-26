package com.example.uicitybazar;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.LayoutInflater;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.SnapHelper;

import com.example.uicitybazar.Model.HomeDiscount;
import com.example.uicitybazar.Model.TopProduct;
import com.example.uicitybazar.MyAdapter.Baneradapter;
import com.example.uicitybazar.MyAdapter.DiscountAdapter;
import com.example.uicitybazar.MyAdapter.HomeDiscountAdapter;
import com.example.uicitybazar.MyAdapter.TopProductAdapter;
import com.example.uicitybazar.databinding.CityBazarHomeUiBinding;

import java.util.ArrayList;

public class CityBazarHomeUI  extends AppCompatActivity
{

   CityBazarHomeUiBinding binding;
    Baneradapter baneradapter;
    TopProductAdapter topProductAdapter;
    HomeDiscountAdapter discountAdapter;



    ArrayList<Banner> al;
    ArrayList<TopProduct> tpal;
    ArrayList<HomeDiscount> hal;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=CityBazarHomeUiBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());
        getSupportActionBar().hide();


        al=new ArrayList<>();
        al.add(new Banner(1,"Eid-Offer","https://cdn4.vectorstock.com/i/1000x1000/60/78/eid-mubarak-sale-orange-color-banner-vector-25586078.jpg"));
        al.add(new Banner(2,"Delieverd","https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/18d60b107187879.5fa16aecd880f.jpg"));
        al.add(new Banner(3,"Shopping","https://previews.123rf.com/images/gmast3r/gmast3r1608/gmast3r160800727/61288939-online-shopping-banner-ecommerce-concept-flat-vector-illustration.jpg"));
        al.add(new Banner(4,"Shopping","https://as1.ftcdn.net/jpg/02/71/81/02/500_F_271810258_MKOGMrVOvzWwg53LwLWTpsFHNvcPHNyU.jpg"));

        baneradapter=new Baneradapter(CityBazarHomeUI.this,al);
        binding.rvBanner.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        binding.rvBanner.setAdapter(baneradapter);
        SnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(binding.rvBanner);


        tpal=new ArrayList<>();
        tpal.add(new TopProduct(1 ,"Red Chief Shoes","https://5.imimg.com/data5/TJ/TM/MY-52269820/red-chief-shoes-500x500.jpg","999","15%Off"));
        tpal.add(new TopProduct(2 ,"JBL earPhone","https://media.croma.com/image/upload/f_auto,q_auto,d_Croma%20Assets:no-product-image.jpg,h_350,w_350/v1605200806/Croma%20Assets/Entertainment/Headphones%20and%20Earphones/Images/8944893460510.png","24000","15%Off"));
        tpal.add(new TopProduct(3 ," Apple iPhone 7","https://rukminim1.flixcart.com/image/416/416/j9d3bm80/mobile/8/k/x/apple-iphone-7-mqtx2hn-a-original-imaeyyuygs9rzmty.jpeg?q=70","999","15%Off"));
        tpal.add(new TopProduct(4 ,"Realme Smart Watch","https://media.croma.com/image/upload/f_auto,q_auto,d_Croma%20Assets:no-product-image.jpg,h_350,w_350/v1605338825/Croma%20Assets/Communication/Wearable%20Devices/Images/8921639583774.png","999","15%Off"));
        tpal.add(new TopProduct(5 ,"Red Chief Shoes","https://5.imimg.com/data5/TJ/TM/MY-52269820/red-chief-shoes-500x500.jpg","999","15%Off"));
        tpal.add(new TopProduct(6 ,"JBL earPhone","https://media.croma.com/image/upload/f_auto,q_auto,d_Croma%20Assets:no-product-image.jpg,h_350,w_350/v1605200806/Croma%20Assets/Entertainment/Headphones%20and%20Earphones/Images/8944893460510.png","24000","15%Off"));
        tpal.add(new TopProduct(7 ," Apple iPhone 7","https://rukminim1.flixcart.com/image/416/416/j9d3bm80/mobile/8/k/x/apple-iphone-7-mqtx2hn-a-original-imaeyyuygs9rzmty.jpeg?q=70","999","15%Off"));
        tpal.add(new TopProduct(8 ,"Realme Smart Watch","https://media.croma.com/image/upload/f_auto,q_auto,d_Croma%20Assets:no-product-image.jpg,h_350,w_350/v1605338825/Croma%20Assets/Communication/Wearable%20Devices/Images/8921639583774.png","999","15%Off"));

        topProductAdapter=new TopProductAdapter(CityBazarHomeUI.this,tpal);

        LinearLayoutManager layoutManager =
                new GridLayoutManager(CityBazarHomeUI.this, 2, GridLayoutManager.HORIZONTAL, false);
        binding.rvtopStores.setLayoutManager(layoutManager);
        binding.rvtopStores.setAdapter(topProductAdapter);


        hal=new ArrayList<>();
        hal.add(new HomeDiscount(250));
        hal.add(new HomeDiscount(100));
        hal.add(new HomeDiscount(254));
        hal.add(new HomeDiscount(300));

        discountAdapter = new HomeDiscountAdapter(CityBazarHomeUI.this,hal);
        binding.rvdiscount.setLayoutManager(new LinearLayoutManager(CityBazarHomeUI.this,LinearLayoutManager.HORIZONTAL,false));
        binding.rvdiscount.setAdapter(discountAdapter);





    }
}
