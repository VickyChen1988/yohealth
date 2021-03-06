//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.1.
//


package com.vc.cloudbalance;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.vc.cloudbalance.R.id;
import com.vc.cloudbalance.R.layout;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class MemberDataActivity_
    extends MemberDataActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    public final static String MEMBER_ID_EXTRA = "EXTRA_KEY_ID_STRING";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.activity_memberdata);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        injectExtras_();
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static MemberDataActivity_.IntentBuilder_ intent(Context context) {
        return new MemberDataActivity_.IntentBuilder_(context);
    }

    public static MemberDataActivity_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new MemberDataActivity_.IntentBuilder_(fragment);
    }

    public static MemberDataActivity_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new MemberDataActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        tvTitle = ((TextView) hasViews.findViewById(id.tvTitle));
        btnBack = ((Button) hasViews.findViewById(id.btnBack));
        imgPage1 = ((ImageView) hasViews.findViewById(id.imgPage1));
        llPageIndexPanel = ((LinearLayout) hasViews.findViewById(id.llPageIndexPanel));
        imgPage2 = ((ImageView) hasViews.findViewById(id.imgPage2));
        viewFlipper = ((ViewFlipper) hasViews.findViewById(id.viewFlipper));
        if (btnBack!= null) {
            btnBack.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    MemberDataActivity_.this.goBack();
                }

            }
            );
        }
        InitBase();
        init();
    }

    private void injectExtras_() {
        Bundle extras_ = getIntent().getExtras();
        if (extras_!= null) {
            if (extras_.containsKey(MEMBER_ID_EXTRA)) {
                MemberId = extras_.getString(MEMBER_ID_EXTRA);
            }
        }
    }

    @Override
    public void setIntent(Intent newIntent) {
        super.setIntent(newIntent);
        injectExtras_();
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<MemberDataActivity_.IntentBuilder_>
    {

        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, MemberDataActivity_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            super(fragment.getActivity(), MemberDataActivity_.class);
            fragment_ = fragment;
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            super(fragment.getActivity(), MemberDataActivity_.class);
            fragmentSupport_ = fragment;
        }

        @Override
        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent, requestCode);
            } else {
                if (fragment_!= null) {
                    fragment_.startActivityForResult(intent, requestCode);
                } else {
                    super.startForResult(requestCode);
                }
            }
        }

        public MemberDataActivity_.IntentBuilder_ MemberId(String MemberId) {
            return super.extra(MEMBER_ID_EXTRA, MemberId);
        }

    }

}
