package com.study.rocky.factory.simple_factory_map.map.gaode;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.amap.api.maps2d.MapView;
import com.study.rocky.factory.simple_factory_map.map.base.AbsMapView;

/**
 * Created by Administrator on 2018/4/2 0002.
 */

public class GaoDeMapView extends AbsMapView {
    private MapView mapView;

    public MapView getMapView() {
        if (this.mapView == null) {
            this.mapView = new MapView(getContext());
        }
        return mapView;
    }

    public GaoDeMapView(Context context) {
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

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getMapView().onCreate(savedInstanceState);
    }
}
