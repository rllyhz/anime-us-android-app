package id.rllyhz.animeus.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import id.rllyhz.animeus.R;
import id.rllyhz.animeus.api.response_type.GetTopAnimeResponseType.Anime;
import id.rllyhz.animeus.helper.RecycleviewItemAnimator;

public class TopAnimeAdapter extends RecyclerView.Adapter<TopAnimeAdapter.AnimeViewHolder> implements Filterable {
    private OnItemClickListener onItemClickListener;
    private OnItemLongClickListener onItemLongClickListener;

    private Context context;
    private List<Anime> animeListFull;
    private List<Anime> filteredAnimeList = new ArrayList<>();

    public TopAnimeAdapter(Context context, List<Anime> animeList) {
        this.context = context;
        this.animeListFull = animeList;
        this.filteredAnimeList.addAll(animeList);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }

    public void setOnItemLongClickListener(OnItemLongClickListener listener) {
        this.onItemLongClickListener = listener;
    }

    public Anime getAnimeAt(int position) {
        if (filteredAnimeList != null)
            return filteredAnimeList.get(position);

        return null;
    }

    @NonNull
    @Override
    public AnimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.anime_item, parent, false);
        return new AnimeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeViewHolder holder, int position) {
        Picasso.get()
                .load(filteredAnimeList.get(position).getImageUrl())
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher_round)
                .into(holder.animeImage);

        holder.animeTitle.setText(filteredAnimeList.get(position).getTitle());
        holder.animeDescription.setText("Total Episodes :  " + filteredAnimeList.get(position).getEpisodes());

        // set onClick listener
        holder.itemView.setOnClickListener(v -> {
            if (onItemClickListener != null)
                onItemClickListener.onClick(v, position);
        });

        // set onLongClick listener
        holder.itemView.setOnLongClickListener(v -> {
            if (onItemLongClickListener != null)
                return onItemLongClickListener.onLongClick(v, position);

            return false;
        });

        RecycleviewItemAnimator.animateBottomUp(holder.itemView, position);
    }

    @Override
    public int getItemCount() {
        return animeListFull == null ? 0 : animeListFull.size();
    }

    public class AnimeViewHolder extends RecyclerView.ViewHolder {
        private ImageView animeImage;
        private TextView animeTitle;
        private TextView animeDescription;

        public AnimeViewHolder(@NonNull View itemView) {
            super(itemView);

            animeImage = itemView.findViewById(R.id.anime_item_image);
            animeTitle = itemView.findViewById(R.id.anime_item_title);
            animeDescription = itemView.findViewById(R.id.anime_item_description);
        }
    }

    @Override
    public Filter getFilter() {
        return animeFilter;
    }

    private Filter animeFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<Anime> filteredList = new ArrayList<>();
            filteredList.clear();

            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(animeListFull);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (Anime topAnime : animeListFull) {
                    if (topAnime.getTitle().toLowerCase().trim().contains(filterPattern)) {
                        filteredList.add(topAnime);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            filteredAnimeList.clear();
            filteredAnimeList.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };

    public interface OnItemClickListener {
        void onClick(View view, int position);
    }

    public interface OnItemLongClickListener {
        boolean onLongClick(View view, int position);
    }

}
