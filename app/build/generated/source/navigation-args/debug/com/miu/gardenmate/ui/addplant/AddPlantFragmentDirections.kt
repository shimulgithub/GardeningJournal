package com.miu.gardenmate.ui.addplant

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.miu.gardenmate.R

public class AddPlantFragmentDirections private constructor() {
  public companion object {
    public fun actionAddPlantFragmentToGardenLogFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_addPlantFragment_to_gardenLogFragment)
  }
}
