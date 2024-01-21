package com.miu.gardenmate.data.dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.miu.gardenmate.data.entity.Plant;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PlantDao_Impl implements PlantDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Plant> __insertionAdapterOfPlant;

  private final EntityDeletionOrUpdateAdapter<Plant> __deletionAdapterOfPlant;

  private final EntityDeletionOrUpdateAdapter<Plant> __updateAdapterOfPlant;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public PlantDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPlant = new EntityInsertionAdapter<Plant>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `plants` (`id`,`name`,`type`,`wateringFrequency`,`plantedDate`,`lastWateredDate`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Plant entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getType() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getType());
        }
        statement.bindLong(4, entity.getWateringFrequency());
        statement.bindLong(5, entity.getPlantedDate());
        statement.bindLong(6, entity.getLastWateredDate());
      }
    };
    this.__deletionAdapterOfPlant = new EntityDeletionOrUpdateAdapter<Plant>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `plants` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Plant entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfPlant = new EntityDeletionOrUpdateAdapter<Plant>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `plants` SET `id` = ?,`name` = ?,`type` = ?,`wateringFrequency` = ?,`plantedDate` = ?,`lastWateredDate` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Plant entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getType() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getType());
        }
        statement.bindLong(4, entity.getWateringFrequency());
        statement.bindLong(5, entity.getPlantedDate());
        statement.bindLong(6, entity.getLastWateredDate());
        statement.bindLong(7, entity.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM plants";
        return _query;
      }
    };
  }

  @Override
  public Object addPlant(final Plant plant, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPlant.insert(plant);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deletePlant(final Plant plant, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfPlant.handle(plant);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updatePlant(final Plant plant, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfPlant.handle(plant);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public LiveData<List<Plant>> getAllPlants() {
    final String _sql = "SELECT * FROM plants ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"plants"}, false, new Callable<List<Plant>>() {
      @Override
      @Nullable
      public List<Plant> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfWateringFrequency = CursorUtil.getColumnIndexOrThrow(_cursor, "wateringFrequency");
          final int _cursorIndexOfPlantedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "plantedDate");
          final int _cursorIndexOfLastWateredDate = CursorUtil.getColumnIndexOrThrow(_cursor, "lastWateredDate");
          final List<Plant> _result = new ArrayList<Plant>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Plant _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final int _tmpWateringFrequency;
            _tmpWateringFrequency = _cursor.getInt(_cursorIndexOfWateringFrequency);
            final long _tmpPlantedDate;
            _tmpPlantedDate = _cursor.getLong(_cursorIndexOfPlantedDate);
            final long _tmpLastWateredDate;
            _tmpLastWateredDate = _cursor.getLong(_cursorIndexOfLastWateredDate);
            _item = new Plant(_tmpId,_tmpName,_tmpType,_tmpWateringFrequency,_tmpPlantedDate,_tmpLastWateredDate);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Plant> getPlantById(final long id) {
    final String _sql = "SELECT * FROM plants WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[] {"plants"}, false, new Callable<Plant>() {
      @Override
      @Nullable
      public Plant call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfWateringFrequency = CursorUtil.getColumnIndexOrThrow(_cursor, "wateringFrequency");
          final int _cursorIndexOfPlantedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "plantedDate");
          final int _cursorIndexOfLastWateredDate = CursorUtil.getColumnIndexOrThrow(_cursor, "lastWateredDate");
          final Plant _result;
          if (_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final int _tmpWateringFrequency;
            _tmpWateringFrequency = _cursor.getInt(_cursorIndexOfWateringFrequency);
            final long _tmpPlantedDate;
            _tmpPlantedDate = _cursor.getLong(_cursorIndexOfPlantedDate);
            final long _tmpLastWateredDate;
            _tmpLastWateredDate = _cursor.getLong(_cursorIndexOfLastWateredDate);
            _result = new Plant(_tmpId,_tmpName,_tmpType,_tmpWateringFrequency,_tmpPlantedDate,_tmpLastWateredDate);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
