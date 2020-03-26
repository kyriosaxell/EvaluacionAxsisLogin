package com.example.evaluacionaxsislogin.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.evaluacionaxsislogin.data.model.LoginDao;
import com.example.evaluacionaxsislogin.data.model.LoginDao_Impl;
import com.example.evaluacionaxsislogin.data.model.UsuarioDao;
import com.example.evaluacionaxsislogin.data.model.UsuarioDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UsuarioRoomDataBase_Impl extends UsuarioRoomDataBase {
  private volatile UsuarioDao _usuarioDao;

  private volatile LoginDao _loginDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(3) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `tcusuarios` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `email` TEXT NOT NULL, `user` TEXT NOT NULL, `contrasena` TEXT, `estatus` INTEGER NOT NULL, `sexo` TEXT NOT NULL, `fecha_creacion` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b41509f2a6fa96c3b870e939c39841d8')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `tcusuarios`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTcusuarios = new HashMap<String, TableInfo.Column>(7);
        _columnsTcusuarios.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTcusuarios.put("email", new TableInfo.Column("email", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTcusuarios.put("user", new TableInfo.Column("user", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTcusuarios.put("contrasena", new TableInfo.Column("contrasena", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTcusuarios.put("estatus", new TableInfo.Column("estatus", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTcusuarios.put("sexo", new TableInfo.Column("sexo", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTcusuarios.put("fecha_creacion", new TableInfo.Column("fecha_creacion", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTcusuarios = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTcusuarios = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTcusuarios = new TableInfo("tcusuarios", _columnsTcusuarios, _foreignKeysTcusuarios, _indicesTcusuarios);
        final TableInfo _existingTcusuarios = TableInfo.read(_db, "tcusuarios");
        if (! _infoTcusuarios.equals(_existingTcusuarios)) {
          return new RoomOpenHelper.ValidationResult(false, "tcusuarios(com.example.evaluacionaxsislogin.data.model.Usuario).\n"
                  + " Expected:\n" + _infoTcusuarios + "\n"
                  + " Found:\n" + _existingTcusuarios);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "b41509f2a6fa96c3b870e939c39841d8", "c7e4a859db3d78cb1c65a1bac8ae9061");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "tcusuarios");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `tcusuarios`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public UsuarioDao usuarioDao() {
    if (_usuarioDao != null) {
      return _usuarioDao;
    } else {
      synchronized(this) {
        if(_usuarioDao == null) {
          _usuarioDao = new UsuarioDao_Impl(this);
        }
        return _usuarioDao;
      }
    }
  }

  @Override
  public LoginDao loginDataSource() {
    if (_loginDao != null) {
      return _loginDao;
    } else {
      synchronized(this) {
        if(_loginDao == null) {
          _loginDao = new LoginDao_Impl(this);
        }
        return _loginDao;
      }
    }
  }
}
