package ps1.rishabh.com.machinerymonitoringsystem;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class CustomAdapterRing extends ArrayAdapter {

    Integer[] statusRing = new Integer[14];
    int i;


    public CustomAdapterRing(@NonNull Context context, Integer[] strings) {
        super(context,R.layout.custom_list, strings);
        for(int i=0;i<14;i++) {
            statusRing[i] = strings[i];
        }
    }
    /*logic for status of departmets */


    Integer[] statusRingframe = {0, 1, 0, 0, 2, 2, 1, 0, 0, 1, 0, 0, 2, 2};

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflaterRing = LayoutInflater.from(getContext());
        View customView = inflaterRing.inflate(R.layout.custom_list, parent, false);

        String[] ringframeMachines = {"MACHINE NO.15", "MACHINE NO.16", "MACHINE NO.17", "MACHINE NO.18", "MACHINE NO.19", "MACHINE NO.20", "MACHINE NO.21", "MACHINE NO.22",
                "MACHINE NO.23", "MACHINE NO.24", "MACHINE NO.25", "MACHINE NO.26", "MACHINE NO.27", "MACHINE NO.28"};

        String singleRing = ringframeMachines[position];
        Integer statusSingleRing = statusRing[position];

        TextView textView = (TextView) customView.findViewById(R.id.textViewDepartments);
        ImageView imageView = (ImageView) customView.findViewById(R.id.imageViewDepartments);

        textView.setText(singleRing);

        /*Logic for statues of machine inside departments */
        switch (statusSingleRing){
            case 0: imageView.setImageResource(R.drawable.green_triangle);break;
            case 1: imageView.setImageResource(R.drawable.yellow_triangle_o);break;
            case 2: imageView.setImageResource(R.drawable.red_triangle);break;
        }
        return customView;

    }

}
