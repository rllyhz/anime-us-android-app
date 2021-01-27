package id.rllyhz.animeus.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.rllyhz.animeus.R;
import id.rllyhz.animeus.activity.AnimeDetailActivity;
import id.rllyhz.animeus.activity.MainActivity;
import id.rllyhz.animeus.adapter.AnimeAdapter;

public class AnimeFragment extends Fragment {
    private RelativeLayout animeTopContainer;
    private RecyclerView recyclerViewAnime;
    private TextView animeTopTitle, animeTopDescription;
    private ImageView animeTopImage;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        animeTopContainer = getActivity().findViewById(R.id.anime_top_container);
        animeTopTitle = getActivity().findViewById(R.id.anime_top_title);
        animeTopDescription = getActivity().findViewById(R.id.anime_top_description);
        animeTopImage = getActivity().findViewById(R.id.anime_top_image);

        String animeTopTitleText = "Anime Top Title";
        String animeTopDescriptionText = "Anime Top Description";
        animeTopImage.setBackground(getActivity().getDrawable(R.mipmap.ic_launcher_round));
        animeTopTitle.setText(animeTopTitleText);
        animeTopDescription.setText(animeTopDescriptionText);

        animeTopContainer.setOnClickListener(v ->
                gotoAnimeDetailActivity(animeTopTitleText, animeTopDescriptionText));

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

        adapter.setOnItemClickListener((view, position) ->
                gotoAnimeDetailActivity(adapter.getAnimeAt(position).get(0), adapter.getAnimeAt(position).get(1)));

        recyclerViewAnime.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewAnime.setAdapter(adapter);
    }

    private void gotoAnimeDetailActivity(String title, String description) {
        Intent animeDetailActivity = new Intent(getActivity(), AnimeDetailActivity.class);
        animeDetailActivity.putExtra(AnimeDetailActivity.EXTRA_ANIME_DETAIL_TITLE, title);
        animeDetailActivity.putExtra(AnimeDetailActivity.EXTRA_ANIME_DETAIL_DESCRIPTION, description);

        getActivity().overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

        getActivity().startActivityForResult(animeDetailActivity, MainActivity.REQUEST_CODE_ANIME_DETAIL);
    }
}
