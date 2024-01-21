package com.miu.gardenmate.ui.gardenlog;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bR&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/miu/gardenmate/ui/gardenlog/GardenLogViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allPlants", "Landroidx/lifecycle/LiveData;", "", "Lcom/miu/gardenmate/data/entity/Plant;", "getAllPlants", "()Landroidx/lifecycle/LiveData;", "setAllPlants", "(Landroidx/lifecycle/LiveData;)V", "repo", "Lcom/miu/gardenmate/data/repository/PlantRepository;", "deletePlant", "", "plant", "updatePlant", "app_debug"})
public final class GardenLogViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.miu.gardenmate.data.repository.PlantRepository repo = null;
    public androidx.lifecycle.LiveData<java.util.List<com.miu.gardenmate.data.entity.Plant>> allPlants;
    
    public GardenLogViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.miu.gardenmate.data.entity.Plant>> getAllPlants() {
        return null;
    }
    
    public final void setAllPlants(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<java.util.List<com.miu.gardenmate.data.entity.Plant>> p0) {
    }
    
    public final void deletePlant(@org.jetbrains.annotations.NotNull
    com.miu.gardenmate.data.entity.Plant plant) {
    }
    
    public final void updatePlant(@org.jetbrains.annotations.NotNull
    com.miu.gardenmate.data.entity.Plant plant) {
    }
}