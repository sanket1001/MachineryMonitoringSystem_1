package ps1.rishabh.com.machinerymonitoringsystem;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RedReport extends AppCompatActivity {
    Button btnProb1;
    Button btnProb2;
    Button btnProb3;
    Button btnProb5;
    Button btnProb6;
    Button btnProb7;
    Button btnProb8;
    Button btnProb9;
    Button btnProb10;
    String DEPT_INFO;
    String MACHINE_NO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.red_report);
        DEPT_INFO = getIntent().getStringExtra("deptInfo");
        MACHINE_NO = getIntent().getStringExtra("machine");

        /*setting toolbar color*/
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbarRed);
        myToolbar.setTitle(DEPT_INFO+">"+MACHINE_NO+"> REPORT STOPPAGE");
        setSupportActionBar(myToolbar);
        //myToolbar.setTitle(MACHINE_NO);
        /*setting status bar color*/
        Window window = RedReport.this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(RedReport.this,R.color.titleBackgroundColorMustard));



    }

    public void onRedReport(View v)
    {
        FirebaseDatabase mFiredb=FirebaseDatabase.getInstance();
        DatabaseReference mRefdb = mFiredb.getReference().child(DEPT_INFO).child(MACHINE_NO);
        switch (v.getId())
        {
            case R.id.btnProb1:
                mRefdb.child("msg").setValue("ELECTRICAL FAULT");
                mRefdb.child("status").setValue("NOT WORKING");
                mRefdb.child("color").setValue(R.color.RED);
                break;
            case R.id.btnProb2:
                mRefdb.child("msg").setValue("MECHANICAL FAULT");
                mRefdb.child("status").setValue("NOT WORKING");
                mRefdb.child("color").setValue(R.color.RED);
                break;
            case R.id.btnProb3:
                mRefdb.child("msg").setValue("MAIN MOTOR");
                mRefdb.child("status").setValue("NOT WORKING");
                mRefdb.child("color").setValue(R.color.RED);
                break;
            case R.id.btnProb4:
                mRefdb.child("msg").setValue("PNEUMATIC MOTOR");
                mRefdb.child("status").setValue("NOT WORKING");
                mRefdb.child("color").setValue(R.color.RED);
                break;
            case R.id.btnProb5:
                mRefdb.child("msg").setValue("INVERTER");
                mRefdb.child("status").setValue("NOT WORKING");
                mRefdb.child("color").setValue(R.color.RED);
                break;
            case R.id.btnProb6:
                mRefdb.child("msg").setValue("MATERIAL CHOKEUP");
                mRefdb.child("status").setValue("NOT WORKING");
                mRefdb.child("color").setValue(R.color.RED);
                break;
            case R.id.btnProb7:
                mRefdb.child("msg").setValue("DRAFT GEAR");
                mRefdb.child("status").setValue("NOT WORKING");
                mRefdb.child("color").setValue(R.color.RED);
                break;
            case R.id.btnProb8:
                mRefdb.child("msg").setValue("MAIN GEAR");
                mRefdb.child("status").setValue("NOT WORKING");
                mRefdb.child("color").setValue(R.color.RED);
                break;
            case R.id.btnProb9:
                mRefdb.child("msg").setValue("BELT DRIVE");
                mRefdb.child("status").setValue("NOT WORKING");
                mRefdb.child("color").setValue(R.color.RED);
                break;
            case R.id.btnProb10:
                mRefdb.child("msg").setValue("GUAGE SETTING");
                mRefdb.child("status").setValue("NOT WORKING");
                mRefdb.child("color").setValue(R.color.RED);
                break;


        }
        Intent intent = new Intent(RedReport.this, DepartmentSelect_1.class);
        switch (DEPT_INFO)
        {
            case "CARDING":
                intent = new Intent(RedReport.this,Carding_1.class);
                break;
            case "BLOWROOM":
                intent = new Intent(RedReport.this,Blowroom_1.class);
                break;
            case "DRAWING":
                intent = new Intent(RedReport.this,Drawing_1.class);
                break;
            case "INTER":
                intent = new Intent(RedReport.this,Inter_1.class);
                break;
            case "RINGFRAME":
                intent = new Intent(RedReport.this,Ringframe_1.class);
                break;
            case "STEAMING":
                intent = new Intent(RedReport.this,Steaming_1.class);
                break;
            case "WINDING":
                intent = new Intent(RedReport.this,Winding_1.class);
                break;
        }
        startActivity(intent);
    }
}
