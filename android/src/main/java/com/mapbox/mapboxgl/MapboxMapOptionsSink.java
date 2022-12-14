// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package com.mapbox.mapboxgl;

import com.mapbox.mapboxsdk.geometry.LatLngBounds;

/**
 * Receiver of MapboxMap configuration options.
 */
interface MapboxMapOptionsSink {
  //@TODO: dddd replace with CameraPosition.Builder target
  void setCameraTargetBounds(LatLngBounds bounds);

  void setCompassEnabled(boolean compassEnabled);

  // @TODO: styleString is not actually a part of options. consider moving
  void setStyleString(String styleString);

  void setMinMaxZoomPreference(Float min, Float max);

  void setRotateGesturesEnabled(boolean rotateGesturesEnabled);

  void setScrollGesturesEnabled(boolean scrollGesturesEnabled);

  void setTiltGesturesEnabled(boolean tiltGesturesEnabled);

  void setTrackCameraPosition(boolean trackCameraPosition);

  void setZoomGesturesEnabled(boolean zoomGesturesEnabled);

  void setLogoViewMargins(int x, int y);

  void setCompassGravity(int gravity);

  void setCompassViewMargins(int x, int y);

  void setAttributionButtonGravity(int gravity);

  void setAttributionButtonMargins(int x, int y);
}
