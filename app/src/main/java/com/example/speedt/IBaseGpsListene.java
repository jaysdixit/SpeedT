package com.example.speedt;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
//implement LocationListener
class IBaseGpsListener implements LocationListener {
    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}

