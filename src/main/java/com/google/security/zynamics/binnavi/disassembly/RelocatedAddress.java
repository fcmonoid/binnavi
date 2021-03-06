// Copyright 2011-2016 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.security.zynamics.binnavi.disassembly;

import com.google.security.zynamics.zylib.disassembly.IAddress;

/**
 * Represents a single relocated address from the address space of a debugged process.
 */
public class RelocatedAddress {
  /**
   * The wrapped address object.
   */
  private final IAddress m_address;

  /**
   * Creates a new relocated address object.
   * 
   * @param address The wrapped address object.
   */
  public RelocatedAddress(final IAddress address) {
    m_address = address;
  }

  @Override
  public boolean equals(final Object rhs) {
    return (rhs instanceof RelocatedAddress)
        && m_address.equals(((RelocatedAddress) rhs).m_address);
  }

  /**
   * Returns the wrapped address object.
   * 
   * @return The wrapped address object.
   */
  public IAddress getAddress() {
    return m_address;
  }

  @Override
  public int hashCode() {
    return m_address.hashCode();
  }
}
