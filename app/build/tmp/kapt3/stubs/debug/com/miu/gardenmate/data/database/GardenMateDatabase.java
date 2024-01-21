package com.miu.gardenmate.data.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/miu/gardenmate/data/database/GardenMateDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getPlanDao", "Lcom/miu/gardenmate/data/dao/PlantDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.miu.gardenmate.data.entity.Plant.class}, version = 1, exportSchema = false)
public abstract class GardenMateDatabase extends androidx.room.RoomDatabase {
    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private static volatile com.miu.gardenmate.data.database.GardenMateDatabase instance;
    @org.jetbrains.annotations.NotNull
    public static final com.miu.gardenmate.data.database.GardenMateDatabase.Companion Companion = null;
    
    public GardenMateDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.miu.gardenmate.data.dao.PlantDao getPlanDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0011\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/miu/gardenmate/data/database/GardenMateDatabase$Companion;", "", "()V", "instance", "Lcom/miu/gardenmate/data/database/GardenMateDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "invoke", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.miu.gardenmate.data.database.GardenMateDatabase invoke(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
        
        private final com.miu.gardenmate.data.database.GardenMateDatabase buildDatabase(android.content.Context context) {
            return null;
        }
    }
}