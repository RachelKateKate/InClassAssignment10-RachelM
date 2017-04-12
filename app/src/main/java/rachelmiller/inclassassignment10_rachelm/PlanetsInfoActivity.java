package rachelmiller.inclassassignment10_rachelm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class PlanetsInfoActivity extends AppCompatActivity {

    TextView displayText;
    TextView nameText;
    TextView infoText;
    ImageView image;
    String savedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planets_info2);

        nameText = (TextView) findViewById(R.id.planet_name);

        infoText = (TextView) findViewById(R.id.planet_info);

        image = (ImageView) findViewById(R.id.planet_photo);

        Intent i = getIntent();
        Planets p = (Planets) i.getSerializableExtra(Keys.PLANETS);

        p.getName().toString();
        p.getInfo().toString();
        p.getPhotoId();

        displayText = (TextView) findViewById(R.id.display_text);

        savedText = displayText.getText().toString();

        displayText.setText((p.getName().toString() + "\n" + p.getInfo().toString() + "\n"));
        image.setImageResource(p.getPhotoId());
    }
}


