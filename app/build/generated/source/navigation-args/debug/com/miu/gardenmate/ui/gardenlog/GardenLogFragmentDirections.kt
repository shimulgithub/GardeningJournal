package com.miu.gardenmate.ui.gardenlog

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.miu.gardenmate.R
import kotlin.Int
import kotlin.Long

public class GardenLogFragmentDirections private constructor() {
  private data class ActionGardenLogFragmentToPlantDetailFragment(
    public val plantId: Long = -1L
  ) : NavDirections {
    public override val actionId: Int = R.id.action_gardenLogFragment_to_plantDetailFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("plantId", this.plantId)
        return result
      }
  }

  public companion object {
    public fun actionGardenLogFragmentToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_gardenLogFragment_to_homeFragment)

    public fun actionGardenLogFragmentToAddPlantFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_gardenLogFragment_to_addPlantFragment)

    public fun actionGardenLogFragmentToPlantDetailFragment(plantId: Long = -1L): NavDirections =
        ActionGardenLogFragmentToPlantDetailFragment(plantId)
  }
}
