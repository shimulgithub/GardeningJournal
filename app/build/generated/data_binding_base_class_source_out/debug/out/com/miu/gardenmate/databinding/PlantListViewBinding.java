// Generated by view binder compiler. Do not edit!
package com.miu.gardenmate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.miu.gardenmate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PlantListViewBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageButton deletePlantBtn;

  @NonNull
  public final ImageButton logWateringBtn;

  @NonNull
  public final ImageButton plantAvatar;

  @NonNull
  public final CardView plantCardView;

  @NonNull
  public final TextView plantNameView;

  @NonNull
  public final TextView plantNextWateringDateView;

  @NonNull
  public final TextView plantNextWateringDayLabel;

  @NonNull
  public final TextView plantTypeView;

  private PlantListViewBinding(@NonNull CardView rootView, @NonNull ImageButton deletePlantBtn,
      @NonNull ImageButton logWateringBtn, @NonNull ImageButton plantAvatar,
      @NonNull CardView plantCardView, @NonNull TextView plantNameView,
      @NonNull TextView plantNextWateringDateView, @NonNull TextView plantNextWateringDayLabel,
      @NonNull TextView plantTypeView) {
    this.rootView = rootView;
    this.deletePlantBtn = deletePlantBtn;
    this.logWateringBtn = logWateringBtn;
    this.plantAvatar = plantAvatar;
    this.plantCardView = plantCardView;
    this.plantNameView = plantNameView;
    this.plantNextWateringDateView = plantNextWateringDateView;
    this.plantNextWateringDayLabel = plantNextWateringDayLabel;
    this.plantTypeView = plantTypeView;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static PlantListViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PlantListViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.plant_list_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PlantListViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.deletePlantBtn;
      ImageButton deletePlantBtn = ViewBindings.findChildViewById(rootView, id);
      if (deletePlantBtn == null) {
        break missingId;
      }

      id = R.id.logWateringBtn;
      ImageButton logWateringBtn = ViewBindings.findChildViewById(rootView, id);
      if (logWateringBtn == null) {
        break missingId;
      }

      id = R.id.plantAvatar;
      ImageButton plantAvatar = ViewBindings.findChildViewById(rootView, id);
      if (plantAvatar == null) {
        break missingId;
      }

      CardView plantCardView = (CardView) rootView;

      id = R.id.plantNameView;
      TextView plantNameView = ViewBindings.findChildViewById(rootView, id);
      if (plantNameView == null) {
        break missingId;
      }

      id = R.id.plantNextWateringDateView;
      TextView plantNextWateringDateView = ViewBindings.findChildViewById(rootView, id);
      if (plantNextWateringDateView == null) {
        break missingId;
      }

      id = R.id.plantNextWateringDayLabel;
      TextView plantNextWateringDayLabel = ViewBindings.findChildViewById(rootView, id);
      if (plantNextWateringDayLabel == null) {
        break missingId;
      }

      id = R.id.plantTypeView;
      TextView plantTypeView = ViewBindings.findChildViewById(rootView, id);
      if (plantTypeView == null) {
        break missingId;
      }

      return new PlantListViewBinding((CardView) rootView, deletePlantBtn, logWateringBtn,
          plantAvatar, plantCardView, plantNameView, plantNextWateringDateView,
          plantNextWateringDayLabel, plantTypeView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
