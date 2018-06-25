package com.example.sunzero.findfloats;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import java.io.ByteArrayOutputStream;

public class Description extends AppCompatActivity {

    private EditText mSearchField;
    private ImageButton mSearchBtn;
    private RecyclerView mResultList;
    private DatabaseReference mUserDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);

        mUserDatabase = FirebaseDatabase.getInstance().getReference("uploads");

        mSearchField = (EditText) findViewById(R.id.search_field);
        mSearchBtn = (ImageButton) findViewById(R.id.search_btn);

        mResultList = (RecyclerView) findViewById(R.id.result_list);


        mSearchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String searchText = mSearchField.getText().toString();

                firebaseShowDescriptionSearch(searchText);

            }
        });
    }

    private void firebaseShowDescriptionSearch(String searchText) {
        FirebaseRecyclerAdapter<ShowDescription, ShowDescriptionViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<ShowDescription, ShowDescriptionViewHolder>(
                ShowDescription.class,
                R.layout.list_description,
                mUserDatabase
        ) {
            @Override
            protected void populateViewHolder(ShowDescriptionViewHolder viewHolder, ShowDescription model, int position) {

                viewHolder.setDetails(model.getName(),model.getJinvid(),model.getImageUrl());

            }
        };
    }

    public static class ShowDescriptionViewHolder extends RecyclerView.ViewHolder {

        View mView;

        public ShowDescriptionViewHolder(View itemView) {
            super(itemView);

            mView = itemView;
        }
        public void setDetails(String showDescriptionName, String showDescriptionJinvid, String showDescriptionImageUrl){

            TextView show_name = mView.findViewById(R.id.name_text);
            TextView show_jinvid = mView.findViewById(R.id.start_text);
            TextView show_imageUri = mView.findViewById(R.id.profile_image);

            show_name.setText(showDescriptionName);
            show_jinvid.setText(showDescriptionJinvid);
            Glide.with(getA)
        }

    }
}

