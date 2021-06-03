package app.nic.etf;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.etf.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public class personaje extends AppCompatActivity implements RewardedVideoAdListener{

    VideoView videoView;
    MediaPlayer mp;
    ProgressDialog progressDialog;
    private InterstitialAd mInterstitialAd;
    private RewardedVideoAd mRewardedVideoAd;
    private static final long DURACION_SPLASH = 4000;

    {
        int duracion_splash = 4;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //full screen ↓↓↓
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        //full screen ↑↑↑↑

        setContentView(R.layout.activity_personaje);

        //Loading
        progressDialog = new ProgressDialog(personaje.this, android.R.style.Theme_DeviceDefault_Light_NoActionBar_Fullscreen);
        progressDialog.show();
        progressDialog.setContentView(R.layout.progress_dialog);
        Objects.requireNonNull(progressDialog.getWindow()).setBackgroundDrawableResource(
                android.R.color.transparent
        );
        //Loading ↑↑↑

        //ad video
        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        mRewardedVideoAd.setRewardedVideoAdListener(this);
        mRewardedVideoAd.loadAd("ca-app-pub-6435926247267945/5059802796", new AdRequest.Builder().build());

        //ad
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-6435926247267945/9899876564");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        // ↓↓↓ MUSIC ↓↓↓
        List<Uri> listmusica = new ArrayList<>();
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/chess/chess1.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/chess/chess2.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/chess/chess3.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/chess/chess6.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/chess/chess7.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/chess/chess8.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/chess/chess9.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/chess/chess10.mp3"));
        //==========================================================================================
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/eznar/eznar1.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/eznar/eznar2.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/eznar/eznar3.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/eznar/eznar4.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/eznar/eznar5.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/eznar/eznar6.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/eznar/eznar7.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/eznar/eznar8.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/eznar/eznar9.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/eznar/eznar10.mp3"));
        //==========================================================================================
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/zorn/zorn1.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/zorn/zorn3.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/zorn/zorn4.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/zorn/zorn5.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/zorn/zorn6.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/zorn/zorn7.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/zorn/zorn8.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/zorn/zorn9.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/zorn/zorn10.mp3"));
        //==========================================================================================
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/panchaone/pacha1.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/panchaone/pacha2.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/panchaone/pacha3.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/panchaone/pacha4.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/panchaone/pacha5.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/panchaone/pacha6.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/panchaone/pacha7.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/panchaone/pacha8.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/panchaone/pacha9.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/panchaone/pacha10.mp3"));
        //==========================================================================================
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/zorn/zorn1.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/zorn/zorn3.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/zorn/zorn4.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/zorn/zorn5.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/zorn/zorn6.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/zorn/zorn7.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/zorn/zorn8.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/zorn/zorn9.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/zorn/zorn10.mp3"));
        //==========================================================================================
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/TheOGBeats/theog1.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/TheOGBeats/theog2.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/TheOGBeats/theog3.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/TheOGBeats/theog4.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/TheOGBeats/theog5.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/TheOGBeats/theog6.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/TheOGBeats/theog7.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/TheOGBeats/theog8.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/TheOGBeats/theog9.mp3"));
        listmusica.add(Uri.parse("https://instrumentaless.s3.us-east-2.amazonaws.com/TheOGBeats/theog10.mp3"));

        mp = MediaPlayer.create(this, (listmusica.get(new Random().nextInt(listmusica.size()))));
        // ↑↑↑↑ MUSIC ↑↑↑↑

        // ↓↓↓ VIDEO ↓↓↓
        videoView = (VideoView) findViewById(R.id.vv);
        List<String> listUri = new ArrayList<>();
        videoView.setVideoURI
        (Uri.parse("https://personaje.s3.us-east-2.amazonaws.com/p1.mp4"));
        listUri.add("https://personaje.s3.us-east-2.amazonaws.com/p1.mp4");
        listUri.add("https://personaje.s3.us-east-2.amazonaws.com/p2.mp4");
        listUri.add("https://personaje.s3.us-east-2.amazonaws.com/p3.mp4");
        listUri.add("https://personaje.s3.us-east-2.amazonaws.com/p4.mp4");
        listUri.add("https://personaje.s3.us-east-2.amazonaws.com/p5.mp4");
        listUri.add("https://personaje.s3.us-east-2.amazonaws.com/p6.mp4");
        listUri.add("https://personaje.s3.us-east-2.amazonaws.com/p7.mp4");
        listUri.add("https://personaje.s3.us-east-2.amazonaws.com/p8.mp4");
        listUri.add("https://personaje.s3.us-east-2.amazonaws.com/p9.mp4");
        listUri.add("https://personaje.s3.us-east-2.amazonaws.com/p10.mp4");
        listUri.add("https://personaje.s3.us-east-2.amazonaws.com/p11.mp4");
        listUri.add("https://personaje.s3.us-east-2.amazonaws.com/p12.mp4");
        listUri.add("https://personaje.s3.us-east-2.amazonaws.com/p13.mp4");
        listUri.add("https://personaje.s3.us-east-2.amazonaws.com/p14.mp4");
        listUri.add("https://personaje.s3.us-east-2.amazonaws.com/p15.mp4");
        listUri.add("https://personaje.s3.us-east-2.amazonaws.com/p16.mp4");
        listUri.add("https://personaje.s3.us-east-2.amazonaws.com/p17.mp4");
        listUri.add("https://personaje.s3.us-east-2.amazonaws.com/p18.mp4");
        listUri.add("https://personaje.s3.us-east-2.amazonaws.com/p19.mp4");
        listUri.add("https://personaje.s3.us-east-2.amazonaws.com/p20.mp4");
        videoView.setVideoPath(listUri.get(new Random().nextInt(listUri.size())));
        videoView.setVisibility(View.VISIBLE);
        videoView.requestFocus();
        // ↑↑↑↑ VIDEO ↑↑↑↑

        // ↓↓↓ play ↓↓↓
        new Handler().postDelayed(new Runnable() {
         public void run() {
         progressDialog.cancel();
         videoView.start();
         mp.start();
            }
            ;
        }, DURACION_SPLASH);
        // ↑↑↑↑ play ↑↑↑↑

        // ↓↓↓ ad end video change activity ↓↓↓
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Intent i = new Intent(personaje.this, MainActivity.class);
                    startActivity(i);
                    // Code to be executed when the interstitial ad is closed.
                }
            }
        });
        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdClosed () {
                if(mRewardedVideoAd.isLoaded()){
                    mRewardedVideoAd.show();
                }
                else{
                    Intent i = new Intent(personaje.this, MainActivity.class);
                    startActivity(i);
                }
            }
        });
    }
    public void onCompletion(MediaPlayer mediaPlayer) {
        finish();
    }

    // ↓↓↓ stop music if i change activity ↓↓↓
    public void onPause()
    {
        super.onPause();
        mp.pause();
    }
    // ↑↑↑↑ stop music if i change activity ↑↑↑↑

    // ↓↓↓ button for change activity ↓↓↓
    public void atras (View view){
        Intent atras = new Intent(this, MainActivity.class);
        startActivity(atras);
    }
    //metodos anuncio de video
    @Override
    public void onRewardedVideoAdLoaded() {
        Log.e("VIDEO", "CARGADO");
    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {
        Intent atras = new Intent(this, MainActivity.class);
        startActivity(atras);
    }

    @Override
    public void onRewarded(RewardItem rewardItem) {
        Toast.makeText(this, "" + rewardItem.getAmount() + "" + rewardItem.getType(),Toast.LENGTH_LONG).show();
    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {
        Intent atras = new Intent(this, MainActivity.class);
        startActivity(atras);
    }

    @Override
    public void onRewardedVideoCompleted() {

    }
}
// ↑↑↑↑ button for change activity ↑↑↑↑
