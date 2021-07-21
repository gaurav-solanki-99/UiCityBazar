package com.example.uicitybazar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;

import com.example.uicitybazar.databinding.CitybazaruiBinding;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

public class MainActivity extends AppCompatActivity {

    CitybazaruiBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=CitybazaruiBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

// in Activity Context
//     ImageView icon = new ImageView(this); // Create an icon
//        icon.setImageDrawable( getResources().getDrawable(R.drawable.bluecornerbutton) );
//
//        FloatingActionButton actionButton = new FloatingActionButton.Builder(this)
//                .setContentView(icon)
//                .build();





        SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);

        ImageView rlIcon1 = new ImageView(this);
        ImageView rlIcon2 = new ImageView(this);
        ImageView rlIcon3 = new ImageView(this);
        ImageView rlIcon4 = new ImageView(this);
        ImageView rlIcon5 = new ImageView(this);
        ImageView rlIcon6= new ImageView(this);
// repeat many times:
//        ImageView itemIcon = new ImageView(this);
//        itemIcon.setImageDrawable(R.drawable.facebook);
//        SubActionButton button1 = itemBuilder.setContentView(itemIcon).build();

        rlIcon1.setImageDrawable(getResources().getDrawable(R.drawable.facebook));
        rlIcon2.setImageDrawable(getResources().getDrawable(R.drawable.linked3));
        rlIcon3.setImageDrawable(getResources().getDrawable(R.drawable.pinterest));
        rlIcon4.setImageDrawable(getResources().getDrawable(R.drawable.logoinsta));
        rlIcon5.setImageDrawable(getResources().getDrawable(R.drawable.twitter2));
        rlIcon6.setImageDrawable(getResources().getDrawable(R.drawable.youtube));

        SubActionButton button1 = itemBuilder.setContentView(rlIcon1).build();
        SubActionButton button2 = itemBuilder.setContentView(rlIcon2).build();
        SubActionButton button3 = itemBuilder.setContentView(rlIcon3).build();
        SubActionButton button4 = itemBuilder.setContentView(rlIcon4).build();
        SubActionButton button5 = itemBuilder.setContentView(rlIcon5).build();
        SubActionButton button6 = itemBuilder.setContentView(rlIcon6).build();

        button1.getLayoutParams().width=100;
        button1.getLayoutParams().height=100;


        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(button1)
                .addSubActionView(button2)
                .addSubActionView(button3)
                .addSubActionView(button4)
                .addSubActionView(button5)
                .addSubActionView(button6)
                .attachTo(binding.floatbtn)
                .setStartAngle(0)
                .setEndAngle(-180)
                .build();



    }
}