package com.example.levon.exampletwo;

import android.graphics.Bitmap;
import android.widget.ListView;

import java.util.ArrayList;

public class Model {
    private Bitmap imgBitmap;
    int likeCounter = 0;
    int commentCounter = 0;
    boolean isLiked = false;
    boolean isCommentActive = false;
    ArrayList<CommentModel> arrayList = new ArrayList<>();

    Model(Bitmap imgBitmap) {
        this.imgBitmap = imgBitmap;
    }

    public Bitmap getImgBitmap() {
        return imgBitmap;
    }

    public void plusLike() {
        ++likeCounter;
    }

    public void plusComment() {
        ++commentCounter;
    }

    public void minusLike() {
        --likeCounter;
    }


}
