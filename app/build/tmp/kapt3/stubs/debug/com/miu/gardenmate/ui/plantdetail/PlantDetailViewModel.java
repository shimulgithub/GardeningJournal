package com.miu.gardenmate.ui.plantdetail;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/miu/gardenmate/ui/plantdetail/PlantDetailViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "plantData", "Landroidx/lifecycle/LiveData;", "Lcom/miu/gardenmate/data/entity/Plant;", "getPlantData", "()Landroidx/lifecycle/LiveData;", "setPlantData", "(Landroidx/lifecycle/LiveData;)V", "repository", "Lcom/miu/gardenmate/data/repository/PlantRepository;", "", "plantId", "", "app_debug"})
public final class PlantDetailViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.miu.gardenmate.data.repository.PlantRepository repository = null;
    public androidx.lifecycle.LiveData<com.miu.gardenmate.data.entity.Plant> plantData;
    
    public PlantDetailViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.miu.gardenmate.data.entity.Plant> getPlantData() {
        return null;
    }
    
    public final void setPlantData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<com.miu.gardenmate.data.entity.Plant> p0) {
    }
    
    public final void setPlantData(long plantId) {
    }
}