package com.study.rocky.factory.simple_factory_map.map.baidu;

import android.content.Context;

import com.study.rocky.factory.simple_factory_map.map.IMapView;
import com.study.rocky.factory.simple_factory_map.map.base.AbsMapFactory;

/**
 * Created by Administrator on 2018/4/2 0002.
 */

public class BaiDuMapFactory extends AbsMapFactory {
    public BaiDuMapFactory(Context context) {
        super(context);
    }

    @Override
    public IMapView getMapView() {
        return new BaiDuMapView(getContext());
    }
}
