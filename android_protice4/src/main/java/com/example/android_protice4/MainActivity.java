package com.example.android_protice4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private final static String PRODUCT = "product";
    private final static String PRICE = "price";
    private final static String CONFIGURATION = "configuaration";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] products = {"小米", "三星", "魅族"};
        String[] prices = {"1999", "2999", "1999"};
        String[] configurations = {"高通什么901，3GBram，16GB rom", "锐步但是,2GBram,3gbRom", "inter 129,2GBram" +
                ",28GBrom"};
        List<Map<String, Object>> items = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < products.length; i++) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put(PRODUCT, products[i]);
            item.put(PRICE, prices[i]);
            item.put(CONFIGURATION, configurations[i]);
            items.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(this, items, R.layout.item, new String[]
                {PRODUCT, PRICE, CONFIGURATION}, new int[]{R.id.txtProduct, R.id.txtPrice,
                R.id.txtConfiguration});
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
