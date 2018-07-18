package ps1.rishabh.com.machinerymonitoringsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class StoppageReport extends AppCompatActivity {

    ListView stoplv;
    ArrayList<String> reasons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stoppage_report);

        stoplv = (ListView) findViewById(R.id.stoplv);
        reasons = new ArrayList<String>();
        reasons.add("Mechanical Problem");
        reasons.add("Elecrical Problem");
        reasons.add("<Problem 1>");
        reasons.add("<Problem 2>");
        reasons.add("<Problem 3>");
        reasons.add("<Problem 4>");

        StoppageReportAdapter adapter= new StoppageReportAdapter(this, reasons);
        stoplv.setAdapter(adapter);
    }
}
