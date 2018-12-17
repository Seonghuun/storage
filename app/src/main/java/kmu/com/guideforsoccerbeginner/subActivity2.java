package kmu.com.guideforsoccerbeginner;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class subActivity2 extends AppCompatActivity {

    String[] listviewTitle = new String[]{
            "Ronaldo", "Modric", "Ramos",
    };

    int[] listviewImage = new int[]{
            R.drawable.cr7, R.drawable.modric, R.drawable.ramos,
    };

    String[] listviewShortDescription = new String[]{
            "Forward, JuventusFc, 187cm", "Midfielder, Real Madrid, 172cm", "Defender, Real Madrid, 184cm",
    };

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i=0; i<3; i++){
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("list_view_item_title", listviewTitle[i]);
            hm.put("list_item_short_description", listviewShortDescription[i]);
            hm.put("list_view_image", Integer.toString(listviewImage[i]));
            aList.add(hm);
        }

        String[] from = {"list_view_image", "list_view_item_title", "list_item_short_description"};
        int[] to = {R.id.list_view_image, R.id.list_view_item_title, R.id.list_item_short_description};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.listview_item, from, to);
        ListView androidListView = (ListView) findViewById(R.id.list_view);
        androidListView.setAdapter(simpleAdapter);
    }



}
