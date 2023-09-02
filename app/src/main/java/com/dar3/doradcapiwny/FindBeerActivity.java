package com.dar3.doradcapiwny;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Spinner;
import java.util.List;

public  class FindBeerActivity extends  Activity {

    private BeerExpert expert = new BeerExpert();
    public void onClickFindBeer(View view){

    TextView brands = (TextView) findViewById (R.id.brands);
    Spinner color = (Spinner) findViewById(R.id.color);
    String beerType = String.valueOf(color.getSelectedItem() );

    List<String> brandsList = expert.getBrands(beerType);
    StringBuilder brandsFormatted = new StringBuilder();

        for (String brand: brandsList) {
            brandsFormatted.append(brand).append('\n');
        }

//        for (int i = 0; i < brandsList.toArray().length; i++) {
//            brandsFormatted.append(brandsList.get(i)).append('\n');
//        }
    brands.setText(brandsFormatted);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }
}