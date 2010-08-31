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

/**
 * <P>The FinderException exception must be included in the throws clause
 * of every findMETHOD(...) method of an entity Bean's home interface.</P>
 * 
 * <P>The exception is used as a standard application-level exception to,
 * report a failure to find the requested EJB object(s).</P>
 */
public class FinderException extends Exception {

  /**
   * Constructs an FinderException with no detail message.
   */
  public FinderException() {
    super();
  }

  /**
   * Constructs an FinderException with the specified detail message.
   *
   * @param message The detailed message.
   */
  public FinderException(String message) {
    super(message);
  }
}
