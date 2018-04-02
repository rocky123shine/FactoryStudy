package com.study.rocky.factory.simple_factory_map.map.base;

import android.content.Context;

import com.study.rocky.factory.simple_factory_map.map.IMapFactory;
import com.study.rocky.factory.simple_factory_map.map.IMapView;

/**
 * Created by Administrator on 2018/4/2 0002.
 */

public abstract class AbsMapFactory implements IMapFactory {

    private Context context;

    public Context getContext() {
        return context;
    }

    public AbsMapFactory(Context context){
        this.context = context;
    }
}
