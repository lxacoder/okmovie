package lxacoder.okmovie.config;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import lxacoder.okmovie.R;


/**
 * Created by lxacoder on 2016/9/7.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */
public class RecyclerViewDecoration extends RecyclerView.ItemDecoration {

    private Drawable mDivider;
    private int offset;
    public RecyclerViewDecoration(Context context,int offset,boolean isNightMode) {
        this.offset = offset;
        chooseDivider(context,isNightMode);
    }

    private void chooseDivider(Context context,boolean isNightMode){
        if (isNightMode){
            this.mDivider = ContextCompat.getDrawable(context, R.drawable.day_line_divider);
        }else {
            this.mDivider = ContextCompat.getDrawable(context, R.drawable.night_line_divider);
        }
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        int left = parent.getPaddingLeft() + 25;
        int right = parent.getWidth() - parent.getPaddingRight() - 25;
        int childCount = parent.getChildCount();
        for (int i = offset; i < childCount; i++) {
            View child = parent.getChildAt(i);

            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();

            int top = child.getBottom() + params.bottomMargin;
            int bottom = top + mDivider.getIntrinsicHeight();

            mDivider.setBounds(left, top, right, bottom);
            mDivider.draw(c);
        }
    }
}
