package com.miu.gardenmate.ui.plantdetail

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.miu.gardenmate.R

public class PlantDetailFragmentDirections private constructor() {
  public companion object {
    public fun actionPlantDetailFragmentToGardenLogFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_plantDetailFragment_to_gardenLogFragment)
  }
}
