package com.study.rocky.factory.simple_factory_map.map.baidu;

import android.content.Context;
import android.view.View;


import com.baidu.mapapi.map.MapView;
import com.study.rocky.factory.simple_factory_map.map.base.AbsMapView;

/**
 * Created by Administrator on 2018/4/2 0002.
 */

public class BaiDuMapView extends AbsMapView {
    private MapView mapView;

    public MapView getMapView() {
        if (this.mapView == null) {
            this.mapView = new MapView(getContext());
        }
        return mapView;
    }

    public BaiDuMapView(Context context) {
        super(context);
    }

    @Override
    public View getView() {
        return getMapView();
    }

    @Override
    public void onPause() {
        getMapView().onPause();
    }

    @Override
    public void onResume() {
        getMapView().onResume();

    }

    @Override
    public void onDestroy() {
        getMapView().onDestroy();
    }
}
