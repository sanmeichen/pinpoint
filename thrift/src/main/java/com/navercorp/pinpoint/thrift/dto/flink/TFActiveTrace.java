/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.navercorp.pinpoint.thrift.dto.flink;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-09-06")
public class TFActiveTrace implements org.apache.thrift.TBase<TFActiveTrace, TFActiveTrace._Fields>, java.io.Serializable, Cloneable, Comparable<TFActiveTrace> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TFActiveTrace");

  private static final org.apache.thrift.protocol.TField HISTOGRAM_FIELD_DESC = new org.apache.thrift.protocol.TField("histogram", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TFActiveTraceStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TFActiveTraceTupleSchemeFactory();

  private TFActiveTraceHistogram histogram; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HISTOGRAM((short)1, "histogram");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // HISTOGRAM
          return HISTOGRAM;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.HISTOGRAM};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HISTOGRAM, new org.apache.thrift.meta_data.FieldMetaData("histogram", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TFActiveTraceHistogram.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TFActiveTrace.class, metaDataMap);
  }

  public TFActiveTrace() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TFActiveTrace(TFActiveTrace other) {
    if (other.isSetHistogram()) {
      this.histogram = new TFActiveTraceHistogram(other.histogram);
    }
  }

  public TFActiveTrace deepCopy() {
    return new TFActiveTrace(this);
  }

  @Override
  public void clear() {
    this.histogram = null;
  }

  public TFActiveTraceHistogram getHistogram() {
    return this.histogram;
  }

  public void setHistogram(TFActiveTraceHistogram histogram) {
    this.histogram = histogram;
  }

  public void unsetHistogram() {
    this.histogram = null;
  }

  /** Returns true if field histogram is set (has been assigned a value) and false otherwise */
  public boolean isSetHistogram() {
    return this.histogram != null;
  }

  public void setHistogramIsSet(boolean value) {
    if (!value) {
      this.histogram = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case HISTOGRAM:
      if (value == null) {
        unsetHistogram();
      } else {
        setHistogram((TFActiveTraceHistogram)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case HISTOGRAM:
      return getHistogram();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case HISTOGRAM:
      return isSetHistogram();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TFActiveTrace)
      return this.equals((TFActiveTrace)that);
    return false;
  }

  public boolean equals(TFActiveTrace that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_histogram = true && this.isSetHistogram();
    boolean that_present_histogram = true && that.isSetHistogram();
    if (this_present_histogram || that_present_histogram) {
      if (!(this_present_histogram && that_present_histogram))
        return false;
      if (!this.histogram.equals(that.histogram))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetHistogram()) ? 131071 : 524287);
    if (isSetHistogram())
      hashCode = hashCode * 8191 + histogram.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TFActiveTrace other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetHistogram()).compareTo(other.isSetHistogram());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHistogram()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.histogram, other.histogram);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TFActiveTrace(");
    boolean first = true;

    if (isSetHistogram()) {
      sb.append("histogram:");
      if (this.histogram == null) {
        sb.append("null");
      } else {
        sb.append(this.histogram);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (histogram != null) {
      histogram.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TFActiveTraceStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TFActiveTraceStandardScheme getScheme() {
      return new TFActiveTraceStandardScheme();
    }
  }

  private static class TFActiveTraceStandardScheme extends org.apache.thrift.scheme.StandardScheme<TFActiveTrace> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TFActiveTrace struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HISTOGRAM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.histogram = new TFActiveTraceHistogram();
              struct.histogram.read(iprot);
              struct.setHistogramIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TFActiveTrace struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.histogram != null) {
        if (struct.isSetHistogram()) {
          oprot.writeFieldBegin(HISTOGRAM_FIELD_DESC);
          struct.histogram.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TFActiveTraceTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TFActiveTraceTupleScheme getScheme() {
      return new TFActiveTraceTupleScheme();
    }
  }

  private static class TFActiveTraceTupleScheme extends org.apache.thrift.scheme.TupleScheme<TFActiveTrace> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TFActiveTrace struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetHistogram()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetHistogram()) {
        struct.histogram.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TFActiveTrace struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.histogram = new TFActiveTraceHistogram();
        struct.histogram.read(iprot);
        struct.setHistogramIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

