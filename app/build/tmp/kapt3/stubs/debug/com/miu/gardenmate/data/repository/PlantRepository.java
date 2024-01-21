package com.miu.gardenmate.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\u000eJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u0011\u0010\u0013\u001a\u00020\bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/miu/gardenmate/data/repository/PlantRepository;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "plantDao", "Lcom/miu/gardenmate/data/dao/PlantDao;", "addPlant", "", "plant", "Lcom/miu/gardenmate/data/entity/Plant;", "(Lcom/miu/gardenmate/data/entity/Plant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "getAllPlants", "Landroidx/lifecycle/LiveData;", "", "getPlantById", "plantId", "", "refreshTestData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePlant", "Companion", "app_debug"})
public final class PlantRepository {
    @org.jetbrains.annotations.NotNull
    private final com.miu.gardenmate.data.dao.PlantDao plantDao = null;
    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private static volatile com.miu.gardenmate.data.repository.PlantRepository instance;
    @org.jetbrains.annotations.NotNull
    public static final com.miu.gardenmate.data.repository.PlantRepository.Companion Companion = null;
    
    private PlantRepository(android.app.Application application) {
        super();
    }
    
    private final java.lang.Object refreshTestData(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.miu.gardenmate.data.entity.Plant>> getAllPlants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.miu.gardenmate.data.entity.Plant> getPlantById(long plantId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addPlant(@org.jetbrains.annotations.NotNull
    com.miu.gardenmate.data.entity.Plant plant, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updatePlant(@org.jetbrains.annotations.NotNull
    com.miu.gardenmate.data.entity.Plant plant, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull
    com.miu.gardenmate.data.entity.Plant plant, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/miu/gardenmate/data/repository/PlantRepository$Companion;", "", "()V", "instance", "Lcom/miu/gardenmate/data/repository/PlantRepository;", "invoke", "application", "Landroid/app/Application;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.miu.gardenmate.data.repository.PlantRepository invoke(@org.jetbrains.annotations.NotNull
        android.app.Application application) {
            return null;
        }
    }
}