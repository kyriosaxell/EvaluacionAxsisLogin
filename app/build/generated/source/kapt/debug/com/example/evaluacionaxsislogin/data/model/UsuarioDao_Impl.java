package com.example.evaluacionaxsislogin.data.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.evaluacionaxsislogin.data.Converters;
import java.lang.Boolean;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UsuarioDao_Impl implements UsuarioDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Usuario> __insertionAdapterOfUsuario;

  private final Converters __converters = new Converters();

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfUpdateUser;

  private final SharedSQLiteStatement __preparedStmtOfUpdateEstatus;

  public UsuarioDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUsuario = new EntityInsertionAdapter<Usuario>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `tcusuarios` (`id`,`email`,`user`,`contrasena`,`estatus`,`sexo`,`fecha_creacion`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Usuario value) {
        stmt.bindLong(1, value.getId());
        if (value.getEmail() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getEmail());
        }
        if (value.getUser() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUser());
        }
        if (value.getContrasena() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getContrasena());
        }
        final int _tmp;
        _tmp = value.getEstatus() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        if (value.getSexo() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSexo());
        }
        final long _tmp_1;
        _tmp_1 = __converters.calendarToDatestamp(value.getFecha_creacion());
        stmt.bindLong(7, _tmp_1);
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM tcusuarios";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateUser = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE tcusuarios SET email = ?, user = ?, sexo = ?, contrasena = ? where id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateEstatus = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE tcusuarios SET estatus = ? where id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertarUsuario(final Usuario usuario, final Continuation<? super Long> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfUsuario.insertAndReturnId(usuario);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object updateUser(final long id, final String email, final String user, final String sexo,
      final String contrasena, final Continuation<? super Unit> p5) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateUser.acquire();
        int _argIndex = 1;
        if (email == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, email);
        }
        _argIndex = 2;
        if (user == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, user);
        }
        _argIndex = 3;
        if (sexo == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, sexo);
        }
        _argIndex = 4;
        if (contrasena == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, contrasena);
        }
        _argIndex = 5;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateUser.release(_stmt);
        }
      }
    }, p5);
  }

  @Override
  public Object updateEstatus(final long id, final int estatus,
      final Continuation<? super Unit> p2) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateEstatus.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, estatus);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateEstatus.release(_stmt);
        }
      }
    }, p2);
  }

  @Override
  public LiveData<List<Usuario>> getAllUsuarios() {
    final String _sql = "SELECT * FROM tcusuarios order by fecha_creacion asc";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"tcusuarios"}, false, new Callable<List<Usuario>>() {
      @Override
      public List<Usuario> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfUser = CursorUtil.getColumnIndexOrThrow(_cursor, "user");
          final int _cursorIndexOfContrasena = CursorUtil.getColumnIndexOrThrow(_cursor, "contrasena");
          final int _cursorIndexOfEstatus = CursorUtil.getColumnIndexOrThrow(_cursor, "estatus");
          final int _cursorIndexOfSexo = CursorUtil.getColumnIndexOrThrow(_cursor, "sexo");
          final int _cursorIndexOfFechaCreacion = CursorUtil.getColumnIndexOrThrow(_cursor, "fecha_creacion");
          final List<Usuario> _result = new ArrayList<Usuario>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Usuario _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            final String _tmpUser;
            _tmpUser = _cursor.getString(_cursorIndexOfUser);
            final String _tmpContrasena;
            _tmpContrasena = _cursor.getString(_cursorIndexOfContrasena);
            final boolean _tmpEstatus;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfEstatus);
            _tmpEstatus = _tmp != 0;
            final String _tmpSexo;
            _tmpSexo = _cursor.getString(_cursorIndexOfSexo);
            final Calendar _tmpFecha_creacion;
            final long _tmp_1;
            _tmp_1 = _cursor.getLong(_cursorIndexOfFechaCreacion);
            _tmpFecha_creacion = __converters.datestampToCalendar(_tmp_1);
            _item = new Usuario(_tmpId,_tmpEmail,_tmpUser,_tmpContrasena,_tmpEstatus,_tmpSexo,_tmpFecha_creacion);
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
  public LiveData<List<Usuario>> findUsuarioById(final long id) {
    final String _sql = "SELECT * FROM tcusuarios WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"tcusuarios"}, false, new Callable<List<Usuario>>() {
      @Override
      public List<Usuario> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfUser = CursorUtil.getColumnIndexOrThrow(_cursor, "user");
          final int _cursorIndexOfContrasena = CursorUtil.getColumnIndexOrThrow(_cursor, "contrasena");
          final int _cursorIndexOfEstatus = CursorUtil.getColumnIndexOrThrow(_cursor, "estatus");
          final int _cursorIndexOfSexo = CursorUtil.getColumnIndexOrThrow(_cursor, "sexo");
          final int _cursorIndexOfFechaCreacion = CursorUtil.getColumnIndexOrThrow(_cursor, "fecha_creacion");
          final List<Usuario> _result = new ArrayList<Usuario>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Usuario _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            final String _tmpUser;
            _tmpUser = _cursor.getString(_cursorIndexOfUser);
            final String _tmpContrasena;
            _tmpContrasena = _cursor.getString(_cursorIndexOfContrasena);
            final boolean _tmpEstatus;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfEstatus);
            _tmpEstatus = _tmp != 0;
            final String _tmpSexo;
            _tmpSexo = _cursor.getString(_cursorIndexOfSexo);
            final Calendar _tmpFecha_creacion;
            final long _tmp_1;
            _tmp_1 = _cursor.getLong(_cursorIndexOfFechaCreacion);
            _tmpFecha_creacion = __converters.datestampToCalendar(_tmp_1);
            _item = new Usuario(_tmpId,_tmpEmail,_tmpUser,_tmpContrasena,_tmpEstatus,_tmpSexo,_tmpFecha_creacion);
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
  public LiveData<Boolean> isValidUsuario(final String user, final String email) {
    final String _sql = "SELECT EXISTS (SELECT 1 FROM tcusuarios WHERE user = ? OR email LIKE ? LIMIT 1) ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (user == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, user);
    }
    _argIndex = 2;
    if (email == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, email);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"tcusuarios"}, false, new Callable<Boolean>() {
      @Override
      public Boolean call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Boolean _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp == null ? null : _tmp != 0;
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
}
