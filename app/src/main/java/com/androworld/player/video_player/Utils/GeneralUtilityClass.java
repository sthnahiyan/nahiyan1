package com.androworld.player.video_player.Utils;

import android.annotation.SuppressLint;
import android.os.AsyncTask;

public class GeneralUtilityClass {

    @SuppressLint("StaticFieldLeak")
    private void nativeAd() {
        new AsyncTask<Void, Void, Void>() {

            public Void doInBackground(Void... voidArr) {

                return null;
            }


            public void onPostExecute(Void voidR) {

                super.onPostExecute(voidR);
            }
        }.execute(new Void[0]);
    }

}
