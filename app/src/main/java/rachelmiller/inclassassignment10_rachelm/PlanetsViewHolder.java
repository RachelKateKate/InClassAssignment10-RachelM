package rachelmiller.inclassassignment10_rachelm;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rachelmiller on 4/10/17.
 */

public class PlanetsViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView planetNameView;
    private TextView planetInfoView;
    private ImageView planetPhotoView;
    private Context context;

    public PlanetsViewHolder(View itemView, Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        planetNameView = (TextView) itemView.findViewById(R.id.planet_name);
        planetInfoView = (TextView) itemView.findViewById(R.id.planet_info);
        planetPhotoView = (ImageView) itemView.findViewById(R.id.planet_photo);
        this.context = context;
    }

    public void bind(final Planets planets) {
        planetNameView.setText(planets.name);
        planetInfoView.setText(planets.info);
        planetPhotoView.setImageResource(planets.photoId);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, PlanetsInfoActivity.class);
                i.putExtra(Keys.PLANETS, planets);
                context.startActivity(i);
                Toast.makeText(context, planetNameView.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
