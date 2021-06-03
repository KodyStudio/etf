package app.nic.etf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.etf.R;

public class MainActivity extends AppCompatActivity {

    Context context;

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
        setContentView(R.layout.activity_main);

        context = this;

        RequestQueue queue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, "http://www.google.com",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // do nothing xd
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Intent intent = new Intent(context, offline.class);
                startActivity(intent);
            }
        });
        queue.add(stringRequest);
    }
    //cambiar de activity a easymode
    public void easymode(View view){
        Intent easymode = new Intent(this, easymode.class);
        startActivity(easymode);
    }
    public void hardmode(View view){
        Intent hardmode = new Intent (this, hardmode.class);
        startActivity(hardmode);
    }
    public void tematicas(View view){
        Intent tematica = new Intent (this, tematica.class);
        startActivity(tematica);
    }
    public void beatmaker(View view){
        Intent beatmaker = new Intent (this, beatmaker.class);
        startActivity(beatmaker);
    }
    public void personaje(View view){
        Intent personaje = new Intent (this, personaje.class);
        startActivity(personaje);
    }
}
