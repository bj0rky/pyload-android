/**
 * Autogenerated by Thrift Compiler (0.8.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.pyload.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerStatus implements org.apache.thrift.TBase<ServerStatus, ServerStatus._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ServerStatus");

  private static final org.apache.thrift.protocol.TField PAUSE_FIELD_DESC = new org.apache.thrift.protocol.TField("pause", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField ACTIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("active", org.apache.thrift.protocol.TType.I16, (short)2);
  private static final org.apache.thrift.protocol.TField QUEUE_FIELD_DESC = new org.apache.thrift.protocol.TField("queue", org.apache.thrift.protocol.TType.I16, (short)3);
  private static final org.apache.thrift.protocol.TField TOTAL_FIELD_DESC = new org.apache.thrift.protocol.TField("total", org.apache.thrift.protocol.TType.I16, (short)4);
  private static final org.apache.thrift.protocol.TField SPEED_FIELD_DESC = new org.apache.thrift.protocol.TField("speed", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField DOWNLOAD_FIELD_DESC = new org.apache.thrift.protocol.TField("download", org.apache.thrift.protocol.TType.BOOL, (short)6);
  private static final org.apache.thrift.protocol.TField RECONNECT_FIELD_DESC = new org.apache.thrift.protocol.TField("reconnect", org.apache.thrift.protocol.TType.BOOL, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ServerStatusStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ServerStatusTupleSchemeFactory());
  }

  public boolean pause; // required
  public short active; // required
  public short queue; // required
  public short total; // required
  public long speed; // required
  public boolean download; // required
  public boolean reconnect; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PAUSE((short)1, "pause"),
    ACTIVE((short)2, "active"),
    QUEUE((short)3, "queue"),
    TOTAL((short)4, "total"),
    SPEED((short)5, "speed"),
    DOWNLOAD((short)6, "download"),
    RECONNECT((short)7, "reconnect");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PAUSE
          return PAUSE;
        case 2: // ACTIVE
          return ACTIVE;
        case 3: // QUEUE
          return QUEUE;
        case 4: // TOTAL
          return TOTAL;
        case 5: // SPEED
          return SPEED;
        case 6: // DOWNLOAD
          return DOWNLOAD;
        case 7: // RECONNECT
          return RECONNECT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PAUSE_ISSET_ID = 0;
  private static final int __ACTIVE_ISSET_ID = 1;
  private static final int __QUEUE_ISSET_ID = 2;
  private static final int __TOTAL_ISSET_ID = 3;
  private static final int __SPEED_ISSET_ID = 4;
  private static final int __DOWNLOAD_ISSET_ID = 5;
  private static final int __RECONNECT_ISSET_ID = 6;
  private BitSet __isset_bit_vector = new BitSet(7);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PAUSE, new org.apache.thrift.meta_data.FieldMetaData("pause", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ACTIVE, new org.apache.thrift.meta_data.FieldMetaData("active", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.QUEUE, new org.apache.thrift.meta_data.FieldMetaData("queue", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.TOTAL, new org.apache.thrift.meta_data.FieldMetaData("total", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.SPEED, new org.apache.thrift.meta_data.FieldMetaData("speed", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DOWNLOAD, new org.apache.thrift.meta_data.FieldMetaData("download", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.RECONNECT, new org.apache.thrift.meta_data.FieldMetaData("reconnect", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ServerStatus.class, metaDataMap);
  }

  public ServerStatus() {
  }

  public ServerStatus(
    boolean pause,
    short active,
    short queue,
    short total,
    long speed,
    boolean download,
    boolean reconnect)
  {
    this();
    this.pause = pause;
    setPauseIsSet(true);
    this.active = active;
    setActiveIsSet(true);
    this.queue = queue;
    setQueueIsSet(true);
    this.total = total;
    setTotalIsSet(true);
    this.speed = speed;
    setSpeedIsSet(true);
    this.download = download;
    setDownloadIsSet(true);
    this.reconnect = reconnect;
    setReconnectIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ServerStatus(ServerStatus other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.pause = other.pause;
    this.active = other.active;
    this.queue = other.queue;
    this.total = other.total;
    this.speed = other.speed;
    this.download = other.download;
    this.reconnect = other.reconnect;
  }

  public ServerStatus deepCopy() {
    return new ServerStatus(this);
  }

  @Override
  public void clear() {
    setPauseIsSet(false);
    this.pause = false;
    setActiveIsSet(false);
    this.active = 0;
    setQueueIsSet(false);
    this.queue = 0;
    setTotalIsSet(false);
    this.total = 0;
    setSpeedIsSet(false);
    this.speed = 0;
    setDownloadIsSet(false);
    this.download = false;
    setReconnectIsSet(false);
    this.reconnect = false;
  }

  public boolean isPause() {
    return this.pause;
  }

  public ServerStatus setPause(boolean pause) {
    this.pause = pause;
    setPauseIsSet(true);
    return this;
  }

  public void unsetPause() {
    __isset_bit_vector.clear(__PAUSE_ISSET_ID);
  }

  /** Returns true if field pause is set (has been assigned a value) and false otherwise */
  public boolean isSetPause() {
    return __isset_bit_vector.get(__PAUSE_ISSET_ID);
  }

  public void setPauseIsSet(boolean value) {
    __isset_bit_vector.set(__PAUSE_ISSET_ID, value);
  }

  public short getActive() {
    return this.active;
  }

  public ServerStatus setActive(short active) {
    this.active = active;
    setActiveIsSet(true);
    return this;
  }

  public void unsetActive() {
    __isset_bit_vector.clear(__ACTIVE_ISSET_ID);
  }

  /** Returns true if field active is set (has been assigned a value) and false otherwise */
  public boolean isSetActive() {
    return __isset_bit_vector.get(__ACTIVE_ISSET_ID);
  }

  public void setActiveIsSet(boolean value) {
    __isset_bit_vector.set(__ACTIVE_ISSET_ID, value);
  }

  public short getQueue() {
    return this.queue;
  }

  public ServerStatus setQueue(short queue) {
    this.queue = queue;
    setQueueIsSet(true);
    return this;
  }

  public void unsetQueue() {
    __isset_bit_vector.clear(__QUEUE_ISSET_ID);
  }

  /** Returns true if field queue is set (has been assigned a value) and false otherwise */
  public boolean isSetQueue() {
    return __isset_bit_vector.get(__QUEUE_ISSET_ID);
  }

  public void setQueueIsSet(boolean value) {
    __isset_bit_vector.set(__QUEUE_ISSET_ID, value);
  }

  public short getTotal() {
    return this.total;
  }

  public ServerStatus setTotal(short total) {
    this.total = total;
    setTotalIsSet(true);
    return this;
  }

  public void unsetTotal() {
    __isset_bit_vector.clear(__TOTAL_ISSET_ID);
  }

  /** Returns true if field total is set (has been assigned a value) and false otherwise */
  public boolean isSetTotal() {
    return __isset_bit_vector.get(__TOTAL_ISSET_ID);
  }

  public void setTotalIsSet(boolean value) {
    __isset_bit_vector.set(__TOTAL_ISSET_ID, value);
  }

  public long getSpeed() {
    return this.speed;
  }

  public ServerStatus setSpeed(long speed) {
    this.speed = speed;
    setSpeedIsSet(true);
    return this;
  }

  public void unsetSpeed() {
    __isset_bit_vector.clear(__SPEED_ISSET_ID);
  }

  /** Returns true if field speed is set (has been assigned a value) and false otherwise */
  public boolean isSetSpeed() {
    return __isset_bit_vector.get(__SPEED_ISSET_ID);
  }

  public void setSpeedIsSet(boolean value) {
    __isset_bit_vector.set(__SPEED_ISSET_ID, value);
  }

  public boolean isDownload() {
    return this.download;
  }

  public ServerStatus setDownload(boolean download) {
    this.download = download;
    setDownloadIsSet(true);
    return this;
  }

  public void unsetDownload() {
    __isset_bit_vector.clear(__DOWNLOAD_ISSET_ID);
  }

  /** Returns true if field download is set (has been assigned a value) and false otherwise */
  public boolean isSetDownload() {
    return __isset_bit_vector.get(__DOWNLOAD_ISSET_ID);
  }

  public void setDownloadIsSet(boolean value) {
    __isset_bit_vector.set(__DOWNLOAD_ISSET_ID, value);
  }

  public boolean isReconnect() {
    return this.reconnect;
  }

  public ServerStatus setReconnect(boolean reconnect) {
    this.reconnect = reconnect;
    setReconnectIsSet(true);
    return this;
  }

  public void unsetReconnect() {
    __isset_bit_vector.clear(__RECONNECT_ISSET_ID);
  }

  /** Returns true if field reconnect is set (has been assigned a value) and false otherwise */
  public boolean isSetReconnect() {
    return __isset_bit_vector.get(__RECONNECT_ISSET_ID);
  }

  public void setReconnectIsSet(boolean value) {
    __isset_bit_vector.set(__RECONNECT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PAUSE:
      if (value == null) {
        unsetPause();
      } else {
        setPause((Boolean)value);
      }
      break;

    case ACTIVE:
      if (value == null) {
        unsetActive();
      } else {
        setActive((Short)value);
      }
      break;

    case QUEUE:
      if (value == null) {
        unsetQueue();
      } else {
        setQueue((Short)value);
      }
      break;

    case TOTAL:
      if (value == null) {
        unsetTotal();
      } else {
        setTotal((Short)value);
      }
      break;

    case SPEED:
      if (value == null) {
        unsetSpeed();
      } else {
        setSpeed((Long)value);
      }
      break;

    case DOWNLOAD:
      if (value == null) {
        unsetDownload();
      } else {
        setDownload((Boolean)value);
      }
      break;

    case RECONNECT:
      if (value == null) {
        unsetReconnect();
      } else {
        setReconnect((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PAUSE:
      return Boolean.valueOf(isPause());

    case ACTIVE:
      return Short.valueOf(getActive());

    case QUEUE:
      return Short.valueOf(getQueue());

    case TOTAL:
      return Short.valueOf(getTotal());

    case SPEED:
      return Long.valueOf(getSpeed());

    case DOWNLOAD:
      return Boolean.valueOf(isDownload());

    case RECONNECT:
      return Boolean.valueOf(isReconnect());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PAUSE:
      return isSetPause();
    case ACTIVE:
      return isSetActive();
    case QUEUE:
      return isSetQueue();
    case TOTAL:
      return isSetTotal();
    case SPEED:
      return isSetSpeed();
    case DOWNLOAD:
      return isSetDownload();
    case RECONNECT:
      return isSetReconnect();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ServerStatus)
      return this.equals((ServerStatus)that);
    return false;
  }

  public boolean equals(ServerStatus that) {
    if (that == null)
      return false;

    boolean this_present_pause = true;
    boolean that_present_pause = true;
    if (this_present_pause || that_present_pause) {
      if (!(this_present_pause && that_present_pause))
        return false;
      if (this.pause != that.pause)
        return false;
    }

    boolean this_present_active = true;
    boolean that_present_active = true;
    if (this_present_active || that_present_active) {
      if (!(this_present_active && that_present_active))
        return false;
      if (this.active != that.active)
        return false;
    }

    boolean this_present_queue = true;
    boolean that_present_queue = true;
    if (this_present_queue || that_present_queue) {
      if (!(this_present_queue && that_present_queue))
        return false;
      if (this.queue != that.queue)
        return false;
    }

    boolean this_present_total = true;
    boolean that_present_total = true;
    if (this_present_total || that_present_total) {
      if (!(this_present_total && that_present_total))
        return false;
      if (this.total != that.total)
        return false;
    }

    boolean this_present_speed = true;
    boolean that_present_speed = true;
    if (this_present_speed || that_present_speed) {
      if (!(this_present_speed && that_present_speed))
        return false;
      if (this.speed != that.speed)
        return false;
    }

    boolean this_present_download = true;
    boolean that_present_download = true;
    if (this_present_download || that_present_download) {
      if (!(this_present_download && that_present_download))
        return false;
      if (this.download != that.download)
        return false;
    }

    boolean this_present_reconnect = true;
    boolean that_present_reconnect = true;
    if (this_present_reconnect || that_present_reconnect) {
      if (!(this_present_reconnect && that_present_reconnect))
        return false;
      if (this.reconnect != that.reconnect)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ServerStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ServerStatus typedOther = (ServerStatus)other;

    lastComparison = Boolean.valueOf(isSetPause()).compareTo(typedOther.isSetPause());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPause()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pause, typedOther.pause);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetActive()).compareTo(typedOther.isSetActive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActive()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.active, typedOther.active);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQueue()).compareTo(typedOther.isSetQueue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queue, typedOther.queue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotal()).compareTo(typedOther.isSetTotal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.total, typedOther.total);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSpeed()).compareTo(typedOther.isSetSpeed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpeed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.speed, typedOther.speed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDownload()).compareTo(typedOther.isSetDownload());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDownload()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.download, typedOther.download);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReconnect()).compareTo(typedOther.isSetReconnect());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReconnect()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reconnect, typedOther.reconnect);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ServerStatus(");
    boolean first = true;

    sb.append("pause:");
    sb.append(this.pause);
    first = false;
    if (!first) sb.append(", ");
    sb.append("active:");
    sb.append(this.active);
    first = false;
    if (!first) sb.append(", ");
    sb.append("queue:");
    sb.append(this.queue);
    first = false;
    if (!first) sb.append(", ");
    sb.append("total:");
    sb.append(this.total);
    first = false;
    if (!first) sb.append(", ");
    sb.append("speed:");
    sb.append(this.speed);
    first = false;
    if (!first) sb.append(", ");
    sb.append("download:");
    sb.append(this.download);
    first = false;
    if (!first) sb.append(", ");
    sb.append("reconnect:");
    sb.append(this.reconnect);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te.getMessage());
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te.getMessage());
    }
  }

  private static class ServerStatusStandardSchemeFactory implements SchemeFactory {
    public ServerStatusStandardScheme getScheme() {
      return new ServerStatusStandardScheme();
    }
  }

  private static class ServerStatusStandardScheme extends StandardScheme<ServerStatus> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ServerStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PAUSE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.pause = iprot.readBool();
              struct.setPauseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ACTIVE
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.active = iprot.readI16();
              struct.setActiveIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // QUEUE
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.queue = iprot.readI16();
              struct.setQueueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TOTAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.total = iprot.readI16();
              struct.setTotalIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SPEED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.speed = iprot.readI64();
              struct.setSpeedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DOWNLOAD
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.download = iprot.readBool();
              struct.setDownloadIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // RECONNECT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.reconnect = iprot.readBool();
              struct.setReconnectIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ServerStatus struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PAUSE_FIELD_DESC);
      oprot.writeBool(struct.pause);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ACTIVE_FIELD_DESC);
      oprot.writeI16(struct.active);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(QUEUE_FIELD_DESC);
      oprot.writeI16(struct.queue);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TOTAL_FIELD_DESC);
      oprot.writeI16(struct.total);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SPEED_FIELD_DESC);
      oprot.writeI64(struct.speed);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DOWNLOAD_FIELD_DESC);
      oprot.writeBool(struct.download);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RECONNECT_FIELD_DESC);
      oprot.writeBool(struct.reconnect);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ServerStatusTupleSchemeFactory implements SchemeFactory {
    public ServerStatusTupleScheme getScheme() {
      return new ServerStatusTupleScheme();
    }
  }

  private static class ServerStatusTupleScheme extends TupleScheme<ServerStatus> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ServerStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPause()) {
        optionals.set(0);
      }
      if (struct.isSetActive()) {
        optionals.set(1);
      }
      if (struct.isSetQueue()) {
        optionals.set(2);
      }
      if (struct.isSetTotal()) {
        optionals.set(3);
      }
      if (struct.isSetSpeed()) {
        optionals.set(4);
      }
      if (struct.isSetDownload()) {
        optionals.set(5);
      }
      if (struct.isSetReconnect()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetPause()) {
        oprot.writeBool(struct.pause);
      }
      if (struct.isSetActive()) {
        oprot.writeI16(struct.active);
      }
      if (struct.isSetQueue()) {
        oprot.writeI16(struct.queue);
      }
      if (struct.isSetTotal()) {
        oprot.writeI16(struct.total);
      }
      if (struct.isSetSpeed()) {
        oprot.writeI64(struct.speed);
      }
      if (struct.isSetDownload()) {
        oprot.writeBool(struct.download);
      }
      if (struct.isSetReconnect()) {
        oprot.writeBool(struct.reconnect);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ServerStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.pause = iprot.readBool();
        struct.setPauseIsSet(true);
      }
      if (incoming.get(1)) {
        struct.active = iprot.readI16();
        struct.setActiveIsSet(true);
      }
      if (incoming.get(2)) {
        struct.queue = iprot.readI16();
        struct.setQueueIsSet(true);
      }
      if (incoming.get(3)) {
        struct.total = iprot.readI16();
        struct.setTotalIsSet(true);
      }
      if (incoming.get(4)) {
        struct.speed = iprot.readI64();
        struct.setSpeedIsSet(true);
      }
      if (incoming.get(5)) {
        struct.download = iprot.readBool();
        struct.setDownloadIsSet(true);
      }
      if (incoming.get(6)) {
        struct.reconnect = iprot.readBool();
        struct.setReconnectIsSet(true);
      }
    }
  }

}
