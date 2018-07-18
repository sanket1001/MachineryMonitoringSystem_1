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

class CustomAdapter extends ArrayAdapter<String>{
    public CustomAdapter(@NonNull Context context, String[] strings) {
        super(context,R.layout.custom_list, strings);
    }
    /*logic for status of departmets */
    Integer[] statusDepartment = {0, 0, 1, 0, 2, 2, 1};

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.custom_list, parent, false);

        String singleDepartment = getItem(position);
        Integer statusSingleDepartment = statusDepartment[position];

        TextView textView = (TextView) customView.findViewById(R.id.textViewDepartments);
        ImageView imageView = (ImageView) customView.findViewById(R.id.imageViewDepartments);

        textView.setText(singleDepartment);

        /*Logic for statues of machine inside departments */
        switch (statusSingleDepartment){
            case 0: imageView.setImageResource(R.drawable.green_triangle);break;
            case 1: imageView.setImageResource(R.drawable.yellow_triangle_o);break;
            case 2: imageView.setImageResource(R.drawable.red_triangle);break;
        }
        return customView;

    }
}
