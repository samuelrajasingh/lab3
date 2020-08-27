package com.urk17cs290.shoppingcart;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class BillActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_bill);
    Intent i = getIntent();
    if (i.getStringExtra("A_COUNT") != null) Log.d("TAG", "a count not null ");

    int aCount = 0;
    aCount = Integer.parseInt(i.getStringExtra("A_COUNT"));
    int oCount=0;
    oCount = Integer.parseInt(i.getStringExtra("O_COUNT"));
    int bCount=0;
    bCount = Integer.parseInt(i.getStringExtra("B_COUNT"));
    int mCount=0;
    mCount = Integer.parseInt(i.getStringExtra("M_COUNT"));
    int gCount=0;
    gCount = Integer.parseInt(Objects.requireNonNull(i.getStringExtra("G_COUNT")));

    int tot=0;
    tot = Integer.parseInt(Objects.requireNonNull(i.getStringExtra("TOTAL")));

    TextView apple = findViewById(R.id.apples);
    TextView orange = findViewById(R.id.oranges);
    TextView banana = findViewById(R.id.bananas);
    TextView mango = findViewById(R.id.mangoes);
    TextView grape = findViewById(R.id.grapes);
    TextView total = findViewById(R.id.total);

    apple.setText("APPLES (" + aCount + ") x 200 = " + aCount * 200);
    orange.setText("ORANGES (" + oCount + ") x 80 = " + oCount * 200);
    banana.setText("BANANA (" + bCount + ") x 50 = " + bCount * 200);
    mango.setText("MANGOES (" + mCount + ") x 60 = " + mCount * 200);
    grape.setText("GRAPES (" + gCount + ") x 100 = " + gCount * 200);
    total.setText("Total : Rs" + tot);


  }
}