package com.miu.gardenmate.ui.plantdetail

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class PlantDetailFragmentArgs(
  public val plantId: Long = -1L
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("plantId", this.plantId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("plantId", this.plantId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): PlantDetailFragmentArgs {
      bundle.setClassLoader(PlantDetailFragmentArgs::class.java.classLoader)
      val __plantId : Long
      if (bundle.containsKey("plantId")) {
        __plantId = bundle.getLong("plantId")
      } else {
        __plantId = -1L
      }
      return PlantDetailFragmentArgs(__plantId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): PlantDetailFragmentArgs {
      val __plantId : Long?
      if (savedStateHandle.contains("plantId")) {
        __plantId = savedStateHandle["plantId"]
        if (__plantId == null) {
          throw IllegalArgumentException("Argument \"plantId\" of type long does not support null values")
        }
      } else {
        __plantId = -1L
      }
      return PlantDetailFragmentArgs(__plantId)
    }
  }
}
