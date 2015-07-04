package com.example.chris_000.highestmountain;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    private Button showButton;
    private TextView showTextView;
    private TextView showTriviaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showButton = (Button) findViewById(R.id.buttonId);
        showTextView = (TextView) findViewById(R.id.textViewId);
        showTriviaTextView = (TextView) findViewById(R.id.triviaTextViewId);

        final String[] mountains = {"Mount Everest", "K2/Qogir", "Kangchenjunga", "Lhotse", "Makula", "Cho Oyu", "Dhaulagiri I", "Manaslu", "Nanga Parbat", "Annapurna I"};
        final String[] mountainTrivia = {"#1. Although Mount Everest is the highest mountain above sea level, Hawaii's Mauna Kea is the tallest mountain base-to-peak: 10,210m (33,500 ft), 4,205m (13,796 ft) above sea level. Countries visible from the summit: Tibet, India, and Nepal. Parent Mountain is itself.",
                "#2. Though Everest is taller by nearly 800 ft., K2 is significantly more dangerous. While Everest has a fatality rate of approximately approximately 5% for year-round climbs, K2 has a fatality rate of about 25%, meaning that one out of every four climbers to attempt the summit have perished. Additionally, K2 has never been climbed during the winter. Parent Mountain is Mount Everest.",
                "#3. The name Kangchenjunga translates \"Five Treasures of Snow,\" referring to Kangchenjunga's five peaks. The Tibetan words are: Kang (Snow) chen (Big) dzo (Treasury) nga (Five). The five treasures are Gold, Silver, Precious Stones, Grain, and Holy Scriptures. Also highest mountain in India. Parent Mountain is Mount Everest.",
                "#4. Lhotse is the least climbed 8,000-meter peak in Nepal. Parent Mountain is Mount Everest.",
                "#5. Due to its isolation and lack of tea houses this area still receives few trekkers. This is one of the most remote and unfrequented trekking areas of Nepal. It is also known as off beaten area by the trekkers because of the geographical remoteness as well as adverse climatic condition, which normally caused hazardous mountain sickness. Parent Mountain is Mount Everest.",
                "#6. Cho Oyu is translated in Tibetan as \"the Turquoise Goddess\". Some climbers claim that Cho Oyu is the easiest 8000 meter peak (if anything over 8000 meters can be called easy!). Its relatively easy access makes it an attractive climb for someone with limited time, as it can be attempted in roughly 6 weeks round trip. Parent Mountain is Mount Everest.",
                "#7. While Cho Oyu is touted by many as an easy 8000er, Dhaulagiri, named \"White Mountain,\" from the Sanskrit dhavala giri, has a reputation of being one of the more technically challenging 8000-meter peaks of the Himalayas. It is the highest mountain located entirely in Nepal. Parent Mountain is K2.",
                "#8. The name Manaslu comes from the Sanskrit word Manasa, translated as \"Mountain of the Spirit\". Manasa means \"soul\" or \"spirit.\". Manaslu is a dangerous peak with a high fatality rate, high avalanche danger on the lower slopes, but easier non-technical climbing up high. Parent Mountain is Cho Oyu.",
                "#9. Nanga Parbat means \"Naked Mountain\" in Urdu. The name the locals call the peak is Diamir, which translates to \"king of mountains.\". Nanga Parbat is considered the second hardest 8,000-meter peak after K2, the second highest peak in the world, as well as one of the most dangerous. Parent Mountain is Dhaulagiri.",
                "#10. Annapurna is a Sanskrit word that literally means \"full of food\" but translates to Goddess of the Harvest. Annapurna is a Hindu fertility goddess. Annapurna was the first 8,000-meter peak climbed and the first to be climbed without supplemental oxygen. Parent Mountan is Cho Oyu"};

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //generate a random number
                Random rand = new Random();
                int randomNum = rand.nextInt(mountains.length);

                //use random number to access element in mountains array and mountainTrivia array in order to show them
                showTextView.setText(mountains[randomNum]);
                showTriviaTextView.setText(mountainTrivia[randomNum]);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
