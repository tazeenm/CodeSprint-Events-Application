package events.example.tazeen.codesprint;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.AdapterViewFlipper;
import android.widget.ListView;

import java.util.Timer;
import java.util.TimerTask;

import events.com.example.tazeen.codesprint.R;

public class Sports extends AppCompatActivity {

    private Toolbar ToolBar1;
    ListView sportsList;

    private AdapterViewFlipper simpleAdapterViewFlipper;
    int[] slideImages = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5};     // array of images

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        ToolBar1 = (Toolbar) findViewById(R.id.toolbar3);
        sportsList = (ListView) findViewById(R.id.sports_list);

        simpleAdapterViewFlipper = (AdapterViewFlipper) findViewById(R.id.simpleAdapterViewFlipper);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), /*fruitNames,*/ slideImages);
        simpleAdapterViewFlipper.setAdapter(customAdapter);
        simpleAdapterViewFlipper.setFlipInterval(3000);
        simpleAdapterViewFlipper.setAutoStart(true);
    }
}
