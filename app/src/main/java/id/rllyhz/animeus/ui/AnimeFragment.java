package id.rllyhz.animeus.ui;

import android.app.ProgressDialog;
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

import com.squareup.picasso.Picasso;

import java.util.List;

import id.rllyhz.animeus.R;
import id.rllyhz.animeus.activity.AnimeDetailActivity;
import id.rllyhz.animeus.activity.MainActivity;
import id.rllyhz.animeus.adapter.TopAnimeAdapter;
import id.rllyhz.animeus.api.ApiClient;
import id.rllyhz.animeus.api.data_service.AnimeAPIService;
import id.rllyhz.animeus.api.response_type.GetTopAnimeResponseType;
import id.rllyhz.animeus.helper.CustomToast;
import id.rllyhz.animeus.api.response_type.GetTopAnimeResponseType.Anime;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AnimeFragment extends Fragment {
    private SearchableRecyclerviewListener searchableRecyclerviewListener;
    private TopAnimeAdapter adapter;

    private RelativeLayout animeTopContainer;
    private RecyclerView recyclerViewAnime;
    private TextView animeTopTitle, animeTopDescription, animeTopHeading, animeListHeading;
    private ImageView animeTopImage;
    private TextView footerText;

    private ProgressDialog progressDialog;
    private CustomToast toast;

    private boolean listFailedTobeDownloaded = false;
    private List<Anime> topAnimeList;
    private Anime topAnime;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        toast = new CustomToast(getActivity(), R.layout.custom_toast);
        progressDialog = new ProgressDialog(getActivity());

        showDialog("Loading...", false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        animeTopHeading = getActivity().findViewById(R.id.anime_top_heading);
        animeListHeading = getActivity().findViewById(R.id.anime_list_heading);
        animeTopContainer = getActivity().findViewById(R.id.anime_top_container);
        animeTopTitle = getActivity().findViewById(R.id.anime_top_title);
        animeTopDescription = getActivity().findViewById(R.id.anime_top_description);
        animeTopImage = getActivity().findViewById(R.id.anime_top_image);
        recyclerViewAnime = getActivity().findViewById(R.id.recyclerview_anime);
        footerText = getActivity().findViewById(R.id.footer_text);
        footerText.setVisibility(View.GONE);

        AnimeAPIService animeAPIService = ApiClient.getAnimeApiServiceInstance().create(AnimeAPIService.class);
        Call<GetTopAnimeResponseType> call = animeAPIService.getTopAnime();

        call.enqueue(new Callback<GetTopAnimeResponseType>() {
            @Override
            public void onResponse(Call<GetTopAnimeResponseType> call, Response<GetTopAnimeResponseType> response) {
                if (response.isSuccessful() && response.code() == 200 && response.body() != null) {
                    topAnimeList = response.body().getAnimeList();
                    topAnime = topAnimeList.get(0);
                    setUI();
                    closeDialog();
                    footerText.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onFailure(Call<GetTopAnimeResponseType> call, Throwable t) {
                showToast("Failed load data!");
                closeDialog();
            }
        });
    }

    private void setUI() {
        if (!listFailedTobeDownloaded) {
            Picasso.get().load(topAnime.getImageUrl())
                    .placeholder(R.mipmap.ic_launcher_round)
                    .into(animeTopImage);

            animeTopTitle.setText(topAnime.getTitle());
            animeTopDescription.setText("Total Episodes :  " + topAnime.getEpisodes());

            animeTopContainer.setOnClickListener(v -> gotoAnimeDetailActivity(topAnime));
        } else {
            animeTopImage.setImageDrawable(getActivity().getDrawable(R.mipmap.ic_launcher_round));
            animeTopTitle.setText(".......");
            animeTopDescription.setText("..............");
        }

        animeTopHeading.setVisibility(View.VISIBLE);
        animeTopContainer.setVisibility(View.VISIBLE);
        animeListHeading.setVisibility(View.VISIBLE);
        setRecyclerView();
        recyclerViewAnime.setVisibility(View.VISIBLE);
    }

    private void setRecyclerView() {
        topAnimeList.remove(0);
        adapter = new TopAnimeAdapter(getContext(), topAnimeList);

        adapter.setOnItemClickListener((view, position) -> gotoAnimeDetailActivity(adapter.getAnimeAt(position)));

        recyclerViewAnime.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerViewAnime.setAdapter(adapter);
        recyclerViewAnime.setFocusable(false);
    }

    public void setSearchableRecyclerviewListener(SearchableRecyclerviewListener listener) {
        this.searchableRecyclerviewListener = listener;
    }

    public void filterAnimeAdapter(String textPattern) {
        if (searchableRecyclerviewListener != null && adapter != null)
            searchableRecyclerviewListener.onSearch(adapter, textPattern);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_anime, container, false);
    }

    private void gotoAnimeDetailActivity(Anime topAnime) {
        Intent animeDetailActivity = new Intent(getActivity(), AnimeDetailActivity.class);
        animeDetailActivity.putExtra(AnimeDetailActivity.EXTRA_ANIME_DETAIL_TITLE, topAnime.getTitle());
        animeDetailActivity.putExtra(AnimeDetailActivity.EXTRA_ANIME_DETAIL_DESCRIPTION, "Total Episodes :  " + topAnime.getEpisodes());
        animeDetailActivity.putExtra(AnimeDetailActivity.EXTRA_ANIME_DETAIL_IMAGE_URL, topAnime.getImageUrl());

        getActivity().overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

        getActivity().startActivityForResult(animeDetailActivity, MainActivity.REQUEST_CODE_ANIME_DETAIL);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        setSearchableRecyclerviewListener(null);
    }

    private void showDialog(String message, boolean isCancelable) {
        progressDialog.setMessage(message);
        progressDialog.setCancelable(isCancelable);

        if (!progressDialog.isShowing())
            progressDialog.show();
    }

    private void closeDialog() {
        if (progressDialog.isShowing())
            progressDialog.dismiss();
    }

    private void showToast(String message) {
        toast.show(null, message);
    }

    public interface SearchableRecyclerviewListener {
        void onSearch(TopAnimeAdapter adapter, String textPattern);
    }
}
