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
 * <P>The CreateException exception must be included in the throws clauses of
 * all create(...) methods define in an enterprise Bean's remote interface.</P>
 * <P>The exception is used as a standard application-level exception
 * to report a failure to create an entity EJB object. </P>
 */
public class CreateException extends Exception {
   
  /**
    * 
    */
   private static final long serialVersionUID = 6295951740865457514L;

   /**
   * Constructs an CreateException with no detail message. 
   */
   public CreateException()
   {
      super();
   }

  /**
   * Constructs an CreateException with the specified detail message.
   *
   * @param message - The detailed message
   */
  public CreateException(String message) {
    super(message);
  }
}
