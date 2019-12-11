/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'PowerOutletFeedbackMsg'
 * message type.
 */

package com.rincon.tunitfeedback.poweroutlet;

/*
 * Copyright (c) 2005-2006 Rincon Research Corporation
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * - Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 * - Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the
 *   distribution.
 * - Neither the name of the Rincon Research Corporation nor the names of
 *   its contributors may be used to endorse or promote products derived
 *   from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * ``AS IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE
 * RINCON RESEARCH OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE
 */

public class PowerOutletFeedbackMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 3;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 255;

    /** Create a new PowerOutletFeedbackMsg of size 3. */
    public PowerOutletFeedbackMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new PowerOutletFeedbackMsg of the given data_length. */
    public PowerOutletFeedbackMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new PowerOutletFeedbackMsg with the given data_length
     * and base offset.
     */
    public PowerOutletFeedbackMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new PowerOutletFeedbackMsg using the given byte array
     * as backing store.
     */
    public PowerOutletFeedbackMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new PowerOutletFeedbackMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public PowerOutletFeedbackMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new PowerOutletFeedbackMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public PowerOutletFeedbackMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new PowerOutletFeedbackMsg embedded in the given message
     * at the given base offset.
     */
    public PowerOutletFeedbackMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new PowerOutletFeedbackMsg embedded in the given message
     * at the given base offset and length.
     */
    public PowerOutletFeedbackMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <PowerOutletFeedbackMsg> \n";
      try {
        s += "  [bool0=0x"+Long.toHexString(get_bool0())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [bool1=0x"+Long.toHexString(get_bool1())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [short0=0x"+Long.toHexString(get_short0())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: bool0
    //   Field type: short, unsigned
    //   Offset (bits): 0
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'bool0' is signed (false).
     */
    public static boolean isSigned_bool0() {
        return false;
    }

    /**
     * Return whether the field 'bool0' is an array (false).
     */
    public static boolean isArray_bool0() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'bool0'
     */
    public static int offset_bool0() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'bool0'
     */
    public static int offsetBits_bool0() {
        return 0;
    }

    /**
     * Return the value (as a short) of the field 'bool0'
     */
    public short get_bool0() {
        return (short)getUIntBEElement(offsetBits_bool0(), 8);
    }

    /**
     * Set the value of the field 'bool0'
     */
    public void set_bool0(short value) {
        setUIntBEElement(offsetBits_bool0(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'bool0'
     */
    public static int size_bool0() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'bool0'
     */
    public static int sizeBits_bool0() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: bool1
    //   Field type: short, unsigned
    //   Offset (bits): 8
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'bool1' is signed (false).
     */
    public static boolean isSigned_bool1() {
        return false;
    }

    /**
     * Return whether the field 'bool1' is an array (false).
     */
    public static boolean isArray_bool1() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'bool1'
     */
    public static int offset_bool1() {
        return (8 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'bool1'
     */
    public static int offsetBits_bool1() {
        return 8;
    }

    /**
     * Return the value (as a short) of the field 'bool1'
     */
    public short get_bool1() {
        return (short)getUIntBEElement(offsetBits_bool1(), 8);
    }

    /**
     * Set the value of the field 'bool1'
     */
    public void set_bool1(short value) {
        setUIntBEElement(offsetBits_bool1(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'bool1'
     */
    public static int size_bool1() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'bool1'
     */
    public static int sizeBits_bool1() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: short0
    //   Field type: short, unsigned
    //   Offset (bits): 16
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'short0' is signed (false).
     */
    public static boolean isSigned_short0() {
        return false;
    }

    /**
     * Return whether the field 'short0' is an array (false).
     */
    public static boolean isArray_short0() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'short0'
     */
    public static int offset_short0() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'short0'
     */
    public static int offsetBits_short0() {
        return 16;
    }

    /**
     * Return the value (as a short) of the field 'short0'
     */
    public short get_short0() {
        return (short)getUIntBEElement(offsetBits_short0(), 8);
    }

    /**
     * Set the value of the field 'short0'
     */
    public void set_short0(short value) {
        setUIntBEElement(offsetBits_short0(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'short0'
     */
    public static int size_short0() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'short0'
     */
    public static int sizeBits_short0() {
        return 8;
    }

}
