package com.study.rocky.factory.simple_factory_map.map;

/**
 * Created by Administrator on 2018/4/2 0002.
 */

//地图工厂
public interface IMapFactory {
    //生产 地图view
    IMapView getMapView();
}
