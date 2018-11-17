package com.example.yam.projectalertdialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder adb;
    int Rr=0,Gg=0,Bb=0;
    Random rnd = new Random();
    LinearLayout Ll;
    String st1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ll = (LinearLayout) findViewById(R.id.Ll);
    }

    public void go1(View view) {
        adb =new AlertDialog.Builder(this);
        adb.setTitle("First example: only text");
        adb.setMessage("This is a simple alert");
        AlertDialog ad=adb.create();
        ad.show();
        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        st1 = "";
        st1 = item.getTitle().toString();
        if (st1 == "Credits"){
            Intent t = new Intent(this, Main2Activity.class);
            startActivity(t);
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    public void go2(View view) {
        adb =new AlertDialog.Builder(this);
        adb.setTitle("Second example: text&icon");
        adb.setMessage("This is a simple alert");
        adb.setIcon(R.drawable.pone);
        AlertDialog ad=adb.create();
        ad.show();

    }

    public void go3(View view) {
        adb =new AlertDialog.Builder(this);
        adb.setTitle("Third example: text&icon&button");
        adb.setMessage("This is a simple alert");
        adb.setIcon(R.drawable.ptwo);
        adb.setNegativeButton("exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }

        });
        AlertDialog ad=adb.create();
        ad.show();
    }

    public void go4(View view) {
        adb =new AlertDialog.Builder(this);
        adb.setTitle("Random background colors");
        adb.setMessage("Change the background color Click: Change ");
        adb.setPositiveButton("Change", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Rr= rnd.nextInt()*256;
                Gg= rnd.nextInt()*256;
                Bb= rnd.nextInt()*256;
                Ll.setBackgroundColor(Color.rgb(Rr,Gg,Bb));

            }
        });


        adb.setNegativeButton("exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }

        });
        AlertDialog ad=adb.create();
        ad.show();

    }

    public void go5(View view) {
        adb =new AlertDialog.Builder(this);
        adb.setTitle("Random background colors");
        adb.setMessage("Change the background color or reset ");
        adb.setPositiveButton("Change", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Rr= rnd.nextInt()*256;
                Gg= rnd.nextInt()*256;
                Bb= rnd.nextInt()*256;
                Ll.setBackgroundColor(Color.rgb(Rr,Gg,Bb));

            }
        });


        adb.setNeutralButton("Reset", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Ll.setBackgroundColor(Color.WHITE);
            }
        });

        adb.setNegativeButton("exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }

        });
        AlertDialog ad=adb.create();
        ad.show();


    }

}

