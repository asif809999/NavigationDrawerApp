package com.example.android.navigationdrawerapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MaxresFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MaxresFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MaxresFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
   // private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    //private String mParam2;
    //private ImageView maxrexPhotoimageView;

    private OnFragmentInteractionListener mListener;

    public MaxresFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.

     * @return A new instance of fragment MaxresFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MaxresFragment newInstance(String param1) {
        MaxresFragment fragment = new MaxresFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
       // args.putInt(ARG_PARAM2, maxrexPhotoimageView);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            //maxrexPhotoimageView = (ImageView) getView().findViewById(R.drawable.maxresdefault);
            //mParam2 = String.valueOf(maxrexPhotoimageView);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        onButtonPressed("Hello "+mParam1);
        return inflater.inflate(R.layout.fragment_maxres, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(String k) {
        if (mListener != null) {

            mListener.onFragmentInteraction(k);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(String a);
    }
}
