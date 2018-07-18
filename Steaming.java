package ps1.rishabh.com.machinerymonitoringsystem;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;

public class Steaming extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing);

        /*setting toolbar color*/
        Toolbar myToolbarDrawing = (Toolbar) findViewById(R.id.toolbarTitleDrawing);
        setSupportActionBar(myToolbarDrawing);
        getSupportActionBar().setTitle("Steaming");
        /*setting status bar color*/
        Window window = Steaming.this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(Steaming.this,R.color.titleBackgroundColorMustard));

    }
}
