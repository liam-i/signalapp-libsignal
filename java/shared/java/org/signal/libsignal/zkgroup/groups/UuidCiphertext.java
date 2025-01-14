//
// Copyright 2020-2021 Signal Messenger, LLC.
// SPDX-License-Identifier: AGPL-3.0-only
//

package org.signal.libsignal.zkgroup.groups;

import org.signal.libsignal.internal.Native;
import org.signal.libsignal.zkgroup.InvalidInputException;
import org.signal.libsignal.zkgroup.internal.ByteArray;

public final class UuidCiphertext extends ByteArray {
  public UuidCiphertext(byte[] contents) throws InvalidInputException {
    super(contents);
    Native.UuidCiphertext_CheckValidContents(contents);
  }
}
