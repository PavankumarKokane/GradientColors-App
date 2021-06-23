package com.pavankumar.gradientcolors;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    ClipboardManager myClipboard;
    ClipData myClip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myClipboard = (ClipboardManager)getSystemService(CLIPBOARD_SERVICE);

        TextView tv1=(TextView)findViewById(R.id.t1);
        TextView tv2=(TextView)findViewById(R.id.t2);
        TextView tv3=(TextView)findViewById(R.id.t3);
        TextView tv4=(TextView)findViewById(R.id.t4);
        TextView tv5=(TextView)findViewById(R.id.t5);
        TextView tv6=(TextView)findViewById(R.id.t6);
        TextView tv7=(TextView)findViewById(R.id.t7);
        TextView tv8=(TextView)findViewById(R.id.t8);
        TextView tv9=(TextView)findViewById(R.id.t9);
        TextView tv10=(TextView)findViewById(R.id.t10);
        TextView tv11=(TextView)findViewById(R.id.t11);
        TextView tv12=(TextView)findViewById(R.id.t12);
        TextView tv13=(TextView)findViewById(R.id.t13);
        TextView tv14=(TextView)findViewById(R.id.t14);
        TextView tv15=(TextView)findViewById(R.id.t15);
        TextView tv16=(TextView)findViewById(R.id.t16);
        TextView tv17=(TextView)findViewById(R.id.t17);
        TextView tv18=(TextView)findViewById(R.id.t18);
        TextView tv19=(TextView)findViewById(R.id.t19);
        TextView tv20=(TextView)findViewById(R.id.t20);
        TextView tv21=(TextView)findViewById(R.id.t21);
        TextView tv22=(TextView)findViewById(R.id.t22);
        TextView tv23=(TextView)findViewById(R.id.t23);
        TextView tv24=(TextView)findViewById(R.id.t24);
        TextView tv25=(TextView)findViewById(R.id.t25);
        TextView tv26=(TextView)findViewById(R.id.t26);
        TextView tv27=(TextView)findViewById(R.id.t27);
        TextView tv28=(TextView)findViewById(R.id.t28);
        TextView tv29=(TextView)findViewById(R.id.t29);
        TextView tv30=(TextView)findViewById(R.id.t30);
        TextView tv31=(TextView)findViewById(R.id.t31);
        TextView tv32=(TextView)findViewById(R.id.t32);
        TextView tv33=(TextView)findViewById(R.id.t33);
        TextView tv34=(TextView)findViewById(R.id.t34);
        TextView tv35=(TextView)findViewById(R.id.t35);
        TextView tv36=(TextView)findViewById(R.id.t36);
        TextView tv37=(TextView)findViewById(R.id.t37);
        TextView tv38=(TextView)findViewById(R.id.t38);
        TextView tv39=(TextView)findViewById(R.id.t39);
        TextView tv40=(TextView)findViewById(R.id.t40);
        TextView tv41=(TextView)findViewById(R.id.t41);
        TextView tv42=(TextView)findViewById(R.id.t42);
        TextView tv43=(TextView)findViewById(R.id.t43);
        TextView tv44=(TextView)findViewById(R.id.t44);
        TextView tv45=(TextView)findViewById(R.id.t45);
        TextView tv46=(TextView)findViewById(R.id.t46);




        tv1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                        String text = "#79F1A4";
                        myClip = ClipData.newPlainText("text", text);
                        myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#0E5CAD";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#FCCF31";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#F55555";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#F761A1";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#8C1BAB";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#43CBFF";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#9708CC";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#F97794";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv10.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#623AA2";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv11.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#92FFC0";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv12.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#002661";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv13.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#EEAD92";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv14.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#6018DC";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv15.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#FFF720";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv16.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#3CD500";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv17.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#00EAFF";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv18.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#3C8CE7";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv19.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#FAEB71";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv20.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#F8D800";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv21.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#FEB692";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv22.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#EA5455";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv23.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#38F9D7";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv24.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#43E97B";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv25.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#2575FC";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv26.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#6A11CB";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv27.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#F9D423";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv28.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#F83600";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv29.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#CC208E";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv30.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#6713D2";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv31.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#FEE140";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv32.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#FA709A";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv33.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#90F7EC";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv34.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#32CCBC";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv35.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#FF96F9";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv36.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#C32BAC";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv37.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#B92B27";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv38.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#1565C0";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv39.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#E65C00";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv40.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#F9D423";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv41.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#FF416C";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv42.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#FF4B2B";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv43.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#A8FF78";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv44.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#78FFD6";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv45.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#00B09B";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });

        tv46.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                String text = "#96C93D";
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Color Copied " +text,Toast.LENGTH_SHORT).show();
            }

        });







    }

}
