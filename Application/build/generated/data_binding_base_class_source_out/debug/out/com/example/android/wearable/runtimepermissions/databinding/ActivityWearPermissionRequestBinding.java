// Generated by view binder compiler. Do not edit!
package com.example.android.wearable.runtimepermissions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.android.wearable.runtimepermissions.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityWearPermissionRequestBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final Button approvePermissionRequest;

  @NonNull
  public final Button denyPermissionRequest;

  @NonNull
  public final TextView detailsTextView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView mainMessageTextView;

  private ActivityWearPermissionRequestBinding(@NonNull NestedScrollView rootView,
      @NonNull Button approvePermissionRequest, @NonNull Button denyPermissionRequest,
      @NonNull TextView detailsTextView, @NonNull ImageView imageView,
      @NonNull TextView mainMessageTextView) {
    this.rootView = rootView;
    this.approvePermissionRequest = approvePermissionRequest;
    this.denyPermissionRequest = denyPermissionRequest;
    this.detailsTextView = detailsTextView;
    this.imageView = imageView;
    this.mainMessageTextView = mainMessageTextView;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityWearPermissionRequestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityWearPermissionRequestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_wear_permission_request, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityWearPermissionRequestBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.approve_permission_request;
      Button approvePermissionRequest = ViewBindings.findChildViewById(rootView, id);
      if (approvePermissionRequest == null) {
        break missingId;
      }

      id = R.id.deny_permission_request;
      Button denyPermissionRequest = ViewBindings.findChildViewById(rootView, id);
      if (denyPermissionRequest == null) {
        break missingId;
      }

      id = R.id.detailsTextView;
      TextView detailsTextView = ViewBindings.findChildViewById(rootView, id);
      if (detailsTextView == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.mainMessageTextView;
      TextView mainMessageTextView = ViewBindings.findChildViewById(rootView, id);
      if (mainMessageTextView == null) {
        break missingId;
      }

      return new ActivityWearPermissionRequestBinding((NestedScrollView) rootView,
          approvePermissionRequest, denyPermissionRequest, detailsTextView, imageView,
          mainMessageTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}