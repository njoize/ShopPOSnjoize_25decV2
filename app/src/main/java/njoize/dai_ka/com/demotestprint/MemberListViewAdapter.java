package njoize.dai_ka.com.demotestprint;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MemberListViewAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<NameMemberModel> nameMemberModelArrayList;
    private List<NameMemberModel> nameMemberModelList;

    public MemberListViewAdapter(Context context, List<NameMemberModel> nameMemberModelList) {
        this.context = context;
        this.nameMemberModelList = nameMemberModelList;
        this.layoutInflater = LayoutInflater.from(context);
        this.nameMemberModelArrayList = new ArrayList<NameMemberModel>();
        this.nameMemberModelArrayList.addAll(nameMemberModelList);
    }

    @Override
    public int getCount() {
        return nameMemberModelList.size();
    }

    @Override
    public Object getItem(int position) {
        return nameMemberModelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, final ViewGroup parent) {
        final ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = layoutInflater.inflate(R.layout.recycler_member, null);
            holder.name = convertView.findViewById(R.id.txtName);
            holder.imageView = convertView.findViewById(R.id.btnDetail);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        final String idString = nameMemberModelList.get(position).getIdString();
        holder.name.setText(nameMemberModelList.get(position).getNameMemberString());
        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("20FebV2", "You Click Text id ==> " + idString);
                Intent intent = new Intent(parent.getContext(), MemberActivity.class);
                intent.putExtra("id", idString);
                intent.putExtra("Status", true);
                parent.getContext().startActivity(intent);
            }
        });

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("20FebV2", "You Click Arrow id==> " + idString);
                Intent intent = new Intent(parent.getContext(), MemberActivity.class);
                intent.putExtra("id", idString);
                intent.putExtra("Status", false);
                parent.getContext().startActivity(intent);
            }
        });

        return convertView;
    }

    public class ViewHolder {
        TextView name;
        ImageView imageView;
    }

    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        nameMemberModelList.clear();
        if (charText.length() == 0) {
            nameMemberModelList.addAll(nameMemberModelArrayList);
        } else {
            for (NameMemberModel nameMemberModel : nameMemberModelArrayList) {
                if (nameMemberModel.getNameMemberString().toLowerCase(Locale.getDefault()).contains(charText)) {
                    nameMemberModelList.add(nameMemberModel);
                }
            } // for
        } // if
        notifyDataSetChanged();
    } // filter



}
