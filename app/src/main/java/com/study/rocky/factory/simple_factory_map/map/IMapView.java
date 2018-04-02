package com.study.rocky.factory.simple_factory_map.map;

import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2018/4/2 0002.
 */

public interface IMapView {

    //百度地图和高德地图的 共性有
    //1 mapview 都是view的子类
    View getView();
    //2 同步生命周期
    void onCreate(Bundle savedInstanceState);
    void onPause();
    void onResume();
    void onDestroy();
}
