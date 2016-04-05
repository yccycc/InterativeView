package com.yctech.interativeview.component;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.yctech.interativeview.R;

public class GdSearchOptionMenu extends LinearLayout implements View.OnClickListener {
    private ImageView mSearchIconIv;

    private TextView mSearchTipTv;
    private Context mContext;
    private PopupWindow mGdOptionPop;
    private View mToDealPopContent;

    public GdSearchOptionMenu(Context context) {
        super(context, null);
    }
    public GdSearchOptionMenu(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        setOrientation(LinearLayout.HORIZONTAL);
        mSearchIconIv = new ImageView(mContext);
        mSearchIconIv.setImageResource(R.drawable.icon_pop_menu);
        mSearchIconIv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        this.addView(mSearchIconIv);
        //
        mSearchTipTv = new TextView(mContext);
        mSearchTipTv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mSearchTipTv.setText("全部");
        this.addView(mSearchTipTv);
        setOnClickListener(this);
        mToDealPopContent = ((Activity)mContext).getLayoutInflater().inflate(R.layout.gd_search_option_pop,null);
        mGdOptionPop = new PopupWindow(mToDealPopContent, ViewGroup.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.WRAP_CONTENT,true);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(mContext,"sdadsasd",Toast.LENGTH_SHORT).show();
        mGdOptionPop.setOutsideTouchable(true);
        mGdOptionPop.setBackgroundDrawable(new PaintDrawable());
        mGdOptionPop.showAsDropDown(v, 0, 30);
    }
}
