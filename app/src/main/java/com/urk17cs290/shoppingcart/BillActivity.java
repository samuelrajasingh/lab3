package com.urk17cs290.shoppingcart;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import java.text.MessageFormat;

public class BillActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_bill);
    Intent i = getIntent();

    int aCount = i.getIntExtra("A_COUNT", 0);
    int oCount = i.getIntExtra("O_COUNT", 0);
    int bCount = i.getIntExtra("B_COUNT", 0);
    int mCount = i.getIntExtra("M_COUNT", 0);
    int gCount = i.getIntExtra("G_COUNT", 0);
    int tot = i.getIntExtra("TOTAL", 0);

    TextView apple = findViewById(R.id.apples);
    TextView orange = findViewById(R.id.oranges);
    TextView banana = findViewById(R.id.bananas);
    TextView mango = findViewById(R.id.mangoes);
    TextView grape = findViewById(R.id.grapes);
    TextView total = findViewById(R.id.total);

    if(aCount > 0)
      apple.setText(MessageFormat.format("APPLES ({0}) x 200 = {1}", aCount, aCount * 200));
    if(oCount > 0)
      orange.setText(MessageFormat.format("ORANGES ({0}) x 80 = {1}", oCount, oCount * 200));
    if(bCount > 0)
      banana.setText(MessageFormat.format("BANANA ({0}) x 50 = {1}", bCount, bCount * 200));
    if(mCount > 0)
      mango.setText(MessageFormat.format("MANGOES ({0}) x 60 = {1}", mCount, mCount * 200));
    if(gCount > 0)
      grape.setText(MessageFormat.format("GRAPES ({0}) x 100 = {1}", gCount, gCount * 200));

    total.setText(MessageFormat.format("Total : Rs{0}", tot));


  }
}