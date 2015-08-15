package com.androidx.androidx.view;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.androidx.androidx.mvvm.Bindable;
import com.androidx.androidx.viewmodel.EventItemVM;

public class EventView extends View implements Bindable<EventItemVM> {
    private TextView mUserNameTextView;
    private TextView mRepositoryNameTextView;

    public EventView(Context context) {
        super(context);

        mUserNameTextView = new TextView(context);
        mRepositoryNameTextView = new TextView(context);
    }

    public TextView getUserNameTextView() {
        return mUserNameTextView;
    }

    public TextView getRepositoryNameTextView() {
        return mRepositoryNameTextView;
    }

    @Override
    public void bindViewModel(EventItemVM vm) {
        mUserNameTextView.setText(vm.getUserLogin());
        mRepositoryNameTextView.setText(vm.getRepositoryName());
    }
}
