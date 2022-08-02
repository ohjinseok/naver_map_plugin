package map.naver.plugin.net.lbstech.naver_map_plugin;

import java.util.List;

import com.naver.maps.geometry.LatLngBounds;

public interface NaverMapOptionSink {
    void setNightModeEnable(boolean nightModeEnable);

    void setLiteModeEnable(boolean liteModeEnable);

    void setIndoorEnable(boolean indoorEnable);

    void setMapType(int typeIndex);

    void setBuildingHeight(double buildingHeight);

    void setSymbolScale(double symbolScale);

    void setSymbolPerspectiveRatio(double symbolPerspectiveRatio);

    void setActiveLayers(List activeLayers);

    void setLocationButtonEnable(boolean locationButtonEnable);

    void setContentPadding(List<Double> paddingData);

    /**
     * flutter 에서 setState()로 값을 변경해도 반영되지 않는 method. 최초 생성시에만 값변경.
     */
    void setMinZoomLevel(double minZoomLevel);

    void setMaxZoomLevel(double maxZoomLevel);

    void setExtent(LatLngBounds extent);

    void setRotationGestureEnable(boolean rotationGestureEnable);

    void setScrollGestureEnable(boolean scrollGestureEnable);

    void setTiltGestureEnable(boolean tiltGestureEnable);

    void setZoomGestureEnable(boolean zoomGestureEnable);

    void setLocationTrackingMode(int locationTrackingMode);

}
