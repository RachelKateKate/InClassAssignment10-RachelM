package rachelmiller.inclassassignment10_rachelm;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by rachelmiller on 4/10/17.
 */

public class PlanetViewHolder extends RecyclerView.ViewHolder {
    private CardView cardView;
    private TextView planetNameView;
    private TextView personInfoView;
    private ImageView personPhotoView;
    private Context context;

    public PlanetViewHolder(View itemView, Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        planetNameView = (TextView) itemView.findViewById(R.id.planet_name);


    }


}
