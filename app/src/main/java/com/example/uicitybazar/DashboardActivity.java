package com.example.uicitybazar;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import com.example.uicitybazar.Model.Category;
import com.example.uicitybazar.Model.DiscountPer;
import com.example.uicitybazar.Model.TopProduct;
import com.example.uicitybazar.Model.TopShopes;
import com.example.uicitybazar.MyAdapter.Baneradapter;
import com.example.uicitybazar.MyAdapter.CategoryAdapter;
import com.example.uicitybazar.MyAdapter.DiscountAdapter;
import com.example.uicitybazar.MyAdapter.TopProductAdapter;
import com.example.uicitybazar.MyAdapter.TopShopAdapter;
import com.example.uicitybazar.databinding.DashboardUiBinding;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity
{

    DashboardUiBinding binding;
    Baneradapter baneradapter;
    ArrayList<Banner> al;
    ArrayList<Category> cal;
    ArrayList<DiscountPer> disal;
    ArrayList<TopProduct> tpal;
    ArrayList<TopShopes> tsal;
    TopProductAdapter  topProductAdapter;
    DiscountAdapter discountAdapter;
    CategoryAdapter categoryAdapter;
    TopShopAdapter topShopAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
          binding=DashboardUiBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        al=new ArrayList<>();
        al.add(new Banner(1,"Eid-Offer","https://cdn4.vectorstock.com/i/1000x1000/60/78/eid-mubarak-sale-orange-color-banner-vector-25586078.jpg"));
        al.add(new Banner(2,"Delieverd","https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/18d60b107187879.5fa16aecd880f.jpg"));
        al.add(new Banner(3,"Shopping","https://previews.123rf.com/images/gmast3r/gmast3r1608/gmast3r160800727/61288939-online-shopping-banner-ecommerce-concept-flat-vector-illustration.jpg"));
        al.add(new Banner(4,"Shopping","https://as1.ftcdn.net/jpg/02/71/81/02/500_F_271810258_MKOGMrVOvzWwg53LwLWTpsFHNvcPHNyU.jpg"));

        baneradapter=new Baneradapter(DashboardActivity.this,al);
        binding.rvBanner.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        binding.rvBanner.setAdapter(baneradapter);
        SnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(binding.rvBanner);

        cal=new ArrayList<>();
        cal.add(new Category("Mens wear","https://i.pinimg.com/236x/d8/9b/5b/d89b5b090b00dd75ea7ccbea219f58e4.jpg"));
        cal.add(new Category("Girls wear","https://wholesalemantra.com/images/Products/Big1/Party-Wear-Girls-Frock-Style-Suits-Catalog-Supplier-Buy-Latest-Bollywood-Dresses-Online-WSM-1489_7.jpeg"));
        cal.add(new Category("Kids wear","https://rukminim1.flixcart.com/image/332/398/jvv9zm80/kids-ethnic-set/b/v/t/2-3-years-digibc001-digimart-original-imafggkydgvztb2k.jpeg?q=50"));
        cal.add(new Category("Womens","https://i.pinimg.com/236x/af/a6/66/afa666da2dcf091e3027fe4f29def2b1.jpg"));
        cal.add(new Category("Foot wear","https://cdn.shopify.com/s/files/1/1816/6561/products/ResizeImges4_large.jpg?v=1608975416"));
        cal.add(new Category("Jeweller","https://ae01.alicdn.com/kf/Hc7b5dec3d8c64536a27761ac2d50a184E/GODKI-Boom-de-Grande-Flor-de-Luxo-Mulheres-Colar-Brinco-Dubai-Conjunto-de-J-ias-de.jpg_Q90.jpg_.webp"));
        cal.add(new Category("Home Appliance","https://lh3.googleusercontent.com/proxy/gwTU9AF60-uW52nNLXF6IQm-zaFpr7e3kd_K6eRFbQLAJqEjUSEWl6pcXN9b4b02FRge2rsNSMP3OsHkqttH4OVsoIvaWP-IYvnrxwvSWxzyiT9ki-bed5SWIZrmwXalflpt15zRyD9kj2-f383eYgrw6fwjxMHvesCBHjPF92Of7Q"));
        cal.add(new Category("Funrniture","data:image/jpeg;base64,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"));
        cal.add(new Category("machinery","https://klassicmachinery.com/wp-content/uploads/2021/06/Klassic-Machinery-Mart-3.jpg"));


        categoryAdapter = new CategoryAdapter(DashboardActivity.this,cal);
        binding.rvCategory.setLayoutManager(new GridLayoutManager(this,3));
        binding.rvCategory.setAdapter(categoryAdapter);




        disal=new ArrayList<>();
        disal.add(new DiscountPer(50));
        disal.add(new DiscountPer(60));
        disal.add(new DiscountPer(45));
        disal.add(new DiscountPer(30));


        discountAdapter=new DiscountAdapter(DashboardActivity.this,disal);
        binding.rvdiscount.setLayoutManager(new GridLayoutManager(this,2));
        binding.rvdiscount.setAdapter(discountAdapter);



        tpal=new ArrayList<>();
        tpal.add(new TopProduct(1 ,"Red Chief Shoes","https://5.imimg.com/data5/TJ/TM/MY-52269820/red-chief-shoes-500x500.jpg","999","15%Off"));
        tpal.add(new TopProduct(2 ,"JBL earPhone","https://media.croma.com/image/upload/f_auto,q_auto,d_Croma%20Assets:no-product-image.jpg,h_350,w_350/v1605200806/Croma%20Assets/Entertainment/Headphones%20and%20Earphones/Images/8944893460510.png","24000","15%Off"));
        tpal.add(new TopProduct(3 ," Apple iPhone 7","https://rukminim1.flixcart.com/image/416/416/j9d3bm80/mobile/8/k/x/apple-iphone-7-mqtx2hn-a-original-imaeyyuygs9rzmty.jpeg?q=70","999","15%Off"));
        tpal.add(new TopProduct(4 ,"Realme Smart Watch","https://media.croma.com/image/upload/f_auto,q_auto,d_Croma%20Assets:no-product-image.jpg,h_350,w_350/v1605338825/Croma%20Assets/Communication/Wearable%20Devices/Images/8921639583774.png","999","15%Off"));

        topProductAdapter=new TopProductAdapter(DashboardActivity.this,tpal);
        binding.rvtopStores.setLayoutManager(new GridLayoutManager(this,2));
        binding.rvtopStores.setAdapter(topProductAdapter);




        tsal = new ArrayList<>();
        tsal.add(new TopShopes(1,"https://citybazaronline.com/uploads/store-banner/2660_1609167849.jpg","Shaheb Fashion","70/2, B.K. Sindhi Colony CHAT wali Gali, Indore M.P.","1236547890",3,4));
        tsal.add(new TopShopes(2,"https://citybazaronline.com/uploads/store-banner/2660_1609167849.jpg","Shaheb Fashion","70/2, B.K. Sindhi Colony CHAT wali Gali, Indore M.P.","1236547890",3,4));
        tsal.add(new TopShopes(3,"https://citybazaronline.com/uploads/store-banner/2660_1609167849.jpg","Shaheb Fashion","70/2, B.K. Sindhi Colony CHAT wali Gali, Indore M.P.","1236547890",3,4));
        tsal.add(new TopShopes(4,"https://citybazaronline.com/uploads/store-banner/2660_1609167849.jpg","Shaheb Fashion","70/2, B.K. Sindhi Colony CHAT wali Gali, Indore M.P.","1236547890",3,4));
        tsal.add(new TopShopes(5,"https://citybazaronline.com/uploads/store-banner/2660_1609167849.jpg","Shaheb Fashion","70/2, B.K. Sindhi Colony CHAT wali Gali, Indore M.P.","1236547890",3,4));



        topShopAdapter=new TopShopAdapter(DashboardActivity.this,tsal);
        binding.rvTopShop.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        binding.rvTopShop.setAdapter(topShopAdapter);
        SnapHelper snapHelper2 = new PagerSnapHelper();
        snapHelper2.attachToRecyclerView(binding.rvTopShop);


        // vertical and cycle layout








    }
}
