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

import com.example.uicitybazar.Model.Blogger;
import com.example.uicitybazar.Model.HomeDiscount;
import com.example.uicitybazar.Model.TopProduct;
import com.example.uicitybazar.Model.TopShopes;
import com.example.uicitybazar.MyAdapter.Baneradapter;
import com.example.uicitybazar.MyAdapter.BloggerAdapter;
import com.example.uicitybazar.MyAdapter.DiscountAdapter;
import com.example.uicitybazar.MyAdapter.FamousMarketAdapter;
import com.example.uicitybazar.MyAdapter.HomeDiscountAdapter;
import com.example.uicitybazar.MyAdapter.TopProductAdapter;
import com.example.uicitybazar.MyAdapter.TopShopAdapter;
import com.example.uicitybazar.databinding.CityBazarHomeUiBinding;

import java.util.ArrayList;

public class CityBazarHomeUI  extends AppCompatActivity
{

   CityBazarHomeUiBinding binding;
    Baneradapter baneradapter;
    TopProductAdapter topProductAdapter;
    HomeDiscountAdapter discountAdapter;
    FamousMarketAdapter famousMarketAdapter;
    TopShopAdapter topShopAdapter;
    BloggerAdapter bloggerAdapter;



    ArrayList<Banner> al,al2;
    ArrayList<TopProduct> tpal;
    ArrayList<HomeDiscount> hal;
    ArrayList<FamousMarket> fal;
    ArrayList<TopShopes> tsal;
    ArrayList<Blogger> bal;



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


        fal=new ArrayList<>();
        fal.add(new FamousMarket("https://static.toiimg.com/thumb/msid-47067385,width=1200,height=900/47067385.jpg","Rajwada Palace"));
        fal.add(new FamousMarket("https://gumlet.assettype.com/freepressjournal%2Fimport%2F2017%2F01%2FIMG_6289.jpg?w=1200","Jail Road"));
        fal.add(new FamousMarket("https://apollocreations.com/wp-content/uploads/2018/12/apollo_tower_big_03.jpg","Apollo Tower"));
        fal.add(new FamousMarket("https://indoretalk.com/wp-content/uploads/2018/02/MT-cloth-market-indore-talk-03-1024x768.jpg","Clothe Market"));
        fal.add(new FamousMarket("https://indoretalk.com/wp-content/uploads/2018/02/MT-cloth-market-indore-talk-03-1024x768.jpg","Clothe Market"));


        famousMarketAdapter = new FamousMarketAdapter(CityBazarHomeUI.this,fal);
        binding.rvmarket.setLayoutManager(new LinearLayoutManager(CityBazarHomeUI.this,LinearLayoutManager.HORIZONTAL,false));
        binding.rvmarket.setAdapter(famousMarketAdapter);


        tsal = new ArrayList<>();
        tsal.add(new TopShopes(1,"https://citybazaronline.com/uploads/store-banner/2660_1609167849.jpg","Shaheb Fashion","70/2, B.K. Sindhi Colony CHAT wali Gali, Indore M.P.","1236547890",3,4));
        tsal.add(new TopShopes(2,"https://content.jdmagicbox.com/indore/21/0731p731stdk002921/catalogue/laxmi-collection-rajwada-indore-bmkk-250.jpg","Laxmi Collection","70/2, B.K. Sindhi Colony CHAT wali Gali, Indore M.P.","1236547890",3,4));
        tsal.add(new TopShopes(3,"https://www.shoppingbazar.in/uploads/images/e06b3ca7bb85b4bab617f7c8984e9aa21541510835.jpg","Shree Maharani Rajput","70/2, B.K. Sindhi Colony CHAT wali Gali, Indore M.P.","1236547890",3,4));
        tsal.add(new TopShopes(4,"https://citybazaronline.com/uploads/store-banner/2660_1609167849.jpg","Shaheb Fashion","70/2, B.K. Sindhi Colony CHAT wali Gali, Indore M.P.","1236547890",3,4));
        tsal.add(new TopShopes(5,"https://citybazaronline.com/uploads/store-banner/2660_1609167849.jpg","Shaheb Fashion","70/2, B.K. Sindhi Colony CHAT wali Gali, Indore M.P.","1236547890",3,4));



        topShopAdapter=new TopShopAdapter(CityBazarHomeUI.this,tsal);
        binding.rvShopesFrom.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        binding.rvShopesFrom.setAdapter(topShopAdapter);
        SnapHelper snapHelper2 = new PagerSnapHelper();
        snapHelper2.attachToRecyclerView(binding.rvShopesFrom);


        bal=new ArrayList<>();
        bal.add(new Blogger(1,"Joy","https://i.pinimg.com/originals/67/15/00/671500a0cfa979e201267cbf3e68b94d.png"));
        bal.add(new Blogger(1,"Joy","https://i.pinimg.com/originals/67/15/00/671500a0cfa979e201267cbf3e68b94d.png"));
        bal.add(new Blogger(1,"Joy","https://i.pinimg.com/originals/67/15/00/671500a0cfa979e201267cbf3e68b94d.png"));
        bal.add(new Blogger(1,"Joy","https://i.pinimg.com/originals/67/15/00/671500a0cfa979e201267cbf3e68b94d.png"));
        bal.add(new Blogger(1,"Joy","https://i.pinimg.com/originals/67/15/00/671500a0cfa979e201267cbf3e68b94d.png"));


        bloggerAdapter = new BloggerAdapter(CityBazarHomeUI.this,bal);
        binding.rvBlogger.setLayoutManager(new LinearLayoutManager(CityBazarHomeUI.this,LinearLayoutManager.HORIZONTAL,false));
        binding.rvBlogger.setAdapter(bloggerAdapter);



        al2=new ArrayList<>();
        al2.add(new Banner(1,"Eid-Offer","https://cdn4.vectorstock.com/i/1000x1000/60/78/eid-mubarak-sale-orange-color-banner-vector-25586078.jpg"));
        al2.add(new Banner(2,"Delieverd","https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/18d60b107187879.5fa16aecd880f.jpg"));
        al2.add(new Banner(3,"Shopping","https://previews.123rf.com/images/gmast3r/gmast3r1608/gmast3r160800727/61288939-online-shopping-banner-ecommerce-concept-flat-vector-illustration.jpg"));
        al2.add(new Banner(4,"Shopping","https://as1.ftcdn.net/jpg/02/71/81/02/500_F_271810258_MKOGMrVOvzWwg53LwLWTpsFHNvcPHNyU.jpg"));

        baneradapter=new Baneradapter(CityBazarHomeUI.this,al2);
        binding.rvBottomBanner.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        binding.rvBottomBanner.setAdapter(baneradapter);
        SnapHelper snapHelper3 = new PagerSnapHelper();
        snapHelper3.attachToRecyclerView(binding.rvBottomBanner);


    }
}
