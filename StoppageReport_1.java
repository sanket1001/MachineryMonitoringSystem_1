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
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class StoppageReport_1 extends AppCompatActivity {


    Button btnRed;
    Button btnYellow;
    Button btnGreen;
    Button btnStMain;
    Toolbar toolStop;

    String DEPT_INFO;
    String MACHINE_NO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stoppage_report_1);
        MACHINE_NO=getIntent().getStringExtra("machine");
        DEPT_INFO = getIntent().getStringExtra("deptInfo");

        /*setting toolbar color*/
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbarStop);
        myToolbar.setTitle(DEPT_INFO+" > "+MACHINE_NO);
        setSupportActionBar(myToolbar);
        //myToolbar.setTitle(MACHINE_NO);
        /*setting status bar color*/
        Window window = StoppageReport_1.this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(StoppageReport_1.this,R.color.titleBackgroundColorMustard));

        toolStop = (Toolbar) findViewById(R.id.toolbarStop);
        toolStop.setTitle(DEPT_INFO+" >>> "+MACHINE_NO);


    }

    public void onReport(View v)
    {
        FirebaseDatabase mFBdb = FirebaseDatabase.getInstance();
        DatabaseReference mRef = mFBdb.getReference().child(DEPT_INFO).child(MACHINE_NO);

        Intent intent = new Intent(StoppageReport_1.this, DepartmentSelect_1.class);
        switch (DEPT_INFO)
        {
            case "CARDING":
                intent = new Intent(StoppageReport_1.this, Carding_1.class);
                break;
            case "BLOWROOM":
                intent = new Intent(StoppageReport_1.this, Blowroom_1.class);
                break;
            case "DRAWING":
                intent = new Intent(StoppageReport_1.this, Drawing_1.class);
                break;
            case "INTER":
                intent = new Intent(StoppageReport_1.this, Inter_1.class);
                break;
            case "RINGFRAME":
                intent = new Intent(StoppageReport_1.this,Ringframe_1.class);
                break;
            case "STEAMING":
                intent = new Intent(StoppageReport_1.this,Steaming_1.class);
                break;
            case "WINDING":
                intent = new Intent(StoppageReport_1.this,Winding_1.class);
                break;
        }

        switch (v.getId())
        {
            case R.id.btnRed:
                //mRef.child("status").setValue("NOT WORKING");
                Intent intent1= new Intent(StoppageReport_1.this, RedReport.class);
                intent1.putExtra("deptInfo",DEPT_INFO);
                intent1.putExtra("machine",MACHINE_NO);
                startActivity(intent1);

                break;
            case R.id.btnYellow:
                mRef.child("status").setValue("REPAIR IN PROGRESS");
                mRef.child("msg").setValue("REPAIR IN PROGRESS");
                mRef.child("color").setValue(R.color.YELLOW);
                Toast.makeText(StoppageReport_1.this, ""+MACHINE_NO+" REPAIR IN PROGRESS!", Toast.LENGTH_SHORT).show();
                startActivity(intent);

                break;
            case R.id.btnGreen:
                mRef.child("status").setValue("WORKING");
                mRef.child("msg").setValue("WORKING");
                mRef.child("color").setValue(R.color.GREEN);
                Toast.makeText(StoppageReport_1.this, ""+MACHINE_NO+" is set WORKING!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
            case R.id.btnStMain:
                startActivity(intent);
                break;

        }

    }

}
