package com.example.pc.hack2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {

    Spinner sss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sss =(Spinner) findViewById(R.id.f1);
        String[] c ={"College Rank","Infrastructure","Accreditation"};
        ArrayAdapter<String> ad = new ArrayAdapter<String>(this ,android.R.layout.simple_spinner_dropdown_item,c);
        sss.setAdapter(ad);

    }

    public void fun1(View v){
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.co.in/maps/place/Bhagwan+Parshuram+Institute+of+Technology/@28.7371403,77.1123723,15z/data=!4m2!3m1!1s0x0:0x154521d473fe3d5f?sa=X&ved=0ahUKEwju8o2ngt_WAhXFOo8KHbY4C20Q_BIIjwEwDg"));
        startActivity(intent);
    }
    public void fun11(View v){
        String url = "http://www.bpitindia.com/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void fun2(View v){
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.co.in/maps/place/Indian+Institute+of+Technology+Delhi/@28.5449756,77.1904396,17z/data=!3m1!4b1!4m5!3m4!1s0x390d1df6b9055fb5:0x81c10b266b1ea3c0!8m2!3d28.5449756!4d77.1926283"));
        startActivity(intent);
    }

    public void fun21(View v){
        String url = "http://www.iitd.ac.in/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void fun3(View v){
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.co.in/maps/place/Netaji+Subhas+Institute+Of+Technology/@28.608474,77.0351008,15z/data=!4m2!3m1!1s0x0:0x7e540ab22a28446?sa=X&ved=0ahUKEwjRgvmAhN_WAhUKKo8KHbQiAm8Q_BIIgAEwCg"));
        startActivity(intent);
    }

    public void fun31(View v){
        String url = "http://www.nsit.ac.in";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void fun4(View v){
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.co.in/maps/place/Institute+of+Informatics+and+Communication,+UDSC/@28.5840619,77.1611565,17z/data=!3m1!4b1!4m5!3m4!1s0x390d1d11d46ccc85:0x2e94d9687f938329!8m2!3d28.5840619!4d77.1633452"));
        startActivity(intent);
    }

    public void fun41(View v){
        String url = "http://iic.ac.in/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void fun5(View v){
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.co.in/maps/place/JNU+Campus/@28.551663,77.1670473,17z/data=!3m1!4b1!4m5!3m4!1s0x390d1dbfa36deb11:0x6741e13da384cbaf!8m2!3d28.551663!4d77.169236"));
        startActivity(intent);
    }

    public void fun51(View v){
        String url = "https://www.jnu.ac.in/main/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void fun6(View v){
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.co.in/maps/place/Sri+Venkateswara+College/@28.588832,77.1656047,17z/data=!3m1!4b1!4m5!3m4!1s0x390d1d13eba57693:0xd1ef5c66eb24b792!8m2!3d28.588832!4d77.1677934"));
        startActivity(intent);
    }

    public void fun61(View v){
        String url = "http://www.svc.ac.in/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

}
