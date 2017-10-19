package com.ctech.reaction.ui;

import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.ctech.reaction.R;
import com.ctech.reaction.widget.ReactionView;

/**
 * Created by KenZira on 2/2/17.
 */

public class FeedViewHolder extends RecyclerView.ViewHolder {
  @BindView(R.id.btLike)
  View btLike;

  @BindView(R.id.btComment)
  View btComment;

  @BindView(R.id.btShare)
  View btShare;

  @BindView(R.id.llFeedInfo)
  View llFeedInfo;
  @BindView(R.id.root_frame)
  FrameLayout rootFrame;

  @BindView(R.id.ivBadgeLike)
  ImageView ivBadgeLike;



  private final PopupWindow popupWindow;

  public FeedViewHolder(View itemView) {
    super(itemView);
    ButterKnife.bind(this, itemView);

  //  final PopupReactionView popupView = new PopupReactionView(itemView.getContext());
    popupWindow = new PopupWindow(
        null,
        WindowManager.LayoutParams.WRAP_CONTENT,
        WindowManager.LayoutParams.WRAP_CONTENT);
    popupWindow.setAnimationStyle(R.style.PopupAnimation);
  }

  @OnClick(R.id.btLike)
  public void handleLikeClick() {
//    if (popupWindow.isShowing()) {
//      popupWindow.dismiss();
//    } else {
//      popupWindow.showAtLocation(llFeedInfo, Gravity.TOP | Gravity.START, ivBadgeLike.getRight(),
//          llFeedInfo.getBottom() );
//    }
    ReactionView rvl = new ReactionView(btLike.getContext());
    rootFrame.addView(rvl);
    rvl.bringToFront();
  }

  @OnClick(R.id.btComment)
  public void handleCommentClick() {

  }

  @OnClick(R.id.btShare)
  public void handleShareClick() {

  }
}
