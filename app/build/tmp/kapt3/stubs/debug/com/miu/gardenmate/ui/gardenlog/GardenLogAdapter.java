package com.miu.gardenmate.ui.gardenlog;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aBA\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0014\u0010\u0018\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/miu/gardenmate/ui/gardenlog/GardenLogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/miu/gardenmate/ui/gardenlog/GardenLogAdapter$GardenLogViewHolder;", "onCardClicked", "Lkotlin/Function1;", "Lcom/miu/gardenmate/data/entity/Plant;", "", "onDeleteClicked", "onWaterClicked", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "plantList", "", "getDaysUntilNextWatering", "", "plant", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setPlantList", "value", "GardenLogViewHolder", "app_debug"})
public final class GardenLogAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.miu.gardenmate.ui.gardenlog.GardenLogAdapter.GardenLogViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.miu.gardenmate.data.entity.Plant, kotlin.Unit> onCardClicked = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.miu.gardenmate.data.entity.Plant, kotlin.Unit> onDeleteClicked = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.miu.gardenmate.data.entity.Plant, kotlin.Unit> onWaterClicked = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.miu.gardenmate.data.entity.Plant> plantList;
    
    public GardenLogAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.miu.gardenmate.data.entity.Plant, kotlin.Unit> onCardClicked, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.miu.gardenmate.data.entity.Plant, kotlin.Unit> onDeleteClicked, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.miu.gardenmate.data.entity.Plant, kotlin.Unit> onWaterClicked) {
        super();
    }
    
    public final void setPlantList(@org.jetbrains.annotations.NotNull
    java.util.List<com.miu.gardenmate.data.entity.Plant> value) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.miu.gardenmate.ui.gardenlog.GardenLogAdapter.GardenLogViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.miu.gardenmate.ui.gardenlog.GardenLogAdapter.GardenLogViewHolder holder, int position) {
    }
    
    private final java.lang.String getDaysUntilNextWatering(com.miu.gardenmate.data.entity.Plant plant) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/miu/gardenmate/ui/gardenlog/GardenLogAdapter$GardenLogViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "logWateringBtn", "Landroid/widget/ImageButton;", "getLogWateringBtn", "()Landroid/widget/ImageButton;", "plantAvatar", "getPlantAvatar", "plantDeleteBtn", "getPlantDeleteBtn", "plantNameTxtView", "Landroid/widget/TextView;", "getPlantNameTxtView", "()Landroid/widget/TextView;", "plantNextWateringDateView", "getPlantNextWateringDateView", "plantTypeTxtView", "getPlantTypeTxtView", "app_debug"})
    public static final class GardenLogViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageButton plantAvatar = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView plantNameTxtView = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView plantTypeTxtView = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView plantNextWateringDateView = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageButton plantDeleteBtn = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageButton logWateringBtn = null;
        
        public GardenLogViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageButton getPlantAvatar() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getPlantNameTxtView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getPlantTypeTxtView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getPlantNextWateringDateView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageButton getPlantDeleteBtn() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageButton getLogWateringBtn() {
            return null;
        }
    }
}