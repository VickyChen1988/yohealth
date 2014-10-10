//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.1.
//


package com.vc.cloudbalance.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vc.cloudbalance.R.id;
import com.vc.cloudbalance.R.layout;
import com.vc.cloudbalance.model.MemberMDL;
import de.hdodenhof.circleimageview.CircleImageView;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;


/**
 * We use @SuppressWarning here because our java code
 * generator doesn't know that there is no need
 * to import OnXXXListeners from View as we already
 * are in a View.
 * 
 */
@SuppressWarnings("unused")
public final class View_BigFlowerMonBabyBalanceData_
    extends View_BigFlowerMonBabyBalanceData
    implements HasViews, OnViewChangedListener
{

    private boolean alreadyInflated_ = false;
    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    public View_BigFlowerMonBabyBalanceData_(Context context, MemberMDL mdl) {
        super(context, mdl);
        init_();
    }

    public View_BigFlowerMonBabyBalanceData_(Context context, AttributeSet attrs) {
        super(context, attrs);
        init_();
    }

    public static View_BigFlowerMonBabyBalanceData build(Context context, MemberMDL mdl) {
        View_BigFlowerMonBabyBalanceData_ instance = new View_BigFlowerMonBabyBalanceData_(context, mdl);
        instance.onFinishInflate();
        return instance;
    }

    /**
     * The mAlreadyInflated_ hack is needed because of an Android bug
     * which leads to infinite calls of onFinishInflate()
     * when inflating a layout with a parent and using
     * the <merge /> tag.
     * 
     */
    @Override
    public void onFinishInflate() {
        if (!alreadyInflated_) {
            alreadyInflated_ = true;
            inflate(getContext(), layout.view_bigflowerbalancedata, this);
            onViewChangedNotifier_.notifyViewChanged(this);
        }
        super.onFinishInflate();
    }

    private void init_() {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    public static View_BigFlowerMonBabyBalanceData build(Context context, AttributeSet attrs) {
        View_BigFlowerMonBabyBalanceData_ instance = new View_BigFlowerMonBabyBalanceData_(context, attrs);
        instance.onFinishInflate();
        return instance;
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        imgFlower = ((ImageView) hasViews.findViewById(id.imgFlower));
        circleImageView = ((CircleImageView) hasViews.findViewById(id.circleImageView));
        llRightLeaf = ((LinearLayout) hasViews.findViewById(id.llRightLeaf));
        imgTrunk = ((ImageView) hasViews.findViewById(id.imgTrunk));
        tvHeight = ((TextView) hasViews.findViewById(id.tvHeight));
        llLeftLeaf = ((LinearLayout) hasViews.findViewById(id.llLeftLeaf));
        tvMsg = ((TextView) hasViews.findViewById(id.tvMsg));
        tvWeight = ((TextView) hasViews.findViewById(id.tvWeight));
        imgGoBalance = ((ImageView) hasViews.findViewById(id.imgGoBalance));
        imgUrl = ((ImageView) hasViews.findViewById(id.imgUrl));
        if (imgGoBalance!= null) {
            imgGoBalance.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    View_BigFlowerMonBabyBalanceData_.this.goBalanceClick();
                }

            }
            );
        }
        if (llRightLeaf!= null) {
            llRightLeaf.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    View_BigFlowerMonBabyBalanceData_.this.showHeightDialog();
                }

            }
            );
        }
        if (imgFlower!= null) {
            imgFlower.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    View_BigFlowerMonBabyBalanceData_.this.flowerClick();
                }

            }
            );
        }
        init();
    }

}