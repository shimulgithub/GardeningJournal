package com.miu.gardenmate.ui.home

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.miu.gardenmate.R

public class HomeFragmentDirections private constructor() {
  public companion object {
    public fun actionHomeFragmentToGardenLogFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_gardenLogFragment)
  }
}
