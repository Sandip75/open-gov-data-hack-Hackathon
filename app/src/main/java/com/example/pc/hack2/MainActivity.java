package com.example.pc.hack2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT=4000;

    Button location,course;
    String[] locstr,coustr;
    boolean[] checkloc,checkcou;
    ArrayList<Integer> locplace = new ArrayList<>();
    ArrayList<Integer> couselection = new ArrayList<>();
    int a=0;
    ImageView iv,iv2;
    Handler handler = new Handler();

    public void imagechange(){
        handler.postDelayed(new Runnable() {
            public void run() {
                imagechange();
            }
        }, 1500);

        if(a==0){
            iv2.animate().alpha(0).setDuration(2000);
            iv.setImageResource(R.drawable.aaaaa);
            iv.animate().alpha(1).setDuration(2000);
            a=1;
        }
        else if(a==1){
            iv.animate().alpha(0).setDuration(2000);
            iv2.setImageResource(R.drawable.aa);
            iv2.animate().alpha(1).setDuration(2000);
            a=2;
        }
        else if(a==2){
            iv2.animate().alpha(0).setDuration(2000);
            iv.setImageResource(R.drawable.aaa);
            iv.animate().alpha(1).setDuration(2000);
            a=3;
        }
        else if(a==3){
            iv.animate().alpha(0).setDuration(2000);
            iv2.setImageResource(R.drawable.aaaa);
            iv2.animate().alpha(1).setDuration(2000);
            a=4;
        }

        else if(a==4){
            iv2.animate().alpha(0).setDuration(2000);
            iv.setImageResource(R.drawable.a);
            iv.animate().alpha(1).setDuration(2000);
            a=5;
        }
        else if(a==5){
            iv.animate().alpha(0).setDuration(2000);
            iv2.setImageResource(R.drawable.aaaaaa);
            iv2.animate().alpha(1).setDuration(2000);
            a=0;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        location = (Button) findViewById(R.id.butlo);
        course = (Button) findViewById(R.id.butco);
        locstr = getResources().getStringArray(R.array.loc);
        coustr = getResources().getStringArray(R.array.cou);
        checkloc = new boolean[locstr.length];
        checkcou = new boolean[coustr.length];



        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mbuiler = new AlertDialog.Builder(MainActivity.this);
                mbuiler.setTitle(R.string.dialog_title);
                mbuiler.setMultiChoiceItems(locstr, checkloc, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int postion, boolean ischecked) {
                        if(ischecked) {
                            if(! locplace.contains(postion)){
                                locplace.add(postion);
                            }
                            else {
                                locplace.remove(postion);
                            }
                        }

                    }
                });
                mbuiler.setCancelable(false);
                mbuiler.setPositiveButton(R.string.ok_label, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                       /* String item ="";
                        for(int i=0;i<locplace.size();i++ ){
                            item = item + locstr[locplace.get(i)];
                            if(i != locplace.size()-1){
                                item = item + ", ";
                            }
                        }
                        mitem.setText(item);*/

                        Intent i= new Intent(MainActivity.this,Main2Activity.class);
                        startActivity(i);

                    }
                });
                mbuiler.setNegativeButton(R.string.dismiss_label, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                mbuiler.setNeutralButton(R.string.clear_all_label , new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        for(int i=0; i <checkloc.length; i++ ){
                            checkloc[i]=false;
                            locplace.clear();
                            //mitemselection
                            //mitem.setText("");

                        }
                    }
                });
                AlertDialog mdialog = mbuiler.create();
                mdialog.show();

            }
        });

        course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mbuiler1 = new AlertDialog.Builder(MainActivity.this);
                mbuiler1.setTitle(R.string.dialog_title);
                mbuiler1.setMultiChoiceItems(coustr, checkcou, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int postion, boolean ischecked) {
                        if(ischecked) {
                            if(! couselection.contains(postion)){
                                couselection.add(postion);
                            }
                            else {
                                couselection.remove(postion);
                            }
                        }

                    }
                });
                mbuiler1.setCancelable(false);
                mbuiler1.setPositiveButton(R.string.ok_label, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                       /* String item ="";
                        for(int i=0;i<locplace.size();i++ ){
                            item = item + locstr[locplace.get(i)];
                            if(i != locplace.size()-1){
                                item = item + ", ";
                            }
                        }
                        mitem.setText(item);*/
                        Intent i= new Intent(MainActivity.this,Main2Activity.class);
                        startActivity(i);

                    }
                });
                mbuiler1.setNegativeButton(R.string.dismiss_label, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                mbuiler1.setNeutralButton(R.string.clear_all_label , new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        for(int i=0; i <checkcou.length; i++ ){
                            checkcou[i]=false;
                            couselection.clear();
                            //mitemselection
                            //mitem.setText("");
                        }
                    }
                });
                AlertDialog mdialog = mbuiler1.create();
                mdialog.show();

            }
        });

        iv = (ImageView)findViewById(R.id.imageView);
        iv2 = (ImageView)findViewById(R.id.imageView2);
        imagechange();


    }
}
