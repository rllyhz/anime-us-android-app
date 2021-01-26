package id.rllyhz.animeus.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.rllyhz.animeus.R;
import id.rllyhz.animeus.adapter.AnimeAdapter;

public class AnimeFragment extends Fragment {
    private RecyclerView recyclerViewAnime;
    private TextView animeTopTitle, animeTopDescription;
    private ImageView animeTopImage;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        animeTopTitle = getActivity().findViewById(R.id.anime_top_title);
        animeTopDescription = getActivity().findViewById(R.id.anime_top_description);
        animeTopImage = getActivity().findViewById(R.id.anime_top_image);

        animeTopImage.setBackground(getActivity().getDrawable(R.mipmap.ic_launcher_round));
        animeTopTitle.setText("Anime Top Title");
        animeTopDescription.setText("Anime Top Description");

        setRecyclerView();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_anime, container, false);
    }

    private void setRecyclerView() {
        recyclerViewAnime = getActivity().findViewById(R.id.recyclerview_anime);

        List<ArrayList<String>> animeList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            ArrayList<String> animeDetail = new ArrayList<>();
            animeDetail.add("Anime Title " + i);
            animeDetail.add("Anime Description " + i);

            animeList.add(animeDetail);
        }

        AnimeAdapter adapter = new AnimeAdapter(getContext(), animeList);
        recyclerViewAnime.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewAnime.setAdapter(adapter);
    }
}
