// ORM class for table 'pedido'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sun Apr 25 23:16:08 UTC 2021
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class pedido extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("x1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        pedido.this.x1 = (Integer)value;
      }
    });
    setters.put("x2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        pedido.this.x2 = (String)value;
      }
    });
    setters.put("x4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        pedido.this.x4 = (java.sql.Date)value;
      }
    });
    setters.put("x5", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        pedido.this.x5 = (java.sql.Time)value;
      }
    });
    setters.put("x6", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        pedido.this.x6 = (java.sql.Timestamp)value;
      }
    });
    setters.put("x7", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        pedido.this.x7 = (java.sql.Timestamp)value;
      }
    });
    setters.put("x8", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        pedido.this.x8 = (java.sql.Date)value;
      }
    });
    setters.put("x9", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        pedido.this.x9 = (java.sql.Date)value;
      }
    });
    setters.put("x10", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        pedido.this.x10 = (Double)value;
      }
    });
    setters.put("x11", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        pedido.this.x11 = (Integer)value;
      }
    });
    setters.put("x12", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        pedido.this.x12 = (Integer)value;
      }
    });
    setters.put("x3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        pedido.this.x3 = (Integer)value;
      }
    });
  }
  public pedido() {
    init0();
  }
  private Integer x1;
  public Integer get_x1() {
    return x1;
  }
  public void set_x1(Integer x1) {
    this.x1 = x1;
  }
  public pedido with_x1(Integer x1) {
    this.x1 = x1;
    return this;
  }
  private String x2;
  public String get_x2() {
    return x2;
  }
  public void set_x2(String x2) {
    this.x2 = x2;
  }
  public pedido with_x2(String x2) {
    this.x2 = x2;
    return this;
  }
  private java.sql.Date x4;
  public java.sql.Date get_x4() {
    return x4;
  }
  public void set_x4(java.sql.Date x4) {
    this.x4 = x4;
  }
  public pedido with_x4(java.sql.Date x4) {
    this.x4 = x4;
    return this;
  }
  private java.sql.Time x5;
  public java.sql.Time get_x5() {
    return x5;
  }
  public void set_x5(java.sql.Time x5) {
    this.x5 = x5;
  }
  public pedido with_x5(java.sql.Time x5) {
    this.x5 = x5;
    return this;
  }
  private java.sql.Timestamp x6;
  public java.sql.Timestamp get_x6() {
    return x6;
  }
  public void set_x6(java.sql.Timestamp x6) {
    this.x6 = x6;
  }
  public pedido with_x6(java.sql.Timestamp x6) {
    this.x6 = x6;
    return this;
  }
  private java.sql.Timestamp x7;
  public java.sql.Timestamp get_x7() {
    return x7;
  }
  public void set_x7(java.sql.Timestamp x7) {
    this.x7 = x7;
  }
  public pedido with_x7(java.sql.Timestamp x7) {
    this.x7 = x7;
    return this;
  }
  private java.sql.Date x8;
  public java.sql.Date get_x8() {
    return x8;
  }
  public void set_x8(java.sql.Date x8) {
    this.x8 = x8;
  }
  public pedido with_x8(java.sql.Date x8) {
    this.x8 = x8;
    return this;
  }
  private java.sql.Date x9;
  public java.sql.Date get_x9() {
    return x9;
  }
  public void set_x9(java.sql.Date x9) {
    this.x9 = x9;
  }
  public pedido with_x9(java.sql.Date x9) {
    this.x9 = x9;
    return this;
  }
  private Double x10;
  public Double get_x10() {
    return x10;
  }
  public void set_x10(Double x10) {
    this.x10 = x10;
  }
  public pedido with_x10(Double x10) {
    this.x10 = x10;
    return this;
  }
  private Integer x11;
  public Integer get_x11() {
    return x11;
  }
  public void set_x11(Integer x11) {
    this.x11 = x11;
  }
  public pedido with_x11(Integer x11) {
    this.x11 = x11;
    return this;
  }
  private Integer x12;
  public Integer get_x12() {
    return x12;
  }
  public void set_x12(Integer x12) {
    this.x12 = x12;
  }
  public pedido with_x12(Integer x12) {
    this.x12 = x12;
    return this;
  }
  private Integer x3;
  public Integer get_x3() {
    return x3;
  }
  public void set_x3(Integer x3) {
    this.x3 = x3;
  }
  public pedido with_x3(Integer x3) {
    this.x3 = x3;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof pedido)) {
      return false;
    }
    pedido that = (pedido) o;
    boolean equal = true;
    equal = equal && (this.x1 == null ? that.x1 == null : this.x1.equals(that.x1));
    equal = equal && (this.x2 == null ? that.x2 == null : this.x2.equals(that.x2));
    equal = equal && (this.x4 == null ? that.x4 == null : this.x4.equals(that.x4));
    equal = equal && (this.x5 == null ? that.x5 == null : this.x5.equals(that.x5));
    equal = equal && (this.x6 == null ? that.x6 == null : this.x6.equals(that.x6));
    equal = equal && (this.x7 == null ? that.x7 == null : this.x7.equals(that.x7));
    equal = equal && (this.x8 == null ? that.x8 == null : this.x8.equals(that.x8));
    equal = equal && (this.x9 == null ? that.x9 == null : this.x9.equals(that.x9));
    equal = equal && (this.x10 == null ? that.x10 == null : this.x10.equals(that.x10));
    equal = equal && (this.x11 == null ? that.x11 == null : this.x11.equals(that.x11));
    equal = equal && (this.x12 == null ? that.x12 == null : this.x12.equals(that.x12));
    equal = equal && (this.x3 == null ? that.x3 == null : this.x3.equals(that.x3));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof pedido)) {
      return false;
    }
    pedido that = (pedido) o;
    boolean equal = true;
    equal = equal && (this.x1 == null ? that.x1 == null : this.x1.equals(that.x1));
    equal = equal && (this.x2 == null ? that.x2 == null : this.x2.equals(that.x2));
    equal = equal && (this.x4 == null ? that.x4 == null : this.x4.equals(that.x4));
    equal = equal && (this.x5 == null ? that.x5 == null : this.x5.equals(that.x5));
    equal = equal && (this.x6 == null ? that.x6 == null : this.x6.equals(that.x6));
    equal = equal && (this.x7 == null ? that.x7 == null : this.x7.equals(that.x7));
    equal = equal && (this.x8 == null ? that.x8 == null : this.x8.equals(that.x8));
    equal = equal && (this.x9 == null ? that.x9 == null : this.x9.equals(that.x9));
    equal = equal && (this.x10 == null ? that.x10 == null : this.x10.equals(that.x10));
    equal = equal && (this.x11 == null ? that.x11 == null : this.x11.equals(that.x11));
    equal = equal && (this.x12 == null ? that.x12 == null : this.x12.equals(that.x12));
    equal = equal && (this.x3 == null ? that.x3 == null : this.x3.equals(that.x3));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.x1 = JdbcWritableBridge.readInteger(1, __dbResults);
    this.x2 = JdbcWritableBridge.readString(2, __dbResults);
    this.x4 = JdbcWritableBridge.readDate(3, __dbResults);
    this.x5 = JdbcWritableBridge.readTime(4, __dbResults);
    this.x6 = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.x7 = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.x8 = JdbcWritableBridge.readDate(7, __dbResults);
    this.x9 = JdbcWritableBridge.readDate(8, __dbResults);
    this.x10 = JdbcWritableBridge.readDouble(9, __dbResults);
    this.x11 = JdbcWritableBridge.readInteger(10, __dbResults);
    this.x12 = JdbcWritableBridge.readInteger(11, __dbResults);
    this.x3 = JdbcWritableBridge.readInteger(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.x1 = JdbcWritableBridge.readInteger(1, __dbResults);
    this.x2 = JdbcWritableBridge.readString(2, __dbResults);
    this.x4 = JdbcWritableBridge.readDate(3, __dbResults);
    this.x5 = JdbcWritableBridge.readTime(4, __dbResults);
    this.x6 = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.x7 = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.x8 = JdbcWritableBridge.readDate(7, __dbResults);
    this.x9 = JdbcWritableBridge.readDate(8, __dbResults);
    this.x10 = JdbcWritableBridge.readDouble(9, __dbResults);
    this.x11 = JdbcWritableBridge.readInteger(10, __dbResults);
    this.x12 = JdbcWritableBridge.readInteger(11, __dbResults);
    this.x3 = JdbcWritableBridge.readInteger(12, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(x1, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(x2, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(x4, 3 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeTime(x5, 4 + __off, 92, __dbStmt);
    JdbcWritableBridge.writeTimestamp(x6, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(x7, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeDate(x8, 7 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(x9, 8 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDouble(x10, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(x11, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(x12, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(x3, 12 + __off, 4, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(x1, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(x2, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(x4, 3 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeTime(x5, 4 + __off, 92, __dbStmt);
    JdbcWritableBridge.writeTimestamp(x6, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(x7, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeDate(x8, 7 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(x9, 8 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDouble(x10, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(x11, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(x12, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(x3, 12 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.x1 = null;
    } else {
    this.x1 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.x2 = null;
    } else {
    this.x2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.x4 = null;
    } else {
    this.x4 = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.x5 = null;
    } else {
    this.x5 = new Time(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.x6 = null;
    } else {
    this.x6 = new Timestamp(__dataIn.readLong());
    this.x6.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.x7 = null;
    } else {
    this.x7 = new Timestamp(__dataIn.readLong());
    this.x7.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.x8 = null;
    } else {
    this.x8 = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.x9 = null;
    } else {
    this.x9 = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.x10 = null;
    } else {
    this.x10 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.x11 = null;
    } else {
    this.x11 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.x12 = null;
    } else {
    this.x12 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.x3 = null;
    } else {
    this.x3 = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.x1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.x1);
    }
    if (null == this.x2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, x2);
    }
    if (null == this.x4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.x4.getTime());
    }
    if (null == this.x5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.x5.getTime());
    }
    if (null == this.x6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.x6.getTime());
    __dataOut.writeInt(this.x6.getNanos());
    }
    if (null == this.x7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.x7.getTime());
    __dataOut.writeInt(this.x7.getNanos());
    }
    if (null == this.x8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.x8.getTime());
    }
    if (null == this.x9) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.x9.getTime());
    }
    if (null == this.x10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.x10);
    }
    if (null == this.x11) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.x11);
    }
    if (null == this.x12) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.x12);
    }
    if (null == this.x3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.x3);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.x1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.x1);
    }
    if (null == this.x2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, x2);
    }
    if (null == this.x4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.x4.getTime());
    }
    if (null == this.x5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.x5.getTime());
    }
    if (null == this.x6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.x6.getTime());
    __dataOut.writeInt(this.x6.getNanos());
    }
    if (null == this.x7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.x7.getTime());
    __dataOut.writeInt(this.x7.getNanos());
    }
    if (null == this.x8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.x8.getTime());
    }
    if (null == this.x9) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.x9.getTime());
    }
    if (null == this.x10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.x10);
    }
    if (null == this.x11) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.x11);
    }
    if (null == this.x12) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.x12);
    }
    if (null == this.x3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.x3);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(x1==null?"null":"" + x1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(x2==null?"null":x2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(x4==null?"null":"" + x4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(x5==null?"null":"" + x5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(x6==null?"null":"" + x6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(x7==null?"null":"" + x7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(x8==null?"null":"" + x8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(x9==null?"null":"" + x9, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(x10==null?"null":"" + x10, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(x11==null?"null":"" + x11, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(x12==null?"null":"" + x12, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(x3==null?"null":"" + x3, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(x1==null?"null":"" + x1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(x2==null?"null":x2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(x4==null?"null":"" + x4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(x5==null?"null":"" + x5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(x6==null?"null":"" + x6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(x7==null?"null":"" + x7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(x8==null?"null":"" + x8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(x9==null?"null":"" + x9, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(x10==null?"null":"" + x10, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(x11==null?"null":"" + x11, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(x12==null?"null":"" + x12, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(x3==null?"null":"" + x3, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.x1 = null; } else {
      this.x1 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.x2 = null; } else {
      this.x2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.x4 = null; } else {
      this.x4 = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.x5 = null; } else {
      this.x5 = java.sql.Time.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.x6 = null; } else {
      this.x6 = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.x7 = null; } else {
      this.x7 = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.x8 = null; } else {
      this.x8 = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.x9 = null; } else {
      this.x9 = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.x10 = null; } else {
      this.x10 = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.x11 = null; } else {
      this.x11 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.x12 = null; } else {
      this.x12 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.x3 = null; } else {
      this.x3 = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.x1 = null; } else {
      this.x1 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.x2 = null; } else {
      this.x2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.x4 = null; } else {
      this.x4 = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.x5 = null; } else {
      this.x5 = java.sql.Time.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.x6 = null; } else {
      this.x6 = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.x7 = null; } else {
      this.x7 = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.x8 = null; } else {
      this.x8 = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.x9 = null; } else {
      this.x9 = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.x10 = null; } else {
      this.x10 = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.x11 = null; } else {
      this.x11 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.x12 = null; } else {
      this.x12 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.x3 = null; } else {
      this.x3 = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    pedido o = (pedido) super.clone();
    o.x4 = (o.x4 != null) ? (java.sql.Date) o.x4.clone() : null;
    o.x5 = (o.x5 != null) ? (java.sql.Time) o.x5.clone() : null;
    o.x6 = (o.x6 != null) ? (java.sql.Timestamp) o.x6.clone() : null;
    o.x7 = (o.x7 != null) ? (java.sql.Timestamp) o.x7.clone() : null;
    o.x8 = (o.x8 != null) ? (java.sql.Date) o.x8.clone() : null;
    o.x9 = (o.x9 != null) ? (java.sql.Date) o.x9.clone() : null;
    return o;
  }

  public void clone0(pedido o) throws CloneNotSupportedException {
    o.x4 = (o.x4 != null) ? (java.sql.Date) o.x4.clone() : null;
    o.x5 = (o.x5 != null) ? (java.sql.Time) o.x5.clone() : null;
    o.x6 = (o.x6 != null) ? (java.sql.Timestamp) o.x6.clone() : null;
    o.x7 = (o.x7 != null) ? (java.sql.Timestamp) o.x7.clone() : null;
    o.x8 = (o.x8 != null) ? (java.sql.Date) o.x8.clone() : null;
    o.x9 = (o.x9 != null) ? (java.sql.Date) o.x9.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("x1", this.x1);
    __sqoop$field_map.put("x2", this.x2);
    __sqoop$field_map.put("x4", this.x4);
    __sqoop$field_map.put("x5", this.x5);
    __sqoop$field_map.put("x6", this.x6);
    __sqoop$field_map.put("x7", this.x7);
    __sqoop$field_map.put("x8", this.x8);
    __sqoop$field_map.put("x9", this.x9);
    __sqoop$field_map.put("x10", this.x10);
    __sqoop$field_map.put("x11", this.x11);
    __sqoop$field_map.put("x12", this.x12);
    __sqoop$field_map.put("x3", this.x3);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("x1", this.x1);
    __sqoop$field_map.put("x2", this.x2);
    __sqoop$field_map.put("x4", this.x4);
    __sqoop$field_map.put("x5", this.x5);
    __sqoop$field_map.put("x6", this.x6);
    __sqoop$field_map.put("x7", this.x7);
    __sqoop$field_map.put("x8", this.x8);
    __sqoop$field_map.put("x9", this.x9);
    __sqoop$field_map.put("x10", this.x10);
    __sqoop$field_map.put("x11", this.x11);
    __sqoop$field_map.put("x12", this.x12);
    __sqoop$field_map.put("x3", this.x3);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
