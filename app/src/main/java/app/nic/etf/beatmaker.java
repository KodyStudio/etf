package app.nic.etf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.etf.R;

public class beatmaker extends AppCompatActivity {

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
        setContentView(R.layout.activity_beatmaker);
    }
    //BOTON PARA IR A MAIN ACTIVITY
    public void atras (View view){
        Intent atras = new Intent(this, MainActivity.class);
        startActivity(atras);
    }
    public void youtubeeznar (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCMYXezUsOc0ff86yNFD-Ofw"));
        startActivity(browserIntent);
    }
    public void youtubechess (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UC--9SRhIJjiKUAjUQV7UHhw"));
        startActivity(browserIntent);
    }
    public void youtubeour4 (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCYcc4mCVDh0HsjF1wfro_ww"));
        startActivity(browserIntent);
    }
    public void youtubezorn (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UC82S1_CVxSAYhSLLt3wX-lw"));
        startActivity(browserIntent);
    }
    public void youtubepachaone (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCGCCz2rqCgjZFDGnj8dq7Rw"));
        startActivity(browserIntent);
    }
    public void youtubetheogbeat (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCPjMlRMMCPyytYfbuJnouZg"));
        startActivity(browserIntent);
    }
}
