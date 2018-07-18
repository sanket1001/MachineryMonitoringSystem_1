package ps1.rishabh.com.machinerymonitoringsystem;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class DepartmentSelect_1 extends AppCompatActivity {
    Button btnBlowroom;
    Button btnCarding;
    Button btnDrawing;
    Button btnInter;
    Button btnRingframe;
    Button btnSteaming;
    Button btnWinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department_select_1);

        /*setting toolbar color*/
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbarTitle);
        setSupportActionBar(myToolbar);
        /*setting status bar color*/
        Window window = DepartmentSelect_1.this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(DepartmentSelect_1.this,R.color.titleBackgroundColorMustard));

        btnBlowroom = (Button) findViewById(R.id.btnBlowRoom);
        btnCarding = (Button) findViewById(R.id.btnCarding);
        btnDrawing = (Button) findViewById(R.id.btnDrawing);
        btnInter = (Button) findViewById(R.id.btnInter);
        btnRingframe = (Button) findViewById(R.id.btnRingframe);
        btnSteaming = (Button) findViewById(R.id.btnSteaming);
        btnWinding = (Button) findViewById(R.id.btnWinding);







    }



    public void onClick (View v)
    {
        Intent intent= new Intent(DepartmentSelect_1.this, Ringframe_1.class);
        switch (v.getId())
        {
            case R.id.btnBlowRoom:
                intent = new Intent(DepartmentSelect_1.this, Blowroom_1.class);
                intent.putExtra("deptInfo","BLOWROOM");
                break;
            case R.id.btnCarding:
                intent = new Intent(DepartmentSelect_1.this, Carding_1.class);
                intent.putExtra("deptInfo","CARDING");

                break;
            case R.id.btnDrawing:
                intent = new Intent(DepartmentSelect_1.this, Drawing_1.class);
                intent.putExtra("deptInfo","DRAWING");

                break;
            case R.id.btnInter:
                intent = new Intent(DepartmentSelect_1.this, Inter_1.class);
                intent.putExtra("deptInfo","INTER");
                break;
            case R.id.btnRingframe:
                intent= new Intent(DepartmentSelect_1.this, Ringframe_1.class);
                intent.putExtra("deptInfo","RINGFRAME");
                break;
            case R.id.btnSteaming:
                intent= new Intent(DepartmentSelect_1.this, Steaming_1.class);
                intent.putExtra("deptInfo","STEAMING");
                break;
            case R.id.btnWinding:
                intent= new Intent(DepartmentSelect_1.this, Winding_1.class);
                intent.putExtra("deptInfo","WINDING");
                break;

        }
        startActivity(intent);
    }
}
