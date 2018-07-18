package ps1.rishabh.com.machinerymonitoringsystem;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StoppageReportAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final ArrayList<String> reasons;

    public StoppageReportAdapter(@NonNull Context context, ArrayList<String> reasons) {
        super(context, R.layout.custom_list_2);
        this.context = context;
        this.reasons = reasons;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=inflater.inflate(R.layout.custom_list_2, parent, false);
        TextView tvProblem = rowView.findViewById(R.id.tvProblem);

        tvProblem.setText(reasons.get(position));




        return rowView;
    }
}
