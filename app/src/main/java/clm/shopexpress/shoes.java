package clm.shopexpress;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link shoes.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link shoes#newInstance} factory method to
 * create an instance of this fragment.
 */
public class shoes extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "company";
    private static final String ARG_PARAM2 = "imageResource";


    // TODO: Rename and change types of parameters
    private String company;
    private int imageResource;

    private OnFragmentInteractionListener mListener;

    public shoes() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param company Parameter 1.
     * @return A new instance of fragment shoes.
     */
    // TODO: Rename and change types and number of parameters
    public static shoes newInstance(String company,int imageResource) {
        shoes fragment = new shoes();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, company);
        args.putInt(ARG_PARAM2, imageResource);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_shoes, container, false);
        Bundle bundle=getArguments();
        if (bundle!=null) {
            company=bundle.getString(ARG_PARAM1,null);
            imageResource=bundle.getInt(ARG_PARAM2,R.drawable.shoes);

            ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
            imageView.setImageResource(imageResource);

            TextView companyTV=(TextView) v.findViewById(R.id.textTV);
            companyTV.setText(company);
        }


        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(String company) {
        if (mListener != null) {
            mListener.changeCompany(company);
        }
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void changeCompany(String company,int imageResource);
    }
}
