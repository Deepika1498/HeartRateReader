// Generated by view binder compiler. Do not edit!
package com.example.android.wearable.runtimepermissions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.android.wearable.runtimepermissions.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextView output;

  @NonNull
  public final Button phoneInfoPermissionButton;

  @NonNull
  public final ScrollView scrollingContentContainer;

  @NonNull
  public final Button wearBodySensorsPermissionButton;

  private ActivityMainBinding(@NonNull ScrollView rootView, @NonNull TextView output,
      @NonNull Button phoneInfoPermissionButton, @NonNull ScrollView scrollingContentContainer,
      @NonNull Button wearBodySensorsPermissionButton) {
    this.rootView = rootView;
    this.output = output;
    this.phoneInfoPermissionButton = phoneInfoPermissionButton;
    this.scrollingContentContainer = scrollingContentContainer;
    this.wearBodySensorsPermissionButton = wearBodySensorsPermissionButton;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.output;
      TextView output = ViewBindings.findChildViewById(rootView, id);
      if (output == null) {
        break missingId;
      }

      id = R.id.phone_info_permission_button;
      Button phoneInfoPermissionButton = ViewBindings.findChildViewById(rootView, id);
      if (phoneInfoPermissionButton == null) {
        break missingId;
      }

      ScrollView scrollingContentContainer = (ScrollView) rootView;

      id = R.id.wear_body_sensors_permission_button;
      Button wearBodySensorsPermissionButton = ViewBindings.findChildViewById(rootView, id);
      if (wearBodySensorsPermissionButton == null) {
        break missingId;
      }

      return new ActivityMainBinding((ScrollView) rootView, output, phoneInfoPermissionButton,
          scrollingContentContainer, wearBodySensorsPermissionButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
