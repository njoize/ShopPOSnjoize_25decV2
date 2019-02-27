package njoize.dai_ka.com.demotestprint;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MemberDetailFragment extends Fragment {

    private String idString;
    private MyConstant myConstant = new MyConstant();

    public MemberDetailFragment() {
        // Required empty public constructor
    }

    public static MemberDetailFragment memberDetailInstance(String idString) {
        MemberDetailFragment memberDetailFragment = new MemberDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString("id", idString);
        memberDetailFragment.setArguments(bundle);
        return memberDetailFragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Get MID
        getMID();

//        Create Detail
        createDetail();


    } // Main Method

    private void createDetail() {
        try {

            GetMemberWhereID getMemberWhereID = new GetMemberWhereID(getActivity());
            getMemberWhereID.execute(idString, myConstant.getUrlGetMemberWhereID());
            String jsonString = getMemberWhereID.get();
            Log.d("20FebV2", jsonString);

        } catch (Exception e) {
//            e.printStackTrace();
            Log.d("20FebV2", "e at createDetail ==> " + e.toString());
        }
    }

    private void getMID() {
        idString = getArguments().getString("id");
        Log.d("20FebV2", "id receive at Detail ==> " + idString);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_member_detail, container, false);
    }

}
