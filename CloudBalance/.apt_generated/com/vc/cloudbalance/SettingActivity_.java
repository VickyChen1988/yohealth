//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.1.
//


package com.vc.cloudbalance;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vc.cloudbalance.R.id;
import com.vc.cloudbalance.R.layout;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class SettingActivity_
    extends SettingActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.activity_setting);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
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

    public static SettingActivity_.IntentBuilder_ intent(Context context) {
        return new SettingActivity_.IntentBuilder_(context);
    }

    public static SettingActivity_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new SettingActivity_.IntentBuilder_(fragment);
    }

    public static SettingActivity_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new SettingActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        btnBack = ((Button) hasViews.findViewById(id.btnBack));
        tvTitle = ((TextView) hasViews.findViewById(id.tvTitle));
        btnUserManager = ((TextView) hasViews.findViewById(id.btnUserManager));
        rlLogOut = ((LinearLayout) hasViews.findViewById(id.rlLogOut));
        tvLanguage = ((TextView) hasViews.findViewById(id.tvLanguage));
        btnLogin = ((TextView) hasViews.findViewById(id.btnLogin));
        rlLogin = ((LinearLayout) hasViews.findViewById(id.rlLogin));
        btnLogout = ((TextView) hasViews.findViewById(id.btnLogout));
        if (btnBack!= null) {
            btnBack.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    SettingActivity_.this.goBack();
                }

            }
            );
        }
        if (btnUserManager!= null) {
            btnUserManager.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    SettingActivity_.this.showAccoutActivity();
                }

            }
            );
        }
        if (btnLogin!= null) {
            btnLogin.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    SettingActivity_.this.showLoginActivity();
                }

            }
            );
        }
        {
            View view = hasViews.findViewById(id.llLanguage);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        SettingActivity_.this.showLanguageWindow();
                    }

                }
                );
            }
        }
        if (btnLogout!= null) {
            btnLogout.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    SettingActivity_.this.Logout();
                }

            }
            );
        }
        InitBase();
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<SettingActivity_.IntentBuilder_>
    {

        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, SettingActivity_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            super(fragment.getActivity(), SettingActivity_.class);
            fragment_ = fragment;
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            super(fragment.getActivity(), SettingActivity_.class);
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

    }

}
