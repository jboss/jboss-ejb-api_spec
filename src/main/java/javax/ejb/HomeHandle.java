/*
 *  JBoss, Home of Professional Open Source
 *  Copyright 2010 Red Hat, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package javax.ejb;

import java.rmi.RemoteException;

/**
 * The HomeHandle interface is implemented by all home object handles. A
 * handle is an abstraction of a network reference to a home object. A
 * handle is intended to be used as a "robust" persistent reference to a
 * home object.
 */
public interface HomeHandle extends java.io.Serializable {

  /**
   * Obtains the home object represented by this handle.
   *
   * @return The home object represented by this handle.
   * @exception java.rmi.RemoteException - The home object could not be obtained because of a
   * system-level failure.
   */
  public EJBHome getEJBHome() throws RemoteException;
}
