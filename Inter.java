package ps1.rishabh.com.machinerymonitoringsystem;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;

public class Inter extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing);

        /*setting toolbar color*/
        Toolbar myToolbarInter = (Toolbar) findViewById(R.id.toolbarTitleInter);
        setSupportActionBar(myToolbarInter);
        getSupportActionBar().setTitle("Inter/Simplex");
        /*setting status bar color*/
        Window window = Inter.this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(Inter.this,R.color.titleBackgroundColorMustard));

    }
}




