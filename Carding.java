package ps1.rishabh.com.machinerymonitoringsystem;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;

public class Carding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carding);

        /*setting toolbar color*/
        Toolbar myToolbarCarding = (Toolbar) findViewById(R.id.toolbarTitleCarding);
        setSupportActionBar(myToolbarCarding);
        getSupportActionBar().setTitle("Carding");
        /*setting status bar color*/
        Window window = Carding.this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(Carding.this,R.color.titleBackgroundColorMustard));

    }



}
