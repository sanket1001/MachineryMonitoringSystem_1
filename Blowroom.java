package ps1.rishabh.com.machinerymonitoringsystem;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;

public class Blowroom extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blowroom);

        /*setting toolbar color*/
        Toolbar myToolbarBlowroom = (Toolbar) findViewById(R.id.toolbarTitleBlowroom);
        setSupportActionBar(myToolbarBlowroom);
        getSupportActionBar().setTitle("Blowroom");
        /*setting status bar color*/
        Window window = Blowroom.this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(Blowroom.this,R.color.titleBackgroundColorMustard));

    }}
