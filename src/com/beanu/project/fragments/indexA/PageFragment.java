package com.beanu.project.fragments.indexA;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;
import com.beanu.project.R;

public class PageFragment extends SherlockFragment {
	public static final String ARG_PAGE = "ARG_PAGE";

	private int mPage;

	public static PageFragment newInstance(int page) {
		Bundle args = new Bundle();
		args.putInt(ARG_PAGE, page);
		PageFragment fragment = new PageFragment();
		fragment.setArguments(args);
		return fragment;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("debug", "PageFragment--onCreate");
		mPage = getArguments().getInt(ARG_PAGE);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.d("debug", "PageFragment--onCreateView" + mPage);
		View view = inflater.inflate(R.layout.indexa_page_fragment, container, false);
		TextView textView = (TextView) view;
		textView.setText("Fragment #" + mPage);
		return view;
	}
}
