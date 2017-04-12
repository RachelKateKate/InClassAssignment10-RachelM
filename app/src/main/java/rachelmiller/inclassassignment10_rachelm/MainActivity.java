package rachelmiller.inclassassignment10_rachelm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Planets> planets;
    private PlanetsAdapter planetsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        planetsAdapter = new PlanetsAdapter(planets, this);
        recyclerView.setAdapter(planetsAdapter);
    }

    public void addRandomPlanet(View view) {
        planets.add(getRandomPlanet()); // populates and adds to the list
        planetsAdapter.notifyDataSetChanged(); // data has grown and needs to be told to refresh
    }

    private void initialData() {
        planets = new ArrayList<>();
        planets.add(new Planets("Mercury", "smallest planet", R.drawable.mercury));
        planets.add(new Planets("Jupiter", "has a red dot", R.drawable.jupiter));
        planets.add(new Planets("Saturn", "has rings", R.drawable.saturn));
    }

    private Planets getRandomPlanet() {
        int num = (int) (Math.random() * 3);
        if (num == 0)
            return new Planets("Mercury", "smallest planet", R.drawable.mercury);
        else if (num == 1)
            return new Planets("Jupiter", "aas a red dot", R.drawable.jupiter);
        else
            return new Planets("Saturn", "has rings", R.drawable.saturn);
    }
}
