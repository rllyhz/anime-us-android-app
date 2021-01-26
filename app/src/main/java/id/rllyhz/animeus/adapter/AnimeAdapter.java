package id.rllyhz.animeus.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.rllyhz.animeus.R;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder> {
    private OnItemClickListener onItemClickListener;
    private OnItemLongClickListener onItemLongClickListener;

    private Context context;
    private List<ArrayList<String>> animeList;

    public AnimeAdapter(Context context, List<ArrayList<String>> animeList) {
        this.context = context;
        this.animeList = animeList;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }

    public void setOnItemLongClickListener(OnItemLongClickListener listener) {
        this.onItemLongClickListener = listener;
    }

    @NonNull
    @Override
    public AnimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.anime_item, parent, false);
        return new AnimeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeViewHolder holder, int position) {
        holder.animeImage.setBackground(context.getDrawable(R.drawable.ic_launcher_foreground));
        holder.animeTitle.setText(animeList.get(position).get(0));
        holder.animeDescription.setText(animeList.get(position).get(1));

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
    }

    @Override
    public int getItemCount() {
        return animeList == null ? 0 : animeList.size();
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

    public interface OnItemClickListener {
        void onClick(View view, int position);
    }

    public interface OnItemLongClickListener {
        boolean onLongClick(View view, int position);
    }
}
