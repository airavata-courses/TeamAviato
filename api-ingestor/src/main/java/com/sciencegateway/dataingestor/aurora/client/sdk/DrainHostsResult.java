/**
 * Autogenerated by Thrift Compiler (0.9.3)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package com.sciencegateway.dataingestor.aurora.client.sdk;

import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import javax.annotation.Generated;
import java.util.*;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-08")
public class DrainHostsResult implements org.apache.thrift.TBase<DrainHostsResult, DrainHostsResult._Fields>, java.io.Serializable, Cloneable, Comparable<DrainHostsResult> {
    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DrainHostsResult");
    private static final org.apache.thrift.protocol.TField STATUSES_FIELD_DESC = new org.apache.thrift.protocol.TField("statuses", org.apache.thrift.protocol.TType.SET, (short) 1);
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();

    static {
        schemes.put(StandardScheme.class, new DrainHostsResultStandardSchemeFactory());
        schemes.put(TupleScheme.class, new DrainHostsResultTupleSchemeFactory());
    }

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.STATUSES, new org.apache.thrift.meta_data.FieldMetaData("statuses", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET,
                        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, HostStatus.class))));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DrainHostsResult.class, metaDataMap);
    }

    public Set<HostStatus> statuses; // required

    public DrainHostsResult() {
    }

    public DrainHostsResult(
            Set<HostStatus> statuses) {
        this();
        this.statuses = statuses;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public DrainHostsResult(DrainHostsResult other) {
        if (other.isSetStatuses()) {
            Set<HostStatus> __this__statuses = new HashSet<HostStatus>(other.statuses.size());
            for (HostStatus other_element : other.statuses) {
                __this__statuses.add(new HostStatus(other_element));
            }
            this.statuses = __this__statuses;
        }
    }

    public DrainHostsResult deepCopy() {
        return new DrainHostsResult(this);
    }

    @Override
    public void clear() {
        this.statuses = null;
    }

    public int getStatusesSize() {
        return (this.statuses == null) ? 0 : this.statuses.size();
    }

    public java.util.Iterator<HostStatus> getStatusesIterator() {
        return (this.statuses == null) ? null : this.statuses.iterator();
    }

    public void addToStatuses(HostStatus elem) {
        if (this.statuses == null) {
            this.statuses = new HashSet<HostStatus>();
        }
        this.statuses.add(elem);
    }

    public Set<HostStatus> getStatuses() {
        return this.statuses;
    }

    public DrainHostsResult setStatuses(Set<HostStatus> statuses) {
        this.statuses = statuses;
        return this;
    }

    public void unsetStatuses() {
        this.statuses = null;
    }

    /**
     * Returns true if field statuses is set (has been assigned a value) and false otherwise
     */
    public boolean isSetStatuses() {
        return this.statuses != null;
    }

    public void setStatusesIsSet(boolean value) {
        if (!value) {
            this.statuses = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case STATUSES:
                if (value == null) {
                    unsetStatuses();
                } else {
                    setStatuses((Set<HostStatus>) value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case STATUSES:
                return getStatuses();

        }
        throw new IllegalStateException();
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
     */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
            case STATUSES:
                return isSetStatuses();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof DrainHostsResult)
            return this.equals((DrainHostsResult) that);
        return false;
    }

    public boolean equals(DrainHostsResult that) {
        if (that == null)
            return false;

        boolean this_present_statuses = true && this.isSetStatuses();
        boolean that_present_statuses = true && that.isSetStatuses();
        if (this_present_statuses || that_present_statuses) {
            if (!(this_present_statuses && that_present_statuses))
                return false;
            if (!this.statuses.equals(that.statuses))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();

        boolean present_statuses = true && (isSetStatuses());
        list.add(present_statuses);
        if (present_statuses)
            list.add(statuses);

        return list.hashCode();
    }

    @Override
    public int compareTo(DrainHostsResult other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetStatuses()).compareTo(other.isSetStatuses());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetStatuses()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.statuses, other.statuses);
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
        StringBuilder sb = new StringBuilder("DrainHostsResult(");
        boolean first = true;

        sb.append("statuses:");
        if (this.statuses == null) {
            sb.append("null");
        } else {
            sb.append(this.statuses);
        }
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        try {
            write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
        try {
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    /**
     * The set of fields this struct contains, along with convenience methods for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        STATUSES((short) 1, "statuses");

        private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

        static {
            for (_Fields field : EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        private final short _thriftId;
        private final String _fieldName;

        _Fields(short thriftId, String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not found.
         */
        public static _Fields findByThriftId(int fieldId) {
            switch (fieldId) {
                case 1: // STATUSES
                    return STATUSES;
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

        public short getThriftFieldId() {
            return _thriftId;
        }

        public String getFieldName() {
            return _fieldName;
        }
    }

    private static class DrainHostsResultStandardSchemeFactory implements SchemeFactory {
        public DrainHostsResultStandardScheme getScheme() {
            return new DrainHostsResultStandardScheme();
        }
    }

    private static class DrainHostsResultStandardScheme extends StandardScheme<DrainHostsResult> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, DrainHostsResult struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // STATUSES
                        if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
                            {
                                org.apache.thrift.protocol.TSet _set278 = iprot.readSetBegin();
                                struct.statuses = new HashSet<HostStatus>(2 * _set278.size);
                                HostStatus _elem279;
                                for (int _i280 = 0; _i280 < _set278.size; ++_i280) {
                                    _elem279 = new HostStatus();
                                    _elem279.read(iprot);
                                    struct.statuses.add(_elem279);
                                }
                                iprot.readSetEnd();
                            }
                            struct.setStatusesIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, DrainHostsResult struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.statuses != null) {
                oprot.writeFieldBegin(STATUSES_FIELD_DESC);
                {
                    oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, struct.statuses.size()));
                    for (HostStatus _iter281 : struct.statuses) {
                        _iter281.write(oprot);
                    }
                    oprot.writeSetEnd();
                }
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class DrainHostsResultTupleSchemeFactory implements SchemeFactory {
        public DrainHostsResultTupleScheme getScheme() {
            return new DrainHostsResultTupleScheme();
        }
    }

    private static class DrainHostsResultTupleScheme extends TupleScheme<DrainHostsResult> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, DrainHostsResult struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetStatuses()) {
                optionals.set(0);
            }
            oprot.writeBitSet(optionals, 1);
            if (struct.isSetStatuses()) {
                {
                    oprot.writeI32(struct.statuses.size());
                    for (HostStatus _iter282 : struct.statuses) {
                        _iter282.write(oprot);
                    }
                }
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, DrainHostsResult struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(1);
            if (incoming.get(0)) {
                {
                    org.apache.thrift.protocol.TSet _set283 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
                    struct.statuses = new HashSet<HostStatus>(2 * _set283.size);
                    HostStatus _elem284;
                    for (int _i285 = 0; _i285 < _set283.size; ++_i285) {
                        _elem284 = new HostStatus();
                        _elem284.read(iprot);
                        struct.statuses.add(_elem284);
                    }
                }
                struct.setStatusesIsSet(true);
            }
        }
    }

}

