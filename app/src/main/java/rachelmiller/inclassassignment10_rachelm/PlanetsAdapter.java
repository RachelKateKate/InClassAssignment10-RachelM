package rachelmiller.inclassassignment10_rachelm;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by rachelmiller on 4/11/17.
 */

public class PlanetsAdapter extends RecyclerView.Adapter<PlanetsViewHolder> {
    private List<Planets> planets;
    private Context context;

    public PlanetsAdapter(List<Planets> planets, Context context) {
        this.planets = planets;
        this.context = context;
    }

    @Override //create with card view
    public PlanetsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_planet, parent, false);
        return new PlanetsViewHolder(view, context);
    }

    @Override // when a new item is loaded and an old one gets receylced
    public void onBindViewHolder(PlanetsViewHolder holder, int position) {
        Planets p = planets.get(position);
        holder.bind(p);
    }

    @Override //creates the size of the recycler viewer
    public int getItemCount() {
        return planets.size();
    }

}

