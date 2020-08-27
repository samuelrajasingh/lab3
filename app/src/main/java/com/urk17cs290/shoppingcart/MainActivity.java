package com.urk17cs290.shoppingcart;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] maintitle ={
            "Apple","Orange",
            "Banana","Mango",
            "Grape",
    };

    String[] subtitle ={
            "Rs: 200","Rs: 80",
            "Rs: 50","Rs: 60",
            "Rs: 100",
    };

    Integer[] imgid={
            R.drawable.download_1,R.drawable.download_2,
            R.drawable.download_3,R.drawable.download_4,
            R.drawable.download_5,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] total = {0};
        final int[] appleCount = {0};
        final int[] bananaCount={0};
        final int[] orangeCount={0};
        final int[] grapeCount={0};
        final int[] mangoCount={0};


        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        list= findViewById(R.id.list);
        list.setAdapter(adapter);
    list.setOnItemClickListener(
        new AdapterView.OnItemClickListener() {

          @Override
          public void onItemClick(
              final AdapterView<?> parent, final View view, int position, long id) {
//
//            try {
              if (position == 0) {
                //              Log.e("TAG", "inside pos 0");

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder
                    .setMessage("Adding to cart")
                    .setTitle("Confirm")
                    .setPositiveButton(
                        "Ok",
                        new DialogInterface.OnClickListener() {
                          @Override
                          public void onClick(DialogInterface dialog, int which) {
                            appleCount[0]++;
                            total[0] += 200;
                            Toast.makeText(
                                    MainActivity.this, "1 Apple added to cart", Toast.LENGTH_SHORT)
                                .show();
                            Log.e("TAG", "total: " + total[0]);
                            Log.e("TAG", "apple: " + appleCount[0]);
                          }
                        })
                    .setNegativeButton(
                        "No",
                        new DialogInterface.OnClickListener() {
                          @Override
                          public void onClick(DialogInterface dialog, int which) {
                            // doing nothing
                          }
                        })
                    .show();

              } else if (position == 1) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder
                    .setMessage("Adding to cart")
                    .setPositiveButton(
                        "Ok",
                        new DialogInterface.OnClickListener() {
                          @Override
                          public void onClick(DialogInterface dialog, int which) {
                            orangeCount[0]++;
                            total[0] += 80;
                            Toast.makeText(
                                    MainActivity.this, "1 Orange added to cart", Toast.LENGTH_SHORT)
                                .show();
                            Log.e("TAG", "total: " + total[0]);
                            Log.e("TAG", "apple: " + orangeCount[0]);
                          }
                        })
                    .setNegativeButton(
                        "No",
                        new DialogInterface.OnClickListener() {
                          @Override
                          public void onClick(DialogInterface dialog, int which) {
                            // doing nothing
                          }
                        })
                    .show();

              } else if (position == 2) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder
                    .setMessage("Adding to cart")
                    .setPositiveButton(
                        "Ok",
                        new DialogInterface.OnClickListener() {
                          @Override
                          public void onClick(DialogInterface dialog, int which) {
                            bananaCount[0]++;
                            total[0] += 50;
                            Toast.makeText(
                                    MainActivity.this, "1 Banana added to cart", Toast.LENGTH_SHORT)
                                .show();
                            Log.e("TAG", "total: " + total[0]);
                            Log.e("TAG", "apple: " + bananaCount[0]);
                          }
                        })
                    .setNegativeButton(
                        "No",
                        new DialogInterface.OnClickListener() {
                          @Override
                          public void onClick(DialogInterface dialog, int which) {
                            // doing nothing
                          }
                        })
                    .show();

              } else if (position == 3) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder
                    .setMessage("Adding to cart")
                    .setPositiveButton(
                        "Ok",
                        new DialogInterface.OnClickListener() {
                          @Override
                          public void onClick(DialogInterface dialog, int which) {
                            mangoCount[0]++;
                            total[0] += 60;
                            Toast.makeText(
                                    MainActivity.this, "1 Mango added to cart", Toast.LENGTH_SHORT)
                                .show();
                            Log.e("TAG", "total: " + total[0]);
                            Log.e("TAG", "apple: " + mangoCount[0]);
                          }
                        })
                    .setNegativeButton(
                        "No",
                        new DialogInterface.OnClickListener() {
                          @Override
                          public void onClick(DialogInterface dialog, int which) {
                            // doing nothing
                          }
                        })
                    .show();

              } else if (position == 4) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder
                    .setMessage("Adding to cart")
                    .setPositiveButton(
                        "Ok",
                        new DialogInterface.OnClickListener() {
                          @Override
                          public void onClick(DialogInterface dialog, int which) {
                            grapeCount[0]++;
                            total[0] += 100;
                            Toast.makeText(
                                    MainActivity.this, "1 Grape added to cart", Toast.LENGTH_SHORT)
                                .show();
                            Log.e("TAG", "total: " + total[0]);
                            Log.e("TAG", "apple: " + grapeCount[0]);
                          }
                        })
                    .setNegativeButton(
                        "No",
                        new DialogInterface.OnClickListener() {
                        @Override
                          public void onClick(DialogInterface dialog, int which) {
                            // doing nothing
                          }
                        })
                    .show();
              }
//            } catch (Exception e) {
//              Log.e("TAG", "Exception : "+e.getMessage());
//            }
          }
        });
        Button check =findViewById(R.id.checkBill);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,BillActivity.class);

                i.putExtra("TOTAL",total[0]);
                i.putExtra("A_COUNT",appleCount[0]);
                i.putExtra("O_COUNT",orangeCount[0]);
                i.putExtra("B_COUNT",bananaCount[0]);
                i.putExtra("M_COUNT",mangoCount[0]);
                i.putExtra("G_COUNT",grapeCount[0]);
                startActivity(i);
            }
        });
    }

}