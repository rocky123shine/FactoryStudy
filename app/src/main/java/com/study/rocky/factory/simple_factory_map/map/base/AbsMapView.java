package com.study.rocky.factory.simple_factory_map.map.base;

import android.content.Context;
import android.os.Bundle;

import com.study.rocky.factory.simple_factory_map.map.IMapView;

/**
 * Created by Administrator on 2018/4/2 0002.
 */

public abstract class AbsMapView implements IMapView {

    private Context context;

    public Context getContext() {
        return context;
    }
    public AbsMapView(Context context){
        this.context = context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

    }
}
